package org.callmemaybe.extractor;

import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.simple.Sentence;
import org.callmemaybe.translator.Parser;
import org.callmemaybe.translator.TemporalPropSeries;
import org.callmemaybe.translator.Verb;
import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempProtocolMatcher {

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
    public static TemporalMatch findProtocolInComment(CommentContent commentContent, DocumentedExecutable excMember) {
//        List<SemanticGraph> semanticGraphs = Parser.extractSemanticGraphs(commentContent, excMember);
        List<TemporalPropSeries> propositionSeries = Parser.parseTemporal(commentContent, excMember);
        TemporalMatch temporalMatch = new TemporalMatch();
        // (new EnumerationIterator, not(will function)) || (#setEnumeration, is called)

        // TODO now we have enhanced deps from the comments, e.g., advcl:until. That's a good sign,
        // TODO but are there *operations* associated with it? If it, we're likely looking at a protocol.
        Word2Vec w2vModel = WordVectorSerializer.readWord2VecModel("src/test/resources/bin/SO_vectors_200.bin");
        List<String> allProtocolConcepts = Stream.of(ProtocolConcepts.values())
                .map(ProtocolConcepts::getStringConcept)
                .collect(Collectors.toList());
        Collection<String> goldenSet = w2vModel.wordsNearest(allProtocolConcepts, new HashSet<>(), 10);
        Set<String> lemmatizedGoldenSet = goldenSet.stream().map(TempProtocolMatcher::getLemma).collect(Collectors.toSet());
        for (TemporalPropSeries p : propositionSeries) {
            Set<String> nonCopulaVerbs = p.verbsDB.stream().filter(x -> x.getKindOfVerb()
                    != Verb.KindOfVerb.COPULA).map(x -> getLemma(x.getWord()))
                    .collect(Collectors.toSet());
            // FIXME TERRIBLE but I still dunno why/how we may end up with multiple prop series!
            temporalMatch.setMatch(lemmatizedGoldenSet.containsAll(nonCopulaVerbs));
            temporalMatch.setRelations(p.getTemporalRelations());
            // FIXME About to do something even uglier:
            temporalMatch.setMethodA(p.getPropositions().get(0).getSubject().getSubject());
            temporalMatch.setMethodB(p.getPropositions().get(1).getSubject().getSubject());
        }
        return temporalMatch;
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


