package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyColt1 extends AbstractPrecisionRecallTestSuite {

  private static final String COLT_1_SRC = "src/test/resources/src/colt-master/src";
  private static final String COLT_1_BIN = "src/test/resources/bin/colt-1.2.0.jar";
  private static final String COLT_1_GOAL_DIR = "expected-tp/colt";

  public AccuracyColt1() {
    super(COLT_1_SRC, COLT_1_BIN, COLT_1_GOAL_DIR);
  }

  @Test
  public void testList_AbstractBooleanList() {
    test("cern.colt.list.AbstractBooleanList", 1, 1);
  }

  @Test
  public void testList_AbstractFloatList() {
    test("cern.colt.list.AbstractFloatList", 1, 1);
  }

  @Test
  public void testList_AbstractByteList() {
    test("cern.colt.list.AbstractByteList", 1, 1);
  }

  @Test
  public void testList_AbstractCharList() {
    test("cern.colt.list.AbstractCharList", 1, 1);
  }

  @Test
  public void testList_AbstractCollection() {
    test("cern.colt.list.AbstractCollection", 1, 1);
  }

  @Test
  public void testList_AbstractDoubleList() {
    test("cern.colt.list.AbstractDoubleList", 1, 1);
  }

  @Test
  public void testList_AbstractLongList() {
    test("cern.colt.list.AbstractLongList", 1, 1);
  }

  @Test
  public void testList_AbstractShortList() {
    test("cern.colt.list.AbstractShortList", 1, 1);
  }

  @Test
  public void testList_AbstractIntList() {
    test("cern.colt.list.AbstractIntList", 1, 1);
  }


}
