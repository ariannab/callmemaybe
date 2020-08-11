package org.toradocu.translator.spec;

import java.util.LinkedList;

/**
 * Body is a sequence of statements that get executed before the postAssertion. The statements may
 * let the postAssertion fail, or not.
 */
public class PostAssertion {
  // FIXME I'm still not sure where to put the snippet so here it is
  private final Body snippetWrapper;
  private final Body preceedingStatements;
  private final Assertion postAssertion;

  public PostAssertion(Body preceedingStatements, Assertion postAssertion, Body snippetWrapper) {
    // FIXME isn't the dummy invocation always the same? Verify.
    this.preceedingStatements = preceedingStatements;
    this.postAssertion = postAssertion;
    this.snippetWrapper = snippetWrapper;
  }

  public Body getSnippetWrapper() {
    return snippetWrapper;
  }

  public Body getPreceedingStatements() {
    return preceedingStatements;
  }

  public LinkedList<String> getBodyContent() {
    return this.preceedingStatements.getStatements();
  }

  public Assertion getPostAssertion() {
    return postAssertion;
  }

  public String getAssertionContent() {
    return this.postAssertion.getBooleanExpression();
  }

  // FIXME delete whether never used (Aspects, goal files)
  private String stringExpression() {
    if (!preceedingStatements.toString().isEmpty()) {
      return preceedingStatements + "\n" + postAssertion;
    }
    return postAssertion.toString();
  }

  private String simplifiedTranslation() {
    StringBuilder simplifiedTranslation = new StringBuilder();

    if (!snippetWrapper.toString().isEmpty()) {
      simplifiedTranslation.append("methodResultID.equals[");
      simplifiedTranslation.append(snippetWrapper.getBodyAsString());
      simplifiedTranslation.append("]");
    } else if (!preceedingStatements.isEmpty()) {
      simplifiedTranslation.append(preceedingStatements.getBodyAsString());
      simplifiedTranslation.append(postAssertion.toString());
    } else {
      simplifiedTranslation.append(postAssertion.toString());
    }
    return simplifiedTranslation.toString();
  }

  @Override
  public String toString() {
    return simplifiedTranslation();
  }

  public boolean isEmpty() {
    return this.postAssertion.isEmpty();
  }
}
