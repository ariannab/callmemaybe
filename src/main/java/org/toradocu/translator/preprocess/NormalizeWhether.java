package org.toradocu.translator.preprocess;

import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.JavadocComment;

public class NormalizeWhether implements PreprocessingPhase {

  private static String normalizeComment(String comment, DocumentedExecutable method) {
    if (comment.toLowerCase().startsWith("whether")) {
      String preComment = "True if";
      String postComment = ", false otherwise";
      comment = comment.replaceFirst("whether", preComment) + postComment;
    }

    return comment;
  }

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {
    return normalizeComment(tag.getComment().getText(), excMember);
  }
}
