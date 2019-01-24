package org.toradocu.translator.preprocess;

import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.JavadocComment;

public class RemoveMayBe implements PreprocessingPhase {

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {
    String comment = tag.getComment().getText();

    if (comment.contains("may be")) {
      comment = comment.replaceAll("may be", "");
    }
    if (comment.contains("can be")) {
      comment = comment.replaceAll("can be", "");
    }
    return comment;
  }
}
