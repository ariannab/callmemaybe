package org.toradocu.translator.spec;

import java.util.regex.Pattern;

public class Assertion {
  public static final String OPENING = "assert(";
  public static final String CLOSING = ");";
  private final String booleanExpression;

  public Assertion(String booleanExpression) {
    // FIXME ugly, check where this was created and eliminate it
    this.booleanExpression =
        booleanExpression
            .replaceAll(Pattern.quote(OPENING), "")
            .replaceAll(Pattern.quote(CLOSING), "");
  }

  public String getBooleanExpression() {
    return booleanExpression;
  }

  @Override
  public String toString() {
    return booleanExpression;
  }

  public boolean isEmpty() {
    return this.booleanExpression.isEmpty();
  }
}
