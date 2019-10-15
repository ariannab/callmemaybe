package org.toradocu.util;

import java.io.File;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mdkt.compiler.CompilationException;
import org.mdkt.compiler.InMemoryJavaCompiler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.toradocu.conf.Configuration;
import org.toradocu.extractor.CodeSnippet;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.DocumentedParameter;
import org.toradocu.extractor.EquivalentMatch;
import org.toradocu.extractor.JavadocExtractor;
import org.toradocu.translator.FreeTextTranslator;
import randoop.condition.specification.Guard;
import randoop.condition.specification.Property;

public class ComplianceChecks {

  /** Logger of this class. */
  private static final Logger log = LoggerFactory.getLogger(ComplianceChecks.class);

  /**
   * Tries to compile the boolean condition in the given {@code Guard} and tells whether the
   * compilation was successful.
   *
   * @param method documented executable the guard belongs to
   * @param condition the guard which condition must be checked for compliance
   * @return true if the condition was compilable, false otherwise
   */
  public static boolean isSpecCompilable(DocumentedExecutable method, String condition) {
    if (Modifier.isPrivate(method.getDeclaringClass().getModifiers())) {
      // if the target class is private we cannot apply compliance check.
      return true;
    }
    SourceCodeBuilder sourceCodeBuilder = addCommonInfo(method);
    addOracle(method, condition, sourceCodeBuilder);
    String sourceCode = sourceCodeBuilder.buildSource();
    try {
      compileSource(sourceCode);
    } catch (CompilationException e) {
      log.info(
          "The following specification was generated but discarded:\n"
              + condition
              + "\n"
              + e.getLocalizedMessage()
              + "\n");
      return false;
    } catch (ClassNotFoundException e) {
      // ignore
    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;
  }

  /**
   * Tries to compile the boolean conditions in the given {@code Guard} and {@code Property} and
   * tells whether the compilation was successful.
   *
   * @param method documented executable the guard belongs to
   * @param guard the guard which condition must be checked for compliance
   * @param property the property which condition must be checked for compliance
   * @return true if the condition was compilable, false otherwise
   */
  public static boolean isPostSpecCompilable(
      DocumentedExecutable method, Guard guard, Property property) {
    if (Modifier.isPrivate(method.getDeclaringClass().getModifiers())) {
      // if the target class is private we cannot apply compliance check.
      return true;
    }
    SourceCodeBuilder sourceCodeBuilder = addCommonInfo(method);
    includeMethodResult(method, sourceCodeBuilder);
    addOracle(method, guard.getConditionText(), sourceCodeBuilder);
    addOracle(method, property.getConditionText(), sourceCodeBuilder);
    String sourceCode = sourceCodeBuilder.buildSource();
    try {
      compileSource(sourceCode);
    } catch (CompilationException e) {
      log.info(
          "The following specification was generated but discarded:\n"
              + guard.getConditionText()
              + " ? "
              + property.getConditionText()
              + "\n"
              + e.getLocalizedMessage()
              + "\n");
      return false;
    } catch (ClassNotFoundException e) {
      // ignore
    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;
  }

  /**
   * Compilation check for equivalence specifications
   *
   * @param method the method the equivalence comment belongs to
   * @return whether the condition compiles or not
   */
  public static boolean isEqSpecCompilable(
      DocumentedExecutable method, EquivalentMatch equivalentMethodMatch) {

    if (Modifier.isPrivate(method.getDeclaringClass().getModifiers())) {
      // if the target class is private we cannot apply compliance check.
      return true;
    }
    // FIXME when receiving in input a condition, it goes as an IF inside the oracle's if.
    // FIXME this should be checked also for returns translation
    SourceCodeBuilder sourceCodeBuilder = addCommonInfo(method);
    sourceCodeBuilder.addImport(equivalentMethodMatch.getImportsNeeded());
    includeMethodResult(method, sourceCodeBuilder);
    addOracle(method, equivalentMethodMatch, sourceCodeBuilder);
    boolean compilable = false;
    int attempts = 0;
    while (!compilable && attempts < 3) {
      String sourceCode = sourceCodeBuilder.buildSource();
      try {
        compileSource(sourceCode);
      } catch (CompilationException e) {
        String prevOracle = equivalentMethodMatch.getOracle();
        ComplianceError ce = new ComplianceError();
        attempts++;
        ce.chooseErrorStrategy(e.getLocalizedMessage(), method, prevOracle);
        if (!ce.getUnreportedException().isEmpty()) {
          sourceCodeBuilder.addExceptionInSignature(ce.getUnreportedException());
        } else if (ce.isIncompatibleTypes()) {
          String newOracle =
              FreeTextTranslator.manageVoidAndUncompatibleMethods(method, prevOracle);
          equivalentMethodMatch.setOracle(newOracle);
          addOracle(method, equivalentMethodMatch, sourceCodeBuilder);
        } else {
          if (!ce.getInstanceOfClause().isEmpty()) {
            log.info("Equivalence found, but an instanceof check is needed");
          }
          log.info(
              "The following specification for method "
                  + method.getSignature()
                  + " was generated but discarded:\n"
                  + prevOracle
                  + "\n"
                  + e.getLocalizedMessage()
                  + "\n"
                  + "Are you trying to compare different result types?"
                  + "\n");

          return false;
        }
        continue;
      } catch (ClassNotFoundException e) {
        // ignore
      } catch (Exception e) {
        e.printStackTrace();
      }
      compilable = true;
    }
    return true;
  }

  /**
   * Compilation check for equivalence specifications
   *
   * @param method the method the equivalence comment belongs to
   * @return whether the condition compiles or not
   */
  public static boolean isSnippetCompilable(
      DocumentedExecutable method, EquivalentMatch equivalentMethodMatch, ComplianceError ce) {
    // String oracle = equivalentMethodMatch.getCodeSnippetText();
    CodeSnippet snippet = equivalentMethodMatch.getCodeSnippet();
    // FIXME when receiving in input a condition, it goes as an IF inside the oracle's if.
    // FIXME this should be checked also for returns translation
    snippet = sobstituteKnownSpecialSymbols(snippet);
    SourceCodeBuilder sourceCodeBuilder = addCommonInfo(method);
    sourceCodeBuilder.addImport(equivalentMethodMatch.getImportsNeeded());
    includeMethodResult(method, sourceCodeBuilder);
    addOracle(method, snippet, sourceCodeBuilder);
    String sourceCode = sourceCodeBuilder.buildSource();
    try {
      compileSource(sourceCode);
    } catch (CompilationException e) {
      ce.chooseErrorStrategy(e.getLocalizedMessage(), method, snippet);
      return false;
    } catch (ClassNotFoundException e) {
      // ignore
    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;
  }

  private static CodeSnippet sobstituteKnownSpecialSymbols(CodeSnippet snippet) {
    snippet.addMatchToSymbol("this", Configuration.RECEIVER);
    return snippet;
  }

  /**
   * Includes in the source code builder information needed to compile a condition involving the
   * method result.
   *
   * @param method the method the condition is about
   * @param sourceCodeBuilder the source code builder to enrich with the information
   */
  private static void includeMethodResult(
      DocumentedExecutable method, SourceCodeBuilder sourceCodeBuilder) {
    String methodReturnType = method.getReturnType().getType().getTypeName();
    if (!methodReturnType.equals("void")) {
      sourceCodeBuilder.addArgument(methodReturnType, Configuration.RETURN_VALUE);
      String returnTypeClass = method.getReturnType().getClass().getName();
      if (!methodReturnType.contains("[")
          && !returnTypeClass.contains("AnnotatedTypeVariableImpl")
          && !primitiveTypes().contains(methodReturnType)
          && !isGenericType(methodReturnType)) {
        sourceCodeBuilder.addImport(methodReturnType);
      }
    }
  }

  public static boolean isGenericType(String methodReturnType) {
    return methodReturnType.length() == 1 && Character.isUpperCase(methodReturnType.charAt(0));
  }

  public static Set<String> primitiveTypes() {
    Set<String> primitives = new HashSet<>();
    primitives.add("int");
    primitives.add("boolean");
    primitives.add("char");
    primitives.add("byte");
    primitives.add("short");
    primitives.add("long");
    primitives.add("float");
    primitives.add("double");
    return primitives;
  }

  /**
   * Invokes the in-memory compiler on the given source code.
   *
   * @param sourceCode source code to be compiled
   * @throws Exception if the compiler encounters problems
   */
  private static void compileSource(String sourceCode) throws Exception {
    InMemoryJavaCompiler compiler = InMemoryJavaCompiler.newInstance();
    compiler.ignoreWarnings();
    List<String> classpath = new ArrayList<>();
    for (URL url : Configuration.INSTANCE.classDirs) {
      classpath.add(url.getPath());
    }
    compiler.useOptions("-cp", String.join(":", classpath));
    compiler.compile("GeneratedSpecs", sourceCode);
  }

  /**
   * Add to the source code to be compiled the information common to any specification.
   *
   * @param method the method which specifications must be compiled
   * @return a {@code SourceCodeBuilder} object that wraps the source code
   */
  private static SourceCodeBuilder addCommonInfo(DocumentedExecutable method) {
    SourceCodeBuilder sourceCodeBuilder = new SourceCodeBuilder();
    Class<?> declaringClass = method.getDeclaringClass();

    if (!Modifier.isPublic(declaringClass.getModifiers())) {
      // class is package-private
      sourceCodeBuilder.addPackage(declaringClass);
    }

    List<String> links = method.getFreeText().getComment().getLinksContent();
    for (String link : links) {
      if (link.matches("[a-z].*")
          && !link.contains("#")
          && !link.contains("(")
          && link.contains(".")) {
        sourceCodeBuilder.addImport(link);
      }
    }

    sourceCodeBuilder.addImport(declaringClass.getName());
    sourceCodeBuilder.addArgument(declaringClass.getName(), Configuration.RECEIVER);
    sourceCodeBuilder.copyClassTypeArguments(declaringClass.getTypeParameters());
    sourceCodeBuilder.copyTypeArguments(method.getExecutable().getTypeParameters());
    return sourceCodeBuilder;
  }

  /**
   * Finds if the condition involves an {@code instanceof} invocation and imports in the source code
   * the classes it is referred to
   *
   * @param method the method which specifications must be compiled
   * @param sourceCodeBuilder {@code SourceCodeBuilder} object that wraps the source code
   * @param conditionText condition text
   */
  private static void importClassesInInstanceOf(
      DocumentedExecutable method, SourceCodeBuilder sourceCodeBuilder, String conditionText) {
    Matcher matcher = Pattern.compile(" instanceof ([A-Z][A-Za-z]+)").matcher(conditionText);
    while (matcher.find()) {
      String className = matcher.group(1);

      Configuration configuration = Configuration.INSTANCE;
      final String sourceFile =
          configuration.sourceDir.toString()
              + File.separator
              + method.getDeclaringClass().getCanonicalName().replaceAll("\\.", File.separator)
              + ".java";
      List<String> classesInPackage =
          JavadocExtractor.getClassesInSamePackage(
              method.getDeclaringClass().getCanonicalName(), sourceFile);
      for (String classInPackage : classesInPackage) {
        if (classInPackage.endsWith("." + className)) {
          sourceCodeBuilder.addImport(classInPackage);
          break;
        }
      }
    }
  }
  /**
   * Extracts and add to the source code information expressed in the given condition text.
   *
   * @param method documented executable the guard belongs to
   * @param snippet
   * @param sourceCodeBuilder {@code SourceCodeBuilder} object that wraps the source code
   */
  private static void addOracle(
      DocumentedExecutable method, CodeSnippet snippet, SourceCodeBuilder sourceCodeBuilder) {
    // FIXME this is comparison between method result and code snippet so build a legit method
    // signature
    // FIXME which body is the snippet and only then you can compare results
    String substitutedText = substituteArgs(sourceCodeBuilder, method, snippet.getSnippet());

    if (snippet.isExpression()) {
      substitutedText = "assert(" + substitutedText + ")" + ";";
    } else if (snippet.isTernary()) {
      substitutedText =
          method.getReturnType().getType().getTypeName() + " result = " + substitutedText + ";";
    } else if (snippet.isComplexSignature()) {
      if (snippet.isComplexSignatureWithIncompatibleTypes()) {
        substitutedText =
            FreeTextTranslator.manageVoidAndUncompatibleMethods(method, snippet.getSnippet());
        substitutedText = substituteArgs(sourceCodeBuilder, method, substitutedText);
        if (substitutedText.contains(Configuration.RECEIVER_CLONE)) {
          sourceCodeBuilder.addArgument(
              method.getDeclaringClass().getTypeName(), Configuration.RECEIVER_CLONE);
        }
      } else if (!method.getReturnType().getType().getTypeName().equals("void")) {
        String equality;
        String end = "";
        if (primitiveTypes().contains(method.getReturnType().getType().getTypeName())) {
          equality = Configuration.RETURN_VALUE + "==";
        } else {
          equality = Configuration.RETURN_VALUE + ".equals(";
          end = ")";
        }
        substitutedText = "assert(" + equality + substitutedText + ")" + end + ";";
      }
    }
    sourceCodeBuilder.addCondition(substitutedText);
    importClassesInInstanceOf(method, sourceCodeBuilder, substitutedText);
  }

  /**
   * Extracts and add to the source code information expressed in the given condition text.
   *
   * @param method documented executable the guard belongs to
   * @param sourceCodeBuilder {@code SourceCodeBuilder} object that wraps the source code
   */
  private static void addOracle(
      DocumentedExecutable method, EquivalentMatch match, SourceCodeBuilder sourceCodeBuilder) {
    String oracle = match.getOracle();
    String condition = match.getCondition();
    if (oracle.contains(Configuration.RECEIVER_CLONE)) {
      sourceCodeBuilder.addArgument(
          method.getDeclaringClass().getTypeName(), Configuration.RECEIVER_CLONE);
    }
    String substitutedText = substituteArgs(sourceCodeBuilder, method, oracle);
    if (!condition.isEmpty()) {
      String premises = "if (" + condition + ") {";
      String conclusion = "}";
      if (!substitutedText.contains("\n")) {
        substitutedText = premises + "assert(" + substitutedText + ")" + ";" + conclusion;
      } else {
        substitutedText = premises + substitutedText + conclusion;
      }
      substitutedText = substituteArgs(sourceCodeBuilder, method, substitutedText);
    } else if (!oracle.contains("\n")) {
      // FIXME Oracle on more than one statement means comparison between object states. Though I
      // don't like this
      substitutedText = "assert(" + substitutedText + ")" + ";";
    }
    sourceCodeBuilder.addCondition(substitutedText);
    importClassesInInstanceOf(method, sourceCodeBuilder, substitutedText);
  }

  /**
   * Extracts and add to the source code information expressed in the given condition text.
   *
   * @param method documented executable the guard belongs to
   * @param oracle the condition text
   * @param sourceCodeBuilder {@code SourceCodeBuilder} object that wraps the source code
   */
  private static void addOracle(
      DocumentedExecutable method, String oracle, SourceCodeBuilder sourceCodeBuilder) {
    if (oracle.contains(Configuration.RECEIVER_CLONE)) {
      sourceCodeBuilder.addArgument(
          method.getDeclaringClass().getTypeName(), Configuration.RECEIVER_CLONE);
    }
    String substitutedText = substituteArgs(sourceCodeBuilder, method, oracle);
    sourceCodeBuilder.addCondition("assert (" + substitutedText + ")" + ";");
    importClassesInInstanceOf(method, sourceCodeBuilder, substitutedText);
  }

  /**
   * Substitutes in the condition the actual arguments names, since Toradocu-generated conditions
   * refer to the nth argument with the {@code args[n]} notation.
   *
   * @param sourceCodeBuilder {@code SourceCodeBuilder} object that wraps the source code
   * @param method documented executable the guard belongs to
   * @param text condition text
   * @return condition text with argument names substituted
   */
  private static String substituteArgs(
      SourceCodeBuilder sourceCodeBuilder, DocumentedExecutable method, String text) {
    if (text != null) {
      final String ARGS_REGEX = "args\\[([0-9])\\]";
      java.util.regex.Matcher argsMatcher = Pattern.compile(ARGS_REGEX).matcher(text);
      while (argsMatcher.find()) {
        int argIndex = Integer.valueOf(argsMatcher.group(1));
        String parameter = method.getParameters().get(argIndex).getName();
        text = text.replace(argsMatcher.group(0), parameter);
        DocumentedParameter argument = method.getParameters().get(argIndex);
        if (argument.asReflectionParameter().isVarArgs()) {
          sourceCodeBuilder.addVarArgArgument(argument.toString());
        } else {
          sourceCodeBuilder.addArgument(argument.toString());
        }
      }
    }

    return text;
  }
}
