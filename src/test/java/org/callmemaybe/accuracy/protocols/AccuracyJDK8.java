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
  }}
