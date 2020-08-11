package org.toradocu.extractor;

import java.io.FileWriter;
import java.io.IOException;
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
   * This method answers to the question "does the comment express an equivalence?". Entry point of
   * free-text CLASSIFICATION.
   *
   * @param comment comment to parse
   * @param codeSnippet
   * @return the signature of the (supposedly) equivalent method
   */
  public static EquivalentMatch findEquivalencesInComment(String comment, CodeSnippet codeSnippet) {
    // TODO maybe a more comprehensive list (e.g. consider an external dictionary) would be better
    // TODO consider also: behaves (as?), like, SYNONYM
    KeywordsSet equivalenceKw =
        new KeywordsSet(
            Arrays.asList(
                "equivalent",
                "similar",
                "analog",
                "like",
                "identical",
                "behaves exactly",
                "behaves identically",
                "equal to",
                "same"
                // "same as",
                // "same value",
                ),
            KeywordsSet.Category.EQUIVALENCE);
    EquivalentMatch methodMatch = classifyEquivalenceComment(comment, codeSnippet, equivalenceKw);
    if (methodMatch != null) {
      return methodMatch;
    } else {
      // TODO add "instead of" (comments like "this method should be used instead of the other
      // TODO method"
      KeywordsSet similarityKw =
          new KeywordsSet(
              Arrays.asList("prefer", "alternative", "replacement for"),
              KeywordsSet.Category.SIMILARITY);
      methodMatch = classifyEquivalenceComment(comment, codeSnippet, similarityKw);
      if (methodMatch != null) {
        FileWriter writer;
        try {
          writer = new FileWriter("classifier-matches.csv", true);
          writer.append(comment);
          writer.append(";");
          writer.append("\n");
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return methodMatch;
      }
    }
    return new EquivalentMatch(new HashMap<>(), false, false, new HashMap<>(), false);
  }

  /**
   * This method answers to the question "does the comment express an equivalence?". Entry point of
   * free-text CLASSIFICATION.
   *
   * @param comment comment to parse
   * @param codeSnippet
   * @return the signature of the (supposedly) equivalent method
   */
  public static EquivalentMatch findEquivalencesInComment(String comment, CodeSnippet codeSnippet) {
    // TODO maybe a more comprehensive list (e.g. consider an external dictionary) would be better
    // TODO consider also: behaves (as?), like, SYNONYM
    KeywordsSet equivalenceKw =
        new KeywordsSet(
            Arrays.asList(
                "equivalent",
                "similar",
                "analog",
                "like",
                "identical",
                "behaves exactly",
                "behaves identically",
                "equal to",
                "same"
                // "same as",
                // "same value",
                ),
            KeywordsSet.Category.EQUIVALENCE);
    EquivalentMatch methodMatch = classifyEquivalenceComment(comment, codeSnippet, equivalenceKw);
    if (methodMatch != null) {
      return methodMatch;
    } else {
      // TODO add "instead of" (comments like "this method should be used instead of the other
      // TODO method"
      KeywordsSet similarityKw =
          new KeywordsSet(
              Arrays.asList("prefer", "alternative", "replacement for"),
              KeywordsSet.Category.SIMILARITY);
      methodMatch = classifyEquivalenceComment(comment, codeSnippet, similarityKw);
      if (methodMatch != null) {
        FileWriter writer;
        try {
          writer = new FileWriter("classifier-matches.csv", true);
          writer.append(comment);
          writer.append(";");
          writer.append("\n");
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
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

  // FIXME THIS METHOD TAKES FOR GRANTED THAT THERE IS JUST ONE MATCH?
  private static EquivalentMatch classifyEquivalenceComment(
      String comment, CodeSnippet codeSnippet, KeywordsSet keywordsSet) {
    EquivalentMatch match = null;

    for (String word : keywordsSet.getKw()) {
      Matcher keywordMatcher =
          Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE).matcher(comment);
      if (keywordMatcher.find()) {
        boolean similarity = isSimilarity(comment, keywordsSet);
        boolean equivalence = !similarity;
        match = buildMatchWithSignatures(comment, keywordMatcher, equivalence);
        if (codeSnippet != null) {
          match.setCodeSnippet(codeSnippet);
        }
      }
    }
    return match;
  }

  private static EquivalentMatch buildMatchWithSignatures(
      String comment, Matcher keywordMatcher, boolean equivalence) {
    boolean negation = false;
    String receiver;
    String methodRegex =
        "(new )?(!)?(([a-z]\\w*)\\.)?([A-Z]\\w+[.#])?(\\w+(\\((.*?(?<!\\) ))\\))+)(\\)+)?\\.?";
    // "(!)?(([a-z]\\w*)\\.)?([A-Z]\\w+[.#])?(\\w+(\\((.*?)\\)$)+)(\\)+)?\\.?";
    String partialMethodRegex = "(!)?([A-Z]\\w+)?[.#]\\w+";
    Map<String, List<String>> argumentsMap = new HashMap<>();
    Map<String, String> signaturesFound = new LinkedHashMap<>();
    java.util.regex.Matcher signatureMatch;
    boolean partial = false;

    int signatureGroup = 0;
    //    if (word.contains("as")) {
    //      signatureMatch = Pattern.compile("( as )" + methodRegex).matcher(comment);
    //      if (!signatureMatch.find()) {
    //        return new EquivalentMatch(signaturesFound, false, false, argumentsMap, negation);
    //      }
    //    }

    signatureMatch = Pattern.compile(methodRegex).matcher(comment);

    boolean matchFound = signatureMatch.find();
    if (!matchFound) {
      signatureMatch = Pattern.compile(partialMethodRegex).matcher(comment);
      partial = signatureMatch.find();
    }
    signatureMatch.reset();
    while (signatureMatch.find() && !doRangesOverlap(keywordMatcher, signatureMatch)) {
      if (signatureMatch.group(1) != null) {
        // FIXME Not supporting "new"
        break;
      }
      receiver = "";
      if (signatureMatch.groupCount() > 3 && signatureMatch.group(4) != null) {
        receiver = signatureMatch.group(4);
      }
      String signatureFound = signatureMatch.group(signatureGroup);
      if (!signatureIsEqualMethod(signatureFound)) {
        if (signatureFound.endsWith(".")) {
          signatureFound = signatureFound.substring(0, signatureFound.length() - 1);
        }
        if (!receiver.isEmpty()) {
          signatureFound = signatureFound.replace(receiver + ".", "");
        }
        signaturesFound.put(signatureFound, receiver);
        if (partial) {
          // FIXME not very nice, and in general this group-management should be improved
          negation = signatureMatch.group(1) != null;
        } else {
          negation = signatureMatch.group(2) != null;
        }
        List<String> arguments = new ArrayList<>();
        if (!partial) {
          arguments = extractArguments(signatureMatch, 8);
        }
        argumentsMap.put(signatureFound, arguments);
      }
    }
    return new EquivalentMatch(signaturesFound, equivalence, !equivalence, argumentsMap, negation);
  }

  private static boolean signatureIsEqualMethod(String signatureFound) {
    // FIXME avoid involving the equals method in cross-oracles
    return signatureFound.contains(".equals(") || signatureFound.endsWith("#equals");
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
