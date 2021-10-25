package org.memo.translator.preprocess;

import org.memo.extractor.DocumentedExecutable;
import org.memo.extractor.JavadocComment;

public class Trim implements PreprocessingPhase {

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {

    return tag.getComment().getText().trim();
  }
}
