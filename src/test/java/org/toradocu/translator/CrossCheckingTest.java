package org.toradocu.translator;

import org.junit.Test;
import org.toradocu.Toradocu;

public class CrossCheckingTest {

  @Test
  public void escape_CharEscaperTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.CharEscaper",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.CharEscaper_goal.json"
        });
  }

  @Test
  public void escape_ArrayBasedEscaperMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.ArrayBasedEscaperMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.ArrayBasedEscaperMap_goal.json"
        });
  }

  @Test
  public void escape_ArrayBasedUnicodeEscaperTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.ArrayBasedUnicodeEscaper",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.ArrayBasedUnicodeEscaper_goal.json"
        });
  }

  @Test
  public void escape_CharEscaperBuilderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.CharEscaperBuilder",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.CharEscaperBuilder_goal.json"
        });
  }

  @Test
  public void escape_EscapersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.Escapers",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.Escapers_goal.json"
        });
  }

  @Test
  public void escape_PlatformTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.Platform",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.Platform_goal.json"
        });
  }

  @Test
  public void escape_EscaperTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.Escaper",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.Escaper_goal.json"
        });
  }

  @Test
  public void escape_UnicodeEscaperTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.UnicodeEscaper",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.UnicodeEscaper_goal.json"
        });
  }

  @Test
  public void escape_ArrayBasedCharEscaperTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.escape.ArrayBasedCharEscaper",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.escape.ArrayBasedCharEscaper_goal.json"
        });
  }

  @Test
  public void collect_DiscreteDomainTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.DiscreteDomain",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.DiscreteDomain_goal.json"
        });
  }

  @Test
  public void collect_NullsLastOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.NullsLastOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.NullsLastOrdering_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSortedMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSortedMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSortedMap_goal.json"
        });
  }

  @Test
  public void collect_FilteredMultimapValuesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredMultimapValues",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredMultimapValues_goal.json"
        });
  }

  // A couple of non-compatible return type.
  @Test
  public void collect_MultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Multiset_goal.json"
        });
  }

  @Test
  public void collect_WellBehavedMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.WellBehavedMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.WellBehavedMap_goal.json"
        });
  }

  @Test
  public void collect_ClassToInstanceMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ClassToInstanceMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ClassToInstanceMap_goal.json"
        });
  }

  @Test
  public void collect_AbstractMapBasedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractMapBasedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractMapBasedMultiset_goal.json"
        });
  }

  @Test
  public void collect_CutTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Cut",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Cut_goal.json"
        });
  }

  @Test
  public void collect_ForwardingConcurrentMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingConcurrentMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingConcurrentMap_goal.json"
        });
  }

  @Test
  public void collect_AbstractBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractBiMap_goal.json"
        });
  }

  @Test
  public void collect_AbstractSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractSetMultimap_goal.json"
        });
  }

  // External (java.util, look at @link BTW!)
  // This is equivalent to EnumSet.complementOf(java.util.EnumSet<E>)
  @Test
  public void collect_SetsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Sets",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Sets_goal.json"
        });
  }

  @Test
  public void collect_SerializationTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Serialization",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Serialization_goal.json"
        });
  }

  @Test
  public void collect_MapConstraintTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MapConstraint",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MapConstraint_goal.json"
        });
  }

  @Test
  public void collect_MapConstraintsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MapConstraints",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MapConstraints_goal.json"
        });
  }

  @Test
  public void collect_ForwardingImmutableListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingImmutableList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingImmutableList_goal.json"
        });
  }

  @Test
  public void collect_AbstractRangeSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractRangeSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractRangeSet_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableAsListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableAsList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableAsList_goal.json"
        });
  }

  @Test
  public void collect_SortedMultisetsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedMultisets",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedMultisets_goal.json"
        });
  }

  @Test
  public void collect_HashBasedTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.HashBasedTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.HashBasedTable_goal.json"
        });
  }

  @Test
  public void collect_EmptyImmutableSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EmptyImmutableSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EmptyImmutableSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSortedSetFauxverideShimTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSortedSetFauxverideShim",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSortedSetFauxverideShim_goal.json"
        });
  }

  @Test
  public void collect_IterablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Iterables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Iterables_goal.json"
        });
  }

  // Many equivalences with java.lang.Iterable

  //  @Test
  //  public void collect_IteratorsTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.collect.Iterators",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.collect.Iterators_goal.json"
  //    });
  //  }

  @Test
  public void collect_ConstraintsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Constraints",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Constraints_goal.json"
        });
  }

  @Test
  public void collect_NullsFirstOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.NullsFirstOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.NullsFirstOrdering_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingImmutableCollectionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingImmutableCollection",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingImmutableCollection_goal.json"
        });
  }

  @Test
  public void collect_RegularContiguousSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularContiguousSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularContiguousSet_goal.json"
        });
  }

  @Test
  public void collect_ImmutableEnumSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableEnumSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableEnumSet_goal.json"
        });
  }

  @Test
  public void collect_ForwardingMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingMultiset_goal.json"
        });
  }

  @Test
  public void collect_TreeMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TreeMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TreeMultimap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingSortedSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingSortedSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingSortedSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_SynchronizedTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Synchronized",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Synchronized_goal.json"
        });
  }

  @Test
  public void collect_UnmodifiableIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.UnmodifiableIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.UnmodifiableIterator_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableSet_goal.json"
        });
  }

  @Test
  public void collect_BinaryTreeTraverserTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.BinaryTreeTraverser",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.BinaryTreeTraverser_goal.json"
        });
  }

  @Test
  public void collect_HashMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.HashMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.HashMultiset_goal.json"
        });
  }

  @Test
  public void collect_HashingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Hashing",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Hashing_goal.json"
        });
  }

  @Test
  public void collect_LinkedHashMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.LinkedHashMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.LinkedHashMultimap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMapValuesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMapValues",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMapValues_goal.json"
        });
  }

  @Test
  public void collect_ForwardingMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingMap_goal.json"
        });
  }

  @Test
  public void collect_MultimapBuilderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MultimapBuilder",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MultimapBuilder_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMultiset_goal.json"
        });
  }

  @Test
  public void collect_ImmutableEntryTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableEntry",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableEntry_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSet_goal.json"
        });
  }

  @Test
  public void collect_MapsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Maps",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Maps_goal.json"
        });
  }

  @Test
  public void collect_ForwardingSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_EmptyImmutableListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EmptyImmutableListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EmptyImmutableListMultimap_goal.json"
        });
  }

  @Test
  public void collect_DescendingImmutableSortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.DescendingImmutableSortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.DescendingImmutableSortedMultiset_goal.json"
        });
  }

  @Test
  public void collect_ForwardingObjectTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingObject",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingObject_goal.json"
        });
  }

  @Test
  public void collect_ImmutableBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableBiMap_goal.json"
        });
  }

  @Test
  public void collect_ComputationExceptionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ComputationException",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ComputationException_goal.json"
        });
  }

  @Test
  public void collect_ForwardingDequeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingDeque",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingDeque_goal.json"
        });
  }

  @Test
  public void collect_ForwardingSortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingSortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingSortedMultiset_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMapKeySetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMapKeySet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMapKeySet_goal.json"
        });
  }

  @Test
  public void collect_ArrayListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ArrayListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ArrayListMultimap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingNavigableMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingNavigableMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingNavigableMap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingImmutableSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingImmutableSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingImmutableSet_goal.json"
        });
  }

  @Test
  public void collect_SortedSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_SortedMapDifferenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedMapDifference",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedMapDifference_goal.json"
        });
  }

  @Test
  public void collect_ContiguousSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ContiguousSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ContiguousSet_goal.json"
        });
  }

  // Equivalence between void methods.  State probing?
  // void clear() is equivalent to void remove(Range.all()).
  @Test
  public void collect_RangeSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RangeSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RangeSet_goal.json"
        });
  }

  @Test
  public void collect_Collections2Test() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Collections2",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Collections2_goal.json"
        });
  }

  @Test
  public void collect_UsingToStringOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.UsingToStringOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.UsingToStringOrdering_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSortedMultisetFauxverideShimTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSortedMultisetFauxverideShim",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSortedMultisetFauxverideShim_goal.json"
        });
  }

  @Test
  public void collect_ForwardingSortedSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingSortedSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingSortedSet_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableBiMap_goal.json"
        });
  }

  @Test
  public void collect_FilteredSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_SortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedMultiset_goal.json"
        });
  }

  @Test
  public void collect_ExplicitOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ExplicitOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ExplicitOrdering_goal.json"
        });
  }

  @Test
  public void collect_AbstractSortedKeySortedSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractSortedKeySortedSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractSortedKeySortedSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_QueuesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Queues",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Queues_goal.json"
        });
  }

  @Test
  public void collect_AbstractMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractMultiset_goal.json"
        });
  }

  @Test
  public void collect_SingletonImmutableSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SingletonImmutableSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SingletonImmutableSet_goal.json"
        });
  }

  @Test
  public void collect_FilteredKeySetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredKeySetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredKeySetMultimap_goal.json"
        });
  }

  @Test
  public void collect_ReverseNaturalOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ReverseNaturalOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ReverseNaturalOrdering_goal.json"
        });
  }

  @Test
  public void collect_FilteredEntryMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredEntryMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredEntryMultimap_goal.json"
        });
  }

  @Test
  public void collect_FilteredKeyListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredKeyListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredKeyListMultimap_goal.json"
        });
  }

  @Test
  public void collect_TableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Table",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Table_goal.json"
        });
  }

  @Test
  public void collect_InternersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Interners",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Interners_goal.json"
        });
  }

  @Test
  public void collect_EnumBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EnumBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EnumBiMap_goal.json"
        });
  }

  @Test
  public void collect_AbstractNavigableMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractNavigableMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractNavigableMap_goal.json"
        });
  }

  @Test
  public void collect_NaturalOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.NaturalOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.NaturalOrdering_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableMultiset_goal.json"
        });
  }

  @Test
  public void collect_ObjectArraysTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ObjectArrays",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ObjectArrays_goal.json"
        });
  }

  //  False positive equals() method

  //  @Test
  //  public void collect_TreeRangeMapTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.collect.TreeRangeMap",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.collect.TreeRangeMap_goal.json"
  //    });
  //  }

  @Test
  public void collect_CountTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Count",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Count_goal.json"
        });
  }

  @Test
  public void collect_PeekingIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.PeekingIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.PeekingIterator_goal.json"
        });
  }

  @Test
  public void collect_FilteredEntrySetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredEntrySetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredEntrySetMultimap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingCollectionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingCollection",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingCollection_goal.json"
        });
  }

  @Test
  public void collect_AbstractSequentialIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractSequentialIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractSequentialIterator_goal.json"
        });
  }

  @Test
  public void collect_ArrayTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ArrayTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ArrayTable_goal.json"
        });
  }

  @Test
  public void collect_SortedIterableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedIterable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedIterable_goal.json"
        });
  }

  @Test
  public void collect_ImmutableRangeSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableRangeSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableRangeSet_goal.json"
        });
  }

  @Test
  public void collect_TransformedListIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TransformedListIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TransformedListIterator_goal.json"
        });
  }

  @Test
  public void collect_LinkedListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.LinkedListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.LinkedListMultimap_goal.json"
        });
  }

  @Test
  public void collect_ListsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Lists",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Lists_goal.json"
        });
  }

  @Test
  public void collect_TreeBasedTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TreeBasedTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TreeBasedTable_goal.json"
        });
  }

  @Test
  public void collect_InternerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Interner",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Interner_goal.json"
        });
  }

  @Test
  public void collect_ComparatorOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ComparatorOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ComparatorOrdering_goal.json"
        });
  }

  @Test
  public void collect_EvictingQueueTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EvictingQueue",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EvictingQueue_goal.json"
        });
  }

  @Test
  public void collect_AllEqualOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AllEqualOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AllEqualOrdering_goal.json"
        });
  }

  @Test
  public void collect_MapMakerInternalMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MapMakerInternalMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MapMakerInternalMap_goal.json"
        });
  }

  @Test
  public void collect_SingletonImmutableTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SingletonImmutableTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SingletonImmutableTable_goal.json"
        });
  }

  @Test
  public void collect_AbstractIndexedListIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractIndexedListIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractIndexedListIterator_goal.json"
        });
  }

  @Test
  public void collect_GenericMapMakerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.GenericMapMaker",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.GenericMapMaker_goal.json"
        });
  }

  @Test
  public void collect_HashBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.HashBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.HashBiMap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMapEntryTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMapEntry",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMapEntry_goal.json"
        });
  }

  // A couple of code snippets and one particular similarity.
  @Test
  public void collect_MultisetsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multisets",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Multisets_goal.json"
        });
  }

  @Test
  public void collect_ImmutableTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableTable_goal.json"
        });
  }

  @Test
  public void collect_SortedMultisetBridgeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedMultisetBridge",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedMultisetBridge_goal.json"
        });
  }

  @Test
  public void collect_ForwardingMapEntryTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingMapEntry",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingMapEntry_goal.json"
        });
  }

  @Test
  public void collect_BoundTypeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.BoundType",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.BoundType_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMapEntrySetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMapEntrySet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMapEntrySet_goal.json"
        });
  }

  @Test
  public void collect_ForwardingListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingListMultimap_goal.json"
        });
  }

  @Test
  public void collect_TablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Tables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Tables_goal.json"
        });
  }

  @Test
  public void collect_ByFunctionOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ByFunctionOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ByFunctionOrdering_goal.json"
        });
  }

  @Test
  public void collect_SortedIterablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedIterables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedIterables_goal.json"
        });
  }

  @Test
  public void collect_PlatformTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Platform",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Platform_goal.json"
        });
  }

  @Test
  public void collect_FilteredKeyMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredKeyMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredKeyMultimap_goal.json"
        });
  }

  @Test
  public void collect_TreeRangeSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TreeRangeSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TreeRangeSet_goal.json"
        });
  }

  @Test
  public void collect_CartesianListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.CartesianList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.CartesianList_goal.json"
        });
  }

  @Test
  public void collect_DescendingImmutableSortedSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.DescendingImmutableSortedSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.DescendingImmutableSortedSet_goal.json"
        });
  }

  @Test
  public void collect_ImmutableRangeMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableRangeMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableRangeMap_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableSortedSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableSortedSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableSortedSet_goal.json"
        });
  }

  @Test
  public void collect_ListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ListMultimap_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableSortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableSortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableSortedMultiset_goal.json"
        });
  }

  @Test
  public void collect_ForwardingBlockingDequeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingBlockingDeque",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingBlockingDeque_goal.json"
        });
  }

  @Test
  public void collect_EnumHashBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EnumHashBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EnumHashBiMap_goal.json"
        });
  }

  @Test
  public void collect_EmptyContiguousSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EmptyContiguousSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EmptyContiguousSet_goal.json"
        });
  }

  @Test
  public void collect_AbstractMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractMultimap_goal.json"
        });
  }

  @Test
  public void collect_TreeTraverserTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TreeTraverser",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TreeTraverser_goal.json"
        });
  }

  @Test
  public void collect_MultimapsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multimaps",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Multimaps_goal.json"
        });
  }

  @Test
  public void collect_MinMaxPriorityQueueTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MinMaxPriorityQueue",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MinMaxPriorityQueue_goal.json"
        });
  }

  @Test
  public void collect_DenseImmutableTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.DenseImmutableTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.DenseImmutableTable_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSortedMapFauxverideShimTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSortedMapFauxverideShim",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSortedMapFauxverideShim_goal.json"
        });
  }

  @Test
  public void collect_ForwardingIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingIterator_goal.json"
        });
  }

  @Test
  public void collect_SetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SetMultimap_goal.json"
        });
  }

  // One false positive:
  // Returns true if obj is another RangeMap that has an equivalent asMapOfRanges().
  // (in the equals() method...)
  @Test
  public void collect_RangeMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RangeMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RangeMap_goal.json"
        });
  }

  @Test
  public void collect_RangeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Range",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Range_goal.json"
        });
  }

  @Test
  public void collect_FilteredMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.FilteredMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.FilteredMultimap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableAsListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableAsList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableAsList_goal.json"
        });
  }

  @Test
  public void collect_CompoundOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.CompoundOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.CompoundOrdering_goal.json"
        });
  }

  @Test
  public void collect_ForwardingSortedMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingSortedMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingSortedMap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableClassToInstanceMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableClassToInstanceMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableClassToInstanceMap_goal.json"
        });
  }

  // Many "stream equivalent", let's keep it for later.

  //  @Test
  //  public void collect_FluentIterableTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.collect.FluentIterable",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.collect.FluentIterable_goal.json"
  //    });
  //  }

  @Test
  public void collect_LexicographicalOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.LexicographicalOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.LexicographicalOrdering_goal.json"
        });
  }

  @Test
  public void collect_AbstractTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractTable_goal.json"
        });
  }

  @Test
  public void collect_ConstraintTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Constraint",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Constraint_goal.json"
        });
  }

  @Test
  public void collect_TransformedIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TransformedIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TransformedIterator_goal.json"
        });
  }

  @Test
  public void collect_SortedListsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SortedLists",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SortedLists_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableList_goal.json"
        });
  }

  @Test
  public void collect_AbstractIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractIterator_goal.json"
        });
  }

  @Test
  public void collect_CollectPreconditionsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.CollectPreconditions",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.CollectPreconditions_goal.json"
        });
  }

  @Test
  public void collect_SingletonImmutableBiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SingletonImmutableBiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SingletonImmutableBiMap_goal.json"
        });
  }

  @Test
  public void collect_RowSortedTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RowSortedTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RowSortedTable_goal.json"
        });
  }

  @Test
  public void collect_ForwardingImmutableMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingImmutableMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingImmutableMap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingNavigableSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingNavigableSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingNavigableSet_goal.json"
        });
  }

  @Test
  public void collect_ComparisonChainTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ComparisonChain",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ComparisonChain_goal.json"
        });
  }

  @Test
  public void collect_UnmodifiableListIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.UnmodifiableListIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.UnmodifiableListIterator_goal.json"
        });
  }

  @Test
  public void collect_AbstractListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractListMultimap_goal.json"
        });
  }

  // A couple of chain of calls and links to external systems (java.util).
  @Test
  public void collect_OrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Ordering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Ordering_goal.json"
        });
  }

  @Test
  public void collect_ReverseOrderingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ReverseOrdering",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ReverseOrdering_goal.json"
        });
  }

  @Test
  public void collect_ConsumingQueueIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ConsumingQueueIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ConsumingQueueIterator_goal.json"
        });
  }

  @Test
  public void collect_AbstractSortedSetMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractSortedSetMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractSortedSetMultimap_goal.json"
        });
  }

  @Test
  public void collect_EnumMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.EnumMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.EnumMultiset_goal.json"
        });
  }

  @Test
  public void collect_ForwardingTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingTable_goal.json"
        });
  }

  @Test
  public void collect_ImmutableEnumMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableEnumMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableEnumMap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingMultimap_goal.json"
        });
  }

  @Test
  public void collect_SparseImmutableTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SparseImmutableTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SparseImmutableTable_goal.json"
        });
  }

  @Test
  public void collect_TreeMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.TreeMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.TreeMultiset_goal.json"
        });
  }

  @Test
  public void collect_ForwardingSetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingSet",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingSet_goal.json"
        });
  }

  // This is a special false positive bc it says:
  // "For example, ImmutableList.of(1, 2, 3).reverse() is equivalent to ImmutableList.of(3, 2, 1)"

  //  @Test
  //  public void collect_ImmutableListTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.collect.ImmutableList",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.collect.ImmutableList_goal.json"
  //    });
  //  }

  @Test
  public void collect_HashMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.HashMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.HashMultimap_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableMap_goal.json"
        });
  }

  @Test
  public void collect_LinkedHashMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.LinkedHashMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.LinkedHashMultiset_goal.json"
        });
  }

  @Test
  public void collect_DescendingMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.DescendingMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.DescendingMultiset_goal.json"
        });
  }

  @Test
  public void collect_ConcurrentHashMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ConcurrentHashMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ConcurrentHashMultiset_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableCollectionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableCollection",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableCollection_goal.json"
        });
  }

  @Test
  public void collect_ImmutableListMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableListMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableListMultimap_goal.json"
        });
  }

  @Test
  public void collect_ImmutableMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableMultimap_goal.json"
        });
  }

  @Test
  public void collect_MutableClassToInstanceMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MutableClassToInstanceMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MutableClassToInstanceMap_goal.json"
        });
  }

  @Test
  public void collect_UnmodifiableSortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.UnmodifiableSortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.UnmodifiableSortedMultiset_goal.json"
        });
  }

  @Test
  public void collect_StandardRowSortedTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.StandardRowSortedTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.StandardRowSortedTable_goal.json"
        });
  }

  @Test
  public void collect_ForwardingListIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingListIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingListIterator_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSortedAsListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSortedAsList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSortedAsList_goal.json"
        });
  }

  @Test
  public void collect_BiMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.BiMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.BiMap_goal.json"
        });
  }

  @Test
  public void collect_ForwardingListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingList_goal.json"
        });
  }

  @Test
  public void collect_ForwardingQueueTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ForwardingQueue",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ForwardingQueue_goal.json"
        });
  }

  @Test
  public void collect_ImmutableSortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ImmutableSortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ImmutableSortedMultiset_goal.json"
        });
  }

  @Test
  public void collect_RegularImmutableTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.RegularImmutableTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.RegularImmutableTable_goal.json"
        });
  }

  @Test
  public void collect_ComputingConcurrentHashMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.ComputingConcurrentHashMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.ComputingConcurrentHashMap_goal.json"
        });
  }

  @Test
  public void collect_MultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.Multimap_goal.json"
        });
  }

  @Test
  public void collect_MapDifferenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MapDifference",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MapDifference_goal.json"
        });
  }

  @Test
  public void collect_GeneralRangeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.GeneralRange",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.GeneralRange_goal.json"
        });
  }

  @Test
  public void collect_AbstractSortedMultisetTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractSortedMultiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractSortedMultiset_goal.json"
        });
  }

  //  False positives in the form of: When multiple elements are equivalent according to...

  //  @Test
  //  public void collect_ImmutableSortedSetTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.collect.ImmutableSortedSet",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.collect.ImmutableSortedSet_goal.json"
  //    });
  //  }

  @Test
  public void collect_SingletonImmutableListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.SingletonImmutableList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.SingletonImmutableList_goal.json"
        });
  }

  @Test
  public void collect_StandardTableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.StandardTable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.StandardTable_goal.json"
        });
  }

  @Test
  public void collect_MapMakerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.MapMaker",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.MapMaker_goal.json"
        });
  }

  @Test
  public void collect_AbstractMapBasedMultimapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractMapBasedMultimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractMapBasedMultimap_goal.json"
        });
  }

  @Test
  public void collect_AbstractMapEntryTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.AbstractMapEntry",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.collect.AbstractMapEntry_goal.json"
        });
  }

  @Test
  public void eventbus_EventBusTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.EventBus",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.EventBus_goal.json"
        });
  }

  @Test
  public void eventbus_DeadEventTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.DeadEvent",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.DeadEvent_goal.json"
        });
  }

  @Test
  public void eventbus_SubscriberTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.Subscriber",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.Subscriber_goal.json"
        });
  }

  @Test
  public void eventbus_SubscriberRegistryTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.SubscriberRegistry",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.SubscriberRegistry_goal.json"
        });
  }

  @Test
  public void eventbus_AsyncEventBusTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.AsyncEventBus",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.AsyncEventBus_goal.json"
        });
  }

  @Test
  public void eventbus_SubscriberExceptionContextTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.SubscriberExceptionContext",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.SubscriberExceptionContext_goal.json"
        });
  }

  @Test
  public void eventbus_SubscriberExceptionHandlerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.SubscriberExceptionHandler",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.SubscriberExceptionHandler_goal.json"
        });
  }

  @Test
  public void eventbus_DispatcherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.eventbus.Dispatcher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.eventbus.Dispatcher_goal.json"
        });
  }

  @Test
  public void net_PercentEscaperTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.PercentEscaper",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.PercentEscaper_goal.json"
        });
  }

  @Test
  public void net_UrlEscapersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.UrlEscapers",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.UrlEscapers_goal.json"
        });
  }

  @Test
  public void net_InternetDomainNameTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.InternetDomainName",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.InternetDomainName_goal.json"
        });
  }

  @Test
  public void net_HttpHeadersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.HttpHeaders",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.HttpHeaders_goal.json"
        });
  }

  @Test
  public void net_MediaTypeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.MediaType",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.MediaType_goal.json"
        });
  }

  @Test
  public void net_InetAddressesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.InetAddresses",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.InetAddresses_goal.json"
        });
  }

  @Test
  public void net_HostAndPortTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.HostAndPort",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.HostAndPort_goal.json"
        });
  }

  @Test
  public void net_HostSpecifierTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.net.HostSpecifier",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.net.HostSpecifier_goal.json"
        });
  }

  @Test
  public void cache_LocalCacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.LocalCache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.LocalCache_goal.json"
        });
  }

  @Test
  public void cache_LongAdderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.LongAdder",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.LongAdder_goal.json"
        });
  }

  @Test
  public void cache_RemovalNotificationTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.RemovalNotification",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.RemovalNotification_goal.json"
        });
  }

  @Test
  public void cache_CacheStatsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.CacheStats",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.CacheStats_goal.json"
        });
  }

  @Test
  public void cache_CacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.Cache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.Cache_goal.json"
        });
  }

  @Test
  public void cache_WeigherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.Weigher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.Weigher_goal.json"
        });
  }

  @Test
  public void cache_RemovalListenersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.RemovalListeners",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.RemovalListeners_goal.json"
        });
  }

  @Test
  public void cache_LoadingCacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.LoadingCache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.LoadingCache_goal.json"
        });
  }

  @Test
  public void cache_AbstractCacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.AbstractCache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.AbstractCache_goal.json"
        });
  }

  @Test
  public void cache_CacheLoaderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.CacheLoader",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.CacheLoader_goal.json"
        });
  }

  @Test
  public void cache_ForwardingLoadingCacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.ForwardingLoadingCache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.ForwardingLoadingCache_goal.json"
        });
  }

  @Test
  public void cache_LongAddableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.LongAddable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.LongAddable_goal.json"
        });
  }

  @Test
  public void cache_CacheBuilderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.CacheBuilder",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.CacheBuilder_goal.json"
        });
  }

  @Test
  public void cache_CacheBuilderSpecTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.CacheBuilderSpec",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.CacheBuilderSpec_goal.json"
        });
  }

  @Test
  public void cache_LongAddablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.LongAddables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.LongAddables_goal.json"
        });
  }

  @Test
  public void cache_RemovalListenerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.RemovalListener",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.RemovalListener_goal.json"
        });
  }

  @Test
  public void cache_AbstractLoadingCacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.AbstractLoadingCache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.AbstractLoadingCache_goal.json"
        });
  }

  @Test
  public void cache_RemovalCauseTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.RemovalCause",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.RemovalCause_goal.json"
        });
  }

  @Test
  public void cache_ForwardingCacheTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.ForwardingCache",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.ForwardingCache_goal.json"
        });
  }

  @Test
  public void cache_Striped64Test() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.Striped64",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.cache.Striped64_goal.json"
        });
  }

  @Test
  public void concurrent_ForwardingListenableFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ForwardingListenableFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ForwardingListenableFuture_goal.json"
        });
  }

  @Test
  public void concurrent_RunnablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Runnables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Runnables_goal.json"
        });
  }

  @Test
  public void concurrent_AggregateFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AggregateFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AggregateFuture_goal.json"
        });
  }

  @Test
  public void concurrent_AtomicDoubleArrayTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AtomicDoubleArray",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AtomicDoubleArray_goal.json"
        });
  }

  @Test
  public void concurrent_SimpleTimeLimiterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.SimpleTimeLimiter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.SimpleTimeLimiter_goal.json"
        });
  }

  @Test
  public void concurrent_ForwardingCheckedFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ForwardingCheckedFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ForwardingCheckedFuture_goal.json"
        });
  }

  // Not sure how to interpret the equivalence I found here
  @Test
  public void concurrent_MoreExecutorsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.MoreExecutors",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.MoreExecutors_goal.json"
        });
  }

  @Test
  public void concurrent_ServiceManagerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ServiceManager",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ServiceManager_goal.json"
        });
  }

  @Test
  public void concurrent_TimeLimiterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.TimeLimiter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.TimeLimiter_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractScheduledServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractScheduledService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractScheduledService_goal.json"
        });
  }

  @Test
  public void concurrent_FakeTimeLimiterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.FakeTimeLimiter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.FakeTimeLimiter_goal.json"
        });
  }

  @Test
  public void concurrent_AtomicDoubleTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AtomicDouble",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AtomicDouble_goal.json"
        });
  }

  @Test
  public void concurrent_ForwardingFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ForwardingFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ForwardingFuture_goal.json"
        });
  }

  @Test
  public void concurrent_SettableFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.SettableFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.SettableFuture_goal.json"
        });
  }

  @Test
  public void concurrent_AtomicsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Atomics",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Atomics_goal.json"
        });
  }

  @Test
  public void concurrent_WrappingExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.WrappingExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.WrappingExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_ExecutionListTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ExecutionList",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ExecutionList_goal.json"
        });
  }

  @Test
  public void concurrent_AsyncFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AsyncFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AsyncFunction_goal.json"
        });
  }

  @Test
  public void concurrent_SmoothRateLimiterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.SmoothRateLimiter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.SmoothRateLimiter_goal.json"
        });
  }

  @Test
  public void concurrent_SerializingExecutorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.SerializingExecutor",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.SerializingExecutor_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractCheckedFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractCheckedFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractCheckedFuture_goal.json"
        });
  }

  @Test
  public void concurrent_GwtFuturesCatchingSpecializationTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.GwtFuturesCatchingSpecialization",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.GwtFuturesCatchingSpecialization_goal.json"
        });
  }

  // These all look like false positives...
  @Test
  public void concurrent_JdkFutureAdaptersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.JdkFutureAdapters",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.JdkFutureAdapters_goal.json"
        });
  }

  @Test
  public void concurrent_InterruptibleTaskTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.InterruptibleTask",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.InterruptibleTask_goal.json"
        });
  }

  @Test
  public void concurrent_ListenableScheduledFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ListenableScheduledFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ListenableScheduledFuture_goal.json"
        });
  }

  @Test
  public void concurrent_UninterruptiblesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Uninterruptibles",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Uninterruptibles_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractListeningExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractListeningExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractListeningExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractFuture_goal.json"
        });
  }

  @Test
  public void concurrent_ForwardingBlockingQueueTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ForwardingBlockingQueue",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ForwardingBlockingQueue_goal.json"
        });
  }

  @Test
  public void concurrent_CollectionFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.CollectionFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.CollectionFuture_goal.json"
        });
  }

  @Test
  public void concurrent_TrustedListenableFutureTaskTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.TrustedListenableFutureTask",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.TrustedListenableFutureTask_goal.json"
        });
  }

  @Test
  public void concurrent_WrappingScheduledExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.WrappingScheduledExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.WrappingScheduledExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_RateLimiterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.RateLimiter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.RateLimiter_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractExecutionThreadServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractExecutionThreadService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractExecutionThreadService_goal.json"
        });
  }

  @Test
  public void concurrent_ThreadFactoryBuilderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ThreadFactoryBuilder",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ThreadFactoryBuilder_goal.json"
        });
  }

  @Test
  public void concurrent_AtomicLongMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AtomicLongMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AtomicLongMap_goal.json"
        });
  }

  @Test
  public void concurrent_FutureCallbackTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.FutureCallback",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.FutureCallback_goal.json"
        });
  }

  @Test
  public void concurrent_UncaughtExceptionHandlersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.UncaughtExceptionHandlers",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.UncaughtExceptionHandlers_goal.json"
        });
  }

  @Test
  public void concurrent_PlatformTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Platform",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Platform_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractService_goal.json"
        });
  }

  @Test
  public void concurrent_ForwardingExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ForwardingExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ForwardingExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_CycleDetectingLockFactoryTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.CycleDetectingLockFactory",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.CycleDetectingLockFactory_goal.json"
        });
  }

  @Test
  public void concurrent_ServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Service",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Service_goal.json"
        });
  }

  @Test
  public void concurrent_AggregateFutureStateTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AggregateFutureState",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AggregateFutureState_goal.json"
        });
  }

  @Test
  public void concurrent_ListeningScheduledExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ListeningScheduledExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ListeningScheduledExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_UncheckedTimeoutExceptionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.UncheckedTimeoutException",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.UncheckedTimeoutException_goal.json"
        });
  }

  @Test
  public void concurrent_ExecutionErrorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ExecutionError",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ExecutionError_goal.json"
        });
  }

  @Test
  public void concurrent_CallablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Callables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Callables_goal.json"
        });
  }

  @Test
  public void concurrent_FuturesGetCheckedTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.FuturesGetChecked",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.FuturesGetChecked_goal.json"
        });
  }

  @Test
  public void concurrent_AbstractIdleServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.AbstractIdleService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.AbstractIdleService_goal.json"
        });
  }

  @Test
  public void concurrent_FutureFallbackTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.FutureFallback",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.FutureFallback_goal.json"
        });
  }

  @Test
  public void concurrent_StripedTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Striped",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Striped_goal.json"
        });
  }

  @Test
  public void concurrent_FuturesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Futures",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Futures_goal.json"
        });
  }

  @Test
  public void concurrent_ForwardingListeningExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ForwardingListeningExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ForwardingListeningExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_ListenableFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ListenableFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ListenableFuture_goal.json"
        });
  }

  @Test
  public void concurrent_MonitorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.Monitor",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.Monitor_goal.json"
        });
  }

  @Test
  public void concurrent_ListenableFutureTaskTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ListenableFutureTask",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ListenableFutureTask_goal.json"
        });
  }

  @Test
  public void concurrent_ListenerCallQueueTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ListenerCallQueue",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ListenerCallQueue_goal.json"
        });
  }

  @Test
  public void concurrent_UncheckedExecutionExceptionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.UncheckedExecutionException",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.UncheckedExecutionException_goal.json"
        });
  }

  @Test
  public void concurrent_ListeningExecutorServiceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.ListeningExecutorService",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.ListeningExecutorService_goal.json"
        });
  }

  @Test
  public void concurrent_CheckedFutureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.CheckedFuture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.util.concurrent.CheckedFuture_goal.json"
        });
  }

  @Test
  public void hash_ChecksumHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.ChecksumHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.ChecksumHashFunction_goal.json"
        });
  }

  @Test
  public void hash_SipHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.SipHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.SipHashFunction_goal.json"
        });
  }

  @Test
  public void hash_AbstractStreamingHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.AbstractStreamingHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.AbstractStreamingHashFunction_goal.json"
        });
  }

  //  False positive: To get the long value equivalent ... at least I THINK

  //  @Test
  //  public void hash_HashingTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.hash.Hashing",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.hash.Hashing_goal.json"
  //    });
  //  }

  @Test
  public void hash_Crc32cHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.Crc32cHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.Crc32cHashFunction_goal.json"
        });
  }

  @Test
  public void hash_HashCodeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.HashCode",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.HashCode_goal.json"
        });
  }

  @Test
  public void hash_FunnelTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.Funnel",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.Funnel_goal.json"
        });
  }

  @Test
  public void hash_HashingOutputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.HashingOutputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.HashingOutputStream_goal.json"
        });
  }

  @Test
  public void hash_PrimitiveSinkTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.PrimitiveSink",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.PrimitiveSink_goal.json"
        });
  }

  @Test
  public void hash_AbstractByteHasherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.AbstractByteHasher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.AbstractByteHasher_goal.json"
        });
  }

  @Test
  public void hash_Murmur3_128HashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.Murmur3_128HashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.Murmur3_128HashFunction_goal.json"
        });
  }

  @Test
  public void hash_BloomFilterStrategiesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.BloomFilterStrategies",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.BloomFilterStrategies_goal.json"
        });
  }

  @Test
  public void hash_Murmur3_32HashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.Murmur3_32HashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.Murmur3_32HashFunction_goal.json"
        });
  }

  @Test
  public void hash_FunnelsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.Funnels",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.Funnels_goal.json"
        });
  }

  @Test
  public void hash_AbstractCompositeHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.AbstractCompositeHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.AbstractCompositeHashFunction_goal.json"
        });
  }

  @Test
  public void hash_MessageDigestHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.MessageDigestHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.MessageDigestHashFunction_goal.json"
        });
  }

  @Test
  public void hash_HasherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.Hasher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.Hasher_goal.json"
        });
  }

  @Test
  public void hash_HashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.HashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.HashFunction_goal.json"
        });
  }

  @Test
  public void hash_BloomFilterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.BloomFilter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.BloomFilter_goal.json"
        });
  }

  @Test
  public void hash_HashingInputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.HashingInputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.HashingInputStream_goal.json"
        });
  }

  @Test
  public void hash_AbstractHasherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.AbstractHasher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.AbstractHasher_goal.json"
        });
  }

  @Test
  public void hash_AbstractNonStreamingHashFunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.hash.AbstractNonStreamingHashFunction",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.hash.AbstractNonStreamingHashFunction_goal.json"
        });
  }

  @Test
  public void reflect_ClassPathTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.ClassPath",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.ClassPath_goal.json"
        });
  }

  @Test
  public void reflect_ElementTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.Element",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.Element_goal.json"
        });
  }

  @Test
  public void reflect_ParameterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.Parameter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.Parameter_goal.json"
        });
  }

  @Test
  public void reflect_ReflectionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.Reflection",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.Reflection_goal.json"
        });
  }

  @Test
  public void reflect_TypeVisitorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.TypeVisitor",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.TypeVisitor_goal.json"
        });
  }

  @Test
  public void reflect_ImmutableTypeToInstanceMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.ImmutableTypeToInstanceMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.ImmutableTypeToInstanceMap_goal.json"
        });
  }

  @Test
  public void reflect_MutableTypeToInstanceMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.MutableTypeToInstanceMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.MutableTypeToInstanceMap_goal.json"
        });
  }

  // Only undefined parameters
  @Test
  public void reflect_TypeToInstanceMapTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.TypeToInstanceMap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.TypeToInstanceMap_goal.json"
        });
  }

  @Test
  public void reflect_TypeParameterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.TypeParameter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.TypeParameter_goal.json"
        });
  }

  @Test
  public void reflect_TypeCaptureTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.TypeCapture",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.TypeCapture_goal.json"
        });
  }

  @Test
  public void reflect_TypeResolverTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.TypeResolver",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.TypeResolver_goal.json"
        });
  }

  @Test
  public void reflect_TypesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.Types",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.Types_goal.json"
        });
  }

  @Test
  public void reflect_InvokableTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.Invokable",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.Invokable_goal.json"
        });
  }

  @Test
  public void reflect_AbstractInvocationHandlerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.reflect.AbstractInvocationHandler",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.reflect.AbstractInvocationHandler_goal.json"
        });
  }

  // Incompatible parameters:
  // Prefer using the concat(Iterable) overload if possible.
  // there are ways to convert iterable to iterator, though I'm not sure...
  @Test
  public void io_CharSourceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.CharSource",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.CharSource_goal.json"
        });
  }

  @Test
  public void io_CharSinkTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.CharSink",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.CharSink_goal.json"
        });
  }

  @Test
  public void io_AppendableWriterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.AppendableWriter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.AppendableWriter_goal.json"
        });
  }

  @Test
  public void io_MultiReaderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.MultiReader",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.MultiReader_goal.json"
        });
  }

  @Test
  public void io_MultiInputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.MultiInputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.MultiInputStream_goal.json"
        });
  }

  @Test
  public void io_ByteSinkTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.ByteSink",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.ByteSink_goal.json"
        });
  }

  @Test
  public void io_ByteArrayDataOutputTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.ByteArrayDataOutput",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.ByteArrayDataOutput_goal.json"
        });
  }

  @Test
  public void io_CloserTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.Closer",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.Closer_goal.json"
        });
  }

  @Test
  public void io_OutputSupplierTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.OutputSupplier",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.OutputSupplier_goal.json"
        });
  }

  @Test
  public void io_PatternFilenameFilterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.PatternFilenameFilter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.PatternFilenameFilter_goal.json"
        });
  }

  @Test
  public void io_CloseablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.Closeables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.Closeables_goal.json"
        });
  }

  @Test
  public void io_BaseEncodingTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.BaseEncoding",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.BaseEncoding_goal.json"
        });
  }

  @Test
  public void io_LineBufferTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.LineBuffer",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.LineBuffer_goal.json"
        });
  }

  @Test
  public void io_FilesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.Files",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.Files_goal.json"
        });
  }

  @Test
  public void io_CharStreamsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.CharStreams",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.CharStreams_goal.json"
        });
  }

  @Test
  public void io_ResourcesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.Resources",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.Resources_goal.json"
        });
  }

  @Test
  public void io_ByteArrayDataInputTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.ByteArrayDataInput",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.ByteArrayDataInput_goal.json"
        });
  }

  @Test
  public void io_FileWriteModeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.FileWriteMode",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.FileWriteMode_goal.json"
        });
  }

  @Test
  public void io_ByteStreamsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.ByteStreams",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.ByteStreams_goal.json"
        });
  }

  // Both void methods:
  // Equivalent to calling flush(flushable, true), but with no IOException in the signature.
  @Test
  public void io_FlushablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.Flushables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.Flushables_goal.json"
        });
  }

  @Test
  public void io_CountingOutputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.CountingOutputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.CountingOutputStream_goal.json"
        });
  }

  @Test
  public void io_CountingInputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.CountingInputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.CountingInputStream_goal.json"
        });
  }

  // Incompatible parameters:
  // Prefer using the concat(Iterable) overload if possible.
  // there are ways to convert iterable to iterator, though I'm not sure...
  @Test
  public void io_ByteSourceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.ByteSource",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.ByteSource_goal.json"
        });
  }

  @Test
  public void io_LittleEndianDataInputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.LittleEndianDataInputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.LittleEndianDataInputStream_goal.json"
        });
  }

  @Test
  public void io_LineProcessorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.LineProcessor",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.LineProcessor_goal.json"
        });
  }

  @Test
  public void io_InputSupplierTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.InputSupplier",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.InputSupplier_goal.json"
        });
  }

  @Test
  public void io_FileBackedOutputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.FileBackedOutputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.FileBackedOutputStream_goal.json"
        });
  }

  @Test
  public void io_LineReaderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.LineReader",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.LineReader_goal.json"
        });
  }

  @Test
  public void io_LittleEndianDataOutputStreamTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.LittleEndianDataOutputStream",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.LittleEndianDataOutputStream_goal.json"
        });
  }

  @Test
  public void io_ByteProcessorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.ByteProcessor",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.ByteProcessor_goal.json"
        });
  }

  @Test
  public void io_CharSequenceReaderTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.io.CharSequenceReader",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.io.CharSequenceReader_goal.json"
        });
  }

  @Test
  public void html_HtmlEscapersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.html.HtmlEscapers",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.html.HtmlEscapers_goal.json"
        });
  }

  @Test
  public void math_LongMathTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.math.LongMath",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.math.LongMath_goal.json"
        });
  }

  @Test
  public void math_IntMathTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.math.IntMath",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.math.IntMath_goal.json"
        });
  }

  @Test
  public void math_MathPreconditionsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.math.MathPreconditions",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.math.MathPreconditions_goal.json"
        });
  }

  @Test
  public void math_BigIntegerMathTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.math.BigIntegerMath",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.math.BigIntegerMath_goal.json"
        });
  }

  @Test
  public void math_DoubleMathTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.math.DoubleMath",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.math.DoubleMath_goal.json"
        });
  }

  @Test
  public void math_DoubleUtilsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.math.DoubleUtils",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.math.DoubleUtils_goal.json"
        });
  }

  @Test
  public void xml_XmlEscapersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.xml.XmlEscapers",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.xml.XmlEscapers_goal.json"
        });
  }

  @Test
  public void primitives_FloatsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Floats",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Floats_goal.json"
        });
  }

  @Test
  public void primitives_BooleansTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Booleans",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Booleans_goal.json"
        });
  }

  @Test
  public void primitives_UnsignedLongsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.UnsignedLongs",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.UnsignedLongs_goal.json"
        });
  }

  @Test
  public void primitives_ShortsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Shorts",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Shorts_goal.json"
        });
  }

  @Test
  public void primitives_SignedBytesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.SignedBytes",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.SignedBytes_goal.json"
        });
  }

  @Test
  public void primitives_DoublesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Doubles",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Doubles_goal.json"
        });
  }

  @Test
  public void primitives_BytesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Bytes",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Bytes_goal.json"
        });
  }

  @Test
  public void primitives_UnsignedIntsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.UnsignedInts",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.UnsignedInts_goal.json"
        });
  }

  @Test
  public void primitives_UnsignedLongTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.UnsignedLong",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.UnsignedLong_goal.json"
        });
  }

  @Test
  public void primitives_IntsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Ints",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Ints_goal.json"
        });
  }

  @Test
  public void primitives_UnsignedBytesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.UnsignedBytes",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.UnsignedBytes_goal.json"
        });
  }

  @Test
  public void primitives_CharsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Chars",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Chars_goal.json"
        });
  }

  @Test
  public void primitives_PrimitivesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Primitives",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Primitives_goal.json"
        });
  }

  @Test
  public void primitives_UnsignedIntegerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.UnsignedInteger",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.UnsignedInteger_goal.json"
        });
  }

  @Test
  public void primitives_ParseRequestTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.ParseRequest",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.ParseRequest_goal.json"
        });
  }

  @Test
  public void primitives_LongsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.primitives.Longs",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.primitives.Longs_goal.json"
        });
  }

  @Test
  public void base_PreconditionsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Preconditions",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Preconditions_goal.json"
        });
  }

  @Test
  public void base_JoinerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Joiner",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Joiner_goal.json"
        });
  }

  @Test
  public void base_AsciiTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Ascii",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Ascii_goal.json"
        });
  }

  @Test
  public void base_StandardSystemPropertyTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.StandardSystemProperty",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.StandardSystemProperty_goal.json"
        });
  }

  @Test
  public void base_EnumsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Enums",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Enums_goal.json"
        });
  }

  // Just false positives, because the class name contains Equivalence

  //  @Test
  //  public void base_PairwiseEquivalenceTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.base.PairwiseEquivalence",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.base.PairwiseEquivalence_goal.json"
  //    });
  //  }

  @Test
  public void base_SuppliersTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Suppliers",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Suppliers_goal.json"
        });
  }

  @Test
  public void base_FunctionsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Functions",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Functions_goal.json"
        });
  }

  @Test
  public void base_ObjectsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Objects",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Objects_goal.json"
        });
  }

  // base.Optional has equivalences outside the system (java.util.Optional)

  //  @Test
  //  public void base_OptionalTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.base.Optional",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.base.Optional_goal.json"
  //    });
  //  }

  @Test
  public void base_StopwatchTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Stopwatch",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Stopwatch_goal.json"
        });
  }

  @Test
  public void base_CharsetsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Charsets",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Charsets_goal.json"
        });
  }

  @Test
  public void base_FinalizableSoftReferenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.FinalizableSoftReference",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.FinalizableSoftReference_goal.json"
        });
  }

  @Test
  public void base_StringsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Strings",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Strings_goal.json"
        });
  }

  @Test
  public void base_SupplierTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Supplier",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Supplier_goal.json"
        });
  }

  @Test
  public void internal_FinalizerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.internal.Finalizer",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.internal.Finalizer_goal.json"
        });
  }

  @Test
  public void base_FinalizableReferenceQueueTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.FinalizableReferenceQueue",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.FinalizableReferenceQueue_goal.json"
        });
  }

  @Test
  public void base_MoreObjectsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.MoreObjects",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.MoreObjects_goal.json"
        });
  }

  @Test
  public void base_Utf8Test() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Utf8",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Utf8_goal.json"
        });
  }

  @Test
  public void base_PredicateTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Predicate",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Predicate_goal.json"
        });
  }

  @Test
  public void base_ThrowablesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Throwables",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Throwables_goal.json"
        });
  }

  @Test
  public void base_ConverterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Converter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Converter_goal.json"
        });
  }

  @Test
  public void base_PlatformTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Platform",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Platform_goal.json"
        });
  }

  // Just false positives, because the class name is Equivalence

  //  @Test
  //  public void base_EquivalenceTest() {
  //    Toradocu.main( new String[] {
  //            "--target-class",
  //            "com.google.common.base.Equivalence",
  //            "--class-dir",
  //            "src/test/resources/bin/guava-19.0.jar" ,
  //            "--source-dir" ,
  //            "src/test/resources/src/guava-19.0-sources" ,
  //            "--disable-semantics" ,
  //            "true" , "--cross-oracles" ,
  //            "true",
  //            "--condition-translator-output",
  //            "com.google.common.base.Equivalence_goal.json"
  //    });
  //  }

  @Test
  public void base_PresentTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Present",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Present_goal.json"
        });
  }

  @Test
  public void base_VerifyExceptionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.VerifyException",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.VerifyException_goal.json"
        });
  }

  @Test
  public void base_FunctionalEquivalenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.FunctionalEquivalence",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.FunctionalEquivalence_goal.json"
        });
  }

  @Test
  public void base_SplitterTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Splitter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Splitter_goal.json"
        });
  }

  @Test
  public void base_CharMatcherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.CharMatcher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.CharMatcher_goal.json"
        });
  }

  @Test
  public void base_PredicatesTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Predicates",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Predicates_goal.json"
        });
  }

  @Test
  public void base_AbstractIteratorTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.AbstractIterator",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.AbstractIterator_goal.json"
        });
  }

  @Test
  public void base_FinalizableReferenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.FinalizableReference",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.FinalizableReference_goal.json"
        });
  }

  @Test
  public void base_VerifyTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Verify",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Verify_goal.json"
        });
  }

  @Test
  public void base_DefaultsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Defaults",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Defaults_goal.json"
        });
  }

  @Test
  public void base_FinalizableWeakReferenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.FinalizableWeakReference",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.FinalizableWeakReference_goal.json"
        });
  }

  @Test
  public void base_TickerTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Ticker",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Ticker_goal.json"
        });
  }

  @Test
  public void base_AbsentTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Absent",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Absent_goal.json"
        });
  }

  @Test
  public void base_FunctionTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.Function",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.Function_goal.json"
        });
  }

  @Test
  public void base_FinalizablePhantomReferenceTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.FinalizablePhantomReference",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.FinalizablePhantomReference_goal.json"
        });
  }

  @Test
  public void base_SmallCharMatcherTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.base.SmallCharMatcher",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.common.base.SmallCharMatcher_goal.json"
        });
  }

  @Test
  public void publicsuffix_PublicSuffixPatternsTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.thirdparty.publicsuffix.PublicSuffixPatterns",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.thirdparty.publicsuffix.PublicSuffixPatterns_goal.json"
        });
  }

  @Test
  public void publicsuffix_PublicSuffixTypeTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.thirdparty.publicsuffix.PublicSuffixType",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.thirdparty.publicsuffix.PublicSuffixType_goal.json"
        });
  }

  @Test
  public void publicsuffix_TrieParserTest() {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.thirdparty.publicsuffix.TrieParser",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "com.google.thirdparty.publicsuffix.TrieParser_goal.json"
        });
  }
}
