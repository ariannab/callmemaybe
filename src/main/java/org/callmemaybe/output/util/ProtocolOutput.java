package org.callmemaybe.output.util;

public class ProtocolOutput extends TagOutput {

    private String member;

    public ProtocolOutput(String comment, String method, String kind, String condition) {
        super(comment, kind, condition);
        this.member = method;
    }

    public String getMember() {
        return this.member;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "ProtocolOutput{}";
    }
}
