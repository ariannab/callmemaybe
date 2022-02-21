package org.callmemaybe.translator;

public class TemporalProtocol {
  /** Signature on the left of the arrow. */
  String memberOnTheLeft;

  /** Signature on the right of the arrow. */
  String memberOnTheRight;

  /**
   * The arrow, as a String, which either corresponds to {@code TemporalRule.LEFT_ARROW} or {@code
   * TemporalRule.RIGHT_ARROW}
   */
  String arrow;

  public TemporalProtocol(String memberOnTheLeft, String memberOnTheRight, String arrow) {
    this.memberOnTheLeft = memberOnTheLeft;
    this.memberOnTheRight = memberOnTheRight;
    this.arrow = arrow;
  }

  public TemporalProtocol() {}

  public boolean isNoProtocol() {
    return memberOnTheLeft.isEmpty() && memberOnTheRight.isEmpty() && arrow.isEmpty();
  }

  public String getMemberOnTheLeft() {
    return memberOnTheLeft;
  }

  public String getMemberOnTheRight() {
    return memberOnTheRight;
  }

  public String getArrow() {
    return arrow;
  }
}
