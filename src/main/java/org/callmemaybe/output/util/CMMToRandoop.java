package org.callmemaybe.output.util;

import org.callmemaybe.extractor.DocumentedExecutable;

public class CMMToRandoop {
    public Type containingClass;
    public String operationSignature;
    public String mustPrecede;
    public String mustFollow;

    public CMMToRandoop(DocumentedExecutable member,
                        String operationSignature,
                        String mustPrecede,
                        String mustFollow) {
        this.operationSignature = operationSignature;
        this.mustPrecede = mustPrecede;
        this.mustFollow = mustFollow;
        this.containingClass =
                new org.callmemaybe.output.util.Type(
                        member.getDeclaringClass().getName(),
                        member.getDeclaringClass().getSimpleName(),
                        member.getDeclaringClass().isArray());
    }
}
