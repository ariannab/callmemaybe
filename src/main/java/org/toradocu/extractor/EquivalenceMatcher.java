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
   * @param codeSnippet
   * @return the signature of the (supposedly) equivalent method
   */
  public static EquivalentMatch getEquivalentOrSimilarMethod(
      String comment, String codeSnippet, boolean isExpression) {
    // TODO maybe a more comprehensive list (e.g. consider an external dictionary) would be better
    // TODO consider also: behaves (as?), like
    KeywordsSet equivalenceKw =
        new KeywordsSet(
            Arrays.asList("equivalent", "similar", "analog", "same as", "identical"),
            KeywordsSet.Category.EQUIVALENCE);
    EquivalentMatch methodMatch =
        getSignatureInMatchingComment(comment, codeSnippet, isExpression, equivalenceKw);
    if (methodMatch != null) {
      return methodMatch;
    } else {
      // TODO add "instead of" (comments like "this method should be used instead of the other
      // TODO method"
      KeywordsSet similarityKw =
          new KeywordsSet(
              Arrays.asList("prefer", "alternative", "replacement for"),
              KeywordsSet.Category.SIMILARITY);
      methodMatch = getSignatureInMatchingComment(comment, codeSnippet, isExpression, similarityKw);
      if (methodMatch != null) {
        return methodMatch;
      }
    }
    return new EquivalentMatch(new ArrayList<>(), false, false, new HashMap<>(), false);
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
      String comment, String codeSnippet, boolean isExpression, KeywordsSet keywordsSet) {
    EquivalentMatch match = null;

    for (String word : keywordsSet.getKw()) {
      Matcher keywordMatcher =
          Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment);
      if (keywordMatcher.find()) {
        boolean similarity = isSimilarity(comment, keywordsSet);
        boolean equivalence = !similarity;
        // if ((similarity && (codeSnippet.isEmpty() || !comment.contains(codeSnippet))) ||
        // equivalence) {
        match = buildMatchWithSignatures(comment, word, keywordMatcher, equivalence);

        //                } else {
        //                    match =
        //                            new EquivalentMatch(
        //                                    new ArrayList<>(),
        //                                    equivalence,
        //                                    similarity,
        //                                    new HashMap<>(),
        //                                    false);
        //                }

        match.setCodeSnippet(codeSnippet, isExpression);
      }
    }
    return match;
  }

  private static EquivalentMatch buildMatchWithSignatures(
      String comment, String word, Matcher keywordMatcher, boolean equivalence) {
    boolean negation = false;
    String methodRegex = "(!)?([A-Z]\\w+[.#])?(\\w+(\\((.*?(?<!\\) ))\\))+)(\\)+)?\\.?";
    String partialMethodRegex = "(!)?[A-Z]\\w+[.#]\\w+";

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
