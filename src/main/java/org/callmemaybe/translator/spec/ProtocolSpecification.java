package org.callmemaybe.translator.spec;

import com.google.gson.annotations.SerializedName;
import randoop.condition.specification.Identifiers;
import randoop.condition.specification.OperationSignature;
import randoop.condition.specification.OperationSpecification;

import java.util.ArrayList;
import java.util.List;

public class ProtocolSpecification  extends OperationSpecification {
    @SerializedName("eq")
    private final List<ProtocolSpec> protocolSpecs;

    public ProtocolSpecification(OperationSignature operation, Identifiers identifiers) {
        super(operation, identifiers);
        this.protocolSpecs = new ArrayList<>();
    }

    public List<ProtocolSpec> getProtocolSpecs() {
        return protocolSpecs;
    }
}
