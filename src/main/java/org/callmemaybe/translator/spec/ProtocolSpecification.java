package org.callmemaybe.translator.spec;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import randoop.condition.specification.Identifiers;
import randoop.condition.specification.OperationSignature;
import randoop.condition.specification.OperationSpecification;

public class ProtocolSpecification extends OperationSpecification {
  @SerializedName("eq")
  private final List<ProtocolSpec> protocolSpecs;

  public ProtocolSpecification(OperationSignature operation, Identifiers identifiers) {
    super(operation, identifiers);
    this.protocolSpecs = new ArrayList<>();
  }

  public List<ProtocolSpec> getProtocolSpecs() {
    return protocolSpecs;
  }

  public void addSpecifications(List<ProtocolSpec> specifications) {
    this.protocolSpecs.addAll(specifications);
  }

  public boolean isEmpty() {
    return this.protocolSpecs.isEmpty()
        || this.protocolSpecs
            .stream()
            .allMatch(s -> s.getPostAssertion().getAssertionContent().isEmpty());
  }
}
