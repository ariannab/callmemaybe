package org.toradocu.translator.preprocess;

import java.util.List;
import org.toradocu.extractor.Comment;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.JavadocComment;

public class Preprocessor {

  private List<PreprocessingPhase> phases;

  Preprocessor(List<PreprocessingPhase> phases) {
    this.phases = phases;
  }

  public JavadocComment preprocess(JavadocComment tag, DocumentedExecutable excMember) {
    for (PreprocessingPhase phase : phases) {
      String preprocessedText = phase.run(tag, excMember);
      tag.setComment(new Comment(preprocessedText, tag.getComment().getWordsMarkedAsCode()));
    }
    return tag;
  }
}
