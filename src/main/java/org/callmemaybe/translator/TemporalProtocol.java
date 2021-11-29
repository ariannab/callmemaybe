package org.callmemaybe.translator;

public class TemporalProtocol{
    String firstMember;
    String secondMember;
    String arrow;

    public TemporalProtocol(String firstMember, String secondMember, String arrow) {
        this.firstMember = firstMember;
        this.secondMember = secondMember;
        this.arrow = arrow;
    }


    public TemporalProtocol() {

    }

    public boolean isNoProtocol(){
        return firstMember.isEmpty() && secondMember.isEmpty() && arrow.isEmpty();
    }

    public String getFirstMember() {
        return firstMember;
    }

    public String getSecondMember() {
        return secondMember;
    }

    public String getArrow() {
        return arrow;
    }
}
