package org.toradocu.extractor;

public class MethodMatch {

  private String method = "";
  private boolean equivalence = false;
  private boolean similarity = false;

  public MethodMatch(String method, boolean equivalence, boolean similarity) {
    this.method = method;
    this.equivalence = equivalence;
    this.similarity = similarity;
  }

  public String getMethod() {
    return method;
  }

  public boolean isEquivalence() {
    return equivalence;
  }

  public boolean isSimilarity() {
    return similarity;
  }
}
