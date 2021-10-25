package org.callmemaybe.extractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.callmemaybe.translator.CodeElement;
import org.callmemaybe.util.ComplianceChecks;

// FIXME turn this into:
/*
EqSpecification extends Specification {

    public EqSpecification(Guard guard) {
        Checks.nonNullParameter(guard, "guard");
        this.guard = guard;
    }
 */
public class EquivalentMatch {

  /**
   * Bounds each method signature with its specific receiver, if any (default is receiverObjectID)
   */
  private Map<String, String> methodSignatures;

  private Map<String, CodeElement<?>> documentedSignatures;
  private CodeSnippet codeSnippet;
  private ArrayList<String> simpleName;
  private boolean equivalence;
  private boolean conditional;
  /** Maps each String signature to a list of String arguments */
  private Map<String, List<String>> arguments;

  /** Bounds signature with its class e.g. for format like ClassName#signature */
  private Map<String, String> classesInSignatures;

  private String condition;
  private String oracle;
  /**
   * This Map and the one below map a signature with A PAIR INT (PARAM POSITION), STRING (PARAM
   * NAME)
   */
  private Map<String, Map<Integer, String>> hardcodedParams;

  private Map<String, Map<Integer, String>> staticFinalParams;

  private Map<String, Map<Integer, String>> typeParams;

  private boolean isNegated;

  private String importsNeeded;
  //  public EquivalentMatch() {
  //    this.methodSignatures = new ArrayList<>();
  //    this.simpleName = new ArrayList<>();
  //    this.equivalence = false;
  //    this.conditional = false;
  //    this.oracle = "";
  //  }

  EquivalentMatch(
      Map<String, String> methodSignatures,
      boolean equivalence,
      boolean conditional,
      Map<String, List<String>> arguments,
      boolean isNegated) {

    this.methodSignatures = methodSignatures;
    this.documentedSignatures = new HashMap<>();
    extractClasses();
    extractSimpleNames();
    this.equivalence = equivalence;
    this.conditional = conditional;
    this.arguments = arguments;
    manageArgs();
    this.importsNeeded = "";
    this.isNegated = isNegated;
    this.oracle = "";
    this.condition = "";
  }

  private void extractClasses() {
    String className = "";
    this.classesInSignatures = new HashMap<>();
    for (String methodSignature : this.methodSignatures.keySet()) {
      if (Character.isUpperCase(methodSignature.charAt(0))) {
        if (methodSignature.contains(".")) {
          className = methodSignature.substring(0, methodSignature.indexOf("."));
        }
        if (methodSignature.contains("#")) {
          className = methodSignature.substring(0, methodSignature.indexOf("#"));
        }
      }
      this.classesInSignatures.put(methodSignature, className);
    }
  }

  private void manageArgs() {
    if (!methodSignatures.isEmpty()) {
      this.hardcodedParams = areArgsHardcoded(methodSignatures);
      this.staticFinalParams = areArgsStaticFinal(methodSignatures);
      this.typeParams = areArgsTypes(methodSignatures);
    } else {
      this.hardcodedParams = new HashMap<>();
      this.staticFinalParams = new HashMap<>();
      this.typeParams = new HashMap<>();
    }
  }

  private void extractSimpleNames() {
    this.simpleName = new ArrayList<>();
    for (String methodSignature : this.methodSignatures.keySet()) {
      //      Matcher classSignature = Pattern.compile("[A-Z].*[.#](.*)").matcher(methodSignature);
      ////      if (classSignature.find()) {
      ////          methodSignature = classSignature.group(1);
      ////      }
      if (Character.isUpperCase(methodSignature.charAt(0))) {
        if (methodSignature.contains(".")) {
          methodSignature = methodSignature.substring(methodSignature.indexOf(".") + 1);
        }
        if (methodSignature.contains("#")) {
          methodSignature = methodSignature.substring(methodSignature.indexOf("#") + 1);
        }
      }

      if (methodSignature.contains("(")) {
        this.simpleName.add(methodSignature.substring(0, methodSignature.indexOf("(")));
      } else {
        this.simpleName.add(methodSignature);
      }
    }
  }
  /**
   * Are values for the parameter hardcoded? e.g. digits for an int, a string between quotes for a
   * String, etc.
   *
   * @param methodSignatures
   * @return
   */
  private Map<String, Map<Integer, String>> areArgsHardcoded(Map<String, String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures.keySet()) {
      Map<Integer, String> constArgs = new HashMap<>();
      List<String> patterns = new ArrayList<>();
      // Is the value a number?
      patterns.add("-?[0-9]+(\\.[0-9]+)?");
      // Is the value an hardcoded code expression ?
      patterns.add("true|false|null");
      // Is the value a string between quotes?
      patterns.add("\"[a-zA-Z]+\"");
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          for (String pattern : patterns) {
            String arg = arguments.get(i);
            java.util.regex.Matcher matchConstant =
                Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(arg);
            if (matchConstant.matches()) {
              constArgs.put(i, matchConstant.group(0));
            }
          }
        }
      }
      map.put(signature, constArgs);
    }
    return map;
  }

  /**
   * Are arguments static final fields?
   *
   * @param methodSignatures
   * @return
   */
  private Map<String, Map<Integer, String>> areArgsStaticFinal(
      Map<String, String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures.keySet()) {
      Map<Integer, String> sfArgs = new HashMap<>();
      String staticFinalRegex = "[A-Z]{2,}|\\w+(\\.[A-Z_]+|#[A-Z_]+)+";
      List<String> signatureArgs = this.arguments.get(signature);
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          String arg = signatureArgs.get(i);
          Matcher staticFinalMatch = Pattern.compile(staticFinalRegex).matcher(arg);
          if (staticFinalMatch.matches()) {
            sfArgs.put(i, staticFinalMatch.group(0));
          }
        }
      }
      map.put(signature, sfArgs);
    }
    return map;
  }

  /**
   * Are arguments expressed only with their type? e.g. add(int, Object)
   *
   * @param methodSignatures
   * @return
   */
  private Map<String, Map<Integer, String>> areArgsTypes(Map<String, String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures.keySet()) {
      Map<Integer, String> tArgs = new HashMap<>();
      List<String> signatureArgs = this.arguments.get(signature);
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          String arg = signatureArgs.get(i);
          Map<Integer, String> sfParams = this.staticFinalParams.get(signature);
          if (!sfParams.containsKey(i) && !arg.isEmpty() && Character.isUpperCase(arg.charAt(0))
              || arg.contains("[]")
              || ComplianceChecks.primitiveTypes().contains(arg)) {
            tArgs.putIfAbsent(i, arg);
          }
        }
      }
      map.put(signature, tArgs);
    }
    return map;
  }

  public Map<String, Map<Integer, String>> getHardcodedParams() {
    return hardcodedParams;
  }

  public Map<String, Map<Integer, String>> getStaticFinalParams() {
    return staticFinalParams;
  }

  public Map<String, Map<Integer, String>> getTypeParams() {
    return typeParams;
  }

  public String getImportsNeeded() {
    return importsNeeded;
  }

  public void setImportsNeeded(String importsNeeded) {
    this.importsNeeded = importsNeeded;
  }

  public boolean isNegated() {
    return isNegated;
  }

  public String getCodeSnippetText() {
    return codeSnippet.getSnippet();
  }

  public CodeSnippet getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(CodeSnippet codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public void addSnippetSymbol(String symbol) {
    this.codeSnippet.getSymbols().put(symbol, null);
    this.codeSnippet.getSolvedSymbols().put(symbol, false);
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Map<String, String> getMethodSignatures() {
    return methodSignatures;
  }

  public boolean isConditional() {
    return conditional;
  }

  public boolean isEquivalence() {
    return equivalence;
  }

  public Map<String, List<String>> getArguments() {
    return arguments;
  }

  public ArrayList<String> getSimpleName() {
    return simpleName;
  }

  public void setOracle(String oracle) {
    this.oracle = oracle;
  }

  public String getOracle() {
    return this.oracle;
  }

  //  public void addDocumentedSignature(String signature, CodeElement<?> documentedExecutable) {
  //    this.documentedSignatures.put(signature, documentedExecutable);
  //  }

  public Map<String, String> getClassesInSignatures() {
    return classesInSignatures;
  }

  //  public Map<String, CodeElement<?>> getDocumentedSignatures() {
  //    return documentedSignatures;
  //  }
}
