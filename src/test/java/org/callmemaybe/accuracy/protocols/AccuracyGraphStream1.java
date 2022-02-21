package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyGraphStream1 extends AbstractPrecisionRecallTestSuite {

  private static final String GS_1_SRC =
      "/Users/arianna/toradocu/src/test/resources/gs-core-1.3-sources/";
  private static final String GS_1_BIN =
      "/Users/arianna/toradocu/src/test/resources/bin/gs-core-1.3.jar";
  private static final String GS_1_DIR = "expected-tp/graphstream";

  public AccuracyGraphStream1() {
    super(GS_1_SRC, GS_1_BIN, GS_1_DIR);
  }

  // At least deactivateEvents from this (advcl:if I think):
  @Test
  public void testGraphicGraph_StyleGroup() {
    test("org.graphstream.ui.graphicGraph.StyleGroup", 1, 0);
  }

  @Test
  public void testNet_URLSource() {
    test("org.graphstream.stream.net.URLSource", 1, 1);
  }

  @Test
  public void testFile_FileSink() {
    test("org.graphstream.stream.file.FileSink", 1, 1);
  }

  @Test
  public void testFile_FileSource() {
    test("org.graphstream.stream.file.FileSource", 1, 1);
  }

  // A nice protocol in class summary. Can we grab it?
  @Test
  public void testLayout_LayoutRunner() {
    test("org.graphstream.ui.layout.LayoutRunner", 1, 1);
  }

  // Only protected methods
  //    @Test
  //    public void testFile_FileSourceBase() {
  //        test("org.graphstream.stream.file.FileSourceBase", 1, 1);
  //    }

}
