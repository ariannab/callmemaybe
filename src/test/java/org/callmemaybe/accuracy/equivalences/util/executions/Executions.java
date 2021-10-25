package org.callmemaybe.accuracy.equivalences.dataset.executions;

import org.junit.Test;
import org.callmemaybe.CallMeMaybe;

public class Executions {
  @Test
  public void matrix_DoubleMatrix2DTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "cern.colt.matrix.DoubleMatrix2D",
          "--class-dir",
          "/Users/arianna/callmemaybe/src/test/resources/bin/colt-1.2.0.jar",
          "--source-dir",
          "/Users/arianna/callmemaybe/src/test/resources/colt-master/src",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "cern.colt.matrix.DoubleMatrix2D_goal.json"
        });
  }
}
