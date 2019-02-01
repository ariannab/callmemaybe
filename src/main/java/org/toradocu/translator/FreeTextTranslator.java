package org.toradocu.translator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.toradocu.conf.Configuration;
import org.toradocu.extractor.CommentContent;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.Equivalences;
import org.toradocu.extractor.FreeText;
import org.toradocu.extractor.MethodMatch;

public class FreeTextTranslator {

  public String translate(FreeText freeTextComment, DocumentedExecutable excMember) {
    String commentText = freeTextComment.getComment().getText();
    String[] sentences = commentText.split("\\. ");
    Set<String> conditions = new LinkedHashSet<>();
    String oracle = "";

    for (String sentence : sentences) {
      // Verify comment contains equivalence declaration...
      MethodMatch equivalenceMatch = Equivalences.getEquivalentOrSimilarMethod(sentence);
      if (equivalenceMatch != null) {
        if (equivalenceMatch.isSimilarity()) {
          String condition = extractCondition(sentence);
          if (condition != null) {
            List<PropositionSeries> extractedPropositions =
                Parser.parse(new CommentContent(condition), excMember);
            for (PropositionSeries propositions : extractedPropositions) {
              BasicTranslator.translate(propositions, excMember, sentence);
              conditions.add(propositions.getTranslation());

              // TODO 1. substitute implicit subject with methodResultID
              // TODO 2. substitute method signature with smart placeholder (is it necessary? Do we
              // need
              // to
              // TODO produce a semantic graph? I'd say: YES IF we need to match a parameter. BUT
              // YET...
              // TODO    ...why not using the subject match directly...???)

              if (!conditions.isEmpty()) {
                // For 1. pattern I found so far:
                String pattern = "(This|this) (is|method)";
                // If no pattern like this, the sentence starts directly as "Equivalent to..." and
                // methodResultID goes as head
                java.util.regex.Matcher isPattern = Pattern.compile(pattern).matcher(commentText);
                if (isPattern.find()) {
                  // TODO do we even care about substitution with Configuration.RETURN_VALUE here?
                  //            String implicitSubject = isPattern.group(1);
                  //            commentText = commentText.replace(implicitSubject,
                  // Configuration.RETURN_VALUE);
                  //          }
                  Matcher matcher = new Matcher();
                  Set<CodeElement<?>> matchingCodeEelem =
                      matcher.subjectMatch(equivalenceMatch.getSimpleName(), excMember);
                  if (matchingCodeEelem != null && !matchingCodeEelem.isEmpty()) {
                    List<CodeElement<?>> sortedCodeElem = new ArrayList<>(matchingCodeEelem);
                    // FIXME You have to match arguments!
                    Match theOne = matcher.checkArgsAndPickBestMatch(excMember, "", sortedCodeElem);
                    oracle =
                        Configuration.RETURN_VALUE + ".equals(" + theOne.getBaseExpression() + ")";
                  }
                }
              }
            }
          }
        }
      }
    }

    // TODO probably we don't want to return a String here, this is just a stub
    return oracle;
  }

  private String extractCondition(String text) {
    java.util.regex.Matcher matchIf =
        Pattern.compile("\\b" + "if" + "\\b", Pattern.CASE_INSENSITIVE).matcher(text);
    java.util.regex.Matcher matchWhen =
        Pattern.compile("\\b" + "when" + "\\b", Pattern.CASE_INSENSITIVE).matcher(text);

    int beginIndex = 0;
    int endIndex = 0;
    if (matchIf.find()) {
      beginIndex = matchIf.start();
    } else if (matchWhen.find()) {
      beginIndex = matchWhen.start();
    }

    // TODO endIndex is the index of the SUBSEQUENT (to the if or when) comma or dot
    endIndex = text.indexOf(",");
    if (endIndex > beginIndex) {
      return text.substring(beginIndex, endIndex);
    }
    return null;
  }
}
