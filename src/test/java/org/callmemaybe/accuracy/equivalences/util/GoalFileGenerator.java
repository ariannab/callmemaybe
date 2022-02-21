package org.callmemaybe.accuracy.equivalences.util;

import org.callmemaybe.CallMeMaybe;
import org.junit.Test;

public class GoalFileGenerator {
  @Test
  public void fitting_CurveFitterTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.fitting.CurveFitter",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.fitting.CurveFitter_goal.json"
        });
  }

  @Test
  public void leastsquares_EvaluationRmsCheckerTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.fitting.leastsquares.EvaluationRmsChecker",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.fitting.leastsquares.EvaluationRmsChecker_goal.json"
        });
  }

  @Test
  public void fitting_WeightedObservedPointsTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.fitting.WeightedObservedPoints",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.fitting.WeightedObservedPoints_goal.json"
        });
  }

  @Test
  public void analysis_FunctionUtilsTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.analysis.FunctionUtils",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.analysis.FunctionUtils_goal.json"
        });
  }

  @Test
  public void solvers_BaseUnivariateSolverTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver_goal.json"
        });
  }

  @Test
  public void solvers_BracketedRealFieldUnivariateSolverTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.analysis.solvers.BracketedRealFieldUnivariateSolver",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.analysis.solvers.BracketedRealFieldUnivariateSolver_goal.json"
        });
  }

  @Test
  public void interpolation_LoessInterpolatorTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.analysis.interpolation.LoessInterpolator",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.analysis.interpolation.LoessInterpolator_goal.json"
        });
  }

  @Test
  public void interpolation_HermiteInterpolatorTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator_goal.json"
        });
  }

  @Test
  public void interpolation_MicrosphereInterpolatorTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator_goal.json"
        });
  }

  @Test
  public void util_MathArraysTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.util.MathArrays",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "goals/org.apache.commons.math3.util.MathArrays_goal.json"
        });
  }

  @Test
  public void util_CombinationsTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.util.Combinations",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.util.Combinations_goal.json"
        });
  }

  @Test
  public void util_Decimal64Test() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.util.Decimal64",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.util.Decimal64_goal.json"
        });
  }

  @Test
  public void complex_ComplexTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.complex.Complex",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.complex.Complex_goal.json"
        });
  }

  @Test
  public void fitting_optimization_CurveFitterTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.optimization.fitting.CurveFitter",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.optimization.fitting.CurveFitter_goal.json"
        });
  }

  @Test
  public void direct_AbstractSimplexTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.optimization.direct.AbstractSimplex",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.optimization.direct.AbstractSimplex_goal.json"
        });
  }

  @Test
  public void linear_EigenDecompositionTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.EigenDecomposition",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.EigenDecomposition_goal.json"
        });
  }

  @Test
  public void linear_Array2DRowRealMatrixTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.Array2DRowRealMatrix",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.Array2DRowRealMatrix_goal.json"
        });
  }

  @Test
  public void linear_BlockFieldMatrixTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.BlockFieldMatrix",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.BlockFieldMatrix_goal.json"
        });
  }

  @Test
  public void linear_Array2DRowFieldMatrixTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.Array2DRowFieldMatrix_goal.json"
        });
  }

  @Test
  public void linear_CholeskyDecompositionTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.CholeskyDecomposition",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.CholeskyDecomposition_goal.json"
        });
  }

  @Test
  public void linear_BlockRealMatrixTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.BlockRealMatrix",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.BlockRealMatrix_goal.json"
        });
  }

  @Test
  public void linear_RealVectorTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.RealVector",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.RealVector_goal.json"
        });
  }

  @Test
  public void linear_RectangularCholeskyDecompositionTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.linear.RectangularCholeskyDecomposition",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.linear.RectangularCholeskyDecomposition_goal.json"
        });
  }

  @Test
  public void noderiv_AbstractSimplexTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex_goal.json"
        });
  }

  @Test
  public void ode_FieldODEStateTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.ode.FieldODEState",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.ode.FieldODEState_goal.json"
        });
  }

  @Test
  public void ode_FieldODEStateAndDerivativeTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.ode.FieldODEStateAndDerivative",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.ode.FieldODEStateAndDerivative_goal.json"
        });
  }

  @Test
  public void events_FieldEventHandlerTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.ode.events.FieldEventHandler",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.ode.events.FieldEventHandler_goal.json"
        });
  }

  @Test
  public void events_EventHandlerTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.ode.events.EventHandler",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.ode.events.EventHandler_goal.json"
        });
  }

  @Test
  public void stat_StatUtilsTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.StatUtils",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.StatUtils_goal.json"
        });
  }

  @Test
  public void correlation_StorelessCovarianceTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.correlation.StorelessCovariance",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.correlation.StorelessCovariance_goal.json"
        });
  }

  @Test
  public void inference_KolmogorovSmirnovTestTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest_goal.json"
        });
  }

  @Test
  public void rank_PercentileTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.descriptive.rank.Percentile",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.descriptive.rank.Percentile_goal.json"
        });
  }

  @Test
  public void rank_PSquarePercentileTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.descriptive.rank.PSquarePercentile",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.descriptive.rank.PSquarePercentile_goal.json"
        });
  }

  @Test
  public void descriptive_AbstractStorelessUnivariateStatisticTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic_goal.json"
        });
  }

  @Test
  public void regression_RegressionResultsTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.stat.regression.RegressionResults",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.stat.regression.RegressionResults_goal.json"
        });
  }

  @Test
  public void dfp_DfpFieldTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.dfp.DfpField",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.dfp.DfpField_goal.json"
        });
  }

  @Test
  public void geometry_VectorTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.Vector",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.Vector_goal.json"
        });
  }

  @Test
  public void threed_FieldVector3DTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D_goal.json"
        });
  }

  @Test
  public void threed_RotationTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.euclidean.threed.Rotation",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.euclidean.threed.Rotation_goal.json"
        });
  }

  @Test
  public void threed_FieldRotationTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation_goal.json"
        });
  }

  @Test
  public void threed_Vector3DTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.euclidean.threed.Vector3D",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.euclidean.threed.Vector3D_goal.json"
        });
  }

  @Test
  public void oned_Vector1DTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.euclidean.oned.Vector1D",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.euclidean.oned.Vector1D_goal.json"
        });
  }

  @Test
  public void twod_Vector2DTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.euclidean.twod.Vector2D",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.euclidean.twod.Vector2D_goal.json"
        });
  }

  @Test
  public void oned_S1PointTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.spherical.oned.S1Point",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.spherical.oned.S1Point_goal.json"
        });
  }

  @Test
  public void twod_CircleTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.spherical.twod.Circle",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.spherical.twod.Circle_goal.json"
        });
  }

  @Test
  public void twod_S2PointTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.geometry.spherical.twod.S2Point",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.geometry.spherical.twod.S2Point_goal.json"
        });
  }

  @Test
  public void random_CorrelatedRandomVectorGeneratorTest() {
    CallMeMaybe.main(
        new String[] {
          "--target-class",
          "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator",
          "--class-dir",
          "src/test/resources/bin/commons-math3-3.6.1.jar",
          "--source-dir",
          "src/test/resources/src/commons-math3-3.6.1-src/src/main/java",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator_goal.json"
        });
  }
}
