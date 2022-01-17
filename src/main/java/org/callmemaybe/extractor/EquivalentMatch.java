package org.callmemaybe.extractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.callmemaybe.translator.CodeElement;

// FIXME turn this into:
/*
EqSpecification extends Specification {

    public EqSpecification(Guard guard) {
        Checks.nonNullParameter(guard, "guard");
        this.guard = guard;
    }
 */
public class EquivalentMatch {

  // Filling the args of a  signature mentioned in a comment is non-trivial (e.g., it may need a matching against
  // available code elements, or, it could have hard-coded values, etc.). Here we hold all the
  // options we have to fill the signature correctly.
  private final DocSignatureParameters docSignatureParameters = new DocSignatureParameters();

  /**
   * Bounds each method signature with its specific receiver, if any (default is receiverObjectID)
   */
  private Map<String, String> methodSignatures;

  private Map<String, CodeElement<?>> documentedSignatures;
  private CodeSnippet codeSnippet;
  private ArrayList<String> simpleName;
  private boolean equivalence;
  private boolean conditional;

  /** Bounds signature with its class e.g. for format like ClassName#signature */
  private Map<String, String> classesInSignatures;

  private String condition;
  private String oracle;

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
    this.docSignatureParameters.arguments = arguments;
    this.docSignatureParameters.doArgsFillingForSignatures(this.methodSignatures);
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

  public Map<String, Map<Integer, String>> getHardcodedParams() {
    return docSignatureParameters.hardcodedParams;
  }

  public Map<String, Map<Integer, String>> getStaticFinalParams() {
    return docSignatureParameters.staticFinalParams;
  }

  public Map<String, Map<Integer, String>> getTypeParams() {
    return docSignatureParameters.typeParams;
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
    return docSignatureParameters.arguments;
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

  public DocSignatureParameters getDocSignatureParameters() {
    return docSignatureParameters;
  }

  //  public Map<String, CodeElement<?>> getDocumentedSignatures() {
  //    return documentedSignatures;
  //  }
}
