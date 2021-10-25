package org.callmemaybe.translator.preprocess;

import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.JavadocComment;

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
