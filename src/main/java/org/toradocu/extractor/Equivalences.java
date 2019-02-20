package org.toradocu.extractor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Equivalences {

  /**
   * This method answers to the question "does the comment express an equivalence?". Basically a man
   * in the middle
   *
   * @param comment comment to parse
   * @return the signature of the (supposedly) equivalent method
   */
  public static MethodMatch getEquivalentOrSimilarMethod(String comment) {
    // TODO maybe a more comprehensive list (e.g. consider an external dictionary) would be better
    // TODO consider also: behaves (as?), like
    KeywordsSet equivalenceKw =
        new KeywordsSet(
            Arrays.asList("equivalent", "similar", "analog", "same as", "identical"),
            KeywordsSet.Category.EQUIVALENCE);
    MethodMatch methodMatch = getSignatureInMatchingComment(comment, equivalenceKw);
    if (methodMatch != null) {
      return methodMatch;
    } else {
      // TODO add "instead of" (comments like "this method should be used instead of the other
      // method"
      KeywordsSet similarityKw =
          new KeywordsSet(
              Arrays.asList("prefer", "alternative", "replacement for"),
              KeywordsSet.Category.SIMILARITY);
      methodMatch = getSignatureInMatchingComment(comment, similarityKw);
      if (methodMatch != null) {
        return methodMatch;
      }
    }
    return new MethodMatch("", false, false, new ArrayList<>(), false);
  }

  /**
   * Parses a comment searching for a) presence of one of the keywords b) a method signature (a. and
   * b. in the same sentence).
   *
   * @param comment the comment to parse
   * @param keywordsSet the keywords to search for
   * @return the signature of the (supposedly) equivalent method
   */
  private static MethodMatch getSignatureInMatchingComment(
      String comment, KeywordsSet keywordsSet) {
    String methodRegex = "(!)?(\\w+(\\((.*?(?<!\\) ))\\)|\\.\\w+|#\\w+)+)";
    for (String word : keywordsSet.getKw()) {
      Matcher matcher =
          Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment);
      if (matcher.find()) {
        // I do not only want the comment to contain the keywords, I also want to find a
        // method signature in it - otherwise, what is this method equivalent to?
        java.util.regex.Matcher signatureMatch;
        int group = 2;
        if (word.equals("as")) {
          signatureMatch = Pattern.compile(" as " + methodRegex).matcher(comment);
        } else {
          signatureMatch = Pattern.compile(methodRegex).matcher(comment);
        }

        if (signatureMatch.find() && !doRangesOverlap(matcher, signatureMatch)) {
          String signatureFound = signatureMatch.group(group);
          boolean negation = signatureMatch.group(1) != null;
          List<String> arguments = extractArguments(signatureMatch);
          // TODO check if there is an "if" or "when" or "except" - more?
          if (keywordsSet.getCategory().equals(KeywordsSet.Category.SIMILARITY)
              || Pattern.compile("\\b" + "if" + "\\b", Pattern.CASE_INSENSITIVE)
                  .matcher(comment)
                  .find()
              || Pattern.compile("\\b" + "when" + "\\b", Pattern.CASE_INSENSITIVE)
                  .matcher(comment)
                  .find()
              || Pattern.compile("\\b" + "except" + "\\b", Pattern.CASE_INSENSITIVE)
                  .matcher(comment)
                  .find()) {
            return new MethodMatch(signatureFound, false, true, arguments, negation);
          } else {
            return new MethodMatch(signatureFound, true, false, arguments, negation);
          }
        }
      }
    }
    return null;
  }

  private static List<String> extractArguments(Matcher methodMatch) {
    if (methodMatch.group(4) != null) {
      // the method takes arguments
      String[] args = methodMatch.group(4).split(",");
      for (int i = 0; i < args.length; i++) {
        args[i] = args[i].trim();
      }
      return Arrays.asList(args);
    }
    return null;
  }

  private static boolean doRangesOverlap(Matcher matcher, Matcher methodMatch) {
    // We do NOT want that (x1 <= y2 && y1 <= x2)
    return matcher.start() <= methodMatch.end() && methodMatch.start() <= matcher.end();
  }
}
