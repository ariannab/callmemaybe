package org.callmemaybe.extractor;

import org.callmemaybe.translator.TemporalProtocol;
import org.callmemaybe.translator.TemporalRule;

import java.util.List;

public class TemporalMatch {

    private boolean isMatch;

    /**
     * The underlying protocol with members and arrows.
     */
    private TemporalProtocol rawProtocol;

    // FIXME why are they multiple? Fix needed in temp.prop.series
    private List<TemporalRule.TemporalRelation> relations;

    private String oracle;

    private String memberA;

    private String memberB;

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }

    public List<TemporalRule.TemporalRelation> getRelations() {
        return relations;
    }

    public void setRelations(List<TemporalRule.TemporalRelation> relations) {
        this.relations = relations;
    }

    public String getOracle() {
        return oracle;
    }

    public void setOracle(String oracle) {
        this.oracle = oracle;
    }

    public String getMemberA() {
        return memberA;
    }

    public void setMemberA(String memberA) {
        this.memberA = memberA;
    }

    public String getMemberB() {
        return memberB;
    }

    public void setMemberB(String memberB) {
        this.memberB = memberB;
    }

    public TemporalProtocol getRawProtocol() {
        return rawProtocol;
    }

    public void setRawProtocol(TemporalProtocol rawProtocol) {
        this.rawProtocol = rawProtocol;
    }
}
