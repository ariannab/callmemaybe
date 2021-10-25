package org.memo.accuracy.equivalences.dataset;

import org.junit.Test;
import org.memo.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyCommonsMath3 extends AbstractPrecisionRecallTestSuite {

  private static final String COMMONSMATH_3_SRC =
      "src/test/resources/src/commons-math3-3.6.1-src/src/main/java";
  private static final String COMMONSMATH_3_BIN = "src/test/resources/bin/commons-math3-3.6.1.jar";
  private static final String COMMONSMATH_3_GOAL_DIR = "expected-equivalences/math";

  public AccuracyCommonsMath3() {
    super(COMMONSMATH_3_SRC, COMMONSMATH_3_BIN, COMMONSMATH_3_GOAL_DIR);
  }

  // Void
  //    @Test
  //    public void testFitting_CurveFitter() {
  //        test("org.apache.commons.math3.fitting.CurveFitter", 0, 0);
  //    }

  // Equivalence on constructors
  //    @Test
  //    public void testLeastsquares_EvaluationRmsChecker() {
  //        test("org.apache.commons.math3.fitting.leastsquares.EvaluationRmsChecker", 0, 0);
  //    }

  // Equivalence on void
  //    @Test
  //    public void testFitting_WeightedObservedPoints() {
  //        test("org.apache.commons.math3.fitting.WeightedObservedPoints", 0, 0);
  //    }

  // Equivalence on constructors
  //    @Test
  //    public void testInterpolation_LoessInterpolator() {
  //        test("org.apache.commons.math3.analysis.interpolation.LoessInterpolator", 0, 0);
  //    }

  // Equivalence that should be expressed with a loop
  //    @Test
  //    public void testInterpolation_HermiteInterpolator() {
  //        test("org.apache.commons.math3.analysis.interpolation.HermiteInterpolator", 0, 0);
  //    }

  // Equivalence on constructors
  //    @Test
  //    public void testInterpolation_MicrosphereInterpolator() {
  //        test("org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator", 0, 0);
  //    }

  // Some constructors
  @Test
  public void testUtil_Decimal64() {
    test("org.apache.commons.math3.util.Decimal64", 1, 0);
  }

  // Void
  //    @Test
  //    public void testOptimization_Fitting_CurveFitter() {
  //        test("org.apache.commons.math3.optimization.fitting.CurveFitter", 1, 0);
  //    }

  // Composite equivalence
  //    @Test
  //    public void testDirect_AbstractSimplex() {
  //        test("org.apache.commons.math3.optimization.direct.AbstractSimplex", 0, 0);
  //    }

  // Constructors
  //    @Test
  //    public void testLinear_Array2DRowRealMatrix() {
  //        test("org.apache.commons.math3.linear.Array2DRowRealMatrix", 0, 0);
  //    }

  // Constructor - a very nice one!
  //    @Test
  //    public void testLinear_BlockFieldMatrix() {
  //        test("org.apache.commons.math3.linear.BlockFieldMatrix", 0, 0);
  //    }

  // Constructors
  //    @Test
  //    public void testLinear_Array2DRowFieldMatrix() {
  //        test("org.apache.commons.math3.linear.Array2DRowFieldMatrix", 0, 0);
  //    }

  // Constructors
  //    @Test
  //    public void testLinear_CholeskyDecomposition() {
  //        test("org.apache.commons.math3.linear.CholeskyDecomposition", 0, 0);
  //    }

  @Test
  public void testLinear_RealVector() {
    test("org.apache.commons.math3.linear.RealVector", 1, 0);
  }

  // Composite equivalence
  //    @Test
  //    public void testNoderiv_AbstractSimplex() {
  //        test("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", 0, 0);
  //    }

  // Constructors
  //    @Test
  //    public void testOde_FieldODEState() {
  //        test("org.apache.commons.math3.ode.FieldODEState", 0, 0);
  //    }

  //    @Test
  //    public void testOde_FieldODEStateAndDerivative() {
  //        test("org.apache.commons.math3.ode.FieldODEStateAndDerivative", 0, 0);
  //    }

  // Contains a similarity. With similarities it would be nice to ask the developer/tester "is it
  // fine to use method X
  // even though it differs from method Y for reason ABC ?"
  //    @Test
  //    public void testStat_StatUtils() {
  //        test("org.apache.commons.math3.stat.StatUtils", 0, 0);
  //    }

  // Here there is a way too strange (composite?) one...
  //    @Test
  //    public void testCorrelation_StorelessCovariance() {
  //        test("org.apache.commons.math3.stat.correlation.StorelessCovariance", 0, 0);
  //    }

  // Composite equivalence
  //    @Test
  //    public void testDescriptive_AbstractStorelessUnivariateStatistic() {
  //        test("org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
  // 0, 0);
  //    }

  // Equivalence on void
  //    @Test
  //    public void testDfp_DfpField() {
  //        test("org.apache.commons.math3.dfp.DfpField", 0, 0);
  //    }

  // Undefined parameters (p? q?)
  //    @Test
  //    public void testGeometry_Vector() {
  //        test("org.apache.commons.math3.geometry.Vector", 0, 0);
  //    }

  // There are some indefinite parameters
  @Test
  public void testThreed_FieldVector3D() {
    test("org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D", 1, 1);
  }

  // Few constructors and math relations!
  @Test
  public void testThreed_Rotation() {
    test("org.apache.commons.math3.geometry.euclidean.threed.Rotation", 0.571, 1);
  }

  @Test
  public void testThreed_FieldRotation() {
    test("org.apache.commons.math3.geometry.euclidean.threed.FieldRotation", 0.444, 1);
  }

  @Test
  public void testThreed_Vector3D() {
    test("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", 1, 1);
  }

  @Test
  public void testOned_Vector1D() {
    test("org.apache.commons.math3.geometry.euclidean.oned.Vector1D", 1, 1);
  }

  @Test
  public void testTwod_Vector2D() {
    test("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", 1, 1);
  }

  @Test
  public void testTwod_Circle() {
    test("org.apache.commons.math3.geometry.spherical.twod.Circle", 1, 0.5);
  }
}
