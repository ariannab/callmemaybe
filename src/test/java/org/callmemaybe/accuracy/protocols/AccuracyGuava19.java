package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyGuava19 extends AbstractPrecisionRecallTestSuite {

  private static final String GUAVA_19_SRC = "src/test/resources/src/guava-19.0-sources/";
  private static final String GUAVA_19_BIN = "src/test/resources/bin/guava-19.0.jar";
  private static final String GUAVA_GOAL_DIR = "expected-tp/guava";

  public AccuracyGuava19() {
    super(GUAVA_19_SRC, GUAVA_19_BIN, GUAVA_GOAL_DIR);
  }

  @Test
  public void testCollect_Sets() {
    test("com.google.common.collect.Sets", 1, 0);
  }

  @Test
  public void testCollect_TreeRangeMap() {
    test("com.google.common.collect.TreeRangeMap", 1, 1);
  }

//  @Test
//  public void testCollect_ImmutableRangeSet() {
//    test("com.google.common.collect.ImmutableRangeSet", 1, 1);
//  }

  @Test
  public void testCollect_SortedLists() {
    test("com.google.common.collect.SortedLists", 1, 0);
  }


}