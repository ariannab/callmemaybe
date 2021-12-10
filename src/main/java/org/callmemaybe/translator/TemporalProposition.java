package org.callmemaybe.translator;

public class TemporalProposition extends Proposition {


    public enum KindOfProtocol {
        METHOD_TO_CALL,
        ACTION_TO_MATCH,
        NONE
    }

    private KindOfProtocol kindOfProtocol;

    public TemporalProposition(Subject subject, String predicate) {
        super(subject, predicate);
    }

    public TemporalProposition(Subject subject, String predicate, boolean isNegative) {
        super(subject, predicate, isNegative);
    }


    public KindOfProtocol getKindOfProtocol() {
        return kindOfProtocol;
    }

    public void setKindOfProtocol(KindOfProtocol kindOfProtocol) {
        this.kindOfProtocol = kindOfProtocol;
    }
}
