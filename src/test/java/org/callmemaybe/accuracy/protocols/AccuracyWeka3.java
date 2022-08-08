package org.callmemaybe.accuracy.protocols;

import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
import org.junit.Test;

public class AccuracyWeka3 extends AbstractPrecisionRecallTestSuite {

  private static final String WEKA_3_SRC =
      "src/test/resources/src/weka-stable-3.8.0-sources";
  private static final String WEKA_3_BIN =
      "src/test/resources/src/weka-stable-3.8.0.jar";
  private static final String WEKA_3_DIR = "expected-tp/weka";

  public AccuracyWeka3() {
    super(WEKA_3_SRC, WEKA_3_BIN, WEKA_3_DIR);
  }

  @Test
  public void testPmml_DefineFunction() {
    test("weka.core.pmml.DefineFunction", 1, 1);
  }

  @Test
  public void testPmml_BuiltInMath() {
    test("weka.core.pmml.BuiltInMath", 1, 1);
  }

  @Test
  public void testClassification_Agrawal() {
    test("weka.datagenerators.classifiers.classification.Agrawal", 0, 0);
  }

  @Test
  public void testClassification_LED24() {
    test("weka.datagenerators.classifiers.classification.LED24", 0, 0);
  }

  @Test
  public void testClassification_RandomRBF() {
    test("weka.datagenerators.classifiers.classification.RandomRBF", 0, 0);
  }

  @Test
  public void testRegression_MexicanHat() {
    test("weka.datagenerators.classifiers.regression.MexicanHat", 0, 0);
  }

  @Test
  public void testRegression_Expression() {
    test("weka.datagenerators.classifiers.regression.Expression", 0, 0);
  }
}
