package org.callmemaybe.translator;

import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphEdge;
import edu.stanford.nlp.trees.GrammaticalRelation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * {@code SentenceParser} parses the {@code edu.stanford.nlp.semgraph.SemanticGraph} of a sentence
 * into a {@code PropositionSeries} through the method {@code getPropositionSeries}. This class uses
 * NLP to identify subjects, relations, conjunctions, and so on from the sentence.
 *
 * <p>This class makes an extensive use of the Stanford parser APIs. The basic thing to know is that
 * an {@code IndexedWord} represents a word in a sentence; a grammatical relation has a governor (or
 * a head) and a dependent. The sentence "she looks beautiful" contains a nsubj (subject) relation
 * between "she" and "looks", where "looks" is the governor and "she" is the dependent.
 */
public class SentenceParser {

  /** The semantic graph of the sentence from which the proposition series will be derived. */
  private SemanticGraph semanticGraph;
  /** Grammatical relations that are extracted from the semantic graph. */
  private List<SemanticGraphEdge> subjectRelations,
      copulaRelations,
      complementRelations,
      conjunctionRelations,
      negationRelations,
      numModifierRelations,
      auxRelations,
      temporalRelations;
  /** Logger for this class. */
  private static final Logger log = LoggerFactory.getLogger(SentenceParser.class);

  /**
   * Constructs a {@code SentenceParser} object that will parse the given {@code SemanticGraph} into
   * a {@code PropositionSeries}.
   *
   * @param semanticGraph the {@code SemanticGraph} that will be used to create the {@code
   *     PropositionSeries}
   */
  public SentenceParser(SemanticGraph semanticGraph) {
    this.semanticGraph = semanticGraph;
    initializeRelations();
  }

  /**
   * Parses and returns a {@code PropositionSeries} for the sentence that this parser is initialized
   * to parse.
   *
   * @return a {@code PropositionSeries} for the sentence that this parser is initialized to parse
   */
  public PropositionSeries getPropositionSeries() {
    // Map between some of the words in a sentence and the proposition composed of those words.
    // (IndexedWord is a Stanford parser class representing a word in a sentence, plus many other
    // information).
    // This map is used to understand which propositions a conjunction is joining, since we have to
    // map a conjunction between two specific words to a conjunction between two propositions.
    Map<List<IndexedWord>, Proposition> propositionMap = new LinkedHashMap<>();
    // Proposition series that will be built and returned.
    PropositionSeries propositionSeries = new PropositionSeries(semanticGraph);

    for (SemanticGraphEdge subjectRelation : subjectRelations) {
      // Get the words that make up the predicate.
      List<IndexedWord> predicateWords = getPredicateWords(subjectRelation.getGovernor());
      if (predicateWords.isEmpty()) {
        // Skip creating a Proposition if no predicate could be identified.
        continue;
      }
      // Check if the predicate should be negated.
      boolean negative = predicateIsNegative(subjectRelation.getGovernor());

      // Stores the word marked as a subject word in the semantic graph.
      IndexedWord subjectWord = subjectRelation.getDependent();
      // Stores the subject and associated words, such as any modifiers that come before it.
      // Words (but the subject) appear in the list in the same order as they appear in the
      // sentence. Subject is always the last word in the list.
      Subject subject = getSubject(subjectWord);
      List<IndexedWord> subjectWords = subject.getSubjectWords();
      // Create a Proposition from the subject and predicate words.
      String predicateWordsAsString =
          predicateWords.stream().map(IndexedWord::word).collect(Collectors.joining(" "));
      Proposition proposition = new Proposition(subject, predicateWordsAsString, negative);

      // Add the Proposition and associated words to the propositionMap.
      List<IndexedWord> propositionWords = new ArrayList<>(subjectWords);
      propositionWords.addAll(predicateWords);
      propositionMap.put(propositionWords, proposition);
    }

    // Identify propositions associated with each conjunction and add them to the propositionSeries.
    for (SemanticGraphEdge conjunctionRelation : conjunctionRelations) {
      IndexedWord conjGovernor = conjunctionRelation.getGovernor();
      IndexedWord conjDependent = conjunctionRelation.getDependent();
      Proposition p1 = null, p2 = null;

      for (Entry<List<IndexedWord>, Proposition> entry : propositionMap.entrySet()) {
        if (entry.getKey().contains(conjGovernor)) {
          p1 = entry.getValue();
        }
        if (entry.getKey().contains(conjDependent)) {
          p2 = entry.getValue();
        }
        if (p1 != null && p2 != null) {
          break;
        }
      }

      if (p1 != null && p2 != null) {
        if (propositionSeries.isEmpty()) {
          propositionSeries.add(p1);
        }
        propositionSeries.add(getConjunction(conjunctionRelation), p2);
      }
    }

    // Add any propositions not part of a conjunction relation to the propositionSeries.
    for (Proposition p : propositionMap.values()) {
      if (!propositionSeries.contains(p)) {
        if (propositionSeries.isEmpty()) {
          propositionSeries.add(p);
        } else {
          // We assume OR as the conjunction when it is not specified.
          propositionSeries.add(Conjunction.OR, p);
        }
      }
    }

    return propositionSeries;
  }

  public TemporalPropSeries getTemporalPropositionSeries() {
    // Map between some of the words in a sentence and the proposition composed of those words.
    // (IndexedWord is a Stanford parser class representing a word in a sentence, plus many other
    // information).
    // This map is used to understand which propositions a conjunction is joining, since we have to
    // map a conjunction between two specific words to a conjunction between two propositions.

    // Proposition series that will be built and returned.
    TemporalPropSeries propositionSeries = new TemporalPropSeries(semanticGraph);

    if(temporalRelations.isEmpty()){
      return propositionSeries;
    }


    Map<List<IndexedWord>, TemporalProposition> propositionMap = new LinkedHashMap<>();

    // Building propositions following the classic subj/pred schema:
    for (SemanticGraphEdge subjectRelation : subjectRelations) {
      // Get the words that make up the predicate.
      List<IndexedWord> predicateWords = getPredicateWords(subjectRelation.getGovernor());
      collectPropSeriesVerbs(subjectRelation.getGovernor(), propositionSeries);
      if (predicateWords.isEmpty()) {
        // Skip creating a Proposition if no predicate could be identified.
        continue;
      }
      // Check if the predicate should be negated.
      boolean negative = predicateIsNegative(subjectRelation.getGovernor());

      // Stores the word marked as a subject word in the semantic graph.
      IndexedWord subjectWord = subjectRelation.getDependent();
      // Stores the subject and associated words, such as any modifiers that come before it.
      // Words (but the subject) appear in the list in the same order as they appear in the
      // sentence. Subject is always the last word in the list.
      if(subjectIsDeveloper(subjectWord)){
        Optional<IndexedWord> alternativeSubj = getACodeSubject(predicateWords);
        if(alternativeSubj.isPresent()){
          subjectWord = alternativeSubj.get();
          predicateWords.remove(subjectWord);
        }
        else{
          continue;
        }
      }
//      Subject subject = getSubject(subjectWord);
      Subject subject = getTemporalSubject(subjectWord);

      List<IndexedWord> subjectWords = subject.getSubjectWords();
      // Create a Proposition from the subject and predicate words.

      String predicateWordsAsString =
              predicateWords.stream().map(IndexedWord::word).collect(Collectors.joining(" "));


      TemporalProposition proposition = new TemporalProposition(subject, predicateWordsAsString, negative);

//      Optional<IndexedWord> verb = predicateWords.stream().filter(x -> x.indexedWord.matches("VB.*")).findFirst();
//      verb.ifPresent(indexedWord -> proposition.setIndexedWord(indexedWord.word()));
      // FIXME instead of the above, retrieve the IndexedWord that is not Copula

      // Add the Proposition and associated words to the propositionMap.
      List<IndexedWord> propositionWords = new ArrayList<>(subjectWords);
      propositionWords.addAll(predicateWords);
      propositionMap.put(propositionWords, proposition);
    }

    // Building propositions following temporal relationships:
    for (SemanticGraphEdge tempRelation : temporalRelations) {
      // Stores the word marked as a dependent word in the semantic graph.
      IndexedWord dependentWord;
      List<IndexedWord> governorWords;

      dependentWord = tempRelation.getDependent();
      // Get the words that make up the governor.
      governorWords = getPredicateWords(tempRelation.getGovernor());
      collectPropSeriesVerbs(tempRelation.getGovernor(), propositionSeries);
      collectPropSeriesVerbs(tempRelation.getDependent(), propositionSeries);

      if(!complementRelations.isEmpty()) {
        // Direct object becomes subject of temporal proposition.
        for (SemanticGraphEdge complementRel : complementRelations) {
          if (complementRel.getGovernor().equals(dependentWord)) {
            dependentWord = complementRel.getDependent();
            governorWords = getPredicateWords(complementRel.getGovernor());
          }
        }
      }

      if (governorWords.isEmpty()) {
        // Skip creating a Proposition if no gov. could be identified.
        continue;
      }
      // Check if the gov. should be negated.
      boolean negative = predicateIsNegative(tempRelation.getGovernor());


      // Stores the dependent and associated words, such as any modifiers that come before it.
      // Words (but the dependent) appear in the list in the same order as they appear in the
      // sentence. Dep. is always the last word in the list.
      Subject dependent = getTemporalSubject(dependentWord);
//      Subject dependent = getSubject(dependentWord);


      // Create a Proposition from the subject and predicate words.
      String predicateWordsAsString =
              governorWords.stream().map(IndexedWord::word).collect(Collectors.joining(" "));

      TemporalProposition proposition = new TemporalProposition(dependent, predicateWordsAsString, negative);

      // Add the Proposition and associated words to the propositionMap.
      List<IndexedWord> depWords = dependent.getSubjectWords();
      List<IndexedWord> propositionWords = new ArrayList<>(depWords);
      propositionWords.addAll(governorWords);
      propositionMap.put(propositionWords, proposition);
    }

    // Identify propositions associated with each temp. rel. and add them to the propositionSeries.
    for (SemanticGraphEdge tempRelation : temporalRelations) {
        IndexedWord tempRelGovernor = tempRelation.getGovernor();
        IndexedWord tempRelDependent = tempRelation.getDependent();
        TemporalRule.TemporalRelation temporalSpecific = getTemporalSpecific(tempRelation);
        TemporalProposition p1 = null, p2 = null;

        for (Entry<List<IndexedWord>, TemporalProposition> entry : propositionMap.entrySet()) {
          if (p1== null && entry.getKey().contains(tempRelGovernor) && p1!=entry.getValue() && p2!=entry.getValue()) {
            p1 = entry.getValue();
          }
          if (p2==null && entry.getKey().contains(tempRelDependent) && p2!=entry.getValue() && p1!=entry.getValue()) {
            p2 = entry.getValue();
          }
          if (p1 != null && p2 != null) {
            break;
          }
        }

        if (p1 != null && p2 != null) {
          if (propositionSeries.isEmpty()) {
            propositionSeries.add(p1);
          }
          if (temporalSpecific != null) {
            propositionSeries.add(temporalSpecific, p2);
          }
        }
      }

    return propositionSeries;
  }

  private Optional<IndexedWord> getACodeSubject(List<IndexedWord> predicateWords) {
    return predicateWords.stream().filter(x -> x.word().contains("method_")).findFirst();
  }

  private boolean subjectIsDeveloper(IndexedWord subjectWord) {
    // TODO This would apply also to: "the user", "a user", whatever.
    return subjectWord.tag().equals("PRP") && subjectWord.word().equalsIgnoreCase("you");
  }

  private void collectPropSeriesVerbs(IndexedWord governor,
                                      TemporalPropSeries propositionSeries) {
    // Copula verbs
    Optional<SemanticGraphEdge> copEdge =
            copulaRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (copEdge.isPresent()) {
      // Predicate is of copula form.
      IndexedWord dep = copEdge.get().getDependent();
      propositionSeries.verbsDB.add(new Verb(dep, Verb.GrammaticalKind.COPULA));
      propositionSeries.verbsDB.add(new Verb(governor, Verb.GrammaticalKind.COPULA));
    }

    // Auxiliary verbs
    Optional<SemanticGraphEdge> auxEdge =
            auxRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (auxEdge.isPresent()) {
//      IndexedWord aux = auxEdge.get().getDependent();
//    TemporalPropSeries.verbsDB.add(new Verb(aux, Verb.GrammaticalKind.AUX));
      propositionSeries.verbsDB.add(new Verb(governor, Verb.GrammaticalKind.AUX));
    }

    // Complementary verbs. Tricky ones: e.g., for dobj such as "making call", you want to retain "call"
    // and not just "make"
    Optional<SemanticGraphEdge> complementEdge =
            complementRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (complementEdge.isPresent()) {
      propositionSeries.verbsDB.add(new Verb(governor, Verb.GrammaticalKind.NON_COPULA));
      IndexedWord complement = complementEdge.get().getDependent();
      propositionSeries.verbsDB.add(new Verb(complement, Verb.GrammaticalKind.NON_COPULA));

//      Optional<SemanticGraphEdge> numModifierEdge =
//              numModifierRelations.stream().filter(e -> e.getGovernor().equals(complement)).findFirst();
//      if (numModifierEdge.isPresent()) {
//        IndexedWord dep = numModifierEdge.get().getDependent();
//      TemporalPropSeries.verbsDB.add(new Verb(dep, Verb.GrammaticalKind.NON_COPULA));
//      }
    }

    // Passive
    Optional<SemanticGraphEdge> auxpassEdge =
            getRelationsFromGraph("auxpass")
                    .stream()
                    .filter(e -> e.getGovernor().equals(governor))
                    .findFirst();
    if (auxpassEdge.isPresent()) {
      IndexedWord dep = auxpassEdge.get().getDependent();
      // TODO for now try ignoring dependents (is, will... + real verb)
//    TemporalPropSeries.verbsDB.add(new Verb(dep, Verb.GrammaticalKind.PASSIVE));
      propositionSeries.verbsDB.add(new Verb(governor, Verb.GrammaticalKind.PASSIVE));
    }

  }


  /**
   * Returns the type of conjunction associated with a conjunction relation.
   *
   * @param conjunctionRelation the relation for which to retrieve the conjunction type
   * @return the conjunction type associated with the given relation
   */
  private Conjunction getConjunction(SemanticGraphEdge conjunctionRelation) {
    String conjunctionRelationSpecific = conjunctionRelation.getRelation().getSpecific();
    Conjunction operator;
    switch (conjunctionRelationSpecific) {
      case "or":
        operator = Conjunction.OR;
        break;
      case "and":
      case "but":
        operator = Conjunction.AND;
        break;
      default:
        operator = null;
    }
    return operator;
  }

  /**
   *
   * @param temporalRelation
   * @return
   */
  private TemporalRule.TemporalRelation getTemporalSpecific(SemanticGraphEdge temporalRelation) {
    String conjunctionRelationSpecific = temporalRelation.getRelation().getSpecific();
    if(conjunctionRelationSpecific!=null) {

      // FIXME We are not passing advmod here anymore. Look for it here. If the specific of
      // FIXME advcl is not temporal but there is a advmod as specified below, there's hope!
      List<String> enumNames = Stream.of(TemporalRule.TemporalRelation.values())
              .map(Enum::name)
              .collect(Collectors.toList());

      if (!enumNames.contains(conjunctionRelationSpecific)) {
        List<SemanticGraphEdge> advmodEdges = getRelationsFromGraph("advmod");
        for (SemanticGraphEdge e : advmodEdges) {
          if (temporalRelation.getDependent().equals(e.getGovernor()) &&
                  e.getDependent().tag().equals("RB")) {
            conjunctionRelationSpecific = e.getDependent().word();
            break;
          }
          if (conjunctionRelationSpecific == null) {
            return null;
          }
        }
      }

      TemporalRule.TemporalRelation operator;
      switch (conjunctionRelationSpecific) {
        case "until":
          operator = TemporalRule.TemporalRelation.UNTIL;
          break;
        case "before":
        case "prior":
          operator = TemporalRule.TemporalRelation.BEFORE;
          break;
        case "after":
        case "once":
          operator = TemporalRule.TemporalRelation.AFTER;
          break;
        default:
          operator = null;
      }
      return operator;
    }
    return null;
  }

  /**
   * Takes the governor for a subject relation and returns true if the predicate (associated with
   * the subject in the subject relation) has a negation modifier.
   *
   * @param governor the governor for a subject relation
   * @return true if the predicate associated with the subject in the subject relation has a
   *     negation modifier, false otherwise
   */
  private boolean predicateIsNegative(IndexedWord governor) {
    // Return true if there are an odd number of negation modifiers.
    long numNegEdges =
        negationRelations.stream().filter(e -> e.getGovernor().equals(governor)).count();
    return numNegEdges % 2 == 1;
  }

  /**
   * Takes the governor for a subject relation and returns all words that are part of the predicate
   * associated with the subject in the subject relation.
   *
   * @param governor the governor for a subject relation
   * @return all words in the predicate associated with the subject in the subject relation
   */
  private List<IndexedWord> getPredicateWords(IndexedWord governor) {
    List<IndexedWord> result;

    result = tryCopulaPredicate(governor);
    if (result.isEmpty()) {
      result = tryPassivePredicate(governor);
    }
    if (result.isEmpty()) {
      result = tryNonCopulaPredicate(governor);
    }
    if (result.isEmpty()) {
      result = tryConjunctionPredicate(governor);
    }
    if (result.isEmpty()) {
      result = tryAuxiliaryRelation(governor);
    }
    //    if (result.isEmpty()) {
    //      log.warn(
    //          "Unable to identify a predicate (governor = " + governor.word() + ") in \"{}\"",
    //          semanticGraph.toRecoveredSentenceString());
    //    }

    return result;
  }

  /**
   * Attempts to return the predicate words associated with the given governor, under the assumption
   * that the predicate is bound to an auxiliary relation.
   *
   * @param governor the governor associated with the predicate
   * @return the predicate words or an empty list if the predicate is not involved in an auxiliary
   *     relation
   */
  private List<IndexedWord> tryAuxiliaryRelation(IndexedWord governor) {
    List<IndexedWord> predicateWords = new ArrayList<>();

    Optional<SemanticGraphEdge> auxEdge =
        auxRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (!auxEdge.isPresent()) {
      return predicateWords;
    }

    IndexedWord aux = auxEdge.get().getDependent();
    predicateWords.add(aux);
    predicateWords.add(governor);
    return predicateWords;
  }

  /**
   * Attempts to return the predicate words associated with the given governor, under the assumption
   * that the predicate is of the non-copula form.
   *
   * @param governor the governor associated with the predicate
   * @return the predicate words or an empty list if the predicate is not of the non-copula form
   */
  private List<IndexedWord> tryNonCopulaPredicate(IndexedWord governor) {
    List<IndexedWord> predicateWords = new ArrayList<>();

    Optional<SemanticGraphEdge> complementEdge =
        complementRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (!complementEdge.isPresent()) {
      // Predicate is not of non-copula form.
      return predicateWords;
    }
    predicateWords.add(governor);
    IndexedWord complement = complementEdge.get().getDependent();
//    TemporalPropSeries.verbsDB.add(new Verb(complement, Verb.GrammaticalKind.NON_COPULA));
    predicateWords.add(complement);

    Optional<SemanticGraphEdge> numModifierEdge =
        numModifierRelations.stream().filter(e -> e.getGovernor().equals(complement)).findFirst();
    if (numModifierEdge.isPresent()) {
      IndexedWord dep = numModifierEdge.get().getDependent();
//      TemporalPropSeries.verbsDB.add(new Verb(dep, Verb.GrammaticalKind.NON_COPULA));
      predicateWords.add(dep);
    }

    return predicateWords;
  }

  /**
   * Attempts to return the predicate words associated with the given governor, under the assumption
   * that the predicate is of the conjunction form.
   *
   * @param governor the governor associated with the predicate
   * @return the predicate words or an empty list if the predicate is not of the conjunction form
   */
  private List<IndexedWord> tryConjunctionPredicate(IndexedWord governor) {
    List<IndexedWord> predicateWords = new ArrayList<>();

    // Case 1: conjunction between verbs (e.g., set is OR contains null).
    Optional<SemanticGraphEdge> conjunctionEdge1 =
        conjunctionRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (conjunctionEdge1.isPresent()) {
      Optional<SemanticGraphEdge> complementEdge =
          complementRelations
              .stream()
              .filter(e -> e.getGovernor().equals(conjunctionEdge1.get().getDependent()))
              .findFirst();
      if (complementEdge.isPresent()) {
        predicateWords.add(governor);
        IndexedWord dep = complementEdge.get().getDependent();
        predicateWords.add(dep);
        return predicateWords;
      }
    }
    // Case 2: conjunction between complements when there is a copula (e.g., name is empty or null).
    Optional<SemanticGraphEdge> conjunctionEdge2 =
        conjunctionRelations.stream().filter(e -> e.getDependent().equals(governor)).findFirst();
    if (conjunctionEdge2.isPresent()) {
      Optional<SemanticGraphEdge> copulaEdge =
          copulaRelations
              .stream()
              .filter(e -> e.getGovernor().equals(conjunctionEdge2.get().getGovernor()))
              .findFirst();
      if (copulaEdge.isPresent()) {
        IndexedWord dep = copulaEdge.get().getDependent();
        IndexedWord dep2 = conjunctionEdge2.get().getDependent();
        predicateWords.add(dep);
        predicateWords.add(dep2);
        return predicateWords;
      }
    }

    return predicateWords;
  }

  /**
   * Attempts to return the predicate words associated with the given governor, under the assumption
   * that the predicate is of the passive form.
   *
   * @param governor the governor associated with the predicate
   * @return the predicate words or an empty list if the predicate is not of the passive form
   */
  private List<IndexedWord> tryPassivePredicate(IndexedWord governor) {
    List<IndexedWord> predicateWords = new ArrayList<>();

    Optional<SemanticGraphEdge> auxpassEdge =
        getRelationsFromGraph("auxpass")
            .stream()
            .filter(e -> e.getGovernor().equals(governor))
            .findFirst();
    if (!auxpassEdge.isPresent()) {
      // Predicate is not of passive form.
      return predicateWords;
    }
    IndexedWord dep = auxpassEdge.get().getDependent();
    predicateWords.add(dep);
    predicateWords.add(governor);

    return predicateWords;
  }

  /**
   * Attempts to return the predicate words associated with the given governor, under the assumption
   * that the predicate is of the copula form.
   *
   * @param governor the governor associated with the predicate
   * @return the predicate words or an empty list if the predicate is not of the copula form
   */
  private List<IndexedWord> tryCopulaPredicate(IndexedWord governor) {
    List<IndexedWord> predicateWords = new ArrayList<>();

    // For a predicate of this form, the given governor of the subject relation is also the governor
    // of the copula relation.
    Optional<SemanticGraphEdge> copEdge =
        copulaRelations.stream().filter(e -> e.getGovernor().equals(governor)).findFirst();
    if (!copEdge.isPresent()) {
      // Predicate is not of copula form.
      return predicateWords;
    }
    IndexedWord dep = copEdge.get().getDependent();
    predicateWords.add(dep);
    // Add the governor itself to the predicate.
    predicateWords.add(governor);

    return predicateWords;
  }

  /**
   * Returns the subject of a predicate minus any articles. The words composing the subject are
   * collected starting from a given {@code subjectWord} (a word in a subject grammatical relation
   * with a verb). For example, in "the large numbers map is not null", the returned words
   * associated with the subject word "map" are ["large", "numbers", "map"]. "the" is not in the
   * returned words since it is a definite article.
   *
   * @param subjectWord the subject word for which to return the associated words
   * @return a {@code Subject} containing the words associated with the given subject (not including
   *     articles)
   */
  private Subject getSubject(IndexedWord subjectWord) {
    // Collect the words composing the container. For example, in the comment "any value in the
    // array is null", the subject is "any value", while the container is "array". At the moment
    // we collect only one word as container. Extend the code to support containers composed of
    // multiple words. For example in "any element in the entry set is null", the container is
    // "entry set".
    List<IndexedWord> containerWords = new ArrayList<>();
    IndexedWord container =
        getRelationsFromGraph("nmod:in")
            .stream()
            .filter(e -> e.getGovernor().equals(subjectWord))
            .map(SemanticGraphEdge::getDependent)
            .findFirst()
            .orElse(null);
    if (container != null) {
      containerWords.add(container);
    }

    boolean isPassive =
        getRelationsFromGraph("nsubjpass")
            .stream()
            .anyMatch(e -> e.getTarget().equals(subjectWord));

    return new Subject(extractSubjectWords(subjectWord), containerWords, isPassive);
  }

  private Subject getTemporalSubject(IndexedWord subjectWord) {
    // Collect the words composing the container. For example, in the comment "any value in the
    // array is null", the subject is "any value", while the container is "array". At the moment
    // we collect only one word as container. Extend the code to support containers composed of
    // multiple words. For example in "any element in the entry set is null", the container is
    // "entry set".
    List<IndexedWord> containerWords = new ArrayList<>();
    IndexedWord container =
            getRelationsFromGraph("nmod:in")
                    .stream()
                    .filter(e -> e.getGovernor().equals(subjectWord))
                    .map(SemanticGraphEdge::getDependent)
                    .findFirst()
                    .orElse(null);
    if (container != null) {
      containerWords.add(container);
    }

    boolean isPassive =
            getRelationsFromGraph("nsubjpass")
                    .stream()
                    .anyMatch(e -> e.getTarget().equals(subjectWord));

    List<IndexedWord> tempSubjectWords = extractTemporalObjects(subjectWord);
    return new Subject(tempSubjectWords, containerWords, isPassive);
  }

  /** Initializes the relations fields using the semantic graph. */
  private void initializeRelations() {
    // TODO Here manage advcl too (and obl, and?)
    subjectRelations = getRelationsFromGraph("nsubj", "nsubjpass");
    //    if (subjectRelations.isEmpty()) {
    //      log.warn("Unable to identify subjects in \"{}\".",
    // semanticGraph.toRecoveredSentenceString());
    //    }
    copulaRelations = getRelationsFromGraph("cop");
    auxRelations = getRelationsFromGraph("aux");
    complementRelations = getRelationsFromGraph("acomp", "xcomp", "dobj");
    conjunctionRelations = getRelationsFromGraph("conj:and", "conj:or", "conj:but");
    negationRelations = getRelationsFromGraph("neg");
    numModifierRelations = getRelationsFromGraph("nummod");
    // TODO originally it was advcl only. But obliques do matter: advmod, nmod, obl?
    temporalRelations = getTemporalRelationsFromGraph("advcl", "obl", "nmod");
  }

  /**
   * Retrieves relations with the given identifiers from the semantic graph. An identifier is a
   * string of the form relation_short_name:specific. The :specific part is optional, but general
   * matches are not possible, i.e., the identifier "conj" will not retrieve "conj:and" nor
   * "conj:and". See {@code edu.stanford.nlp.trees.GrammaticalRelation#getShortName()} and {@code
   * edu.stanford.nlp.trees.GrammaticalRelation#getSpecific()} for more information.
   *
   * @param relationIdentifiers the identifiers of the relations to retrieve.
   * @return all the grammatical relations in the sentence (as graph edges) that match the specified
   *     relation identifiers
   */
  private List<SemanticGraphEdge> getRelationsFromGraph(String... relationIdentifiers) {
    final List<String> identifiers =
        Collections.unmodifiableList(Arrays.asList(relationIdentifiers));
    final List<SemanticGraphEdge> foundRelations = new ArrayList<>();

    for (SemanticGraphEdge edge : semanticGraph.edgeIterable()) {
      final GrammaticalRelation grammaticalRelation = edge.getRelation();
      String identifier = grammaticalRelation.getShortName();
      final String specific = grammaticalRelation.getSpecific();
      if (specific != null) {
        identifier += ":" + specific;
      }
      if (identifiers.contains(identifier)) {
        foundRelations.add(edge);
      }
    }
    return foundRelations;
  }

  /**
   * Mimics the above but slightly different logic.  FIXME double check this works
   * @param relationIdentifiers
   * @return
   */
  private List<SemanticGraphEdge> getTemporalRelationsFromGraph(String... relationIdentifiers) {
    final List<String> identifiers =
            Collections.unmodifiableList(Arrays.asList(relationIdentifiers));
    final List<SemanticGraphEdge> foundRelations = new ArrayList<>();

    for (SemanticGraphEdge edge : semanticGraph.edgeIterable()) {
      final GrammaticalRelation grammaticalRelation = edge.getRelation();
      String identifier = grammaticalRelation.getShortName();

      // FIXME do we care about this *now*?
//      final String specific = grammaticalRelation.getSpecific();
//      if (specific != null) {
//        identifier += ":" + specific;
//      }

      if (identifiers.contains(identifier)) {
        foundRelations.add(edge);
      }
    }
    return foundRelations;
  }

  /**
   * Collects all the words composing a subject in a proposition, given the node that is marked as
   * subject by the Stanford parser. Subject words appear in the returned list in the order they
   * appear in the input sentence.
   *
   * @param subject the subject node
   * @return a list of words representing the subject of a proposition
   */
  private List<IndexedWord> extractSubjectWords(IndexedWord subject) {
    List<IndexedWord> subjectWords = new ArrayList<>();
    Queue<IndexedWord> nodeQueue = new LinkedList<>();
    nodeQueue.add(subject);
    subjectWords.add(subject);

    while (!nodeQueue.isEmpty()) {
      IndexedWord currentNode = nodeQueue.poll();
      for (IndexedWord child : getChildren(currentNode)) {
        subjectWords.add(child);
        nodeQueue.add(child);
      }
    }
    subjectWords.sort(Comparator.comparingInt(IndexedWord::index));
    return subjectWords;
  }

  private List<IndexedWord> extractTemporalObjects(IndexedWord subject) {
    List<IndexedWord> subjectWords = new ArrayList<>();
    Queue<IndexedWord> nodeQueue = new LinkedList<>();
    nodeQueue.add(subject);
    subjectWords.add(subject);

    while (!nodeQueue.isEmpty()) {
      IndexedWord currentNode = nodeQueue.poll();
      List<IndexedWord> children = getTemporalChildren(currentNode);
      for (IndexedWord child : children) {
        subjectWords.add(child);
        nodeQueue.add(child);
      }
    }
    subjectWords.sort(Comparator.comparingInt(IndexedWord::index));
    return subjectWords;
  }

  /**
   * Returns the list of children of {@code node} in the semantic graph produce by the Stanford
   * parser. The list of children only contains nodes that are connected with {@code node} with the
   * grammatical relations listed in {@code relationIdentifiers}. Also, nodes containing a stopword
   * (e.g., "a", "an", "the") are ignored.
   *
   * @param node a node in the semantic graph
   * @return the filtered list of children
   */
  private List<IndexedWord> getChildren(IndexedWord node) {
    List<String> relationIdentifiers =
        Arrays.asList("compound", "advmod", "amod", "det", "nmod:poss", "nmod:of");
    List<String> stopwords = Arrays.asList("a", "an", "the");

    return semanticGraph
        .getOutEdgesSorted(node)
        .stream()
        .filter(
            edge -> {
              GrammaticalRelation grammaticalRelation = edge.getRelation();
              String identifier = grammaticalRelation.getShortName();
              final String specific = grammaticalRelation.getSpecific();
              if (specific != null) {
                identifier += ":" + specific;
              }
              return relationIdentifiers.contains(identifier);
            })
        .map(SemanticGraphEdge::getTarget)
        .filter(word -> !stopwords.contains(word.word().toLowerCase()))
        .collect(Collectors.toList());
  }

  private List<IndexedWord> getTemporalChildren(IndexedWord node) {
    List<String> relationIdentifiers =
            Arrays.asList("compound", "amod", "det", "nmod:poss", "nmod:of", "dobj");
    List<String> stopwords = Arrays.asList("a", "an", "the");

    return semanticGraph
            .getOutEdgesSorted(node)
            .stream()
            .filter(
                    edge -> {
                      GrammaticalRelation grammaticalRelation = edge.getRelation();
                      String identifier = grammaticalRelation.getShortName();
                      final String specific = grammaticalRelation.getSpecific();
                      if (specific != null) {
                        identifier += ":" + specific;
                      }
                      return relationIdentifiers.contains(identifier);
                    })
            .map(SemanticGraphEdge::getTarget)
            .filter(word -> !stopwords.contains(word.word().toLowerCase()))
            .collect(Collectors.toList());
  }
}
