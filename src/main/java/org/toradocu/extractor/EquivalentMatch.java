package org.toradocu.extractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.toradocu.util.ComplianceChecks;

// FIXME turn this into:
/*
EqSpecification extends Specification {

    public EqSpecification(Guard guard) {
        Checks.nonNullParameter(guard, "guard");
        this.guard = guard;
    }
 */
public class EquivalentMatch {

  private ArrayList<String> methodSignatures;
  private CodeSnippet codeSnippet;
  private ArrayList<String> simpleName;
  private boolean equivalence;
  private boolean similarity;
  /** Maps each String signature to a list of String arguments */
  private Map<String, List<String>> arguments;

  private String oracle;
  /**
   * This Map and the one below map a signature with A PAIR INT (PARAM POSITION), STRING (PARAM
   * NAME)
   */
  private Map<String, Map<Integer, String>> hardcodedParams;

  private Map<String, Map<Integer, String>> staticFinalParams;

  private Map<String, Map<Integer, String>> typeParams;

  private boolean isNegated;

  String importsNeeded;
  //  public EquivalentMatch() {
  //    this.methodSignatures = new ArrayList<>();
  //    this.simpleName = new ArrayList<>();
  //    this.equivalence = false;
  //    this.similarity = false;
  //    this.oracle = "";
  //  }

  EquivalentMatch(
      ArrayList<String> methodSignatures,
      boolean equivalence,
      boolean similarity,
      Map<String, List<String>> arguments,
      boolean isNegated) {

    this.methodSignatures = methodSignatures;
    extractSimpleNames();
    this.equivalence = equivalence;
    this.similarity = similarity;
    this.arguments = arguments;
    manageArgs();
    this.importsNeeded = "";
    this.isNegated = isNegated;
    this.oracle = "";
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
    for (String methodSignature : this.methodSignatures) {
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

  public ArrayList<String> getMethodSignatures() {
    return methodSignatures;
  }

  public boolean isSimilarity() {
    return similarity;
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

  private Map<String, Map<Integer, String>> areArgsHardcoded(ArrayList<String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures) {
      Map<Integer, String> constArgs = new HashMap<>();
      List<String> patterns = new ArrayList<>();
      patterns.add("[0-9]+(\\.[0-9]+)?");
      patterns.add("true|false");
      patterns.add("\"[a-zA-Z]+\"");
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          for (String pattern : patterns) {
            String arg = arguments.get(i);
            java.util.regex.Matcher matchConstant =
                Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(arg);
            if (matchConstant.find()) {
              constArgs.put(i, matchConstant.group(0));
            }
          }
        }
      }
      map.put(signature, constArgs);
    }
    return map;
  }

  private Map<String, Map<Integer, String>> areArgsStaticFinal(ArrayList<String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures) {
      Map<Integer, String> sfArgs = new HashMap<>();
      String staticFinalRegex = "[A-Z]+|\\w+(\\.[A-Z_]+|#[A-Z_]+)+";
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

  private Map<String, Map<Integer, String>> areArgsTypes(ArrayList<String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures) {
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

  public void addSignature(String signature) {
    this.methodSignatures.add(signature);
    extractSimpleNames();
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
}
