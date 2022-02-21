package org.callmemaybe.translator;

import org.callmemaybe.extractor.TemporalMatch;

/**
 * Class that produces a {@link TemporalProtocol} according to hard-coded rules. In other words,
 * following templates which depend on the temporal relation (such as: before; after; ecc.)
 */
public class TemporalRule {
  public enum TemporalRelation {
    UNTIL,
    BEFORE,
    AFTER,
    PRIOR,
    IF
  }

  public static final String LEFT_ARROW = "<-";
  public static final String RIGHT_ARROW = "->";

  /**
   * Builds the right {@link TemporalProtocol} according to the temporal relation.
   *
   * @param temporalMatch the match which holds the members of the protocols and the relation
   * @return a {@code TemporalProtocol} with fields set according to this clas templates
   */
  public static TemporalProtocol buildRawProtocol(TemporalMatch temporalMatch) {
    if (!temporalMatch.getRelations().isEmpty() && temporalMatch.getRelations().get(0) != null) {
      switch (temporalMatch.getRelations().get(0)) {
        case UNTIL:
          return notUntilTranslation(temporalMatch.getMemberA(), temporalMatch.getMemberB());
        case AFTER:
        case IF:
          return afterTranslation(temporalMatch.getMemberA(), temporalMatch.getMemberB());
        case BEFORE:
        case PRIOR:
          return beforeTranslation(temporalMatch.getMemberA(), temporalMatch.getMemberB());
        default:
          return new TemporalProtocol();
      }
    }
    return new TemporalProtocol();
  }

  // FIXME What are A and B? If they're object it's a thing, if they're methods
  // FIXME it's another thing
  /**
   * Translates "A before B", or, A -> B (arrow looking right) (e.g., "A must be called before B")
   *
   * @param A
   * @param B
   * @return
   */
  // TODO reason a bit better about types -- String...???
  public static TemporalProtocol beforeTranslation(String A, String B) {
    return new TemporalProtocol(A, B, RIGHT_ARROW);
  }

  /**
   * Translates "A after B", or, A <- B (arrow looking left) (e.g., "A can only be called after B"
   *
   * @param A
   * @param B
   * @return
   */
  public static TemporalProtocol afterTranslation(String A, String B) {
    return new TemporalProtocol(A, B, LEFT_ARROW);
  }

  // FIXME I am not sure about the below, reason about plain until and not + until
  /**
   * Translates "not A until B". (e.g., "A should not be called, until B is called", ~~ "B should
   * precede A")
   *
   * @param A
   * @param B
   * @return
   */
  public static TemporalProtocol notUntilTranslation(String A, String B) {
    return beforeTranslation(A, B);
  }
}
