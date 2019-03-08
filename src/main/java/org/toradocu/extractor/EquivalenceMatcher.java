package org.toradocu.extractor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquivalenceMatcher {

  /**
   * This method answers to the question "does the comment express an equivalence?". Basically a man
   * in the middle
   *
   * @param comment comment to parse
   * @return the signature of the (supposedly) equivalent method
   */
  public static EquivalentMethodMatch getEquivalentOrSimilarMethod(String comment) {
    // TODO maybe a more comprehensive list (e.g. consider an external dictionary) would be better
    // TODO consider also: behaves (as?), like
    KeywordsSet equivalenceKw =
        new KeywordsSet(
            Arrays.asList("equivalent", "similar", "analog", "same as", "identical"),
            KeywordsSet.Category.EQUIVALENCE);
    EquivalentMethodMatch methodMatch = getSignatureInMatchingComment(comment, equivalenceKw);
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
    return new EquivalentMethodMatch(new ArrayList<>(), false, false, new HashMap<>(), false);
  }

  /**
   * Parses a comment searching for a) presence of one of the keywords b) a method signature (a. and
   * b. in the same sentence).
   *
   * @param comment the comment to parse
   * @param keywordsSet the keywords to search for
   * @return the signature of the (supposedly) equivalent method
   */
  private static EquivalentMethodMatch getSignatureInMatchingComment(
      String comment, KeywordsSet keywordsSet) {

    EquivalentMethodMatch match = null;

    // String methodRegex = "(!)?(\\w+(\\((.*?(?<!\\) ))\\)|\\.\\w+|#\\w+)+)";
    // TODO let's try the following method regex: it should be correctly recursive for chain of
    // calls (separated by .)
    String methodRegex = "(!)?([A-Z]\\w+[.#])?(\\w+(\\((.*?(?<!\\) ))\\))+)(\\)+)?\\.?";
    String partialMethodRegex = "(!)?[A-Z]\\w+[.#]\\w+";
    for (String word : keywordsSet.getKw()) {
      Matcher keywordMatcher =
          Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment);
      if (keywordMatcher.find()) {
        // I do not only want the comment to contain the keywords, I also want to find a
        // method signature in it - otherwise, what is this method equivalent to?
        java.util.regex.Matcher signatureMatch;
        boolean partial = false;
        int group = 0;
        if (word.equals("as")) {
          signatureMatch = Pattern.compile(" as " + methodRegex).matcher(comment);
        } else {
          signatureMatch = Pattern.compile(methodRegex).matcher(comment);
        }
        if (!signatureMatch.find()) {
          signatureMatch = Pattern.compile(partialMethodRegex).matcher(comment);
          partial = true;
        }
        signatureMatch.reset();

        boolean equivalence = false;
        boolean similarity = false;
        boolean negation = false;
        Map<String, List<String>> argumentsMap = new HashMap<>();
        ArrayList<String> signaturesFound = new ArrayList<>();
        while (signatureMatch.find() && !doRangesOverlap(keywordMatcher, signatureMatch)) {
          String signatureFound = signatureMatch.group(group);
          if (signatureFound.endsWith(".")) {
            signatureFound = signatureFound.substring(0, signatureFound.length() - 1);
          }
          signaturesFound.add(signatureFound);
          negation = signatureMatch.group(1) != null;
          List<String> arguments = new ArrayList<>();
          if (!partial) {
            arguments = extractArguments(signatureMatch, 5);
          }
          argumentsMap.put(signatureFound, arguments);
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
            equivalence = false;
            similarity = true;
            // return new EquivalentMethodMatch(signatureFound, false, true, arguments, negation);
          } else {
            equivalence = true;
            similarity = false;
            // return new EquivalentMethodMatch(signatureFound, true, false, arguments, negation);
          }
        }
        if (similarity || equivalence) {
          match =
              new EquivalentMethodMatch(
                  signaturesFound, equivalence, similarity, argumentsMap, negation);
        }
      }
    }
    return match;
  }

  private static List<String> extractArguments(Matcher methodMatch, int group) {
    if (methodMatch.group(group) != null) {
      // the method takes arguments
      String[] args = methodMatch.group(group).split(",");
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
