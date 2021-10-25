package org.memo.translator.preprocess;

import org.memo.extractor.DocumentedExecutable;
import org.memo.extractor.JavadocComment;

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
