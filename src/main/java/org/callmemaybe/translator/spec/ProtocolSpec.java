package org.callmemaybe.translator.spec;

import randoop.condition.specification.Guard;
import randoop.condition.specification.SpecificationClause;

public class ProtocolSpec extends SpecificationClause {

  // FIXME just to test the flow, doubt that "post assertion" is the right concept for protocols
  private final PostAssertion postAssertion;

  public ProtocolSpec(String description, Guard guard, PostAssertion postAssertion) {
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
    return "ProtocolSpec{" + "postAssertion=" + postAssertion + '}';
  }
}
