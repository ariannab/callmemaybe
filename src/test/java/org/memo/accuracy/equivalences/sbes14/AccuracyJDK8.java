package org.memo.accuracy.equivalences.sbes14;

import org.junit.Test;
import org.memo.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyJDK8 extends AbstractPrecisionRecallTestSuite {

  private static final String JDK_8_SRC =
      "src/test/resources/src/jdk8-sources/src/share/classes";
  private static final String JDK_8_BIN =
      "src/test/resources/bin/jdk8-2.9.0.jar";
  private static final String JDK_8_GOAL_DIR = "expected-equivalences/jdk";

  public AccuracyJDK8() {
    super(JDK_8_SRC, JDK_8_BIN, JDK_8_GOAL_DIR);
  }

  @Test
  public void testUtil_List() {
    test("java.util.List", 1, 0);
  }

  @Test
  public void testUtil_AbstractList() {
    test("java.util.AbstractList", 1, 0);
  }

  @Test
  public void testUtil_Vector() {
    test("java.util.Vector", 1, 1);
  }

  @Test
  public void testUtil_Stack() {
    test("java.util.Stack", 1, 1);
  }
}
