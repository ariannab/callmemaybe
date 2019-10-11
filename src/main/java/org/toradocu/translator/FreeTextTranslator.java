package org.toradocu.translator;

import com.github.javaparser.ast.ImportDeclaration;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.toradocu.conf.Configuration;
import org.toradocu.extractor.CodeSnippet;
import org.toradocu.extractor.CommentContent;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.DocumentedParameter;
import org.toradocu.extractor.DocumentedType;
import org.toradocu.extractor.EquivalenceMatcher;
import org.toradocu.extractor.EquivalentMatch;
import org.toradocu.util.ComplianceChecks;
import org.toradocu.util.ComplianceError;
import org.toradocu.util.Reflection;

public class FreeTextTranslator {

  /**
   * Translates a free text comment. For now only supports equivalences.
   *
   * @param excMember the executable member the comment belongs to
   * @return the translation, null if failed
   */
  public ArrayList<EquivalentMatch> translate(
      DocumentedType documentedType, DocumentedExecutable excMember) {

    CommentContent commentContent = excMember.getFreeText().getComment();
    String commentText = commentContent.getText();
    String[] sentences = commentText.split("\\. |(?<!\\.\\.)\\.\\)");
    ArrayList<EquivalentMatch> matches = new ArrayList<>();
    EquivalentMatch equivalenceMatch;

    // FIXME IF != SENTENCES HAVE != EQUIVALENCES WHAT HAPPENS HERE???
    for (String sentence : sentences) {
      // Let's avoid spurious comments...
      if (!sentence.isEmpty() && sentence.length() > 2) {
        String cleanSentence = sentence.replaceAll(" ", "");
        List<CodeSnippet> snippets = commentContent.getCodeSnippets();
        CodeSnippet sentenceSnippet = null;
        for (CodeSnippet snippet : snippets) {
          String cleanSnippet = snippet.getSnippet().replaceAll(" ", "");
          if (cleanSentence.contains(cleanSnippet)) {
            sentenceSnippet = snippet;
          }
        }
        // Verify comment contains equivalence declaration...
        equivalenceMatch = EquivalenceMatcher.findEquivalencesInComment(sentence, sentenceSnippet);
        String translatedCondition = "";

        if (!equivalenceMatch.getMethodSignatures().isEmpty()) {
          String condition = extractCondition(sentence);
          if (equivalenceMatch.isSimilarity()
              && !equivalenceMatch.getMethodSignatures().isEmpty()
              // && equivalenceMatch.getCodeSnippet() != null
              && condition != null) {
            // Similarity, e.g. conditional equivalence
            translatedCondition =
                translateConditionalEquivalence(
                    excMember, equivalenceMatch, condition, documentedType);
            if (!translatedCondition.isEmpty()) {
              matchEquivalentMethod(
                  excMember, equivalenceMatch, translatedCondition, documentedType);
            }
          } else if (equivalenceMatch.getCodeSnippet() != null
              && !equivalenceMatch.getCodeSnippetText().isEmpty()
              && sentence
                  .replaceAll(" ", "")
                  .contains(equivalenceMatch.getCodeSnippetText().replaceAll(" ", ""))) {
            // No condition, thus equivalence against snippet
            boolean compilable =
                isSolvedSnippetCompilable(documentedType, excMember, equivalenceMatch);
            if (compilable) {
              String finalOracle = prepareResult(excMember, equivalenceMatch.getCodeSnippet());
              equivalenceMatch.setOracle(finalOracle);
            } else {
              equivalenceMatch.setOracle("");
            }
          } else {
            // Exact equivalence
            matchEquivalentMethod(excMember, equivalenceMatch, translatedCondition, documentedType);
          }
          matches.add(equivalenceMatch);
        }
      }
    }
    return matches;
  }

  private boolean isSolvedSnippetCompilable(
      DocumentedType documentedType,
      DocumentedExecutable excMember,
      EquivalentMatch equivalenceMatch) {
    String oracle = equivalenceMatch.getCodeSnippetText();
    equivalenceMatch.setOracle(oracle);
    ComplianceError complianceError = new ComplianceError();
    boolean compilable;
    List<String> missingSymbols = new ArrayList<>();
    List<String> swappableArgs = new ArrayList<>();
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
   * @param excMember the executable member the comment belongs to
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
        codeElements = extractMethodCodeElements(excMember, receiver);
      }
      Set<CodeElement<?>> matchingCodeElem =
          matcher.subjectMatch(methodNameForSubjectMatch, codeElements);

      String className = "";
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
      } else if (matchingCodeElem.isEmpty()
          || !equivalenceMatch.getClassesInSignatures().get(methodSignature).isEmpty()
              && (!excMember.getLinksContent().isEmpty()
                  || !documentedType.getImports().isEmpty())) {
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
            extractMatchingCodeElementFromType(excMember, matchedType, simpleMethodName, className);
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
      buildAndCompileOracle(
          excMember, equivalenceMatch, theFinalMatch.getCodeElement(), condition, previousOracle);
    }
  }

  /**
   * Finds the right code element match for the signature involved in the equivalence comment.
   *
   * @param excMember the executable member the comment belongs to
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
        JavaElementsCollector.getCodeElementsFromRawMethods(
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
    } else {
      if (!condition.isEmpty()) {
        String premises = "if(" + condition + ") {";
        String end = "}";
        equivalenceMatch.setOracle(premises + oracle + end);
      }
    }
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
        || (primitives && !execMemberReturnType.equals(otherReturnType))) {
      oracle = manageVoidAndUncompatibleMethods(excMember, previousOracle);
    } else if (ComplianceChecks.primitiveTypes()
        .contains(excMember.getReturnType().getType().getTypeName())) {
      oracle = Configuration.RETURN_VALUE + "==(" + previousOracle + ")";
    } else {
      oracle = Configuration.RETURN_VALUE + ".equals(" + previousOracle + ")";
    }
    return oracle;
  }

  public static String manageVoidAndUncompatibleMethods(
      DocumentedExecutable excMember, String previousOracle) {
    //    receiverObjectID.clear(); == previousOracle
    //    receiverObjectClone.removeAllElements();
    //    assert(receiverObjectID.equals(receiverObjectClone));
    String signature = excMember.getSignature();
    String signatureWithRightArguments = signature.substring(0, signature.indexOf("(") + 1);
    int size = excMember.getParameters().size();
    for (int i = 0; i < size; i++) {
      signatureWithRightArguments += "args[" + i + "]";
      if (size > 1 && i < size - 1) {
        signatureWithRightArguments += ",";
      }
    }
    signatureWithRightArguments += ")";
    String preStatements =
        previousOracle
            + ";\n"
            + Configuration.RECEIVER_CLONE
            + "."
            + signatureWithRightArguments
            + ";\n";
    String assertion =
        "assert(" + Configuration.RECEIVER_CLONE + ".equals(" + Configuration.RECEIVER + "));";

    return preStatements + " " + assertion;
  }

  @NotNull
  private String prepareResult(DocumentedExecutable excMember, CodeSnippet codeSnippet) {
    String previousOracle = codeSnippet.getSnippet();
    String oracle;
    String separator1;
    String separator2;
    if (codeSnippet.isExpression() || codeSnippet.isComplexSignature()) {
      separator1 = "(";
      separator2 = ")";
    } else {
      separator1 = "[";
      separator2 = "]";
    }
    if (ComplianceChecks.primitiveTypes()
        .contains(excMember.getReturnType().getType().getTypeName())) {
      oracle =
          Configuration.RETURN_VALUE + "==" + separator1 + " " + previousOracle + " " + separator2;
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
        JavaElementsCollector.getCodeElementsFromRawMethods(rawMethods, receiver));
    return collectedElements;
  }

  /**
   * Given a text, extracts a condition, if any
   *
   * @param text the text that may contain a condition
   * @return the extracted condition, if any
   */
  private String extractCondition(String text) {
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
