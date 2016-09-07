package org.toradocu;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;
import org.toradocu.testlib.TestCaseStats;

public class PrecisionRecallJGraphT extends AbstractPrecisionRecallTestSuite {

  private static final String JGRAPHT_SRC = "src/test/resources/src/jgrapht-core-0.9.2-sources";
  private static final String JGRAPHT_BIN = "src/test/resources/bin/jgrapht-core-0.9.2.jar";
  private static final String JGRAPHT_EXPECTED_DIR = "src/test/resources/JGraphT/";

  public PrecisionRecallJGraphT() {
    super(JGRAPHT_SRC, JGRAPHT_BIN, JGRAPHT_EXPECTED_DIR);
  }

  @Test
  public void abstractGraphTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.graph.AbstractGraph");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(0.75));
  }

  @Test
  public void graphTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.Graph");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(0.2));
  }

  @Test
  public void graphsTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.Graphs");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(0.5));
  }

  @Test
  public void linearGraphGeneratorTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.generate.LinearGraphGenerator");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(1.0));
  }

  @Test
  public void emptyGraphGeneratorTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.generate.EmptyGraphGenerator");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(1.0));
  }

  @Test
  public void kShortestPathsTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.alg.KShortestPaths");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), closeTo(0.666, PRECISION));
  }

  @Test
  public void directedSimpleCyclesTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.alg.cycle.DirectedSimpleCycles");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(1.0));
  }

  @Test
  public void abstractPathElementListTest() throws Exception {
    TestCaseStats stats = test("org.jgrapht.alg.AbstractPathElementList");
    assertThat(PRECISION_MESSAGE, stats.getPrecision(), is(1.0));
    assertThat(RECALL_MESSAGE, stats.getRecall(), is(0.5));
  }
}
