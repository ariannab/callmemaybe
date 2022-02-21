package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyJDK8 extends AbstractPrecisionRecallTestSuite {
  private static final String JDK_8_SRC = "src/test/resources/src/jdk8-sources/src/share/classes";
  private static final String JDK_8_BIN = "src/test/resources/bin/jdk8-2.9.0.jar";
  private static final String JDK_8_GOAL_DIR = "expected-tp/jdk8";

  public AccuracyJDK8() {
    super(JDK_8_SRC, JDK_8_BIN, JDK_8_GOAL_DIR);
  }

  @Test
  public void testThread() {
    testTP("java.lang.Thread", 1, 1);
  }

  //  @Test
  //  public void testScanner() {
  //    testTP("java.util.Scanner", 1, 1);
  //  }

  @Test
  public void testArrays() {
    testTP("java.util.Arrays", 1, 1);
  }

  @Test
  public void testUtil_Vector() {
    test("java.util.Vector", 1, 1);
  }

  @Test
  public void testUtil_TreeMap() {
    test("java.util.TreeMap", 1, 1);
  }

  @Test
  public void testUtil_LinkedList() {
    test("java.util.LinkedList", 1, 1);
  }

  @Test
  public void testUtil_Map() {
    test("java.util.Map", 1, 1);
  }

  @Test
  public void testUtil_IdentityHashMap() {
    test("java.util.IdentityHashMap", 1, 1);
  }

  @Test
  public void testUtil_HashMap() {
    test("java.util.HashMap", 1, 1);
  }

  @Test
  public void testUtil_Collection() {
    test("java.util.Collection", 0.666, 0.666);
  }

  @Test
  public void testUtil_List() {
    test("java.util.List", 1, 1);
  }

  @Test
  public void testUtil_AbstractList() {
    test("java.util.AbstractList", 1, 1);
  }

  @Test
  public void testUtil_WeakHashMap() {
    test("java.util.WeakHashMap", 1, 0.5);
  }

  @Test
  public void testUtil_ArrayList() {
    test("java.util.ArrayList", 1, 1);
  }

  @Test
  public void testUtil_AbstractQueue() {
    test("java.util.AbstractQueue", 0, 0);
  }

  @Test
  public void testUtil_ArrayDeque() {
    test("java.util.ArrayDeque", 1, 1);
  }

  @Test
  public void testUtil_PriorityQueue() {
    test("java.util.PriorityQueue", 1, 1);
  }

  @Test
  public void testZip_Inflater() {
    test("java.util.zip.Inflater", 0, 0);
  }

  @Test
  public void testZip_Deflater() {
    test("java.util.zip.Deflater", 0, 0);
  }

  @Test
  public void testConcurrent_LinkedBlockingQueue() {
    test("java.util.concurrent.LinkedBlockingQueue", 1, 1);
  }

  @Test
  public void testConcurrent_CopyOnWriteArrayList() {
    test("java.util.concurrent.CopyOnWriteArrayList", 1, 1);
  }

  @Test
  public void testConcurrent_ConcurrentSkipListSet() {
    test("java.util.concurrent.ConcurrentSkipListSet", 1, 0);
  }

  @Test
  public void testConcurrent_CopyOnWriteArraySet() {
    test("java.util.concurrent.CopyOnWriteArraySet", 1, 1);
  }

  @Test
  public void testConcurrent_DelayQueue() {
    test("java.util.concurrent.DelayQueue", 1, 1);
  }

  @Test
  public void testConcurrent_ArrayBlockingQueue() {
    test("java.util.concurrent.ArrayBlockingQueue", 1, 1);
  }

  @Test
  public void testConcurrent_LinkedBlockingDeque() {
    test("java.util.concurrent.LinkedBlockingDeque", 1, 1);
  }

  @Test
  public void testConcurrent_PriorityBlockingQueue() {
    test("java.util.concurrent.PriorityBlockingQueue", 1, 1);
  }

  @Test
  public void testUtil_HashSet() {
    test("java.util.HashSet", 1, 1);
  }

  @Test
  public void testUtil_Collections() {
    test("java.util.Collections", 1, 0);
  }

  @Test
  public void testUtil_Set() {
    test("java.util.Set", 1, 1);
  }

  @Test
  public void testUtil_TreeSet() {
    test("java.util.TreeSet", 1, 0.5);
  }

  @Test
  public void testLogging_Handler() {
    test("java.util.logging.Handler", 0, 0);
  }

  @Test
  public void testLogging_StreamHandler() {
    test("java.util.logging.StreamHandler", 1, 0);
  }
}
