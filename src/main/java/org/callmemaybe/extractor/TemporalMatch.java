package org.callmemaybe.extractor;

import java.util.List;
import org.callmemaybe.conf.Configuration;
import org.callmemaybe.output.util.CMMToRandoop;
import org.callmemaybe.translator.TemporalPropSeries;
import org.callmemaybe.translator.TemporalProposition;
import org.callmemaybe.translator.TemporalProtocol;
import org.callmemaybe.translator.TemporalRule;

public class TemporalMatch {

  /** {@code DocumentedExecutable} this protocol refers to. */
  DocumentedExecutable documentedOperation;

  /** The underlying protocol with members and arrows. */
  private TemporalProtocol rawProtocol;

  private List<TemporalPropSeries> temporalPropSeries;

  // FIXME why are they multiple? Fix needed in temp.prop.series
  private List<TemporalRule.TemporalRelation> relations;

  private String oracle;

  private String memberA;

  private String memberB;

  private TemporalProposition propositionA;

  private TemporalProposition propositionB;

  boolean isIndeedMatch;

  private String originalComment;

  public TemporalMatch(
      DocumentedExecutable excMember,
      List<TemporalPropSeries> propositionSeries,
      String originalComment) {
    this.documentedOperation = excMember;
    this.temporalPropSeries = propositionSeries;
    this.originalComment = originalComment;
  }

  public TemporalProposition getPropositionA() {
    return propositionA;
  }

  public void setPropositionA(TemporalProposition propositionA) {
    this.propositionA = propositionA;
  }

  public TemporalProposition getPropositionB() {
    return propositionB;
  }

  public void setPropositionB(TemporalProposition propositionB) {
    this.propositionB = propositionB;
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

  public boolean isIndeedMatch() {
    return isIndeedMatch;
  }

  public void setIndeedMatch(boolean indeedMatch) {
    isIndeedMatch = indeedMatch;
  }

  public void setMember(String letter, String member) {
    switch (letter) {
      case "A":
        setMemberA(member);
        break;
      case "B":
        setMemberB(member);
        break;
      default:
    }
  }

  public void setMember(int i, String member) {
    switch (i) {
      case 0:
        setMemberA(member);
        break;
      case 1:
        setMemberB(member);
        break;
      default:
    }
  }

  public void buildOracle() {
    this.oracle =
        rawProtocol.getMemberOnTheLeft()
            + rawProtocol.getArrow()
            + rawProtocol.getMemberOnTheRight();
  }

  public CMMToRandoop toMachineReadableOutput() {
    // FIXME Simplification; how to translate depends by where is the doc. op.
    // FIXME (is it first or sec member? And what does first and sec mean w.r.t.
    // FIXME arrows anyway, is it left or right lol)
    String arrow = this.rawProtocol.getArrow();
    String memberOnTheLeft = this.rawProtocol.getMemberOnTheLeft();
    String memberOnTheRight = this.rawProtocol.getMemberOnTheRight();
    String docOperationName = this.documentedOperation.getName();
    DocumentedExecutable member = this.documentedOperation;

    if (arrow.equals(TemporalRule.LEFT_ARROW)) {
      if (memberOnTheLeft.contains(docOperationName)
          || isConstructorOperation(memberOnTheLeft, member)) {
        // A <- B where A has the documented protocol. The doc. protocol must follow B.
        return new CMMToRandoop(
            docOperationName, member.isConstructor(), "", memberOnTheRight, this.originalComment);
      } else if (memberOnTheRight.contains(docOperationName)) {
        // A <- B where B has the documented protocol. The doc. protocol. must precede A.
        return new CMMToRandoop(
            docOperationName, member.isConstructor(), memberOnTheLeft, "", this.originalComment);
      }
    } else if (arrow.equals(TemporalRule.RIGHT_ARROW)) {
      if (memberOnTheLeft.contains(docOperationName)) {
        // A -> B where A has the documented protocol. The doc. protocol must precede B.
        return new CMMToRandoop(
            docOperationName, member.isConstructor(), memberOnTheRight, "", this.originalComment);
      } else if (memberOnTheRight.contains(docOperationName)) {
        // A -> B where B has the documented protocol. The doc. protocol must follow A.
        return new CMMToRandoop(
            docOperationName, member.isConstructor(), "", memberOnTheLeft, this.originalComment);
      }
    }
    return null;
  }

  private boolean isConstructorOperation(String member, DocumentedExecutable docMember) {
    return Configuration.RECEIVER.equals(member) && docMember.isConstructor();
  }

  public List<TemporalPropSeries> getTemporalPropSeries() {
    return temporalPropSeries;
  }

  public void setTemporalPropSeries(List<TemporalPropSeries> temporalPropSeries) {
    this.temporalPropSeries = temporalPropSeries;
  }
}
