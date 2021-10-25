package org.memo.translator.preprocess;

import org.memo.extractor.DocumentedExecutable;
import org.memo.extractor.JavadocComment;

public class EndPeriod implements PreprocessingPhase {

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {
    String comment = tag.getComment().getText();
    if (!comment.endsWith(".")) {
      comment += ".";
    }

    return comment;
  }
}
