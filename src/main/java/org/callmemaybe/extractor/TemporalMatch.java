package org.callmemaybe.extractor;

import org.callmemaybe.translator.TemporalRule;

import java.util.List;

public class TemporalMatch {

    private boolean isMatch;

    // FIXME why are they multiple? Fix needed in temp.prop.series
    private List<TemporalRule.TemporalRelation> relations;

    private String oracle;

    private String methodA;

    private String methodB;

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

    public String getMethodA() {
        return methodA;
    }

    public void setMethodA(String methodA) {
        this.methodA = methodA;
    }

    public String getMethodB() {
        return methodB;
    }

    public void setMethodB(String methodB) {
        this.methodB = methodB;
    }
}
