package org.toradocu.translator;

import static org.toradocu.util.ComplianceChecks.isSpecCompilable;

import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.ParamTag;
import randoop.condition.specification.Guard;
import randoop.condition.specification.Precondition;

public class ParamTranslator {

  public Precondition translate(ParamTag tag, DocumentedExecutable excMember) {
    final String commentTranslation =
        isDescriptiveComment(tag.getComment().getText())
            ? ""
            : BasicTranslator.translate(tag, excMember);

    final Guard guard = new Guard(tag.getComment().getText(), commentTranslation);

    if (commentTranslation.isEmpty() || !isSpecCompilable(excMember, guard.getConditionSource())) {
      return new Precondition(tag.toString(), new Guard(tag.getComment().getText(), ""));
    }

    return new Precondition(tag.toString(), guard);
  }

  private boolean isDescriptiveComment(String text) {
    return text.matches("(.*) is (If|if) (.*)");
  }
}
