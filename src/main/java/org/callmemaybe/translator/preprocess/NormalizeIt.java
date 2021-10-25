package org.memo.translator.preprocess;

import static java.util.stream.Collectors.toList;

import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.semgraph.SemanticGraph;
import java.util.List;
import org.memo.extractor.CommentContent;
import org.memo.extractor.DocumentedExecutable;
import org.memo.extractor.JavadocComment;
import org.memo.translator.Parser;
import org.memo.translator.PropositionSeries;

/** Created by arianna on 29/06/17. */
public class NormalizeIt implements PreprocessingPhase {

  private static String normalizeComment(String comment, DocumentedExecutable method) {
    // "it" would be translated as a standalone subject, but more probably it is referred to another
    // more meaningful one:
    // probably a previous mentioned noun.
    if (comment.contains(" it ")) {
      final List<PropositionSeries> extractedPropositions =
          Parser.parse(new CommentContent(comment), method);
      final List<SemanticGraph> semanticGraphs =
          extractedPropositions.stream().map(PropositionSeries::getSemanticGraph).collect(toList());
      for (SemanticGraph sg : semanticGraphs) {
        List<IndexedWord> nouns = sg.getAllNodesByPartOfSpeechPattern("NN(.*)");
        if (!nouns.isEmpty()) {
          IndexedWord boh = nouns.stream().findFirst().get();
          comment = comment.replace(" it ", " " + boh.word() + " ");
        }
      }
    }

    return comment;
  }

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {
    return normalizeComment(tag.getComment().getText(), excMember);
  }
}
