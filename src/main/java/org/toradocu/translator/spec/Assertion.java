package org.toradocu.translator.spec;

public class Assertion {
  public static final String OPENING = "assert(";
  public static final String CLOSING = ");";
  private final String booleanExpression;

  public Assertion(String booleanExpression) {
    this.booleanExpression = booleanExpression;
  }

  @Override
  public String toString() {
    return booleanExpression;
  }
}
