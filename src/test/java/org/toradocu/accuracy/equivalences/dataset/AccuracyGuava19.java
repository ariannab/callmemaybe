package org.toradocu.accuracy.equivalences.dataset;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyGuava19 extends AbstractPrecisionRecallTestSuite {

  private static final String GUAVA_19_SRC = "src/test/resources/src/guava-19.0-sources/";
  private static final String GUAVA_19_BIN = "src/test/resources/bin/guava-19.0.jar";
  private static final String GUAVA_GOAL_DIR = "expected-equivalences/guava";

  public AccuracyGuava19() {
    super(GUAVA_19_SRC, GUAVA_19_BIN, GUAVA_GOAL_DIR);
  }

  @Test
  public void testBase_CharMatcher() {
    test("com.google.common.base.CharMatcher", 1, 1);
  }

  //  @Test
  //  public void testBase_Predicates() {
  //    test("com.google.common.base.Predicates", 1, 1);
  //  }

  @Test
  public void testBase_Splitter() {
    test("com.google.common.base.Splitter", 1, 1);
  }

  //  @Test
  //  public void testBase_Utf8() {
  //    test("com.google.common.base.Utf8", 1, 1);
  //  }

  // Missing: requires a casting
  @Test
  public void testCache_LongAdder() {
    test("com.google.common.cache.LongAdder", 1, 1);
  }

  @Test
  public void testCollect_ArrayTable() {
    test("com.google.common.collect.ArrayTable", 1, 1);
  }

  // Missing: no syntactical sim. with parameter, mb semantic (list vs iterable/collection)
  @Test
  public void testCollect_Collections2() {
    test("com.google.common.collect.Collections2", 1, 0);
  }

  @Test
  public void testCollect_ContiguousSet() {
    test("com.google.common.collect.ContiguousSet", 1, 1);
  }

  // The following talks about "stream equivalent" - how to manage those?

  //    @Test
  //    public void testCollect_FluentIterable() {
  //      test("com.google.common.collect.FluentIterable", 1, 1);
  //    }

  // Missing: conditional equivalence!
  @Test
  public void testCollect_ImmutableRangeSet() {
    test("com.google.common.collect.ImmutableRangeSet", 1, 0);
  }

  // Missing: ?
  @Test
  public void testCollect_ImmutableTable() {
    test("com.google.common.collect.ImmutableTable", 1, 0);
  }

  // Missing: requires particular parsing of mixed @link/@code
  @Test
  public void testCollect_Iterables() {
    test("com.google.common.collect.Iterables", 1, 0.5);
  }

  @Test
  public void testCollect_Iterators() {
    test("com.google.common.collect.Iterators", 0.666, 0.666);
  }

  @Test
  public void testCollect_Multimap() {
    test("com.google.common.collect.Multimap", 1, 1);
  }

  @Test
  public void testCollect_Multiset() {
    test("com.google.common.collect.Multiset", 0.666, 1);
  }

  @Test
  public void testCollect_Multisets() {
    test("com.google.common.collect.Multisets", 1, 1);
  }

  // The following is a non-equivalence (particular case)

  //      @Test
  //      public void testCollect_Ordering() {
  //        test("com.google.common.collect.Ordering", 1, 1);
  //      }

  //  @Test
  //  public void testCollect_RangeMap() {
  //    test("com.google.common.collect.RangeMap", 1, 1);
  //  }

  // The following involves void methods and particular conditions (e.g. equivalent to do X on each
  // element)

  //  @Test
  //  public void testCollect_RangeSet() {
  //    test("com.google.common.collect.RangeSet", 1, 1);
  //  }

  // The following says "equivalent to EnumSet#complementOf, but can act on any input collection" -
  // ?

  //    @Test
  //    public void testCollect_Sets() {
  //      test("com.google.common.collect.Sets", 1, 1);
  //    }

  //  @Test
  //  public void testCollect_SortedLists() {
  //    test("com.google.common.collect.SortedLists", 1, 1);
  //  }

  @Test
  public void testCollect_SortedMultiset() {
    test("com.google.common.collect.SortedMultiset", 1, 1);
  }

  @Test
  public void testHash_Hasher() {
    test("com.google.common.hash.Hasher", 1, 1);
  }

  //  @Test
  //  public void testIo_ByteSource() {
  //    test("com.google.common.io.ByteSource", 1, 1);
  //  }

  // The following is a void method...

  @Test
  public void testIo_CharSink() {
    test("com.google.common.io.CharSink", 1, 0);
  }

  //  @Test
  //  public void testIo_CharSource() {
  //    test("com.google.common.io.CharSource", 1, 1);
  //  }

  // Comparison between static void methods, not sure about translation yet: The clone should be the
  // parameter?
  //  @Test
  //  public void testIo_Flushables() {
  //    test("com.google.common.io.Flushables", 1, 1);
  //  }

  @Test
  public void testMath_DoubleMath() {
    test("com.google.common.math.DoubleMath", 1, 1);
  }

  //  @Test
  //  public void testNet_InternetDomainName() {
  //    test("com.google.common.net.InternetDomainName", 1, 1);
  //  }

  @Test
  public void testPrimitives_Booleans() {
    test("com.google.common.primitives.Booleans", 1, 1);
  }

  @Test
  public void testPrimitives_Chars() {
    test("com.google.common.primitives.Chars", 1, 0.833);
  }

  @Test
  public void testPrimitives_Doubles() {
    test("com.google.common.primitives.Doubles", 1, 1);
  }

  @Test
  public void testPrimitives_Floats() {
    test("com.google.common.primitives.Floats", 1, 1);
  }

  @Test
  public void testPrimitives_Ints() {
    test("com.google.common.primitives.Ints", 1, 0.666);
  }

  @Test
  public void testPrimitives_Longs() {
    test("com.google.common.primitives.Longs", 1, 0.833);
  }

  @Test
  public void testPrimitives_Shorts() {
    test("com.google.common.primitives.Shorts", 1, 0.833);
  }

  // The following has fake parameters...

  //  @Test
  //  public void testReflect_TypeToInstanceMap() {
  //    test("com.google.common.reflect.TypeToInstanceMap", 1, 1);
  //  }

  @Test
  public void testConcurrent_CycleDetectingLockFactory() {
    test("com.google.common.util.concurrent.CycleDetectingLockFactory", 1, 1);
  }

  // Missing: constructor
  @Test
  public void testConcurrent_Monitor() {
    test("com.google.common.util.concurrent.Monitor", 1, 0);
  }

  //  @Test
  //  public void testConcurrent_MoreExecutors() {
  //    test("com.google.common.util.concurrent.MoreExecutors", 1, 1);
  //  }

  @Test
  public void testConcurrent_RateLimiter() {
    test("com.google.common.util.concurrent.RateLimiter", 1, 1);
  }
}
