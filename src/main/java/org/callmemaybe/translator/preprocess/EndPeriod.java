package org.callmemaybe.translator.preprocess;

import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.JavadocComment;

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
