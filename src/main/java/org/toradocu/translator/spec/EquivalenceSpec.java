package org.toradocu.translator.spec;

import randoop.condition.specification.Guard;
import randoop.condition.specification.SpecificationClause;

// FIXME this will become PostAssertion
public class EquivalenceSpec extends SpecificationClause {
  private final PostAssertion postAssertion;

  public EquivalenceSpec(String description, Guard guard, PostAssertion postAssertion) {
    super(description, guard);
    this.postAssertion = postAssertion;
  }

  public PostAssertion getPostAssertion() {
    return postAssertion;
  }
}
