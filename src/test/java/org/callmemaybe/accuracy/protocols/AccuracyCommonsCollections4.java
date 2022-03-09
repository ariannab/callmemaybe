package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyCommonsCollections4 extends AbstractPrecisionRecallTestSuite {

  private static final String COMMONSCOLLECTIONS_4_SRC =
      "src/test/resources/src/commons-collections4-4.1-src/src/main/java/";
  private static final String COMMONSCOLLECTIONS_4_BIN =
      "src/test/resources/bin/commons-collections4-4.1.jar";
  private static final String COMMONSCOLLECTIONS_4_GOAL_DIR = "expected-tp/collections4";

  public AccuracyCommonsCollections4() {
    super(COMMONSCOLLECTIONS_4_SRC, COMMONSCOLLECTIONS_4_BIN, COMMONSCOLLECTIONS_4_GOAL_DIR);
  }

  @Test
  public void testIterators_IteratorChain() {
    test("org.apache.commons.collections4.iterators.IteratorChain", 1, 1);
  }

  @Test
  public void testIterators_CollatingIterator() {
    test("org.apache.commons.collections4.iterators.CollatingIterator", 1, 1);
  }

  @Test
  public void testIterators_BoundedIterator() {
    test("org.apache.commons.collections4.iterators.BoundedIterator", 1, 1);
  }

  @Test
  public void testIterators_TransformIterator() {
    test("org.apache.commons.collections4.iterators.TransformIterator", 1, 1);
  }

  @Test
  public void testIterators_EnumerationIterator() {
    test("org.apache.commons.collections4.iterators.EnumerationIterator", 1, 1);
  }

  @Test
  public void testIterators_LoopingIterator() {
    test("org.apache.commons.collections4.iterators.LoopingIterator", 1, 1);
  }

  @Test
  public void testIterators_IteratorEnumeration() {
    test("org.apache.commons.collections4.iterators.IteratorEnumeration", 1, 1);
  }

  @Test
  public void testIterators_SkippingIterator() {
    test("org.apache.commons.collections4.iterators.SkippingIterator", 1, 1);
  }

  @Test
  public void testIterators_FilterIterator() {
    test("org.apache.commons.collections4.iterators.FilterIterator", 1, 1);
  }

  @Test
  public void testIterators_FilterListIterator() {
    test("org.apache.commons.collections4.iterators.FilterListIterator", 1, 0.666);
  }
}
