package org.callmemaybe.translator.preprocess;

import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.JavadocComment;

public interface PreprocessingPhase {
  String run(JavadocComment tag, DocumentedExecutable excMember);
}
