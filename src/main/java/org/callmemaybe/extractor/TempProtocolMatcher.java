package org.callmemaybe.extractor;

import edu.stanford.nlp.simple.Sentence;
import org.callmemaybe.translator.CodeElement;
import org.callmemaybe.translator.JavaElementsCollector;
import org.callmemaybe.translator.Parser;
import org.callmemaybe.translator.TemporalPropSeries;
import org.callmemaybe.translator.TemporalProposition;
import org.callmemaybe.translator.Verb;
import org.callmemaybe.translator.Matcher;
import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempProtocolMatcher {

    private Word2Vec w2vModel;
    private Collection<String> goldenSet;

    /**
     * Initialize model and golden set of concepts.
     * Doing it in the constructor so it can be done exactly once
     * for all translations.
     */
    public TempProtocolMatcher() {
        this.w2vModel = WordVectorSerializer.readWord2VecModel("src/test/resources/bin/SO_vectors_200.bin");
        List<String> allProtocolConcepts = Stream.of(ProtocolConcepts.values())
                .map(ProtocolConcepts::getStringConcept)
                .collect(Collectors.toList());
        this.goldenSet = w2vModel.wordsNearest(allProtocolConcepts, new HashSet<>(), 10);
    }

    private enum ProtocolConcepts {
        CALL("call"),
        OPERATION("operation");


        private String stringConcept;

        ProtocolConcepts(String stringConcept) {
            this.stringConcept = stringConcept;
        }

        public String getStringConcept() {
            return stringConcept;
        }
    }


    /**
     * This method answers to the question "does the comment express a TP?". Entry point of TP Finder.
     *
     * @param
     * @return TemporalMatch object containing information such as the matched signature, empty if
     * no match
     */
    public TemporalMatch findProtocolInComment(CommentContent commentContent, DocumentedExecutable excMember) {
//        List<SemanticGraph> semanticGraphs = Parser.extractSemanticGraphs(commentContent, excMember);
        List<TemporalPropSeries> propositionSeries = Parser.parseTemporal(commentContent, excMember);
        TemporalMatch temporalMatch = new TemporalMatch();

        for (TemporalPropSeries p : propositionSeries) {
            if(p.getPropositions().size() >= 2) {
                assessIfTemporalMatch(excMember, p, temporalMatch);
                if (temporalMatch.isIndeedMatch()) {
                    temporalMatch.setRelations(p.getTemporalRelations());
                    // FIXME About to do something even uglier:
                    temporalMatch.setPropositionA(p.getPropositions().get(0));
                    temporalMatch.setPropositionB(p.getPropositions().get(1));
                }
            }
        }
        return temporalMatch;
    }

    /**
     * Checks verbs (~ actions) in the sentence to see if they may be expressing a temporal protocol.
     * So far 2 heuristics:
     * 1) [SEMANTICS] The verb belongs to call/operation semantic domain (to call, to invoke...)
     * 2) [ACTIONS] The verb refers to a method of the class under test
     *
     * @param excMember
     * @param propSeries
     * @param temporalMatch
     */
    // FIXME I'm afraid here I'm already attempting a translation (sorta). Not something I love
    // FIXME since the matchers are in the translator package and were not public
    private void assessIfTemporalMatch(DocumentedExecutable excMember,
                                       TemporalPropSeries propSeries,
                                       TemporalMatch temporalMatch) {
        Set<String> lemmatizedGoldenSet = goldenSet.stream().map(TempProtocolMatcher::getLemma).collect(Collectors.toSet());
        Set<String> nonCopulaVerbs = propSeries.verbsDB.stream().filter(x -> x.getKindOfVerb()
                != Verb.GrammaticalKind.COPULA).map(x -> getLemma(x.getWord()))
                .collect(Collectors.toSet());

        // FIXME the non-copula verbs heuristics works for one category of protocols but not
        // FIXME all of them. Imagine having at least 2 categories: explicit by verb (you must call,
        // FIXME must be invoked, etc.); implicit by verb referring to method semantics.
        // FIXME We probably should require that the verb is EITHER a non copula in our semantic
        // FIXME model about concepts, OR, a predicate match on other methods.
        // First criterion: verbs such as "to call", "to invoke", and synonym related to our concepts
        // FIXME f- containsAll. Check one proposition at a time and set right kind.
        boolean belongsToSemanticConcepts = !nonCopulaVerbs.isEmpty() &&
                lemmatizedGoldenSet.containsAll(nonCopulaVerbs);
        boolean isAction = false;
        if(!belongsToSemanticConcepts){
            // No verb related to calls/operations. Is it an action related to a specific method?
            Matcher matcher = new Matcher();
            Set<CodeElement<?>> possibleMethods = JavaElementsCollector.collect(excMember);
            for(String v : nonCopulaVerbs) {
                isAction = matcher.subjectMatch(v, possibleMethods)!=null;
                if(isAction){
                    // Found an action verb, we're good
                    // TODO are we? check
                    break;
                }
            }
        }
        if(isAction || belongsToSemanticConcepts){
            for(TemporalProposition prop : propSeries.getPropositions()){

            }
        }
    }


    /**
     * Given a word text, lemmatize it
     *
     * @return the result of lemmatization
     */
    public static String getLemma(String word) {
        return new Sentence(word).lemma(0);
    }
}


