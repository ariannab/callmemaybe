package org.toradocu.accuracy.equivalences.sbes14;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyGraphStream1 extends AbstractPrecisionRecallTestSuite {

  private static final String GRAPHSTREAM_SRC =
      "/Users/arianna/toradocu/src/test/resources/gs-core-1.3-sources/";
  private static final String GRAPHSTREAM_BIN =
      "/Users/arianna/toradocu/src/test/resources/bin/gs-core-1.3.jar";
  private static final String GRAPHSTREAM_GOAL_DIR = "expected-equivalences/gs";

  public AccuracyGraphStream1() {
    super(GRAPHSTREAM_SRC, GRAPHSTREAM_BIN, GRAPHSTREAM_GOAL_DIR);
  }

  // Void (push-add)
  @Test
  public void testGraph_Path() {
    test("org.graphstream.graph.Path", 1, 1);
  }

  //    @Test
  //    public void testGraph_Structure() {
  //        test("org.graphstream.graph.Structure", 1, 1);
  //    }

  @Test
  public void testGraph_Edge() {
    test("org.graphstream.graph.Edge", 1, 1);
  }

  //    @Test
  //    public void testGraph_Node() {
  //        test("org.graphstream.graph.Node", 1, 1);
  //    }

  // Void (addAttribute)
  @Test
  public void testGraph_Element() {
    test("org.graphstream.graph.Element", 1, 0.5);
  }

  //    @Test
  //    public void testImplementations_SingleNode() {
  //        test("org.graphstream.graph.implementations.SingleNode", 1, 1);
  //    }
  //
  //    @Test
  //    public void testImplementations_MultiNode() {
  //        test("org.graphstream.graph.implementations.MultiNode", 1, 1);
  //    }
  //
  //    @Test
  //    public void testGeom_Vector2() {
  //        test("org.graphstream.ui.geom.Vector2", 1, 1);
  //    }
  //
  //    @Test
  //    public void testGeom_Vector3() {
  //        test("org.graphstream.ui.geom.Vector3", 1, 1);
  //    }

}
