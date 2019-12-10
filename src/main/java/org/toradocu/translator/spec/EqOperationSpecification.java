package org.toradocu.translator.spec;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import randoop.condition.specification.Identifiers;
import randoop.condition.specification.OperationSignature;
import randoop.condition.specification.OperationSpecification;

public class EqOperationSpecification extends OperationSpecification {

  @SerializedName("eq")
  private final List<EquivalenceSpec> equivalenceSpecs;

  // FIXME check how OperationSpecification are instantiated:
  // FIXME are all specs passed at once in lists? If so, then
  // FIXME call the super that accepts such lists and plus add the equivalences
  public EqOperationSpecification(OperationSignature operation, Identifiers identifiers) {
    super(operation, identifiers);
    this.equivalenceSpecs = new ArrayList<>();
  }

  public void addEqSpecifications(List<EquivalenceSpec> specifications) {
    this.equivalenceSpecs.addAll(specifications);
  }

  public List<EquivalenceSpec> getEquivalenceSpecs() {
    return equivalenceSpecs;
  }

  public String toString() {
    return "{ \"operation\": "
        + this.getOperation().toString()
        + ", \"identifiers\": "
        // + this.getIdentifiers().toString()
        + ", \"eqSpecifications\": "
        + this.equivalenceSpecs.toString();
  }

  public boolean isEmpty() {
    return this.equivalenceSpecs.isEmpty();
  }
}
