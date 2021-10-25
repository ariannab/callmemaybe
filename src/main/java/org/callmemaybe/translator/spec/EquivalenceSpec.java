package org.callmemaybe.translator.spec;

import randoop.condition.specification.Guard;
import randoop.condition.specification.SpecificationClause;

public class EquivalenceSpec extends SpecificationClause {

  private final PostAssertion postAssertion;

  public EquivalenceSpec(String description, Guard guard, PostAssertion postAssertion) {
    // guard in this case it's the conditional.
    super(description, guard);
    this.postAssertion = postAssertion;
  }

  public PostAssertion getPostAssertion() {
    return postAssertion;
  }

  public boolean isEmpty() {
    return this.postAssertion.isEmpty();
  }

  @Override
  public String toString() {
    return "EquivalenceSpec{" + "postAssertion=" + postAssertion + '}';
  }
}
