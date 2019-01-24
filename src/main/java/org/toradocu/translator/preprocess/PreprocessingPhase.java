package org.toradocu.translator.preprocess;

import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.JavadocComment;

public interface PreprocessingPhase {
  String run(JavadocComment tag, DocumentedExecutable excMember);
}
