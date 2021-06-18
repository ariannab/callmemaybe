package org.memo.accuracy.equivalences.dataset;

import org.junit.Test;
import org.memo.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyColt1 extends AbstractPrecisionRecallTestSuite {

  private static final String COLT_1_SRC =
      "src/test/resources/src/colt-master/src";
  private static final String COLT_1_BIN =
      "src/test/resources/bin/colt-1.2.0.jar";
  private static final String COLT_1_GOAL_DIR = "expected-equivalences/colt";

  public AccuracyColt1() {
    super(COLT_1_SRC, COLT_1_BIN, COLT_1_GOAL_DIR);
  }

  //    @Test
  //    public void testBin_MightyStaticBin1D() {
  //        test("hep.aida.bin.MightyStaticBin1D", 1, 1);
  //    }

  //    @Test
  //    public void testBin_QuantileBin1D() {
  //        test("hep.aida.bin.QuantileBin1D", 1, 1);
  //    }

  @Test
  public void testAida_IHistogram2D() {
    test("hep.aida.IHistogram2D", 1, 0.333);
  }

  @Test
  public void testAida_IHistogram3D() {
    test("hep.aida.IHistogram3D", 1, 1);
  }

  @Test
  public void testColt_Timer() {
    test("cern.colt.Timer", 0.5, 1);
  }

  // Hard to interpret "except(s)".
  //    @Test
  //    public void testColt_Partitioning() {
  //        test("cern.colt.Partitioning", 1, 0.714);
  //    }

  //    @Test
  //    public void testMap_OpenIntObjectHashMap() {
  //        test("cern.colt.map.OpenIntObjectHashMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_AbstractIntDoubleMap() {
  //        test("cern.colt.map.AbstractIntDoubleMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_AbstractIntObjectMap() {
  //        test("cern.colt.map.AbstractIntObjectMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_OpenIntDoubleHashMap() {
  //        test("cern.colt.map.OpenIntDoubleHashMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_OpenIntIntHashMap() {
  //        test("cern.colt.map.OpenIntIntHashMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_AbstractLongObjectMap() {
  //        test("cern.colt.map.AbstractLongObjectMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_OpenDoubleIntHashMap() {
  //        test("cern.colt.map.OpenDoubleIntHashMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_OpenLongObjectHashMap() {
  //        test("cern.colt.map.OpenLongObjectHashMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_AbstractDoubleIntMap() {
  //        test("cern.colt.map.AbstractDoubleIntMap", 1, 1);
  //    }
  //
  //    @Test
  //    public void testMap_AbstractIntIntMap() {
  //        test("cern.colt.map.AbstractIntIntMap", 1, 1);
  //    }

  @Test
  public void testMatrix_ObjectMatrix2D() {
    test("cern.colt.matrix.ObjectMatrix2D", 1, 1);
  }

  //    @Test
  //    public void testLinalg_Property() {
  //        test("cern.colt.matrix.linalg.Property", 1, 1);
  //    }

  @Test
  public void testLinalg_Algebra() {
    test("cern.colt.matrix.linalg.Algebra", 1, 0.5);
  }

  @Test
  public void testMatrix_ObjectMatrix3D() {
    test("cern.colt.matrix.ObjectMatrix3D", 1, 1);
  }

  @Test
  public void testMatrix_ObjectMatrix1D() {
    test("cern.colt.matrix.ObjectMatrix1D", 1, 1);
  }

  // "A" is the matrix itself (this): it is specified in other parts of the documentation.
  @Test
  public void testMatrix_DoubleMatrix2D() {
    test("cern.colt.matrix.DoubleMatrix2D", 1, 0);
  }

  //    @Test
  //    public void testStat_Descriptive() {
  //        test("cern.jet.stat.Descriptive", 1, 1);
  //    }

  //    @Test
  //    public void testQuantile_Utils() {
  //        test("cern.jet.stat.quantile.Utils", 1, 1);
  //    }

  @Test
  public void testStat_Probability() {
    test("cern.jet.stat.Probability", 1, 0);
  }
}
