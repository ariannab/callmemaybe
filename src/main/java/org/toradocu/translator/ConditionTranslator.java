package org.toradocu.translator;

import edu.stanford.nlp.semgraph.SemanticGraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.toradocu.extractor.DocumentedMethod;
import org.toradocu.extractor.ThrowsTag;

/**
 * ConditionTranslator translates exception comments in method documentation to Java expressions.
 * The entry point is {@link #translate(List)}.
 */
public class ConditionTranslator {

  private static final Logger log = LoggerFactory.getLogger(ConditionTranslator.class);

  /**
   * Translates the throws tags in the given methods. This method sets the field
   * {@code ThrowsTag.condition} for each throws tags in the given methods.
   *
   * @param methods a list of {@code DocumentedMethod}s whose throws tags to translate
   */
  public static void translate(List<DocumentedMethod> methods) {
    for (DocumentedMethod method : methods) {
      for (ThrowsTag tag : method.throwsTags()) {
        log.trace(
            "Identifying propositions from: \""
                + tag.exceptionComment()
                + "\" in "
                + method.getSignature());

        String comment = tag.exceptionComment().trim();
        String lowerCaseComment = comment.toLowerCase();

        // Sanitize exception comment: remove initial "if"
        if (lowerCaseComment.startsWith("if ") && lowerCaseComment.length() > 3) {
          comment = comment.substring(3);
        }

        /* Identify propositions in the comment. Each sentence in the comment is parsed into a
         * PropositionSeries. */
        List<PropositionSeries> extractedPropositions = getPropositionSeries(comment);

        Set<String> conditions = new LinkedHashSet<>();
        // Identify Java code elements in propositions.
        for (PropositionSeries propositions : extractedPropositions) {
          translatePropositions(propositions, method);
          conditions.add(propositions.getTranslation());
        }
        tag.setCondition(mergeConditions(conditions));
      }
    }
  }

  /**
   * Takes a comment as a String and returns a list of {@code PropositionSeries} objects, one for
   * each sentence in the comment.
   *
   * @param comment the text of a Javadoc comment
   * @return a list of {@code PropositionSeries} objects, one for each sentence in the comment
   */
  private static List<PropositionSeries> getPropositionSeries(String comment) {
    comment = addPlaceholders(comment);
    List<PropositionSeries> result = new ArrayList<>();

    for (SemanticGraph semanticGraph : StanfordParser.getSemanticGraphs(comment)) {
      result.add(new SentenceParser(semanticGraph).getPropositionSeries());
    }

    return removePlaceholders(result);
  }

  /**
   * Replaces inequalities (e.g. "< 3", ">= 42") with placeholder text that can be more easily
   * parsed.
   *
   * @param text the text containing inequalities
   * @return text with inequalities replaced by placeholders
   */
  private static String addPlaceholders(String text) {
    java.util.regex.Matcher matcher = Pattern.compile(INEQUALITY_NUMBER_REGEX).matcher(text);
    String placeholderText = text;
    int i = 0;
    while (matcher.find()) {
      inequalities.add(text.substring(matcher.start(), matcher.end()));
      placeholderText =
          placeholderText.replaceFirst(INEQUALITY_NUMBER_REGEX, PLACEHOLDER_PREFIX + i++);
    }
    return placeholderText;
  }

  private static final String INEQUALITY_NUMBER_REGEX = "(<|>)=? ?-?[0-9]+";
  private static final String PLACEHOLDER_PREFIX = "INEQUALITY_";
  private static List<String> inequalities = new ArrayList<>();

  /**
   * Returns a new list of {@code PropositionSeries} in which any placeholder text has been replaced
   * by the original inequalities.
   *
   * @param seriesList the list of {@code PropositionSeries} containing placeholder text
   * @return a new list of {@code PropositionSeries} with placeholders replaced by inequalities
   */
  private static List<PropositionSeries> removePlaceholders(List<PropositionSeries> seriesList) {
    List<PropositionSeries> result = new ArrayList<>();

    for (PropositionSeries series : seriesList) {
      List<Proposition> inequalityPropositions = new ArrayList<>();
      for (Proposition placeholderProposition : series.getPropositions()) {
        String subject = placeholderProposition.getSubject();
        String predicate = placeholderProposition.getPredicate();
        for (int i = 0; i < inequalities.size(); i++) {
          subject = subject.replaceAll(PLACEHOLDER_PREFIX + i, inequalities.get(i));
          predicate = predicate.replaceAll(PLACEHOLDER_PREFIX + i, inequalities.get(i));
        }
        inequalityPropositions.add(
            new Proposition(subject, predicate, placeholderProposition.isNegative()));
      }
      result.add(new PropositionSeries(inequalityPropositions, series.getConjunctions()));
    }

    inequalities.clear();
    return result;
  }

  /**
   * Translates the {@code Proposition}s in the given {@code propositionSeries} to Java expressions.
   *
   * @param propositionSeries the {@code Proposition}s to translate into Java expressions
   * @param method the method the containing the Javadoc comment from which the
   *        {@code propositionSeries} was extracted
   */
  private static void translatePropositions(
      PropositionSeries propositionSeries, DocumentedMethod method) {
    for (Proposition p : propositionSeries.getPropositions()) {
      Set<CodeElement<?>> subjectMatches;
      subjectMatches = Matcher.subjectMatch(p.getSubject(), method);
      if (subjectMatches.isEmpty()) {
        log.debug("Failed subject translation for: " + p);
        return;
      }

      // A single subject can match multiple elements (e.g., in "either value is null").
      // Therefore, predicate matching should be attempted for each matched subject code element.
      String translation = "";
      for (CodeElement<?> subjectMatch : subjectMatches) {
        String currentTranslation =
            Matcher.predicateMatch(subjectMatch, p.getPredicate(), p.isNegative());
        if (currentTranslation == null) {
          log.trace("Failed predicate translation for: " + p);
          continue;
        }

        if (translation.isEmpty()) {
          translation = currentTranslation;
        } else {
          translation += getConjunction(p.getSubject()) + currentTranslation;
        }
      }

      if (!translation.isEmpty()) {
        log.trace("Translated proposition " + p + " as: " + translation);
        p.setTranslation(translation);
      }
    }
  }

  /**
   * Returns a boolean Java expression that merges the conditions from the given set of conditions.
   * Each condition in the set is combined using an || conjunction.
   *
   * @param conditions the translated conditions for a throws tag (as Java boolean conditions)
   * @return a boolean Java expression that is true only if any of the given conditions is true
   */
  private static String mergeConditions(Set<String> conditions) {
    conditions.removeIf(s -> s.isEmpty());
    if (conditions.size() == 0) {
      return "";
    } else if (conditions.size() == 1) {
      return conditions.iterator().next();
    } else {
      Iterator<String> it = conditions.iterator();
      StringBuilder conditionsBuilder = new StringBuilder("(" + it.next() + ")");
      while (it.hasNext()) {
        conditionsBuilder.append(" || (" + it.next() + ")");
      }
      return conditionsBuilder.toString();
    }
  }

  /**
   * Returns the conjunction that should be used to form the translation for a {@code Proposition}
   * with the given subject. Returns null if no conjunction should be used.
   *
   * @param subject the subject of the {@code Proposition}
   * @return the conjunction that should be used to form the translation for the {@code Proposition}
   *         with the given subject or null if no conjunction should be used
   */
  private static String getConjunction(String subject) {
    if (subject.startsWith("either ") || subject.startsWith("any ")) {
      return " || ";
    } else if (subject.startsWith("both ") || subject.startsWith("all ")) {
      return " && ";
    } else {
      return null;
    }
  }
}
