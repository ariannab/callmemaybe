package org.callmemaybe.extractor;

import edu.stanford.nlp.semgraph.SemanticGraph;
import org.callmemaybe.translator.Parser;
import org.callmemaybe.translator.PropositionSeries;
import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempProtocolMatcher {

  private enum ProtocolConcepts{
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
   *         no match
   */
  public static TemporalMatch findProtocolInComment(CommentContent commentContent,  DocumentedExecutable excMember) {
    List<SemanticGraph> semanticGraphs = Parser.extractSemanticGraphs(commentContent, excMember);
    List<PropositionSeries> propositionSeries = Parser.parseTemporal(commentContent, excMember);
    TemporalMatch temporalMatch = new TemporalMatch();
    // (new EnumerationIterator, not(will function)) || (#setEnumeration, is called)

    // TODO now we have enhanced deps from the comments, e.g., advcl:until. That's a good sign,
    // TODO but are there *operations* associated with it? If it, we're likely looking at a protocol.
    Word2Vec w2vModel = WordVectorSerializer.readWord2VecModel("src/test/resources/bin/SO_vectors_200.bin");
    List<String> allProtocolConcepts = Stream.of(ProtocolConcepts.values())
            .map(ProtocolConcepts::getStringConcept)
            .collect(Collectors.toList());
    Collection goldenSet = w2vModel.wordsNearest(allProtocolConcepts, Collections.EMPTY_LIST, 10);
    for(PropositionSeries p : propositionSeries){
      // FIXME TERRIBLE but I still dunno why/how we may end up with multiple prop series!
        temporalMatch.setTemporalMatch(goldenSet.containsAll(p.getAllVerbs()));
    }
    return temporalMatch;
  }
}


