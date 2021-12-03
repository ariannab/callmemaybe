package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;


public class AccuracyCommonsCollections4 extends AbstractPrecisionRecallTestSuite {

  private static final String COMMONSCOLLECTIONS_4_SRC =
      "src/test/resources/src/commons-collections4-4.1-src/src/main/java/";
  private static final String COMMONSCOLLECTIONS_4_BIN =
      "src/test/resources/bin/commons-collections4-4.1.jar";
  private static final String COMMONSCOLLECTIONS_4_GOAL_DIR =
      "expected-tp/collections4/";

  public AccuracyCommonsCollections4() {
    super(COMMONSCOLLECTIONS_4_SRC, COMMONSCOLLECTIONS_4_BIN, COMMONSCOLLECTIONS_4_GOAL_DIR);
  }

  @Test
  public void testEnumerationIterator() {
    testTP("org.apache.commons.collections4.iterators.EnumerationIterator", 1, 1);
  }


}
