package org.memo.accuracy.equivalences.dataset;

import org.junit.Test;
import org.memo.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyElasticSearch6 extends AbstractPrecisionRecallTestSuite {

  // FIXME wrong elasticsearch, where is actual one? & why paths do not work
  private static final String ELASTICSEARCH_6_SRC =
      "src/test/resources/src/elasticsearch-6.1.1-sources/";
  private static final String ELASTICSEARCH_6_BIN =
      "src/test/resources/bin/elasticsearch-6.1.1.jar:"
          + "src/test/resources/bin/lucene-core-7.2.1.jar:"
          + "src/test/resources/bin/joda-time-2.9.8.jar";
  private static final String ELASTICSEARCH_6_GOAL_DIR = "expected-equivalences/elastic";

  public AccuracyElasticSearch6() {
    super(ELASTICSEARCH_6_SRC, ELASTICSEARCH_6_BIN, ELASTICSEARCH_6_GOAL_DIR);
  }

  // Voids n defaults
  //  @Test
  //  public void testIndex_MappingUpdatedAction() {
  //    test("org.elasticsearch.cluster.action.index.MappingUpdatedAction", 1, 1);
  //  }

  // Symmetric equivalences

  //  @Test
  //  public void testMetadata_IndexNameExpressionResolver() {
  //    test("org.elasticsearch.cluster.metadata.IndexNameExpressionResolver", 1, 1);
  //  }

  @Test
  public void testRouting_ShardShuffler() {
    test("org.elasticsearch.cluster.routing.ShardShuffler", 1, 0);
  }

  // Interesting thought not sure how to translate

  //  @Test
  //  public void testCollect_CopyOnWriteHashMap() {
  //    test("org.elasticsearch.common.collect.CopyOnWriteHashMap", 1, 1);
  //  }

  @Test
  public void testGeo_GeoUtils() {
    test("org.elasticsearch.common.geo.GeoUtils", 1, 1);
  }

  // Not sure about the semantics of out.smt ...

  //  @Test
  //  public void testIo_FastCharArrayWriter() {
  //    test("org.elasticsearch.common.io.FastCharArrayWriter", 0, 1);
  //  }

  @Test
  public void testIo_UTF8StreamWriter() {
    test("org.elasticsearch.common.io.UTF8StreamWriter", 1, 0);
  }

  // Interesting not sure how to translate if any

  //  @Test
  //  public void testCommon_Randomness() {
  //    test("org.elasticsearch.common.Randomness", 1, 1);
  //  }

  // Forwards and void...

  //  @Test
  //  public void testConcurrent_AbstractRunnable() {
  //    test("org.elasticsearch.common.util.concurrent.AbstractRunnable", 1, 1);
  //  }

  @Test
  public void testConcurrent_EsThreadPoolExecutor() {
    test("org.elasticsearch.common.util.concurrent.EsThreadPoolExecutor", 1, 1);
  }

  @Test
  public void testConcurrent_ThreadContext() {
    test("org.elasticsearch.common.util.concurrent.ThreadContext", 1, 1);
  }

//  @Test
//  public void testRecovery_RecoveryTarget() {
//    test("org.elasticsearch.indices.recovery.RecoveryTarget", 1, 1);
//  }

  @Test
  public void testRest_RestRequest() {
    test("org.elasticsearch.rest.RestRequest", 1, 0.5);
  }

  @Test
  public void testRest_RestUtils() {
    test("org.elasticsearch.rest.RestUtils", 1, 0);
  }

  // Comparison between voids
  @Test
  public void testBucket_BucketsAggregator() {
    test("org.elasticsearch.search.aggregations.bucket.BucketsAggregator", 1, 1);
  }

  //  @Test
  //  public void testRange_GeoDistanceAggregationBuilder() {
  //    test("org.elasticsearch.search.aggregations.bucket.range.GeoDistanceAggregationBuilder", 1,
  // 1);
  //  }

  //  @Test
  //  public void testRange_IpRangeAggregationBuilder() {
  //    test("org.elasticsearch.search.aggregations.bucket.range.IpRangeAggregationBuilder", 1, 1);
  //  }

  //  @Test
  //  public void testRange_RangeAggregationBuilder() {
  //    test("org.elasticsearch.search.aggregations.bucket.range.RangeAggregationBuilder", 1, 1);
  //  }

  // Some strange equivalence on fuzziness of parameters
  @Test
  public void testCompletion_CompletionSuggestionBuilder() {
    test("org.elasticsearch.search.suggest.completion.CompletionSuggestionBuilder", 1, 1);
  }

  @Test
  public void testSuggest_SuggestionBuilder() {
    test("org.elasticsearch.search.suggest.SuggestionBuilder", 1, 0);
  }
}
