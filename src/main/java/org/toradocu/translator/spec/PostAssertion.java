package org.toradocu.translator.spec;

/**
 * Body is a sequence of statements that get executed before the assertion. The statements may let
 * the assertion fail, or not.
 */
public class PostAssertion {
  private final Body body;
  private final Assertion assertion;

  public PostAssertion(Body body, Assertion assertion) {
    this.body = body;
    this.assertion = assertion;
  }

  public Body getBody() {
    return body;
  }

  public Assertion getAssertion() {
    return assertion;
  }

  private String stringExpression() {
    if (!body.toString().isEmpty()) {
      return body + "\n" + assertion;
    }
    return assertion.toString();
  }

  @Override
  public String toString() {
    return stringExpression();
  }
}
