package org.memo.extractor;

public class FreeText extends JavadocComment {
  /**
   * Constructs a {@code JavadocComment} of the specific kind, with the given comment.
   *
   * @param kind the comment kind, must not be null
   * @param comment the comment associated with the exception, must not be null
   */
  public FreeText(Kind kind, CommentContent comment) {
    super(Kind.FREETEXT, comment);
  }
}
