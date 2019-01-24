package org.toradocu.translator.preprocess;

import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.JavadocComment;

public class Trim implements PreprocessingPhase {

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {

    return tag.getComment().getText().trim();
  }
}
