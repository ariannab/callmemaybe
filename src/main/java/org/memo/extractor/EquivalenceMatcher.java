package org.memo.extractor;

import com.crtomirmajer.wmd4j.WordMovers;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.memo.MeMo;
import org.memo.translator.semantic.GloveModelWrapper;

public class EquivalenceMatcher {

    private static final KeywordsSet equivBigrams = new KeywordsSet(
            Arrays.asList(
                    "equivalent",
                    "similar",
                    "analog",
                    "like",
                    "identical",
                    "behaves exactly as",
                    "behaves identically",
                    "equal to",
                    "same",
                    "prefer",
                    "alternative",
                    "replacement for"
            ),
            KeywordsSet.Category.EQUIVALENCE);

    // FIXME is this necessary? Why not adding this to the above?
//  private static final KeywordsSet similarityKw = new KeywordsSet(
//      Arrays.asList(
//              "prefer",
//              "alternative",
//              "replacement for"),
//      KeywordsSet.Category.SIMILARITY);

    /**
     * This method answers to the question "does the comment express a MR?".
     * Entry point of MR Finder.
     *
     * @param comment     comment to parse
     * @param codeSnippet code snippet in comment, if any
     * @return EquivalentMatch object containing information such as the matched signature, empty if no match
     */
    public static EquivalentMatch findEquivalencesInComment(String comment, CodeSnippet codeSnippet) {
        EquivalentMatch methodMatch = classifyEquivalenceComment(comment, codeSnippet, equivBigrams);
        if (methodMatch != null) {
            return methodMatch;
        } else {
            if (MeMo.configuration.isSemanticMatcherEnabled()) {
                // No match found via n-grams: try WMD
                methodMatch = findEquivalencesSemantic(comment, codeSnippet);
            }
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
     * @param comment     comment to parse
     * @param codeSnippet
     * @return the signature of the (supposedly) equivalent method
     */
    public static EquivalentMatch findEquivalencesSemantic(String comment, CodeSnippet codeSnippet) {
        EquivalentMatch methodMatch =
                classifyEquivalenceSemantic(comment, codeSnippet, equivBigrams);
        if (methodMatch != null)
            return methodMatch;

        return new EquivalentMatch(new HashMap<>(), false, false, new HashMap<>(), false);
    }

    /**
     * Parses a comment searching for a) presence of one of the keywords b) a method signature (a. and
     * b. in the same sentence).
     *
     * @param comment     the comment to parse
     * @param codeSnippet
     * @param keywordsSet the keywords to search for
     * @return the signature of the (supposedly) equivalent method
     */

    // FIXME THIS METHOD TAKES FOR GRANTED THAT THERE IS JUST ONE MATCH?
    private static EquivalentMatch classifyEquivalenceComment(
            String comment, CodeSnippet codeSnippet, KeywordsSet keywordsSet) {
        EquivalentMatch match = null;

        if(comment.contains("The Iterable equivalent")){
            System.out.println("!!!! DEBUG !!!");
        }

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

    /**
     * Parses a comment searching for a) presence of one of the keywords b) a method signature (a. and
     * b. in the same sentence).
     *
     * @param comment     the comment to parse
     * @param codeSnippet
     * @param biGrams     the keywords to search for
     * @return the signature of the (supposedly) equivalent method
     */

    // FIXME THIS METHOD TAKES FOR GRANTED THAT THERE IS JUST ONE MATCH?
    private static EquivalentMatch classifyEquivalenceSemantic(
            String comment, CodeSnippet codeSnippet, KeywordsSet biGrams) {
        EquivalentMatch match = null;

        String methodRegex =
                "(new )?(!)?(([a-z]\\w*)\\.)?([A-Z]\\w+[.#])?(\\w+(\\((.*?(?<!\\) ))\\))+)(\\)+)?\\.?";
        // "(!)?(([a-z]\\w*)\\.)?([A-Z]\\w+[.#])?(\\w+(\\((.*?)\\)$)+)(\\)+)?\\.?";
        String partialMethodRegex = "(!)?([A-Z]\\w+)?[.#]\\w+";
        Map<String, List<String>> argumentsMap = new HashMap<>();
        Map<String, String> signaturesFound = new LinkedHashMap<>();
        java.util.regex.Matcher signatureMatch;
        boolean partial = false;
        int signatureGroup = 0;
        signatureMatch = Pattern.compile(methodRegex).matcher(comment);
        boolean matchFound = signatureMatch.find();
        String puppyComment = "";
        if (!matchFound) {
            signatureMatch = Pattern.compile(partialMethodRegex).matcher(comment);
            partial = signatureMatch.find();
        }
        signatureMatch.reset();
        while (signatureMatch.find()) {
            puppyComment = comment.replace(signatureMatch.group(0), "that method").
                    replaceAll("[@#]","");
        }
        for (String biGram : biGrams.getKw()) {
            double dist = 10;
            String puppySentence = biGram + " that method";
            try {
                WordMovers wm =
                        WordMovers.Builder()
                                .wordVectors(GloveModelWrapper.getInstance().getGloveTxtVectors())
                                .build();
                try {
                    // Reminder: the distance is the opposite of the similarity
                    dist = wm.distance(puppySentence, puppyComment);
                } catch (Exception e) {
                    // do nothing
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }

            // To obtain a normalized value between 1 and 0
            double normDist = dist / 10;
            // Seek a similarity of 75% minimum
            if (normDist < 0.26) {
                match = buildMatchWithSignatures(comment, true);
                if (codeSnippet != null) {
                    match.setCodeSnippet(codeSnippet);
                }

                FileWriter writer;
                try {
                    writer = new FileWriter("semantic-class-match.csv", true);
                    writer.append(comment);
                    writer.append(";");
                    writer.append(String.valueOf(dist));
                    writer.append(";");
                    writer.append(puppySentence);
                    writer.append(";");
                    writer.append("\n");
                    writer.close();
                    System.out.println("Hello I am the semantic matcher and I think you should consider:" + comment);
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return match;
    }

    private static EquivalentMatch buildMatchWithSignatures(String comment,
                                                            boolean equivalence) {
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
        while (signatureMatch.find()) {
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
