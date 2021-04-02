package org.memo.translator.preprocess;

import org.memo.extractor.DocumentedExecutable;
import org.memo.extractor.JavadocComment;

public interface PreprocessingPhase {
  String run(JavadocComment tag, DocumentedExecutable excMember);
}
