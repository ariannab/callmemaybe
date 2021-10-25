package org.callmemaybe.translator.spec;

public class Assertion {
  public static final String OPENING = "assert(";
  public static final String CLOSING = ");";
  private final String booleanExpression;

  public Assertion(String booleanExpression) {
    this.booleanExpression = booleanExpression;
  }

  public String getBooleanExpression() {
    return booleanExpression;
  }

  @Override
  public String toString() {
    return booleanExpression;
  }

  public String asAssertionString() {
    return OPENING + booleanExpression + CLOSING;
  }

  public boolean isEmpty() {
    return this.booleanExpression.isEmpty();
  }
}
