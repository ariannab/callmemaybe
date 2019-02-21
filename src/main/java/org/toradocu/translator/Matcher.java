package org.toradocu.translator;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javafx.util.Pair;
import org.toradocu.conf.Configuration;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.EquivalentMethodMatch;
import org.toradocu.translator.semantic.SemanticMatcher;
import org.toradocu.util.Reflection;

/**
 * The {@code Matcher} class translates subjects and predicates in Javadoc comments to Java
 * expressions containing Java code elements.
 */
class Matcher {

  /**
   * Represents the threshold for the edit distance above which {@code CodeElement}s are considered
   * to be not matching.
   */
  private final int editDistanceThreshold;

  public Matcher() {
    this.editDistanceThreshold = Configuration.INSTANCE.getDistanceThreshold();
  }

  public Matcher(int editDistanceThreshold) {
    this.editDistanceThreshold = editDistanceThreshold;
  }

  /**
   * Takes the subject of a proposition in a Javadoc comment and the {@code DocumentedExecutable}
   * that subject was extracted from. Then returns all {@code CodeElement}s that match (i.e. have a
   * similar name to) the given subject string.
   *
   * @param subject the subject of a proposition from a Javadoc comment
   * @return a set of {@code CodeElement}s that have a similar name to the subject
   */
  Set<CodeElement<?>> subjectMatch(String subject, Set<CodeElement<?>> codeElements) {
    // Clean the subject string by removing words and characters not related to its identity so that
    // they do not influence string matching.
    List<String> wordsToRemove = Arrays.asList("either", "both", "any");
    for (String word : wordsToRemove) {
      String wordToReplace = word + " ";
      if (subject.startsWith(wordToReplace)) {
        subject = subject.replaceFirst(wordToReplace, "");
      }
    }
    subject = subject.trim();
    // Filter and return the CodeElements whose name is similar to subject.
    return filterMatchingCodeElements(subject, codeElements);
  }

  /**
   * Takes the container of a proposition in a Javadoc comment and the {@code DocumentedExecutable}
   * that container was extracted from. Then returns the {@code CodeElement} that matches (i.e. has
   * a similar name to) the given container string.
   *
   * @param container the container of a proposition from a Javadoc comment
   * @param method the {@code DocumentedExecutable} that the subject was extracted from
   * @return the {@code CodeElement} that has a similar name to the container
   */
  CodeElement<?> containerMatch(String container, DocumentedExecutable method) {

    // Extract every CodeElement associated with the method and the containing class of the method.
    Set<CodeElement<?>> codeElements = JavaElementsCollector.collect(method);
    final Set<CodeElement<?>> containers = subjectMatch(container, codeElements);
    return !containers.isEmpty() ? containers.iterator().next() : null;
  }

  /**
   * Returns the set of {@code CodeElement}s that match the given filter string.
   *
   * @param filter the string to match {@code CodeElement}s against
   * @param codeElements the set of {@code CodeElement}s to filter
   * @return a set of {@code CodeElement}s that match the given string
   */
  private Set<CodeElement<?>> filterMatchingCodeElements(
      String filter, Set<CodeElement<?>> codeElements) {
    Set<CodeElement<?>> minCodeElements = new LinkedHashSet<>();
    // If the word to match is a one-letter word (or empty string), we look for an exact match.
    int minDistance = 0;
    // Only consider elements with a minimum distance <= the threshold distance.
    if (filter.length() > 1) {
      minDistance = editDistanceThreshold;
    }
    // Returns the CodeElement(s) with the smallest distance.
    for (CodeElement<?> codeElement : codeElements) {
      int distance = codeElement.getEditDistanceFrom(filter);
      if (distance < minDistance) {
        minDistance = distance;
        minCodeElements.clear();
        minCodeElements.add(codeElement);
      } else if (distance == minDistance) {
        minCodeElements.add(codeElement);
      }
    }
    return minCodeElements;
  }

  /**
   * Returns the translation (to a Java expression) of the given subject and predicate. Returns null
   * if a translation could not be found.
   *
   * @param method the method whose comment (and predicate) is being translated
   * @param subject the subject of the proposition to translate
   * @param proposition the proposition to translate
   * @param comment comment from which the proposition has been extracted
   * @return the translation (to a Java expression) of the predicate with the given subject and
   *     predicate, or null if no translation found
   */
  String predicateMatch(
      DocumentedExecutable method,
      CodeElement<?> subject,
      Proposition proposition,
      String comment) {

    String predicate = proposition.getPredicate();
    // Special case to handle predicates about arrays' length. We need a more general solution.
    if (subject.getJavaCodeElement().toString().contains("[]")) {
      final java.util.regex.Matcher lengthPattern =
          Pattern.compile("has length ([0-9]+|zero)").matcher(predicate);
      if (lengthPattern.find()) {
        final String lengthString = lengthPattern.group(1);
        final int length = lengthString.equals("zero") ? 0 : Integer.parseInt(lengthString);
        return subject.getJavaExpression()
            + "!=null && "
            + subject.getJavaExpression()
            + ".length=="
            + length;
      }
      final java.util.regex.Matcher numberPattern =
          Pattern.compile("([<>=]=?|(!=)|is) ?([0-9]+|zero)").matcher(predicate);
      if (numberPattern.find()) {
        final String lengthString = numberPattern.group(3);
        final int length = lengthString.equals("zero") ? 0 : Integer.parseInt(lengthString);
        String operator = numberPattern.group(1);
        if (operator.equals("is")) {
          operator = "==";
        }
        return subject.getJavaExpression()
            + "!=null && "
            + subject.getJavaExpression()
            + ".length"
            + operator
            + length;
      }

      // "zero-length" special case handling.
      java.util.regex.Matcher zeroLengthPattern =
          Pattern.compile("(is|are|has|have) zero-?length").matcher(predicate);
      if (zeroLengthPattern.find()) {
        return subject.getJavaExpression()
            + "!=null && "
            + subject.getJavaExpression()
            + ".length==0";
      }
    }

    // General case
    Match match = simpleMatch(predicate);
    if (match != null
        && subject.isCompatibleWith(method.getDeclaringClass(), match.getBaseExpression())) {
      if (subject instanceof ContainerElementsCodeElement) {
        ContainerElementsCodeElement containerCodeElement = (ContainerElementsCodeElement) subject;
        match.setBaseExpression(containerCodeElement.getJavaExpression(match.getBaseExpression()));
      } else {
        match.setBaseExpression(subject.getJavaExpression() + match.getBaseExpression());
      }
    } else {
      match = codeElementsMatch(method, subject, proposition, comment);
      if (match == null
          || !subject.isCompatibleWith(method.getDeclaringClass(), match.getBaseExpression())) {
        return null;
      }
    }

    if (match
        .getBaseExpression()
        .equals(
            Configuration.RECEIVER
                + "==null")) { // Condition "receiverObjectID==null" is indeed not correct.
      return null;
    }
    String finalMatch;
    if (proposition.isNegative()) {
      finalMatch = "(" + match.getBaseExpression() + ") == false";
    } else {
      finalMatch = match.getBaseExpression();
    }

    if (match.getNullDereferenceCheck() != null) {
      finalMatch = (match.getNullDereferenceCheck() + " && ").concat(finalMatch);
    }

    return finalMatch;
  }

  private Match codeElementsMatch(
      DocumentedExecutable method,
      CodeElement<?> subject,
      Proposition proposition,
      String comment) {
    String predicate = proposition.getPredicate();
    Set<CodeElement<?>> codeElements = extractCodeElements(subject, method);
    if (codeElements == null) {
      return null;
    }
    List<CodeElement<?>> sortedMethodList = new ArrayList<CodeElement<?>>(codeElements);

    // Try the classic syntactic match first of all
    Match match = syntacticMatch(predicate, codeElements, method, subject.getJavaExpression());
    if (match == null && SemanticMatcher.isEnabled()) {
      // When the syntactic match fails, try semantic if enabled
      try {
        SemanticMatcher semanticMatcher = new SemanticMatcher(true, (float) 0.2, (float) 3.11);

        // it is important to provide a fixed order since this point, to prevent method with same
        // score
        // being put in map in a different order every execution
        Collections.sort(sortedMethodList, new JavaExpressionComparator());
        LinkedHashMap<CodeElement<?>, Double> semanticMethodMatches =
            semanticMatcher.runSemanticMatch(
                sortedMethodList, method, subject, proposition, comment);

        if (semanticMethodMatches != null && !semanticMethodMatches.isEmpty()) {
          List<CodeElement<?>> semanticMethodList =
              new ArrayList<CodeElement<?>>(semanticMethodMatches.keySet());

          if (semanticMethodList.size() > 5) {
            semanticMethodList = semanticMethodList.subList(0, 4);
          }
          match = bestArgsTypeMatch(method, predicate, semanticMethodList);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return match;
  }

  private Set<CodeElement<?>> extractCodeElements(
      CodeElement<?> subject, DocumentedExecutable method) {
    Set<CodeElement<?>> codeElements;
    // TODO check the following calls to extractBooleanCodeElements(): are they necessary before
    // TODO calling JavaElementsCollector#collect()?
    if (subject instanceof ParameterCodeElement) {
      ParameterCodeElement paramCodeElement = (ParameterCodeElement) subject;
      codeElements =
          extractBooleanCodeElements(
              paramCodeElement, paramCodeElement.getJavaCodeElement().getType());
      Class<?> targetClass = method.getDeclaringClass();
      codeElements.addAll(extractStaticBooleanMethods(targetClass, paramCodeElement));
    } else if (subject instanceof ClassCodeElement) {
      ClassCodeElement classCodeElement = (ClassCodeElement) subject;
      codeElements =
          extractBooleanCodeElements(classCodeElement, classCodeElement.getJavaCodeElement());
    } else if (subject instanceof MethodCodeElement) {
      MethodCodeElement methodCodeElement = (MethodCodeElement) subject;
      codeElements =
          extractBooleanCodeElements(
              methodCodeElement, methodCodeElement.getJavaCodeElement().getReturnType());
    } else if (subject instanceof StaticMethodCodeElement) {
      StaticMethodCodeElement staticMethodCodeElement = (StaticMethodCodeElement) subject;
      codeElements =
          extractBooleanCodeElements(
              staticMethodCodeElement,
              staticMethodCodeElement.getJavaCodeElement().getReturnType());
    } else {
      return null;
    }

    codeElements.addAll(JavaElementsCollector.collect(method));

    // Filter collected code elements that refer to the documented method under analysis.
    // This avoids to generate specifications mentioning the method whose behavior they specify.
    codeElements =
        codeElements
            .stream()
            .filter(
                e -> {
                  if (e.getJavaExpression().matches("(.*).set[A-Z](.*)")) {
                    // exclude setters
                    return false;
                  }
                  if (e instanceof MethodCodeElement) {
                    Method m = ((MethodCodeElement) e).getJavaCodeElement();
                    if (m.toGenericString().equals(method.getExecutable().toGenericString())
                        || (!m.getReturnType().equals(Boolean.class)
                            && !m.getReturnType().equals(boolean.class))) {
                      return false;
                    }
                  } else if (e instanceof StaticMethodCodeElement) {
                    Method m = ((StaticMethodCodeElement) e).getJavaCodeElement();
                    if (m.toGenericString().equals(method.getExecutable().toGenericString())
                        || (!m.getReturnType().equals(Boolean.class)
                            && !m.getReturnType().equals(boolean.class))) {
                      return false;
                    }
                  }
                  return true;
                })
            .collect(Collectors.toSet());

    return codeElements;
  }

  /**
   * Run classic syntactic match based on edit distance
   *
   * @param predicate predicate to match
   * @param codeElements list of candidate code elements to match
   * @param method the {@code DocumentedExecutable} the predicate belongs to
   * @return the best matching code element according to the edit distance, null if none found
   */
  private Match syntacticMatch(
      String predicate,
      Set<CodeElement<?>> codeElements,
      DocumentedExecutable method,
      String subject) {
    List<CodeElement<?>> sortedMethodList;
    sortedMethodList = new ArrayList<>(filterMatchingCodeElements(predicate, codeElements));

    sortedMethodList.removeIf(
        m ->
            m instanceof MethodCodeElement
                && !((MethodCodeElement) m).getReceiver().equals(subject));

    if (!sortedMethodList.isEmpty())
      Collections.sort(sortedMethodList, new JavaExpressionComparator());
    if (sortedMethodList.isEmpty()) {
      return null;
    } else {
      return bestArgsTypeMatch(method, predicate, sortedMethodList);
    }
  }

  /**
   * Search the best match between the {@code predicate} and the list of possibly matching sorted
   * {@code CodeElement}s. This is especially to find the best method match in case of {@code
   * MethodCodeElement}, by comparing the arguments needed.
   *
   * @param method the {@code DocumentedExecutable} the predicate is referring to
   * @param sortedCodeElements sorted list of matching method {@code CodeElement}s
   * @return object representation of the best match found
   */
  public Match bestArgsTypeMatch(
      DocumentedExecutable method, String predicate, List<CodeElement<?>> sortedCodeElements) {
    Match match = null;
    CodeElement<?> firstCodeMatch = null;
    boolean foundArgMatch = false;
    List<String> paramForMatch = new ArrayList<String>();
    List<String> otherMethodParams;
    String[] otherMethodArgs = null;
    String receiver = "";
    java.lang.reflect.Parameter[] myMethodArgs = method.getExecutable().getParameters();

    for (CodeElement<?> currentMatch : sortedCodeElements) {
      if (currentMatch instanceof MethodCodeElement) {
        otherMethodArgs = ((MethodCodeElement) currentMatch).getArgs();
        receiver = ((MethodCodeElement) currentMatch).getReceiver();
      } else if (currentMatch instanceof StaticMethodCodeElement) {
        otherMethodArgs = ((StaticMethodCodeElement) currentMatch).getArgs();
      } else continue;
      // Match is a String: before building it, check if the method has parameters,
      // and fill the parenthesis () with the right ones
      if (otherMethodArgs != null) {
        otherMethodParams = Arrays.asList(otherMethodArgs);
        int pcount = 0;
        for (java.lang.reflect.Parameter myMethodParam : myMethodArgs) {
          Type myParamType = myMethodParam.getParameterizedType();
          if (otherMethodParams.contains(myParamType.getTypeName())
              || isGenericType(myParamType.getTypeName(), otherMethodParams)) {
            paramForMatch.add("args[" + pcount + "]");
            if (!receiver.equals("args[" + pcount + "]")) {
              firstCodeMatch = currentMatch;
              foundArgMatch = true;
            }
          }

          pcount++;
        }
      }
      if (foundArgMatch) {
        break;
      }
    }
    if (foundArgMatch && paramForMatch.size() == otherMethodArgs.length) {
      String exp = firstCodeMatch.getJavaExpression();
      if (firstCodeMatch instanceof MethodCodeElement) {
        match =
            new Match(
                exp.substring(0, exp.indexOf("(") + 1),
                ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck());
      } else {
        match = new Match(exp.substring(0, exp.indexOf("(") + 1), null);
      }
      for (int j = 0; j < paramForMatch.size() - 1; j++) {
        match.completeExpression(paramForMatch.get(j) + ",");
      }
      match.completeExpression(paramForMatch.get(paramForMatch.size() - 1) + ")");
    } else if (!foundArgMatch && otherMethodArgs != null) {
      // the method is supposed to take params but we haven't find a match: does it have to take
      // special arguments such as null?
      match = manageSpecialPatterns(predicate, receiver, sortedCodeElements, myMethodArgs);
    }

    if (match == null && !foundArgMatch) {
      // No match is the absolute best: just pick the first one, but only if it takes no arguments!
      firstCodeMatch = sortedCodeElements.stream().findFirst().get();
      if ((firstCodeMatch instanceof MethodCodeElement
          && ((MethodCodeElement) firstCodeMatch).getArgs() == null)) {
        match =
            new Match(
                firstCodeMatch.getJavaExpression(),
                ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck());
      } else if (firstCodeMatch instanceof GeneralCodeElement) {
        match =
            new Match(
                firstCodeMatch.getJavaExpression(),
                ((GeneralCodeElement) firstCodeMatch).getNullDereferenceCheck());
      }
    }
    return match;
  }

  /**
   * This is a revised version of {@code bestArgsTypeMatch} useful for now only for equivalences
   *
   * @param equivalentMethod equivalent method to be matched
   * @param method executable the equivalentMethod is equivalent to
   * @param sortedCodeElements possible candidates for matching
   * @return the match, may be null
   */
  Match reverseBestArgsTypeMatch(
      EquivalentMethodMatch equivalentMethod,
      DocumentedExecutable method,
      List<CodeElement<?>> sortedCodeElements) {
    Match match = null;
    Map<Integer, String> constantParamsToIgnore = equivalentMethod.getHardcodedParams();
    Map<Integer, String> codeElementsParams = equivalentMethod.getStaticFinalParams();
    CodeElement<?> firstCodeMatch = null;
    List<String> paramForMatch = new ArrayList<String>();
    // List<String> otherMethodParams;
    String[] currentMatchParamTypes = null;
    String receiver = "";
    java.lang.reflect.Parameter[] myMethodParamTypes = method.getExecutable().getParameters();
    List<String> myParamTypes = new ArrayList<>();
    for (Parameter arg : myMethodParamTypes) {
      myParamTypes.add(arg.getType().getName());
    }

    for (CodeElement<?> currentMatch : sortedCodeElements) {
      List<Integer> indexesToBeMatched = new ArrayList<>();
      if (currentMatch instanceof ConstructorCodeElement) {
        currentMatchParamTypes = ((ConstructorCodeElement) currentMatch).getArgs();
        receiver = ((ConstructorCodeElement) currentMatch).getReceiver();
      } else if (currentMatch instanceof MethodCodeElement) {
        currentMatchParamTypes = ((MethodCodeElement) currentMatch).getArgs();
        receiver = ((MethodCodeElement) currentMatch).getReceiver();
      } else if (currentMatch instanceof StaticMethodCodeElement) {
        currentMatchParamTypes = ((StaticMethodCodeElement) currentMatch).getArgs();
      } else continue;
      // Match is a String: before building it, check if the method has parameters,
      // and fill the parenthesis () with the right ones

      if (currentMatchParamTypes != null
          && currentMatchParamTypes.length == equivalentMethod.getArguments().size()
          && currentMatchParamTypes.length
              <= myMethodParamTypes.length
                  + constantParamsToIgnore.size()
                  + codeElementsParams.size()) {

        int argIndex = 0;
        for (String currentMatchParam : currentMatchParamTypes) {
          if (myParamTypes.contains(currentMatchParam)
              || isGenericType(currentMatchParam, myParamTypes)) {
            if (!receiver.equals("args[" + argIndex + "]")) {
              paramForMatch.add("args[" + argIndex + "]");
              argIndex++;
            }
          } else if (constantParamsToIgnore.containsKey(argIndex)) {
            paramForMatch.add(constantParamsToIgnore.get(argIndex));
          } else {
            indexesToBeMatched.add(argIndex);
          }
        }

        boolean sizesMatch =
            paramForMatch.size() + codeElementsParams.size() == currentMatchParamTypes.length;
        if (sizesMatch) {
          firstCodeMatch = currentMatch;
          // break;
        }
      }

      if (firstCodeMatch != null) {
        String exp = firstCodeMatch.getJavaExpression();
        if (firstCodeMatch instanceof MethodCodeElement) {
          match =
              new Match(
                  exp.substring(0, exp.indexOf("(") + 1),
                  ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck());
        } else {
          match = new Match(exp.substring(0, exp.indexOf("(") + 1), null);
        }
        for (int j = 0; j < paramForMatch.size() - 1; j++) {
          match.completeExpression(paramForMatch.get(j) + ",");
        }
        if (!codeElementsParams.isEmpty()) {
          String[] codeElementTokens = codeElementsParams.get(0).split("\\.");
          String codeElementName = codeElementTokens[codeElementTokens.length - 1];
          //  Configuration configuration = Configuration.INSTANCE;
          //                    final String sourceFile =
          //                            configuration.sourceDir.toString()
          //                                    + File.separator
          //                                    +
          // method.getDeclaringClass().getCanonicalName().replaceAll("\\.", File.separator)
          //                                    + ".java";
          // List<String> packageClasses =
          //     JavadocExtractor.getClassesInSamePackage(
          //           method.getDeclaringClass().getCanonicalName(), sourceFile);

          // The following call will not work if there is no classname preceding the code element
          // name.
          // Pair<String, EquivalentMethodMatch.SystemLocation> theEquivalent =
          //        whereIsMethodDeclared(codeElementsParams.get(0), packageClasses);

          // if (theEquivalent.getValue().equals(EquivalentMethodMatch.SystemLocation.U)) {
          //          1. Extract all classes in package
          //          2. Extract all public code elements accessible from those classes: fields or
          // enums. (methods? I’m not sure)
          //          3. Perform syntax match, assuming that the receiver (the class name, in this
          // case BoundType) can be ignored.
          //          4. Use the receiver (BoundType) to understand if the type matching (args taken
          // by range()) is compatible
          //   System.out.println();
          // } else if (theEquivalent.getValue().equals(EquivalentMethodMatch.SystemLocation.P)) {
          // OK this was easy, we know where the code element comes from!

          List<FieldCodeElement> result = new ArrayList<>();
          int filled = 0;
          for (int i = 0; i < indexesToBeMatched.size(); i++) {
            String className = currentMatchParamTypes[i];
            // the class name is the one of the parameters left;
            Class<?> matchedType = null;
            try {
              matchedType = Reflection.getClass(className);
            } catch (ClassNotFoundException e) {
              // Intentionally empty: Apply other heuristics to load the exception type.
            }
            if (matchedType != null) {
              List<FieldCodeElement> allFieldsInClass = JavaElementsCollector.fieldsOf(matchedType);
              if (!allFieldsInClass.isEmpty()) {
                result =
                    allFieldsInClass
                        .stream()
                        .filter(
                            f ->
                                f.getJavaExpression()
                                    .equals(Configuration.RECEIVER + "." + codeElementName))
                        .collect(Collectors.toList());
              }
            }
            if (!result.isEmpty()) {
              // THAT'S IT! We found the right match (classes-public field).
              paramForMatch.add(className + "." + codeElementName);
            }
            // }
          }

          for (int j = 0; j < paramForMatch.size() - 1; j++) {
            match.completeExpression(paramForMatch.get(j) + ",");
          }
        }
        if (!paramForMatch.isEmpty()) {
          match.completeExpression(paramForMatch.get(paramForMatch.size() - 1) + ")");
        }
      }
    }
    if (match == null) {
      // No match is the absolute best: just pick the first one, but only if it takes no arguments!
      firstCodeMatch = sortedCodeElements.stream().findFirst().get();
      if ((firstCodeMatch instanceof MethodCodeElement
          && ((MethodCodeElement) firstCodeMatch).getArgs() == null)) {
        match =
            new Match(
                firstCodeMatch.getJavaExpression(),
                ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck());
      } else if (firstCodeMatch instanceof GeneralCodeElement) {
        match =
            new Match(
                firstCodeMatch.getJavaExpression(),
                ((GeneralCodeElement) firstCodeMatch).getNullDereferenceCheck());
      }
    }
    return match;
  }

  /**
   * Tells whether the signatures are located in the class (C), package (P), system (S). "U" means
   * Unknown and typically means the method is in another system.
   *
   * @param type the class
   * @param signature the signatures
   * @param packageClasses the classes in the same package
   * @return a string representing the location (C, P, S, U)
   */
  private static Pair<String, EquivalentMethodMatch.SystemLocation> whereIsMethodDeclared(
      String signature, List<String> packageClasses) {
    // TODO look if the method name is smt like Class#method or Class.method and look into
    // packageClasses!
    // TODO Currently there is no parse of the method name so this is all very naive

    String method = signature.trim();
    int hashMark = method.indexOf("#");
    int dot = method.indexOf('.');
    //      String methodSimpleName;
    //       int parenthesis = method.indexOf("(");

    //      List<DocumentedExecutable> executables = type.getDocumentedExecutables();
    //      if (parenthesis != -1 && hashMark == -1) {
    //        methodSimpleName = method.substring(0, parenthesis);
    //        for (DocumentedExecutable ex : executables) {
    //          if (ex.getSignature().contains(methodSimpleName)) {
    //            return new Pair<>(ex, EquivalentMethodMatch.SystemLocation.C);
    //          }
    //        }
    //      }
    String methodClass = "";
    if (dot != -1) {
      methodClass = method.substring(0, dot);
    } else if (hashMark != -1) {
      methodClass = method.substring(0, hashMark);
    }
    if (!packageClasses.isEmpty() && !methodClass.isEmpty()) {
      for (String pclass : packageClasses) {
        if (pclass.endsWith("." + methodClass)) {
          // FIXME don't like null here
          return new Pair<>(pclass, EquivalentMethodMatch.SystemLocation.P);
        }
      }
      // FIXME for now I am omitting outside-package classes
      /*
      for (String sclass : systemClasses) {
        if (sclass.endsWith("." + methodClass)) {
          //FIXME don't like null here
          return new Pair<>(null, EquivalentMethodMatch.SystemLocation.S);
        }
      }
      */
    }

    return new Pair<>(null, EquivalentMethodMatch.SystemLocation.U);
  }

  /**
   * Matches special patterns such as the equals() method and methods that take null as argument
   *
   * @param predicate the predicate to match
   * @param receiver receiver of the method to match
   * @param sortedCodeElements list of possible matches
   * @param paramsToMatch parameters to match
   * @return the match, may be null
   */
  private Match manageSpecialPatterns(
      String predicate,
      String receiver,
      List<CodeElement<?>> sortedCodeElements,
      java.lang.reflect.Parameter[] paramsToMatch) {

    final java.util.regex.Matcher nullPattern =
        Pattern.compile("(has|have|contains?) null").matcher(predicate);

    final java.util.regex.Matcher equalPattern = // or is it the equals() method?
        Pattern.compile("(is|are) equals?").matcher(predicate);

    CodeElement<?> firstCodeMatch = sortedCodeElements.stream().findFirst().get();

    Match match = null;
    if (nullPattern.find()) {
      String exp = firstCodeMatch.getJavaExpression();
      match =
          new Match(
              exp.substring(0, exp.indexOf("(") + 1) + "null" + ")",
              ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck());
    } else if (equalPattern.find()) {
      // the equal method can be invoked only from an Object to an Object of the same type
      receiver = receiver.replace("[", "").replace("]", "").replace("s", "");
      boolean foundArgMatch = false;
      for (int i = 0; i < paramsToMatch.length && !foundArgMatch; i++) {
        Parameter p = paramsToMatch[i];
        if (p.getName().equals(receiver)) { // found the receiver, who is the Object of same type?
          String type = p.getParameterizedType().getTypeName();
          for (int j = 0; j < paramsToMatch.length; j++) {
            if (j != i && paramsToMatch[j].getParameterizedType().getTypeName().equals(type)) {
              String exp = firstCodeMatch.getJavaExpression();
              match =
                  new Match(
                      exp.substring(0, exp.indexOf("(") + 1) + "args[" + j + "]" + ")",
                      ((MethodCodeElement) firstCodeMatch).getNullDereferenceCheck());
              foundArgMatch = true;
              break;
            }
          }
        }
      }
    }

    return match;
  }

  private boolean isGenericType(String pt, List<String> paramMatch) {
    // FIXME this is naive and potentially wrong, look at the same method in ComplianceChecks
    return paramMatch.contains("java.lang.Object")
        && pt.length() == 1
        && Character.isUpperCase(pt.charAt(0));
  }

  /**
   * Extracts and returns all the boolean methods of {@code type}, including methods that take as
   * parameter {@code parameterType}.
   *
   * @param targetClass the class from which extract the methods
   * @param parameter the actual parameter that has to be used to invoke the extracted methods
   * @return the static boolean methods in the given class target class as a set of code elements
   */
  private Set<CodeElement<?>> extractStaticBooleanMethods(
      Class<?> targetClass, ParameterCodeElement parameter) {
    Set<CodeElement<?>> collectedElements = new LinkedHashSet<>();

    // Add methods in containing class as code elements.
    methodCollection:
    for (Method classMethod : targetClass.getMethods()) {
      if (Modifier.isStatic(classMethod.getModifiers())
          && classMethod.getParameters().length < 2
          && (classMethod.getReturnType().equals(Boolean.class)
              || classMethod.getReturnType().equals(boolean.class))) {
        for (java.lang.reflect.Parameter par : classMethod.getParameters()) {
          if (!parameter.getJavaCodeElement().getType().equals(par.getType())) {
            continue methodCollection;
          }
        }
        collectedElements.add(
            new StaticMethodCodeElement(classMethod, parameter.getJavaExpression()));
      }
    }

    return collectedElements;
  }

  /**
   * Extracts and returns all fields and methods in the given class that have a boolean (return)
   * value. The returned code elements have the given code element integrated into their Java
   * expression representations as the receiver of the field or method call.
   *
   * @param receiver the code element that calls the field or method in the Java expression
   *     representation of the return code elements
   * @param type the class whose boolean-valued fields and methods to extract
   * @return the boolean-valued fields and methods in the given class as a set of code elements
   */
  private Set<CodeElement<?>> extractBooleanCodeElements(CodeElement<?> receiver, Class<?> type) {
    Set<CodeElement<?>> result = new LinkedHashSet<>();

    if (type.isArray()) {
      result.add(
          new GeneralCodeElement(
              receiver.getJavaExpression() + ".length==0",
              receiver.getJavaExpression() + "!=null",
              "isEmpty"));
      return result;
    }

    // Important: Sort members to make result deterministic!
    Comparator<Member> byName = Comparator.comparing(Member::getName);

    for (Field field :
        Arrays.stream(type.getFields()).sorted(byName).collect(Collectors.toList())) {
      if (field.getType().equals(Boolean.class) || field.getType().equals(boolean.class)) {
        result.add(new FieldCodeElement(receiver.getJavaExpression(), field));
      }
    }

    for (Method method :
        Arrays.stream(type.getMethods()).sorted(byName).collect(Collectors.toList())) {
      if (method.getReturnType().equals(Boolean.class)
          || method.getReturnType().equals(boolean.class)) {
        result.add(new MethodCodeElement(receiver.getJavaExpression(), method));
      }
    }

    return result;
  }

  /**
   * Attempts to match the given predicate to a simple Java expression (i.e. one containing only
   * literals). The visibility of this method is {@code protected} for testing purposes.
   *
   * @param predicate the predicate to translate to a Java expression. Must not be {@code null}.
   * @return a Java expression translation of the given predicate or null if the predicate could not
   *     be matched
   */
  private static Match simpleMatch(String predicate) {
    String verbs = "(is|are|be|is equal to|are equal to|equals to|return) ?";

    String predicates =
        "(true|false|null|this|empty|zero|positive|strictly positive|negative|strictly negative|nonnegative|nonpositive)";

    java.util.regex.Matcher isPattern =
        Pattern.compile(verbs + "(==|=)? ?" + predicates).matcher(predicate);

    java.util.regex.Matcher isNotPattern =
        Pattern.compile(verbs + "(!=)? ?" + predicates).matcher(predicate);

    java.util.regex.Matcher inequalityNumber =
        Pattern.compile(
                verbs
                    + "(<=|>=|<|>|!=|==|=)? ?(-?([0-9]+(.[0-9]+)?|zero|one|two|three|four\b|five|six\b|seven\b|eight\b|nine\b)(?! ))")
            .matcher(predicate);

    java.util.regex.Matcher inequalityVar =
        Pattern.compile(verbs + "(<=|>=|<|>|!=|==|=) ?((([a-zA-Z]+[0-9]?)+_?)+)")
            .matcher(predicate);

    java.util.regex.Matcher instanceOf = Pattern.compile("(instanceof) (.*)").matcher(predicate);

    Match match = null;
    String translation = null;
    if (isPattern.find()) {
      // Get the last group in the regular expression.
      translation = manageIsPattern(isPattern);
    } else if (isNotPattern.find()) {
      translation = manageIsNotPattern(isNotPattern);
    } else if (inequalityNumber.find()) {
      translation = manageInequalityNumber(inequalityNumber);
    } else if (inequalityVar.find()) {
      match = manageInequalityVar(predicate, inequalityVar);
    } else if (predicate.equals("been set")) {
      translation = "!=null";
    } else if (instanceOf.find()) {
      translation = " instanceof " + instanceOf.group(2);
    }

    if (translation != null && match == null) {
      match = new Match(translation, null);
    }

    return match;
  }

  /**
   * Returns the translation of predicate matching the inequalityVar regex
   *
   * @param inequalityVar the matching regex
   * @return the translation
   */
  private static Match manageInequalityVar(
      String predicate, java.util.regex.Matcher inequalityVar) {
    Match match;
    // Get the variable from the last group of the regular expression.
    String variable = inequalityVar.group(3);
    // Get the symbol from the regular expression.
    String relation = inequalityVar.group(2);
    // Now we have the variable name, but who is it in the code? We'll have to find it.
    if (relation == null || relation.equals("=")) {
      match = new Match("==" + "{" + variable + "}", null);
    } else {
      match = new Match(relation + "{" + variable + "}", null);
    }
    if (predicate.contains(variable + ".")) {
      match.completeExpression(predicate.substring(predicate.indexOf(".")));
      match.setNullDereferenceCheck("{" + variable + "}" + "!=null");
    }
    return match;
  }

  /**
   * Returns the translation of predicate matching the inequalityNumber regex
   *
   * @param inequalityNumber the matching regex
   * @return the translation
   */
  private static String manageInequalityNumber(java.util.regex.Matcher inequalityNumber) {
    String predicateTranslation;
    // Get the number from the last group of the regular expression.
    String numberString = inequalityNumber.group(3);
    // Get the symbol from the regular expression.
    String relation = inequalityNumber.group(2);
    String numberWord = numberWordToDigit(numberString);

    int intNumber = 0;
    float floatNumber = 0;
    boolean isIntNumber = false;

    if (!numberString.contains(".")) { // the number is an int
      intNumber =
          (!numberWord.equals(""))
              ? intNumber = Integer.parseInt(numberWord)
              : Integer.parseInt(numberString);

      isIntNumber = true;
    } else {
      floatNumber = Float.parseFloat(numberString);
    }
    // relation is null in predicates without inequalities. For example "is 0".
    if (relation == null || relation.equals("=")) {
      predicateTranslation = (isIntNumber) ? ("==" + intNumber) : ("==" + floatNumber);
    } else {
      predicateTranslation = (isIntNumber) ? (relation + intNumber) : (relation + floatNumber);
    }
    return predicateTranslation;
  }

  /**
   * Returns the translation of predicate matching the isNotPattern regex
   *
   * @param isNotPattern the matching regex
   * @return the translation
   */
  private static String manageIsNotPattern(java.util.regex.Matcher isNotPattern) {
    String predicateTranslation;
    String word = isNotPattern.group(isNotPattern.groupCount());
    switch (word) {
      case "true":
      case "false":
      case "null":
        predicateTranslation = "!=" + word;
        break;
      case "zero":
        predicateTranslation = "!=0";
        break;
      case "positive":
      case "strictly positive":
        predicateTranslation = ">0";
        break;
      case "negative":
      case "strictly negative":
        predicateTranslation = "<0";
        break;
      case "nonnegative":
        predicateTranslation = ">=0";
        break;
      case "nonpositive":
        predicateTranslation = "<=0";
        break;
      default:
        predicateTranslation = null;
    }
    return predicateTranslation;
  }

  /**
   * Returns the translation of predicate matching the isPattern regex
   *
   * @param isPattern the matching regex
   * @return the translation
   */
  private static String manageIsPattern(java.util.regex.Matcher isPattern) {
    String predicateTranslation;
    String lastWord = isPattern.group(isPattern.groupCount());
    switch (lastWord) {
      case "true":
      case "false":
      case "null":
        predicateTranslation = "==" + lastWord;
        break;
      case "this":
        predicateTranslation =
            "==" + Configuration.RECEIVER; // The receiver object in the generated aspects.
        break;
      case "zero":
        predicateTranslation = "==0";
        break;
      case "positive":
      case "strictly positive":
        predicateTranslation = ">0";
        break;
      case "negative":
      case "strictly negative":
        predicateTranslation = "<0";
        break;
      case "nonnegative":
        predicateTranslation = ">=0";
        break;
      case "nonpositive":
        predicateTranslation = "<=0";
        break;
      default:
        predicateTranslation = null;
    }
    return predicateTranslation;
  }

  private static String numberWordToDigit(String numberString) {
    switch (numberString) {
      case "zero":
        return "0";
      case "one":
        return "1";
      case "two":
        return "2";
      case "three":
        return "3";
      case "four":
        return "4";
      case "five":
        return "5";
      case "six":
        return "6";
      case "seven":
        return "7";
      case "eight":
        return "8";
      case "nine":
        return "9";
    }

    return "";
  }
}
