package org.toradocu.extractor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

// FIXME turn this into:
/*
EqSpecification extends Specification {

    public EqSpecification(Guard guard) {
        Checks.nonNullParameter(guard, "guard");
        this.guard = guard;
    }
 */
public class MethodMatch {

  private String methodSignature;
  private String simpleName;
  private boolean equivalence;
  private boolean similarity;
  private List<String> arguments;
  private String oracle;
  private Map<Integer, String> constants;

  public MethodMatch() {
    this.methodSignature = "";
    this.simpleName = "";
    this.equivalence = false;
    this.similarity = false;
    this.oracle = "";
  }

  MethodMatch(
      String methodSignature, boolean equivalence, boolean similarity, List<String> arguments) {
    this.methodSignature = methodSignature;
    this.equivalence = equivalence;
    this.similarity = similarity;
    this.arguments = arguments;
    this.constants = areArgsConstants();
    if (methodSignature.contains("(")) {
      this.simpleName = methodSignature.substring(0, methodSignature.indexOf("("));
    } else {
      this.simpleName = methodSignature;
    }
  }

  public String getMethodSignature() {
    return methodSignature;
  }

  public boolean isSimilarity() {
    return similarity;
  }

  public boolean isEquivalence() {
    return equivalence;
  }

  public List<String> getArguments() {
    return arguments;
  }

  public String getSimpleName() {
    return simpleName;
  }

  public void setOracle(String oracle) {
    this.oracle = oracle;
  }

  public String getOracle() {
    return this.oracle;
  }

  public Map<Integer, String> getConstants() {
    return constants;
  }

  private Map<Integer, String> areArgsConstants() {
    Map<Integer, String> constants = new HashMap<>();
    if (this.arguments != null) {
      for (int i = 0; i < this.arguments.size(); i++) {
        java.util.regex.Matcher matchConstant =
            Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE).matcher(this.arguments.get(i));
        if (matchConstant.find()) {
          constants.put(i, matchConstant.group(0));
        }
      }
    }
    return constants;
  }
}
