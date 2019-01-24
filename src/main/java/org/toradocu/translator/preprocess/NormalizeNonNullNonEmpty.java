package org.toradocu.translator.preprocess;

import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.JavadocComment;

public class NormalizeNonNullNonEmpty implements PreprocessingPhase {

  /**
   * Replace some common expressions in the comment with other standard easier to translate
   * correctly.
   *
   * @param comment the String comment to sanitize
   * @param method the DocumentedExecutable
   * @return the normalized comment
   */
  private static String normalizeComment(String comment, DocumentedExecutable method) {

    if (comment.contains("non-null")) {
      comment = comment.replace("non-null", "!=null");
    }

    if (comment.contains("nonnull")) {
      comment = comment.replace("nonnull", "!=null");
    }

    if (comment.contains("non-empty")) {
      comment = comment.replace("non-empty", "not empty");
    }

    if (comment.contains("nonempty")) {
      comment = comment.replace("nonempty", "not empty");
    }

    return comment;
  }

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {
    return normalizeComment(tag.getComment().getText(), excMember);
  }
}
