package org.callmemaybe.translator.preprocess;

import java.util.List;
import org.callmemaybe.extractor.CommentContent;
import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.JavadocComment;

public class Preprocessor {

  private List<PreprocessingPhase> phases;

  Preprocessor(List<PreprocessingPhase> phases) {
    this.phases = phases;
  }

  public JavadocComment preprocess(JavadocComment tag, DocumentedExecutable excMember) {
    for (PreprocessingPhase phase : phases) {
      String preprocessedText = phase.run(tag, excMember);
      tag.setComment(new CommentContent(preprocessedText, tag.getComment().getWordsMarkedAsCode()));
    }
    return tag;
  }
}
