package org.toradocu.output.util;

public class EquivalenceOutput extends TagOutput {

  public EquivalenceOutput(String comment, String kind, String condition) {
    super(comment, kind, condition);
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public String toString() {
    return "EquivalenceOutput{}";
  }
}
