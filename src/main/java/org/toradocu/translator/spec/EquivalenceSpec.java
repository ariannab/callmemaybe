package org.toradocu.translator.spec;

import randoop.condition.specification.Guard;
import randoop.condition.specification.Property;
import randoop.condition.specification.SpecificationClause;

// FIXME this will become PostAssertion
public class EquivalenceSpec extends SpecificationClause {
  private final Property property;

  private EquivalenceSpec() {
    this.property = null;
  }

  public EquivalenceSpec(String description, Guard guard, Property property) {
    super(description, guard);
    this.property = property;
  }

  public Property getProperty() {
    return property;
  }
}
