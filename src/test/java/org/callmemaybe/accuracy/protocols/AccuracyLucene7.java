package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyLucene7 extends AbstractPrecisionRecallTestSuite {

    private static final String LUCENE_7_SRC = "/Users/arianna/comment-clones/javadoclones/src/resources/src/lucene-core-7.2.1-sources/";
    private static final String LUCENE_7_BIN = "/Users/arianna/comment-clones/javadoclones/src/resources/bin/lucene-core-7.2.1.jar";
    private static final String LUCENE_7_DIR = "expected-tp/lucene";

    public AccuracyLucene7() {
        super(LUCENE_7_SRC, LUCENE_7_BIN, LUCENE_7_DIR);
    }

    @Test
    public void testAnalysis_CharArraySet() {
        test("org.apache.lucene.analysis.CharArraySet", 0, 0);
    }

    @Test
    public void testSpans_Spans() {
        test("org.apache.lucene.search.spans.Spans", 1, 1);
    }

    @Test
    public void testSearch_IndexSearcher() {
        test("org.apache.lucene.search.IndexSearcher", 1, 0);
    }


    @Test
    public void testIndex_IndexWriter() {
        test("org.apache.lucene.index.IndexWriter", 1, 1);
    }

    @Test
    public void testUtil_ByteBlockPool() {
        test("org.apache.lucene.util.ByteBlockPool", 1, 0);
    }

    @Test
    public void testIndex_IndexReader() {
        test("org.apache.lucene.index.IndexReader", 0, 0);
    }



    @Test
    public void testSearch_LeafFieldComparator() {
        test("org.apache.lucene.search.LeafFieldComparator", 1, 1);
    }


}
