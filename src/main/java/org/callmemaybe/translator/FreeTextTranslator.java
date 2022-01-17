package org.callmemaybe.translator;

import com.github.javaparser.ast.ImportDeclaration;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.callmemaybe.extractor.DocSignatureParameters;
import org.callmemaybe.extractor.TempProtocolMatcher;
import org.callmemaybe.extractor.TemporalMatch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.callmemaybe.CallMeMaybe;
import org.callmemaybe.conf.Configuration;
import org.callmemaybe.extractor.CodeSnippet;
import org.callmemaybe.extractor.CommentContent;
import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.DocumentedParameter;
import org.callmemaybe.extractor.DocumentedType;
import org.callmemaybe.extractor.EquivalenceMatcher;
import org.callmemaybe.extractor.EquivalentMatch;
import org.callmemaybe.util.ComplianceChecks;
import org.callmemaybe.util.ComplianceError;
import org.callmemaybe.util.Reflection;

import static org.callmemaybe.translator.BasicTranslator.findMatchingCodeElements;
import static org.callmemaybe.translator.JavaElementsCollector.getCodeElementsFromRawMethods;

public class FreeTextTranslator {

    private static final String LOOP_OK = "OK";
    private static final String LOOP_CONTINUE = "continue";
    private static final String LOOP_RETURN = "return";

    /**
     * Translates a free text comment if it contains a MR. This method calls the MR Finder and then
     * the Translator.
     *
     * @param excMember      the executable member the comment belongs to
     * @param documentedType the type the member belongs to
     * @return the translation, null if failed
     */
    public List<EquivalentMatch> translateEq(
            DocumentedType documentedType, DocumentedExecutable excMember) {

        CommentContent commentContent = excMember.getFreeText().getComment();
        String commentText = commentContent.getText();
        String[] sentences = commentText.split("\\. |(?<!\\.\\.)\\.\\)");
        ArrayList<EquivalentMatch> matches = new ArrayList<>();
        EquivalentMatch equivalenceMatch;

        for (String sentence : sentences) {
            CallMeMaybe.configuration.ALL_SENTENCES = CallMeMaybe.configuration.ALL_SENTENCES + 1;
            // Let's avoid spurious comments...
            if (!sentence.isEmpty() && sentence.length() > 2) {
                // Verify if there is a snippet in the sentence...
                CodeSnippet sentenceSnippet = determineSnippet(commentContent, sentence);
                // MR Finder entry point: Verify sentence contains an equivalence declaration...
                equivalenceMatch = EquivalenceMatcher.findEquivalencesInComment(sentence, sentenceSnippet);

                if (!equivalenceMatch.getMethodSignatures().isEmpty()) {
                    String translatedCondition = "";
                    String condition = extractCondition(sentence);
                    if (equivalenceMatch.isConditional()
                            && !equivalenceMatch.getMethodSignatures().isEmpty()
                            && condition != null) {
                        // Conditional equivalence: translate condition first
                        translatedCondition =
                                translateConditionalEquivalence(
                                        excMember, equivalenceMatch, condition, documentedType);
                        if (!translatedCondition.isEmpty()) {
                            // If the condition was successfully translated, proceed with equivalent method match
                            matchEquivalentMethod(
                                    excMember, equivalenceMatch, translatedCondition, documentedType);
                        }
                    } else if (equivalenceMatch.getCodeSnippet() != null) {
                        // Equivalence against snippet
                        // FIXME what about similarity w/ snippets?
                        boolean compilable =
                                isSolvedSnippetCompilable(documentedType, excMember, equivalenceMatch);
                        if (compilable) {
                            String finalOracle = prepareResult(excMember, equivalenceMatch);
                            if (!finalOracle.isEmpty()) {
                                equivalenceMatch.setOracle(finalOracle);
                            }
                        } else {
                            equivalenceMatch.setOracle("");
                        }
                    } else {
                        // Exact equivalence, no condition, no snippet
                        matchEquivalentMethod(excMember, equivalenceMatch, translatedCondition, documentedType);
                    }
                    matches.add(equivalenceMatch);
                } else {
                    FileWriter writer;
                    try {
                        writer = new FileWriter("classifier-discarded.txt", true);
                        writer.append(sentence);
                        writer.append("\n");
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return matches;
    }

    /**
     * Translates a free text comment if it contains a temporal protocol.
     * This method calls the TP Finder and then the Translator.
     *
     * @param excMember the executable member the comment belongs to
     * @return the translation, null if failed
     */
    public List<TemporalMatch> translateTP(TempProtocolMatcher temporalMatcher, DocumentedExecutable excMember) {

        CommentContent commentContent = excMember.getFreeText().getComment();
        // TODO We have a similar method (addPlaceholders) that does something similar for other reasons.
        // TODO This may cause confusion.

        // FIXME See if this is the right point or it's below, later (setMembers calling replaceThisSubj):
//        commentContentPlaceholders(commentContent, excMember);

//    String commentText = commentContent.getText();
//    String[] sentences = commentText.split("\\. |(?<!\\.\\.)\\.\\)");
        ArrayList<TemporalMatch> matches = new ArrayList<>();
        TemporalMatch temporalMatch;
        temporalMatch = temporalMatcher.findProtocolInComment(commentContent, excMember);

        if (temporalMatch.isIndeedMatch()) {
            if(temporalMatch.getMemberA()==null || temporalMatch.getMemberA().isEmpty()) {
                translateMembers("A", temporalMatch, excMember, commentContent);
            }
            if(temporalMatch.getMemberB()==null || temporalMatch.getMemberB().isEmpty()) {
                translateMembers("B", temporalMatch, excMember, commentContent);
            }
            // After both proposition are translated, we set the "raw protocol". It is
            // only made of identifiers (simple names), that will be translated into real
            // code names only in the last phase. FIXME maybe not what we need tho
            temporalMatch.setRawProtocol(TemporalRule.buildRawProtocol(temporalMatch));
            if(temporalMatch.getRawProtocol().getFirstMember() != null &&
                    temporalMatch.getRawProtocol().getSecondMember()!=null) {
                // We have a complete raw protocol: translate into code
                // TODO Ignoring it for now, come back to it later.
//                translateRawProtocol(excMember, temporalMatch);

                // Build the oracle by gluing members and arrow
                temporalMatch.buildOracle();
                // Match is now ready to be returned
                matches.add(temporalMatch);
            }
        }
        return matches;
    }

    /**
     * This method will replace the original comment text. Use wisely.
     *
     * @param commentContent
     * @param excMember
     */
    private void commentContentPlaceholders(CommentContent commentContent, DocumentedExecutable excMember) {
        // FIXME is this the right place? What if a signature is not parsed right
        // FIXME ANSWER: does not look like, well, not always. try ignore "this call" and leave "this method"
        // FIXME for texts purposes
        // TODO Add more if found.
        // FIXME cases are sad, smt like  Apache commons->StringUtils.containsIgnoreCase would be nice
        commentContent.modifyTextWithPlaceholder("This method", excMember.getSignature());
//        commentContent.modifyTextWithPlaceholder("this call", excMember.getSignature());
        commentContent.modifyTextWithPlaceholder("this method", excMember.getSignature());
//        commentContent.modifyTextWithPlaceholder("This call", excMember.getSignature());

    }



    private void translateMembers(String propositionLetter,
                                  TemporalMatch temporalMatch,
                                  DocumentedExecutable excMember,
                                  CommentContent commentContent) {
        TemporalProposition proposition;
        if (propositionLetter.equals("A")) {
            proposition = temporalMatch.getPropositionA();
        } else {
            proposition = temporalMatch.getPropositionB();
        }

        String subjNameToMatch="";
        Matcher matcher = new Matcher();

        if (proposition.getKindOfProtocol() == TemporalProposition.KindOfProtocol.METHOD_TO_CALL) {
            subjNameToMatch = replaceThisSubject(proposition.getSubject().getSubject(), commentContent, excMember);
            if(!subjNameToMatch.isEmpty()){
                // Subject was the documented method itself: done with matching
                List<Executable> singleRawMethodsList = new ArrayList<>();
                singleRawMethodsList.add(excMember.getExecutable());
                List<CodeElement<?>> singleCandidateList = getCodeElementsFromRawMethods(singleRawMethodsList, Configuration.RECEIVER);
                HashMap<String, String> singleSignatureMap = new HashMap<>();
                singleSignatureMap.put(subjNameToMatch, Configuration.RECEIVER);
                DocSignatureParameters docSignatureParams = new DocSignatureParameters(subjNameToMatch, excMember.getParameters());
                docSignatureParams.doArgsFillingForSignatures(singleSignatureMap);
                Match matchForDocMethod = matcher.matchAccordingToArgs(
                        subjNameToMatch,
                        docSignatureParams,
                        excMember,
                        singleCandidateList
                        );
                if(matchForDocMethod!=null) {
                    // It should never be null here though, since it's the doc. method itself
                    String result = matchForDocMethod.getBaseExpression();
                    proposition.setTranslation(result);
                    temporalMatch.setMember(propositionLetter, result);
                }
            }
        } else if (proposition.getKindOfProtocol() == TemporalProposition.KindOfProtocol.ACTION_TO_MATCH) {
            // A classic subject + predicate matching similar to Jdoctor's.
            subjNameToMatch = proposition.getSubject().getSubject();
            Set<CodeElement<?>> allCodeElements = JavaElementsCollector.collect(excMember);
            // TODO Following code is borrowed from BasicTranslator. Check it's alright.
            Set<CodeElement<?>> matchingSubjs = matcher.subjectMatch(subjNameToMatch, allCodeElements);
            if(matchingSubjs.iterator().hasNext()) {
//                CodeElement<?> sub = matchingSubjs.iterator().next();
                final Set<CodeElement<?>> matchingCodeElements = new LinkedHashSet<>();
                String loop = findMatchingCodeElements(proposition, matchingSubjs, excMember, matchingCodeElements);
                if (loop.equals(LOOP_RETURN)) {
                    return;
                }

                // Maps each subject code element to the Java expression translation that uses that code
                // element.
                Map<CodeElement<?>, String> translations = new LinkedHashMap<>();
                for (CodeElement<?> subjectMatch : matchingCodeElements) {
                    Set<CodeElement<?>> codeElements = JavaElementsCollector.collectIgnoringScope(excMember);
                    Match predicateMatch = matcher.syntacticMatch(proposition.getVerbWord(),
                            codeElements, excMember, subjectMatch.getJavaExpression());
                    if(predicateMatch!=null) {
                        String currentTranslation = predicateMatch.getBaseExpression();
                        if (currentTranslation == null) {
                            //          ConditionTranslator.log.trace("Failed predicate translation for: " + p);
                            continue;
                        }
                        if (currentTranslation.contains("{") && currentTranslation.contains("}")) {
                            String argument =
                                    currentTranslation.substring(
                                            currentTranslation.indexOf("{") + 1, currentTranslation.indexOf("}"));

                            Set<CodeElement<?>> argMatches;

                            // Extract every CodeElement associated with the method and the containing class of the
                            // method.
                            Set<CodeElement<?>> methodCodeElements = JavaElementsCollector.collect(excMember);
                            argMatches = matcher.subjectMatch(argument, methodCodeElements);
                            if (argMatches.isEmpty()) {
                                //            ConditionTranslator.log.trace("Failed predicate translation for: " + p + "
                                // due to variable not found.");
                                continue;
                            } else {
                                Iterator<CodeElement<?>> it = argMatches.iterator();
                                String replaceTarget = "{" + argument + "}";
                                // Naive solution: picks the first match from the list.
                                String replacement = it.next().getJavaExpression();
                                currentTranslation = currentTranslation.replace(replaceTarget, replacement);
                            }
                        }
                        translations.put(subjectMatch, currentTranslation);
                    }
                }

                if (translations.isEmpty()) {
                    // Predicate match failed for every subject match.
                    return;
                }

                // The final translation.
                String result;
                // Sort matching subjects according to their priorities (defined in CodeElement#compareTo).
                List<CodeElement<?>> matchingSubjects = new ArrayList<>(translations.keySet());
                matchingSubjects.sort(Collections.reverseOrder());
                // Get all the matching subjects with the same priority (i.e., of the same type)
                // and pick the first one
                CodeElement<?> match =
                        matchingCodeElements
                                .stream()
                                .filter(c -> matchingSubjects.get(0).getClass().equals(c.getClass()))
                                .findFirst()
                                .orElse(null);

                result = translations.get(match);
                if (result == null) {
                    //        ConditionTranslator.log.warn("Failed translation for proposition " + p);
                    proposition.setTranslation("");
                } else {
                    //        ConditionTranslator.log.trace("Translated proposition " + p + " as: " + result);
                    proposition.setTranslation(result);
                    temporalMatch.setMember(propositionLetter, result);
                }

            }
        }
    }

    private String replaceThisSubject(String subject,
                                      CommentContent commentContent,
                                      DocumentedExecutable excMember) {
        // TODO add more, "this method", cases, etch.

        // FIXME Probably we don't want to return nor the name nor the signature but a proper JavaExpression
        // FIXME From the code element.
        if(subject.contains("this call")) {
            return excMember.getSignature();
        }else if(subject.contains("This method")) {
            return excMember.getSignature();
        }else if(subject.contains("method_")){
            return commentContent.getSignaturesInComment().get(subject);
        }
        return subject;
    }


    // FIXME Not super sure we have this for. According to my best current understanding:
    // FIXME [1] OPERATION TO CALL: no real subject and predicate, just a call to the method name. Simple search in code.
    // FIXME [2] ACTION TO MATCH: likely a *classic* proposition that needs *classic* subject+pred matching.
    private TemporalMatch translateRawProtocol(DocumentedExecutable excMember,
                                               TemporalMatch temporalMatch) {

        Matcher matcher = new Matcher();
        TemporalProtocol rawProtocol = temporalMatch.getRawProtocol();
//    Set<CodeElement<?>> codeElements = extractMethodCodeElements(excMember, Configuration.RECEIVER);
        Set<CodeElement<?>> codeElements = JavaElementsCollector.collectIgnoringScope(excMember);
        // Protocols do involve the doc. method often times, we want to have it in the list.
        CodeElement<?> documentedMethod = JavaElementsCollector.getCodeElementFromRawMethod(excMember.getExecutable(), Configuration.RECEIVER);
        codeElements.add(documentedMethod);

        // Match first member of the protocol.
        Set<CodeElement<?>> firstMemberMatches = matcher.subjectMatch(rawProtocol.getFirstMember(), codeElements);

        // Match second member of the protocol.
        Set<CodeElement<?>> secMemberMatches = matcher.subjectMatch(rawProtocol.getSecondMember(), codeElements);

        if (!firstMemberMatches.iterator().hasNext() || !secMemberMatches.iterator().hasNext()) {
            // TODO check if this is the best way to flag a failed match
//      temporalMatch.setKindOfProtocol(TemporalMatch.KindOfProtocol.NONE);
            return temporalMatch;
        }
        temporalMatch.setMemberA(firstMemberMatches.iterator().next().getJavaExpression());
        temporalMatch.setMemberB(secMemberMatches.iterator().next().getJavaExpression());
        return temporalMatch;
    }


    @Nullable
    private CodeSnippet determineSnippet(CommentContent commentContent, String sentence) {
        String cleanSentence = sentence.replaceAll(" ", "");
        List<CodeSnippet> snippets = commentContent.getCodeSnippets();
        CodeSnippet sentenceSnippet = null;
        for (CodeSnippet snippet : snippets) {
            String cleanSnippet = snippet.getSnippet().replaceAll(" ", "");
            if (cleanSentence.contains(cleanSnippet)) {
                sentenceSnippet = snippet;
            }
        }
        return sentenceSnippet;
    }

    private boolean isSolvedSnippetCompilable(
            DocumentedType documentedType,
            DocumentedExecutable excMember,
            EquivalentMatch equivalenceMatch) {
        String oracle = equivalenceMatch.getCodeSnippetText();
        equivalenceMatch.setOracle(oracle);
        ComplianceError complianceError = new ComplianceError();
        boolean compilable;
        Set<String> missingSymbols;
        List<String> swappableArgs;
        compilable = ComplianceChecks.isSnippetCompilable(excMember, equivalenceMatch, complianceError);
        do {
            if (!compilable) {
                // There was a compilation error for missing symbols in the snippet,
                // so we have to match them correctly
                missingSymbols = complianceError.getMissingSymbols();
                swappableArgs = complianceError.getSwappableMethods();
                for (String missingSymbol : missingSymbols) {
                    equivalenceMatch.addSnippetSymbol(missingSymbol);
                    matchEquivalentSnippet(excMember, equivalenceMatch, missingSymbol, documentedType);

                    if (!equivalenceMatch
                            .getCodeSnippet()
                            .getSolvedSymbols()
                            .entrySet()
                            .stream()
                            .filter(x -> !x.getValue())
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                            .isEmpty()) {
                        return false;
                    }
                }
                for (String swappableArg : swappableArgs) {
                    matchEquivalentSnippet(excMember, equivalenceMatch, swappableArg, documentedType);
                }

                complianceError = new ComplianceError();
                // Now that we matched, we have to check again whether the snippet compiles
                compilable =
                        ComplianceChecks.isSnippetCompilable(excMember, equivalenceMatch, complianceError);
            }
        } while (!compilable && complianceError.isErrorSolved());

        return compilable;
    }

    private String translateConditionalEquivalence(
            DocumentedExecutable excMember,
            EquivalentMatch equivalenceMatch,
            String condition,
            DocumentedType documentedType) {

        if (condition != null
                && equivalenceMatch.getCodeSnippet() != null
                && condition.contains(equivalenceMatch.getCodeSnippetText())) {
            // Condition is in form of snippet
            boolean compilable = isSolvedSnippetCompilable(documentedType, excMember, equivalenceMatch);
            if (compilable) {
                return equivalenceMatch.getCodeSnippet().getSnippet();
            }
        } else {
            // Condition is in form of natural language
            final List<PropositionSeries> extractedPropositions =
                    Parser.parse(new CommentContent(condition), excMember);
            for (PropositionSeries prop : extractedPropositions) {
                BasicTranslator.translate(prop, excMember, condition);
                String translation = prop.getTranslation();
                if (!translation.isEmpty()) {
                    return translation;
                }
            }
        }
        return "";
    }

    //  private String prepareResultWithCondition(DocumentedExecutable excMember, EquivalentMatch
    // match) {
    //    // FIXME naive and potentially incorrect:
    //    String previousOracle = match.getMethodSignatures().keySet().stream().findFirst().get();
    //    String oracle = "if(" + match.getCodeSnippetText() + ") {";
    //    if (ComplianceChecks.primitiveTypes()
    //        .contains(excMember.getReturnType().getType().getTypeName())) {
    //      oracle += Configuration.RETURN_VALUE + "==(" + previousOracle + ")";
    //    } else {
    //      oracle += Configuration.RETURN_VALUE + ".equals(" + previousOracle + ")";
    //    }
    //    return oracle + "}";
    //  }

    /**
     * Finds the right code element match for the signature involved in the equivalence comment.
     *
     * @param excMember        the executable member the comment belongs to
     * @param equivalenceMatch the final match, null if nothing found
     * @param documentedType
     */
    private void matchEquivalentMethod(
            DocumentedExecutable excMember,
            EquivalentMatch equivalenceMatch,
            String condition,
            DocumentedType documentedType) {
        Matcher matcher = new Matcher();
        Class<?> matchedType = null;
        Match theFinalMatch = null;
        String negation = "";
        String previousOracle = "";

        int i = 0;
        // FIXME check shared/duplicated code with the matching of snippet (missing symbols)
        for (String methodSignature : equivalenceMatch.getMethodSignatures().keySet()) {
            AnnotatedType previousReturnType = null;
            if (i > 0 && theFinalMatch != null) {
                // We are not in the first iteration: we are solving multiple signatures, thus
                // the nth in the chain is invocated on the type of the nth-1
                previousReturnType = extractPreviousType(theFinalMatch);
            }

            String simpleMethodName = equivalenceMatch.getSimpleName().get(i);
            String methodNameForSubjectMatch = simpleMethodName;
            if (simpleMethodName.startsWith("get")) {
                methodNameForSubjectMatch = simpleMethodName.substring(3);
            }
            boolean partial = !methodSignature.contains("(");
            // Extract every CodeElement associated with the method and the containing class of the
            // method.

            Set<CodeElement<?>> codeElements;
            String receiver = equivalenceMatch.getMethodSignatures().get(methodSignature);
            if (receiver.isEmpty()) {
                codeElements = extractMethodCodeElements(excMember, Configuration.RECEIVER);
            } else {
                List<String> docArgs =
                        excMember
                                .getParameters()
                                .stream()
                                .map(DocumentedParameter::getName)
                                .collect(Collectors.toList());
                int receiverIndex = docArgs.indexOf(receiver);
                if (receiverIndex == -1) {
                    return;
                }
                receiver = "args[" + receiverIndex + "]";
                // FIXME you may find no candidate here because you should check in the receiver's code
                // elements
                // FIXME via JavaElementsCollector#allMethodsOf. You first need to infer the receiver's
                // FIXME class (hint - it's a parameter of the documented method)
                codeElements = extractMethodCodeElements(excMember, receiver);
            }
            Set<CodeElement<?>> matchingCodeElem =
                    matcher.subjectMatch(methodNameForSubjectMatch, codeElements);

            String className = "";
            if (matchingCodeElem.isEmpty()) {
                if (previousReturnType != null) {
                    try {
                        className = previousReturnType.getType().getTypeName();
                        matchedType = Reflection.getClass(className);
                    } catch (ClassNotFoundException e) {
                        // Intentionally empty: Apply other heuristics to load the exception type.
                    }
                    if (matchedType != null) {
                        matchingCodeElem =
                                extractMatchingCodeElementFromType(
                                        excMember, matchedType, simpleMethodName, className);
                    }
                } else if (!equivalenceMatch.getClassesInSignatures().get(methodSignature).isEmpty()) {
                    // FIXME it is not necessarily true that we need an external class here.
                    String externalClass = equivalenceMatch.getClassesInSignatures().get(methodSignature);

                    String[] javaPackages = {"java.lang.", "java.util."};
                    for (String p : javaPackages) {
                        try {
                            className = p + externalClass;
                            matchedType = Reflection.getClass(className);
                        } catch (ClassNotFoundException e) {
                        }
                        if (matchedType != null) {
                            equivalenceMatch.setImportsNeeded(className);
                        }
                    }
                }
                if (matchedType == null
                        && (!excMember.getLinksContent().isEmpty() || !documentedType.getImports().isEmpty())) {
                    List<String> links = excMember.getLinksContent();
                    String[] javaPackages = {"java.lang.", "java.util."};
                    for (String link : links) {
                        if (matchedType != null) {
                            break;
                        }
                        if (link.contains("#")) {
                            link = link.substring(0, link.indexOf("#"));
                        }
                        if (!link.isEmpty()) {
                            if (!link.contains(".")) {
                                for (String javaP : javaPackages) {
                                    String newlink = javaP + link;
                                    try {
                                        matchedType = Reflection.getClass(newlink);
                                    } catch (ClassNotFoundException e) {
                                    }
                                    if (matchedType != null) {
                                        link = newlink;
                                        break;
                                    }
                                }
                            } else {
                                try {
                                    matchedType = Reflection.getClass(link);
                                } catch (ClassNotFoundException e) {
                                }
                            }
                            if (matchedType != null) {
                                className = link;
                                // FIXME this will prevent to iterate the other links, and the current one might not
                                // be the right one
                                break;
                            } else {
                                for (int j = 0; j < documentedType.getImports().size(); j++) {
                                    ImportDeclaration anImport = documentedType.getImports().get(j);
                                    String importedClass = anImport.getNameAsString().replace("import", "").trim();
                                    if (importedClass.endsWith(link)) {
                                        try {
                                            matchedType = Reflection.getClass(importedClass);
                                        } catch (ClassNotFoundException e) {
                                        }
                                        if (matchedType != null) {
                                            className = importedClass;
                                            equivalenceMatch.setImportsNeeded(className);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (matchedType != null) {
                    matchingCodeElem =
                            extractMatchingCodeElementFromType(
                                    excMember, matchedType, simpleMethodName, className);
                }
            }

            if (matchingCodeElem != null && !matchingCodeElem.isEmpty()) {
                List<CodeElement<?>> sortedCodeElem = new ArrayList<>(matchingCodeElem);
                if (partial) {
                    theFinalMatch = matcher.bestArgsTypeMatch(excMember, "", sortedCodeElem);
                } else {
                    theFinalMatch =
                            matcher.reverseBestArgsTypeMatch(
                                    methodSignature, equivalenceMatch, excMember, sortedCodeElem);
                }
                if (equivalenceMatch.isNegated()) {
                    negation = "!";
                }
                if (theFinalMatch != null) {
                    // Found a match, include it in the oracle
                    String currentOracle = negation + theFinalMatch.getBaseExpression();
                    if (!previousOracle.isEmpty()) {
                        currentOracle =
                                previousOracle + currentOracle.substring(currentOracle.lastIndexOf("."));
                    }
                    previousOracle = currentOracle;
                    // equivalenceMatch.addDocumentedSignature(methodSignature,
                    // theFinalMatch.getCodeElement());
                }
            }
            i++;
        }
        if (previousOracle.isEmpty()) {
            return;
        }
        if (theFinalMatch != null) {
            // It is not safe to perform any invocation on the target object: we do not wish to
            // modify its state. Perform invocations on a clone.
            previousOracle =
                    previousOracle.replaceAll(Configuration.RECEIVER, Configuration.RECEIVER_CLONE);
            buildAndCompileOracle(
                    excMember, equivalenceMatch, theFinalMatch.getCodeElement(), condition, previousOracle);
        }
    }

    /**
     * Finds the right code element match for the signature involved in the equivalence comment.
     *
     * @param excMember        the executable member the comment belongs to
     * @param equivalenceMatch the final match, null if nothing found
     * @param documentedType
     */
    private void matchEquivalentSnippet(
            DocumentedExecutable excMember,
            EquivalentMatch equivalenceMatch,
            String symbol,
            DocumentedType documentedType) {
        Matcher matcher = new Matcher();
        String matchingSymbol = null;
        CodeSnippet snippet = equivalenceMatch.getCodeSnippet();
        String snippetText = snippet.getSnippet();
        int possibleParenthesis = snippetText.indexOf(symbol) + symbol.length();
        if (snippetText.length() > possibleParenthesis
                && snippetText.charAt(possibleParenthesis) == '(') {
            // method to swap args
            String wrongArgs =
                    snippetText
                            .substring(snippetText.indexOf(symbol) + symbol.length())
                            .replaceAll("\\(", "")
                            .replaceAll("\\)", "");
            if (!wrongArgs.isEmpty()) {
                String[] args = wrongArgs.split(",");
                String newExpr = "";
                for (int i = args.length - 1; i >= 0; i--) {
                    newExpr += args[i];
                    if (i > 0) {
                        newExpr += ",";
                    }
                }
                snippet.substitutePart(wrongArgs, newExpr);
                return;
            }
        }
        if (!symbol.contains("(")
                && !(Character.isUpperCase(symbol.charAt(0)) && symbol.length() > 1)) {
            matchingSymbol = identifyMissingSymbolInArgs(excMember, symbol, snippet);
        }
        if (matchingSymbol == null) {
            matchingSymbol = identifyMissingSymbolInImports(documentedType, equivalenceMatch, symbol);
        }
        if (matchingSymbol == null) {
            matchingSymbol = identifyMissingSymbolInCode(excMember, symbol, matcher, snippet);
        }
        if (matchingSymbol != null) {
            if (matchingSymbol.contains(Configuration.RECEIVER)) {
                // It is not safe to perform any invocation on the receiver object, because we
                // do not wish to modify its state. Perform invocations on a clone.
                matchingSymbol =
                        matchingSymbol.replaceAll(Configuration.RECEIVER, Configuration.RECEIVER_CLONE);
            }
            snippet.addMatchToSymbol(symbol, matchingSymbol);
            snippet.completeSnippet();
        }
    }

    private String identifyMissingSymbolInCode(
            DocumentedExecutable excMember, String symbol, Matcher matcher, CodeSnippet snippet) {
        // Extract every CodeElement associated with the method and the containing class of the
        // method.
        String simpleName;
        if (symbol.contains("(")) {
            simpleName = symbol.substring(0, symbol.indexOf("("));
        } else {
            simpleName = symbol;
        }

        Set<CodeElement<?>> codeElements = extractMethodCodeElements(excMember, Configuration.RECEIVER);
        Set<CodeElement<?>> matchingCodeElem = matcher.subjectMatch(simpleName, codeElements);

        // matchingCodeElem = identifyMissingSymbolInImports(excMember, symbol, matchingCodeElem);
        Match theFinalMatch = null;
        if (matchingCodeElem != null && !matchingCodeElem.isEmpty()) {
            CodeElement<?> firstCodeMatch = matchingCodeElem.stream().findFirst().get();
            if (firstCodeMatch instanceof MethodCodeElement) {
                theFinalMatch =
                        new Match(
                                firstCodeMatch.getJavaExpression(),
                                ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck(),
                                firstCodeMatch);
            } else if (firstCodeMatch instanceof GeneralCodeElement) {
                theFinalMatch =
                        new Match(
                                firstCodeMatch.getJavaExpression(),
                                ((GeneralCodeElement) firstCodeMatch).getNullDereferenceCheck(),
                                firstCodeMatch);
            } else if (firstCodeMatch instanceof StaticMethodCodeElement) {
                theFinalMatch = new Match(firstCodeMatch.getJavaExpression(), "", firstCodeMatch);
            }
        }
        if (theFinalMatch != null) {
            //            snippet.addMatchToSymbol(symbol, theFinalMatch.getBaseExpression());
            //            snippet.completeSnippet();

            return theFinalMatch.getBaseExpression();
        }

        return null;
    }

    private String identifyMissingSymbolInImports(
            DocumentedType documentedType, EquivalentMatch equivalenceMatch, String symbol) {
        // TODO IMPORTANT also extract package classes!
        String className;
        Class<?> matchedType = null;
        if (!documentedType.getImports().isEmpty()) {
            for (int j = 0; j < documentedType.getImports().size(); j++) {
                ImportDeclaration anImport = documentedType.getImports().get(j);
                String importedClass = anImport.getNameAsString().replace("import", "").trim();
                if (importedClass.endsWith(symbol)) {
                    try {
                        matchedType = Reflection.getClass(importedClass);
                    } catch (ClassNotFoundException e) {
                    }
                    if (matchedType != null) {
                        className = importedClass;
                        equivalenceMatch.setImportsNeeded(className);
                        break;
                    }
                }
            }
        }
        if (matchedType != null) {
            return matchedType.getName();
        } else {
            for (String classInPackage : documentedType.getClassesInPackage()) {
                if (classInPackage.endsWith(symbol)) {
                    return classInPackage;
                }
            }
        }
        return null;
    }

    private String identifyMissingSymbolInArgs(
            DocumentedExecutable excMember, String symbol, CodeSnippet snippet) {
        List<DocumentedParameter> args = excMember.getParameters();
        Optional<DocumentedParameter> matchingSymbolName =
                args.stream().filter(a -> a.getName().equals(symbol)).findFirst();
        if (matchingSymbolName.isPresent()) {
            int i = args.indexOf(matchingSymbolName.get());
            snippet.addMatchToSymbol(symbol, "args[" + i + "]");
            snippet.completeSnippet();
            return symbol;
        }

        for (int i = 0; i < args.size(); i++) {
            String argName = args.get(i).getName();
            if (ComplianceChecks.isGenericType(symbol)) { // FIXME naive check
                snippet.addMatchToSymbol(symbol, "Object");
                snippet.completeSnippet();
                break;
            } else {
                Matcher syntaxMatcher = new Matcher();
                List<ParameterCodeElement> codeArgs = JavaElementsCollector.parametersOf(excMember);
                Set<CodeElement<?>> syntaxMatches =
                        syntaxMatcher.filterMatchingCodeElements(argName, new HashSet<>(codeArgs));
                if (syntaxMatches.iterator().hasNext()) {
                    //                    snippet.addMatchToSymbol(symbol,
                    // syntaxMatches.iterator().next().getJavaExpression());
                    //                    snippet.completeSnippet();
                    //                    break;
                    return syntaxMatches.iterator().next().getJavaExpression();
                }
            }
        }
        return null;
    }

    //  private boolean isGenericType(String pt) {
    //    // FIXME this is naive and potentially wrong, look at the same method in ComplianceChecks
    //    return pt.length() == 1 && Character.isUpperCase(pt.charAt(0));
    //  }

    private Set<CodeElement<?>> extractMatchingCodeElementFromType(
            DocumentedExecutable excMember,
            Class<?> matchedType,
            String simpleMethodName,
            String className) {
        List<CodeElement<?>> allMethodsInClass =
                getCodeElementsFromRawMethods(
                        JavaElementsCollector.collectRawMethods(matchedType, excMember),
                        matchedType.getCanonicalName());
        Set<CodeElement<?>> matchingCodeEelem = null;
        if (!allMethodsInClass.isEmpty()) {
            String methodSimpleName = className + "." + simpleMethodName;
            // FIXME here I am overwriting...cleverer way?
            matchingCodeEelem =
                    allMethodsInClass
                            .stream()
                            .filter(
                                    m ->
                                            m.getJavaExpression()
                                                    .substring(0, m.getJavaExpression().indexOf("("))
                                                    .equals(methodSimpleName))
                            .collect(Collectors.toSet());
        }
        return matchingCodeEelem;
    }

    private AnnotatedType extractPreviousType(Match theOne) {
        CodeElement<?> previousMatch = theOne.getCodeElement();
        AnnotatedType previousReturnType = null;
        if (previousMatch instanceof MethodCodeElement) {
            previousReturnType =
                    ((MethodCodeElement) previousMatch).getJavaCodeElement().getAnnotatedReturnType();
        } else if (previousMatch instanceof StaticMethodCodeElement) {
            previousReturnType =
                    ((StaticMethodCodeElement) previousMatch).getJavaCodeElement().getAnnotatedReturnType();
        }
        return previousReturnType;
    }

    private void buildAndCompileOracle(
            DocumentedExecutable excMember,
            EquivalentMatch equivalenceMatch,
            CodeElement<?> codeElement,
            String condition,
            String previousOracle) {
        String oracle = prepareResult(equivalenceMatch, codeElement, excMember, previousOracle);
        if (!condition.isEmpty()) {
            equivalenceMatch.setCondition(condition);
        }

        equivalenceMatch.setOracle(oracle);

        if (!ComplianceChecks.isEqSpecCompilable(excMember, equivalenceMatch)) {
            equivalenceMatch.setOracle("");
        }
        //        else {
        //            if (!condition.isEmpty()) {
        //                String premises = "if(" + condition + ") {";
        //                String end = "}";
        //                equivalenceMatch.setOracle(premises + oracle + end);
        //            }
        //        }
    }

    @NotNull
    private String prepareResult(
            EquivalentMatch equivalenceMatch,
            CodeElement<?> codeElement,
            DocumentedExecutable excMember,
            String previousOracle) {
        String oracle;
        String execMemberReturnType = excMember.getReturnType().getType().getTypeName();
        String otherReturnType = "";
        // CodeElement<?> otherMethod =
        // equivalenceMatch.getDocumentedSignatures().get(excMember.getSignature());
        if (codeElement instanceof MethodCodeElement) {
            otherReturnType = ((MethodCodeElement) codeElement).getReturnType();
        } else if (codeElement instanceof StaticMethodCodeElement) {
            otherReturnType = ((StaticMethodCodeElement) codeElement).getReturnType();
        }
        // FIXME the following is a workaround, in the future make sure to implement a more significant
        // FIXME type check for any type
        boolean primitives =
                ComplianceChecks.primitiveTypes().contains(otherReturnType)
                        && ComplianceChecks.primitiveTypes().contains(execMemberReturnType);
        if (execMemberReturnType.equals("void")
                || otherReturnType.equals("void")
                || (primitives && !execMemberReturnType.equals(otherReturnType))) {
            oracle = manageVoidAndUncompatibleMethods(excMember, previousOracle);
        } else if (ComplianceChecks.primitiveTypes()
                .contains(excMember.getReturnType().getType().getTypeName())) {
            oracle = Configuration.RETURN_VALUE + "==(" + previousOracle + ")";
        } else {
            if (execMemberReturnType.contains("[]")) {
                oracle =
                        "java.util.Arrays.equals(" + Configuration.RETURN_VALUE + ", " + previousOracle + ")";
            } else {
                oracle = Configuration.RETURN_VALUE + ".equals(" + previousOracle + ")";
            }
        }
        return oracle;
    }

    public static String manageVoidAndUncompatibleMethods(
            DocumentedExecutable excMember, String previousOracle) {
        //    receiverObjectID.clear(); == previousOracle
        //    receiverObjectClone.removeAllElements();
        //    assert(receiverObjectID.equals(receiverObjectClone));

        //        String signature = excMember.getSignature();
        //        String signatureWithRightArguments = signature.substring(0, signature.indexOf("(") +
        // 1);
        //        int size = excMember.getParameters().size();
        //        for (int i = 0; i < size; i++) {
        //            signatureWithRightArguments += "args[" + i + "]";
        //            if (size > 1 && i < size - 1) {
        //                signatureWithRightArguments += ",";
        //            }
        //        }
        //        signatureWithRightArguments += ")";
        String preStatements = previousOracle + ";\n";
        //                        + Configuration.RECEIVER_CLONE
        //                        + "."
        //                        + signatureWithRightArguments
        //                        + ";\n";

        // FIXME what if the are arrays  (Arrays.equals)
        String booleanExpression =
                Configuration.RECEIVER_CLONE + ".equals(" + Configuration.RECEIVER + ")";

        return preStatements + booleanExpression;
    }

    @NotNull
    private String prepareResult(DocumentedExecutable excMember, EquivalentMatch em) {
        CodeSnippet codeSnippet = em.getCodeSnippet();
        String oracle;
        String separator1;
        String separator2;
        if (codeSnippet.isExpression()
                || codeSnippet.isTernary()
                || (codeSnippet.isComplexSignature()
                && !codeSnippet.getSnippet().contains(Configuration.RECEIVER_CLONE))) {
            // FIXME not necessarily correct, might be uncompatible types.
            String previousOracle = codeSnippet.getSnippet();
            separator1 = "(";
            separator2 = ")";

            //    else {
            //      separator1 = "[";
            //      separator2 = "]";
            //    }
            if (ComplianceChecks.primitiveTypes()
                    .contains(excMember.getReturnType().getType().getTypeName())) {
                // FIXME this does not look effective.s
                oracle =
                        Configuration.RETURN_VALUE
                                + "=="
                                + separator1
                                + " "
                                + previousOracle
                                + " "
                                + separator2;
            } else {
                oracle =
                        Configuration.RETURN_VALUE
                                + ".equals"
                                + separator1
                                + " "
                                + previousOracle
                                + " "
                                + separator2;
            }
            return oracle;
        } else {
            // getOracle at this point should return the complete COMPILABLE snippetWrapper
            String previousOracle = em.getOracle();
            // FIXME manage this snippet signature&co better

            String declaration = previousOracle.substring(0, previousOracle.indexOf("{") + 1);

            String snippet = em.getCodeSnippet().getSnippet();

            if (!snippet.endsWith("{") && !snippet.endsWith("}") && !snippet.endsWith(";")) {
                // FIXME WHY DOES THIS HAPPEN, FIND ROOT CAUSE
                snippet += ";";
            }

            previousOracle = declaration + "\n" + snippet + "\n" + "}";

            oracle =
                    previousOracle
                            + "\n"
                            + "//END OF METHOD"
                            + "\nsnippetWrapper("
                            + Configuration.RECEIVER_CLONE
                            + ","
                            + "args"
                            + ")";
            oracle = manageVoidAndUncompatibleMethods(excMember, oracle);
        }
        return oracle;
    }

    //  public String composeOracle(String newOracle, String oldOracle) {
    //    newOracle = StringUtils.difference(oldOracle, newOracle);
    //    return oldOracle.substring(0, oldOracle.length() - 1) + "." + newOracle;
    //  }

    private Set<CodeElement<?>> extractMethodCodeElements(
            DocumentedExecutable excMember, String receiver) {
        Set<CodeElement<?>> collectedElements = new LinkedHashSet<>();
        Class<?> containingClass = excMember.getDeclaringClass();
        List<Executable> rawMethods =
                JavaElementsCollector.collectRawMethods(containingClass, excMember);
        collectedElements.addAll(
                getCodeElementsFromRawMethods(rawMethods, receiver));
        return collectedElements;
    }

    /**
     * Given a text, extracts a condition, if any
     *
     * @param text the text that may contain a condition
     * @return the extracted condition, if any
     */
    private String extractCondition(String text) {
        if (text.contains("if extension is null")) {
            System.out.println("DEBUG");
        }

        java.util.regex.Matcher matchIf =
                Pattern.compile("\\b" + "(?i)if" + "\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        java.util.regex.Matcher matchWhen =
                Pattern.compile("\\b" + "(?i)when" + "\\b", Pattern.CASE_INSENSITIVE).matcher(text);

        int beginIndex = 0;
        int endIndex = 0;
        boolean matchIfOrWhen = false;
        if (matchIf.find()) {
            beginIndex = matchIf.start();
            matchIfOrWhen = true;
        } else if (matchWhen.find()) {
            beginIndex = matchWhen.start();
            matchIfOrWhen = true;
        }

        // endIndex is the index of the SUBSEQUENT (to the if or when) comma or dot
        if (matchIfOrWhen) {
            endIndex = text.indexOf(",");
            if (endIndex > beginIndex) {
                return text.substring(beginIndex, endIndex);
            }
        }
        return null;
    }
}
