package org.callmemaybe.translator.preprocess;

import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.JavadocComment;

public class RemoveCommas implements PreprocessingPhase {

  @Override
  public String run(JavadocComment tag, DocumentedExecutable excMember) {
    return tag.getComment().getText().replaceAll(",", " ");
  }
}
