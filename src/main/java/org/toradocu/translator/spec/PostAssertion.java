package org.toradocu.translator.spec;

import java.util.LinkedList;

/**
 * Body is a sequence of statements that get executed before the assertion. The statements may let
 * the assertion fail, or not.
 */
public class PostAssertion {
  // FIXME I'm still not sure where to put the snippet so here it is
  private final Body dummyMethod;
  private final Body body;
  private final Assertion assertion;

  public PostAssertion(Body body, Assertion assertion, Body dummyMethod) {
    this.body = body;
    this.assertion = assertion;
    this.dummyMethod = dummyMethod;
  }

  public Body getDummyMethod() {
    return dummyMethod;
  }

  public Body getBody() {
    return body;
  }

  public LinkedList<String> getBodyContent() {
    return this.body.getStatements();
  }

  public Assertion getAssertion() {
    return assertion;
  }

  public String getAssertionContent() {
    return this.assertion.getBooleanExpression();
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

  public boolean isEmpty() {
    return this.assertion.isEmpty();
  }
}
