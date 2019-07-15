package org.toradocu.extractor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
   * @param codeSnippet
   * @return the signature of the (supposedly) equivalent method
   */
  public static EquivalentMatch getEquivalentOrSimilarMethod(
      String comment, CodeSnippet codeSnippet) {
    // TODO maybe a more comprehensive list (e.g. consider an external dictionary) would be better
    // TODO consider also: behaves (as?), like
    KeywordsSet equivalenceKw =
        new KeywordsSet(
            Arrays.asList(
                "equivalent",
                "similar",
                "analog",
                "identical",
                "behaves exactly",
                "equal to",
                "same as",
                "same value"),
            KeywordsSet.Category.EQUIVALENCE);
    EquivalentMatch methodMatch =
        getSignatureInMatchingComment(comment, codeSnippet, equivalenceKw);
    if (methodMatch != null) {
      return methodMatch;
    } else {
      // TODO add "instead of" (comments like "this method should be used instead of the other
      // TODO method"
      KeywordsSet similarityKw =
          new KeywordsSet(
              Arrays.asList("prefer", "alternative", "replacement for"),
              KeywordsSet.Category.SIMILARITY);
      methodMatch = getSignatureInMatchingComment(comment, codeSnippet, similarityKw);
      if (methodMatch != null) {
        return methodMatch;
      }
    }
    return new EquivalentMatch(new HashMap<>(), false, false, new HashMap<>(), false);
  }

  /**
   * Parses a comment searching for a) presence of one of the keywords b) a method signature (a. and
   * b. in the same sentence).
   *
   * @param comment the comment to parse
   * @param codeSnippet
   * @param keywordsSet the keywords to search for
   * @return the signature of the (supposedly) equivalent method
   */
  private static EquivalentMatch getSignatureInMatchingComment(
      String comment, CodeSnippet codeSnippet, KeywordsSet keywordsSet) {
    EquivalentMatch match = null;

    for (String word : keywordsSet.getKw()) {
      Matcher keywordMatcher =
          Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment);
      if (keywordMatcher.find()) {
        boolean similarity = isSimilarity(comment, keywordsSet);
        boolean equivalence = !similarity;
        match = buildMatchWithSignatures(comment, word, keywordMatcher, equivalence);
        if (codeSnippet != null) {
          match.setCodeSnippet(codeSnippet);
        }
      }
    }
    return match;
  }

  private static EquivalentMatch buildMatchWithSignatures(
      String comment, String word, Matcher keywordMatcher, boolean equivalence) {
    boolean negation = false;
    String receiver;
    String methodRegex =
        "(!)?(([a-z]\\w*)\\.)?([A-Z]\\w+[.#])?(\\w+(\\((.*?(?<!\\) ))\\))+)(\\)+)?\\.?";
    String partialMethodRegex = "(!)?[A-Z]\\w+[.#]\\w+";
    Map<String, List<String>> argumentsMap = new HashMap<>();
    Map<String, String> signaturesFound = new LinkedHashMap<>();
    java.util.regex.Matcher signatureMatch;
    boolean partial = false;

    int signatureGroup = 0;
    if (word.contains("as")) {
      signatureMatch = Pattern.compile("( as )" + methodRegex).matcher(comment);
      if (!signatureMatch.find()) {
        return new EquivalentMatch(signaturesFound, false, false, argumentsMap, negation);
      }
    }

    signatureMatch = Pattern.compile(methodRegex).matcher(comment);

    boolean matchFound = signatureMatch.find();
    if (!matchFound) {
      signatureMatch = Pattern.compile(partialMethodRegex).matcher(comment);
      partial = true;
    }
    signatureMatch.reset();
    while (signatureMatch.find() && !doRangesOverlap(keywordMatcher, signatureMatch)) {
      receiver = "";
      if (signatureMatch.groupCount() > 2 && signatureMatch.group(3) != null) {
        receiver = signatureMatch.group(3);
      }
      String signatureFound = signatureMatch.group(signatureGroup);
      if (signatureFound.endsWith(".")) {
        signatureFound = signatureFound.substring(0, signatureFound.length() - 1);
      }
      if (!receiver.isEmpty()) {
        signatureFound = signatureFound.replace(receiver + ".", "");
      }
      signaturesFound.put(signatureFound, receiver);
      negation = signatureMatch.group(1) != null;
      List<String> arguments = new ArrayList<>();
      if (!partial) {
        arguments = extractArguments(signatureMatch, 7);
      }
      argumentsMap.put(signatureFound, arguments);
    }
    return new EquivalentMatch(signaturesFound, equivalence, !equivalence, argumentsMap, negation);
  }

  private static boolean isSimilarity(String comment, KeywordsSet keywordsSet) {
    return keywordsSet.getCategory().equals(KeywordsSet.Category.SIMILARITY)
        || Pattern.compile("\\b" + "if" + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment).find()
        || Pattern.compile("\\b" + "when" + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment).find()
        || Pattern.compile("\\b" + "except" + "\\b", Pattern.CASE_INSENSITIVE)
            .matcher(comment)
            .find();
  }

  private static List<String> extractArguments(Matcher methodMatch, int group) {
    if (methodMatch.group(group) != null && !methodMatch.group(group).isEmpty()) {
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
