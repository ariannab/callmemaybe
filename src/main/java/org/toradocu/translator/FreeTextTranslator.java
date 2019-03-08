package org.toradocu.translator;

import com.github.javaparser.ast.ImportDeclaration;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.toradocu.conf.Configuration;
import org.toradocu.extractor.CommentContent;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.DocumentedType;
import org.toradocu.extractor.EquivalenceMatcher;
import org.toradocu.extractor.EquivalentMethodMatch;
import org.toradocu.util.ComplianceChecks;
import org.toradocu.util.Reflection;

public class FreeTextTranslator {

  /**
   * Translates a free text comment. For now only supports equivalences.
   *
   * @param excMember the executable member the comment belongs to
   * @return the translation, null if failed
   */
  public ArrayList<EquivalentMethodMatch> translate(
      DocumentedType documentedType, DocumentedExecutable excMember) {
    String commentText = excMember.getFreeText().getComment().getText();
    String[] sentences = commentText.split("[.;] ");
    ArrayList<EquivalentMethodMatch> matches = new ArrayList<>();
    EquivalentMethodMatch equivalenceMatch;

    for (String sentence : sentences) {
      // Let's avoid spurious comments...
      if (!sentence.isEmpty() && sentence.length() > 2) {
        // Verify comment contains equivalence declaration...
        equivalenceMatch = EquivalenceMatcher.getEquivalentOrSimilarMethod(sentence);
        if (!equivalenceMatch.getMethodSignatures().isEmpty()) {
          if (equivalenceMatch.isSimilarity()) {
            translateConditionalEquivalence(excMember, equivalenceMatch, sentence, documentedType);
          } else {
            // Exact equivalence
            matchEquivalentMethod(excMember, equivalenceMatch, "", documentedType);
          }
        }
        matches.add(equivalenceMatch);
      }
    }
    return matches;
  }

  private void translateConditionalEquivalence(
      DocumentedExecutable excMember,
      EquivalentMethodMatch equivalenceMatch,
      String sentence,
      DocumentedType documentedType) {
    String condition = extractCondition(sentence);
    if (condition != null) {
      String translation = "";
      List<PropositionSeries> extractedPropositions =
          Parser.parse(new CommentContent(condition), excMember);
      for (PropositionSeries propositions : extractedPropositions) {
        BasicTranslator.translate(propositions, excMember, sentence);
        translation = propositions.getTranslation();
        if (!translation.isEmpty()) {
          matchEquivalentMethod(excMember, equivalenceMatch, translation, documentedType);
        }
      }
      if (translation.isEmpty()) {
        // FIXME this could be not the right place where to check this, mb as first attempt above?
        // Condition predicate could be expressed directly with a method signature, e.g.
        // "if list.isEmpty()" instead of the classic "if list is empty": look for signatures

        String methodRegex = "(!)?(\\w+(\\((.*?(?<!\\) ))\\)|\\.\\w+|#\\w+)+)";
        java.util.regex.Matcher signatureMatch = Pattern.compile(methodRegex).matcher(condition);
        if (signatureMatch.find()) {
          // TODO you find smt like parameter.methodFromParameter, thus:
          // TODO 1. Split on dot
          // TODO 2. match left part (is it a parameter or what?)
          // TODO 3. match right part (is it something invokable from the left part?)
        }
      }
    }
  }

  /**
   * Finds the right code element match for the signature involved in the equivalence comment.
   *
   * @param excMember the executable member the comment belongs to
   * @param equivalenceMatch the final match, null if nothing found
   * @param condition
   * @param documentedType
   */
  private void matchEquivalentMethod(
      DocumentedExecutable excMember,
      EquivalentMethodMatch equivalenceMatch,
      String condition,
      DocumentedType documentedType) {
    Matcher matcher = new Matcher();
    Class<?> matchedType = null;
    Match theOne = null;
    String negation = "";
    String previousOracle = "";

    for (int i = 0; i < equivalenceMatch.getMethodSignatures().size(); i++) {
      AnnotatedType previousReturnType = null;
      if (i > 0 && theOne != null) {
        CodeElement<?> previousMatch = theOne.getCodeElement();
        if (previousMatch instanceof MethodCodeElement) {
          previousReturnType =
              ((MethodCodeElement) previousMatch).getJavaCodeElement().getAnnotatedReturnType();
        } else if (previousMatch instanceof StaticMethodCodeElement) {
          previousReturnType =
              ((StaticMethodCodeElement) previousMatch)
                  .getJavaCodeElement()
                  .getAnnotatedReturnType();
        }
      }

      String methodSignature = equivalenceMatch.getMethodSignatures().get(i);
      String simpleMethodName = equivalenceMatch.getSimpleName().get(i);
      boolean partial = !methodSignature.contains("(");
      // Extract every CodeElement associated with the method and the containing class of the
      // method.
      Set<CodeElement<?>> codeElements = extractMethodCodeElements(excMember);
      Set<CodeElement<?>> matchingCodeEelem = matcher.subjectMatch(simpleMethodName, codeElements);

      String className = "";
      if (previousReturnType != null) {
        try {
          className = previousReturnType.getType().getTypeName();
          matchedType = Reflection.getClass(className);
        } catch (ClassNotFoundException e) {
          // Intentionally empty: Apply other heuristics to load the exception type.
        }
        if (matchedType != null) {
          List<CodeElement<?>> allMethodsInClass =
              JavaElementsCollector.getCodeElementsFromRawMethods(
                  JavaElementsCollector.collectRawMethods(matchedType, excMember),
                  matchedType.getCanonicalName());
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
        }
      } else if (matchingCodeEelem.isEmpty()
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
        if (matchedType != null) {
          List<CodeElement<?>> allMethodsInClass =
              JavaElementsCollector.getCodeElementsFromRawMethods(
                  JavaElementsCollector.collectRawMethods(matchedType, excMember),
                  matchedType.getCanonicalName());
          if (!allMethodsInClass.isEmpty()) {
            String methodSimpleName = className + "." + simpleMethodName;
            Set<CodeElement<?>> result =
                allMethodsInClass
                    .stream()
                    .filter(
                        m ->
                            m.getJavaExpression()
                                .substring(0, m.getJavaExpression().indexOf("("))
                                .equals(methodSimpleName))
                    .collect(Collectors.toSet());
            // FIXME here I am overwriting...cleverer way?
            matchingCodeEelem = result;
          }
        }
      }
      if (matchingCodeEelem != null && !matchingCodeEelem.isEmpty()) {
        List<CodeElement<?>> sortedCodeElem = new ArrayList<>(matchingCodeEelem);

        if (partial) {
          theOne = matcher.bestArgsTypeMatch(excMember, "", new ArrayList<>(matchingCodeEelem));
        } else {
          theOne =
              matcher.reverseBestArgsTypeMatch(
                  methodSignature, equivalenceMatch, excMember, sortedCodeElem);
        }
        if (equivalenceMatch.isNegated()) {
          negation = "!";
        }
        if (theOne != null) {
          // Found a match, include it in the oracle
          String currentOracle = negation + theOne.getBaseExpression();
          if (!previousOracle.isEmpty()) {
            currentOracle =
                previousOracle + currentOracle.substring(currentOracle.lastIndexOf("."));
          }
          previousOracle = currentOracle;
        }
      }
    }
    if (previousOracle.isEmpty()) {
      return;
    }

    String oracle;
    if (ComplianceChecks.primitiveTypes()
        .contains(excMember.getReturnType().getType().getTypeName())) {
      oracle = Configuration.RETURN_VALUE + "==" + previousOracle;
    } else {
      oracle = Configuration.RETURN_VALUE + ".equals(" + previousOracle + ")";
    }
    //      if (!equivalenceMatch.getOracle().isEmpty()) {
    //          // We have to add something to the partial oracle
    //          oracle = composeOracle(oracle, equivalenceMatch.getOracle());
    //      }
    if (!condition.isEmpty()) {
      equivalenceMatch.setOracle("if (" + condition + ") {" + oracle + "}");
    } else {
      equivalenceMatch.setOracle(oracle);
    }
    if (!ComplianceChecks.isEqSpecCompilable(excMember, equivalenceMatch, condition)) {
      equivalenceMatch.setOracle("");
    }
  }
  //  public String composeOracle(String newOracle, String oldOracle) {
  //    newOracle = StringUtils.difference(oldOracle, newOracle);
  //    return oldOracle.substring(0, oldOracle.length() - 1) + "." + newOracle;
  //  }

  private Set<CodeElement<?>> extractMethodCodeElements(DocumentedExecutable excMember) {
    Set<CodeElement<?>> collectedElements = new LinkedHashSet<>();
    Class<?> containingClass = excMember.getDeclaringClass();
    List<Executable> rawMethods =
        JavaElementsCollector.collectRawMethods(containingClass, excMember);
    collectedElements.addAll(
        JavaElementsCollector.getCodeElementsFromRawMethods(rawMethods, Configuration.RECEIVER));
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
    if (matchIf.find()) {
      beginIndex = matchIf.start();
    } else if (matchWhen.find()) {
      beginIndex = matchWhen.start();
    }

    // endIndex is the index of the SUBSEQUENT (to the if or when) comma or dot
    endIndex = text.indexOf(",");
    if (endIndex > beginIndex) {
      return text.substring(beginIndex, endIndex);
    }
    return null;
  }
}
