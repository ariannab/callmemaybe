package org.toradocu.extractor;

import java.util.List;

public class MethodMatch {

  private String methodSignature;
  private String simpleName;
  private boolean equivalence;
  private boolean similarity;
  private List<String> arguments;

  public MethodMatch(
      String method, boolean equivalence, boolean similarity, List<String> arguments) {
    this.methodSignature = method;
    this.equivalence = equivalence;
    this.similarity = similarity;
    this.arguments = arguments;
    this.simpleName = method.substring(0, method.indexOf("("));
  }

  public String getMethodSignature() {
    return methodSignature;
  }

  public boolean isEquivalence() {
    return equivalence;
  }

  public boolean isSimilarity() {
    return similarity;
  }

  public List<String> getArguments() {
    return arguments;
  }

  public String getSimpleName() {
    return simpleName;
  }
}
