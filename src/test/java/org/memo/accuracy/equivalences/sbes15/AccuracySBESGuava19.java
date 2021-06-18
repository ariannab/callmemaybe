package org.memo.accuracy.equivalences.sbes15;

import org.junit.Test;
import org.memo.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracySBESGuava19 extends AbstractPrecisionRecallTestSuite {

  private static final String GUAVA_19_SRC = "src/test/resources/src/guava-19.0-sources/";
  private static final String GUAVA_19_BIN = "src/test/resources/bin/guava-19.0.jar";
  private static final String GUAVA_GOAL_DIR = "expected-equivalences/guava";

  public AccuracySBESGuava19() {
    super(GUAVA_19_SRC, GUAVA_19_BIN, GUAVA_GOAL_DIR);
  }

  // Check if SBES finds asList [NO]:
  // Returns an ImmutableList containing the same elements, in the same order, as this collection.
  // From superinterface java.util.Collection:
  // Note that toArray(new Object[0]) is identical in function to toArray(). [NO]
  //  @Test
  //  public void testCollect_ImmutableCollection() {
  //    test("com.google.common.collect.ImmutableCollection", 1, 1);
  //  }

  @Test
  public void testCollect_ImmutableMultimap() {
    test("com.google.common.collect.ImmutableMultimap", 0, 1);
  }

  //  @Test
  //  public void testCollect_StandardTable() {
  //    test("com.google.common.collect.StandardTable", 1, 1);
  //  }

  // Multimap
  //  @Test
  //  public void testCollect_ListMultimap() {
  //    test("com.google.common.collect.ListMultimap", 1, 1);
  //  }

  @Test
  public void testCollect_Multimap() {
    test("com.google.common.collect.Multimap", 1, 1);
  }

  // Check the following: [NO]
  // This method refines Collection.add(E),
  // Idem for contains()
  // This method refines Collection.contains(java.lang.Object)
  // NOTE: if SBES finds it, we can argue about the documentation
  // add(): [NOT WITH NCOPIES]
  // This method is functionally equivalent (except in the case of overflow) to the
  // call addAll(Collections.nCopies(element, occurrences))
  // count(): [NO]
  // Note that for an Object.equals(java.lang.Object)-based multiset, this gives the
  // same result as Collections.frequency(java.util.Collection<?>, java.lang.Object)
  // Also:
  // Iterables.frequency(java.lang.Iterable<?>, java.lang.Object) generalizes this operation
  @Test
  public void testCollect_Multiset() {
    test("com.google.common.collect.Multiset", 0.666, 1);
  }

  // Check:
  // the maps returned by rowMap().get() have the same behavior as those returned by Table.row(R).
  //
  //  @Test
  //  public void testCollect_RowSortedTable() {
  //    test("com.google.common.collect.RowSortedTable", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_SetMultimap() {
  //    test("com.google.common.collect.SetMultimap", 1, 1);
  //  }

  //  Nothing
  //  @Test
  //  public void testCollect_SortedIterable() {
  //    test("com.google.common.collect.SortedIterable", 1, 1);
  //  }

  @Test
  public void testCollect_SortedMultiset() {
    test("com.google.common.collect.SortedMultiset", 1, 1);
  }

  // Nothing
  //  @Test
  //  public void testCollect_SortedMultisetBridge() {
  //    test("com.google.common.collect.SortedMultisetBridge", 1, 1);
  //  }

  // Derives from SetMultimap
  //  @Test
  //  public void testCollect_SortedSetMultimap() {
  //    test("com.google.common.collect.SortedSetMultimap", 1, 1);
  //  }

  // Check:
  // columMap - the maps returned by columnMap().get() have the same behavior as those returned by
  // Table.column(C)
  // rowMap - the maps returned by rowMap().get() have the same behavior as those returned by row(R)
  // putAll() - The effect is equivalent to calling Table.put(R, C, V) [FOREACH]
  //  @Test
  //  public void testCollect_Table() {
  //    test("com.google.common.collect.Table", 1, 1);
  //  }

  // Multiset interface
  //  @Test
  //  public void testCollect_ConcurrentHashMultiset() {
  //    test("com.google.common.collect.ConcurrentHashMultiset", 1, 1);
  //  }

  // Usual create()
  //  @Test
  //  public void testCollect_HashBasedTable() {
  //    test("com.google.common.collect.HashBasedTable", 1, 1);
  //  }

  // This derives everything from MultiMap. Shall we count as multiple equivalences or diminish the
  // ones in SBES??
  //  @Test
  //  public void testCollect_HashMultimap() {
  //    test("com.google.common.collect.HashMultimap", 1, 1);
  //  }

  //  // Derives from Multiset
  //  @Test
  //  public void testCollect_HashMultiset() {
  //    test("com.google.common.collect.HashMultiset", 1, 1);
  //  }

  // Check:
  // The generated builder is equivalent to the builder created by the ImmutableListMultimap.Builder
  // [CONSTRUCTOR]
  // constructor.
  // copyOf - containing the same mappings as multimap
  @Test
  public void testCollect_ImmutableListMultimap() {
    test("com.google.common.collect.ImmutableListMultimap", 1, 1);
  }

  // Check as above:
  // The generated builder is equivalent to the builder created by the ImmutableMultiset.Builder
  // constructor.
  //  @Test
  //  public void testCollect_ImmutableMultiset() {
  //    test("com.google.common.collect.ImmutableMultiset", 1, 1);
  //  }

  @Test
  public void testCollect_LinkedHashMultimap() {
    test("com.google.common.collect.LinkedHashMultimap", 1, 1);
  }

  @Test
  public void testCollect_LinkedHashMultiset() {
    test("com.google.common.collect.LinkedHashMultiset", 1, 1);
  }

  @Test
  public void testCollect_LinkedListMultimap() {
    test("com.google.common.collect.LinkedListMultimap", 1, 1);
  }

  // Check transform():
  // If only a Collection or Iterable input is available, [INSTANCEOF]
  // use Collections2.transform(java.util.Collection<F>, com.google.common.base.Function<? super F,
  // T>)
  // or Iterables.transform(java.lang.Iterable<F>, com.google.common.base.Function<? super F, ?
  // extends T>).
  // also newCopyOnWriteArrayList, newLinkedList etc
  // if you need an immutable empty List, use Collections.emptyList() instead. [TOO MANY CONDITIONS]
  //  @Test
  //  public void testCollect_Lists() {
  //    test("com.google.common.collect.Lists", 1, 1);
  //  }

  // Unsure if contains equiv.
//  @Test
//  public void testCollect_Maps() {
//    test("com.google.common.collect.Maps", 0, 1);
//  }

  @Test
  public void testCollect_Sets() {
    test("com.google.common.collect.Sets", 0, 0);
  }

  // Check create():
  // Creates a TreeBasedTable with the same mappings and sort order as the specified TreeBasedTable.
  //  @Test
  //  public void testCollect_TreeBasedTable() {
  //    test("com.google.common.collect.TreeBasedTable", 1, 1);
  //  }

  // Check create()
  // Takes all the rest from Multimap
  //  @Test
  //  public void testCollect_TreeMultimap() {
  //    test("com.google.common.collect.TreeMultimap", 1, 1);
  //  }

  // Takes from Multiset and SortedMultiset
  //  @Test
  //  public void testCollect_TreeMultiset() {
  //    test("com.google.common.collect.TreeMultiset", 1, 1);
  //  }

  // Many other classes inherit from Multiset and Multimap. Some others i.e. SortedMultiset as well.
  //  @Test
  //  public void testCollect_AbstractListMultimap() {
  //    test("com.google.common.collect.AbstractListMultimap", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_AbstractMapBasedMultimap() {
  //    test("com.google.common.collect.AbstractMapBasedMultimap", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_AbstractMapBasedMultiset() {
  //    test("com.google.common.collect.AbstractMapBasedMultiset", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_AbstractMultimap() {
  //    test("com.google.common.collect.AbstractMultimap", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_AbstractMultiset() {
  //    test("com.google.common.collect.AbstractMultiset", 1, 1);
  //  }

  // Nothing in here - testCollect_AbstractSetMultimap
  //  @Test
  //  public void testCollect_AbstractSetMultimap() {
  //    test("com.google.common.collect.AbstractSetMultimap", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_AbstractSortedKeySortedSetMultimap() {
  //    test("com.google.common.collect.AbstractSortedKeySortedSetMultimap", 1, 1);
  //  }

  //  // Nothing in here - AbstractSortedMultiset
  //  @Test
  //  public void testCollect_AbstractSortedMultiset() {
  //    test("com.google.common.collect.AbstractSortedMultiset", 1, 1);
  //  }

  // Nothing in here - AbstractSortedSetMultimap
  //  @Test
  //  public void testCollect_AbstractSortedSetMultimap() {
  //    test("com.google.common.collect.AbstractSortedSetMultimap", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_AbstractTable() {
  //    test("com.google.common.collect.AbstractTable", 1, 1);
  //  }

  //  @Test
  //  public void testCollect_StandardRowSortedTable() {
  //    test("com.google.common.collect.StandardRowSortedTable", 1, 1);
  //  }

  // Nothing in here - ArrayListMultimap
  //  @Test
  //  public void testCollect_ArrayListMultimap() {
  //    test("com.google.common.collect.ArrayListMultimap", 1, 1);
  //  }

}
