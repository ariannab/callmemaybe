package org.toradocu.accuracy.equivalences.dataset;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;

public class AccuracyWeka3 extends AbstractPrecisionRecallTestSuite {
  private static final String WEKA_3_SRC = "src/test/resources/weka-stable-3.8.0-sources";
  private static final String WEKA_3_BIN = "src/test/resources/bin/weka-stable-3.8.0.jar";
  private static final String WEKA_3_GOAL_DIR = "expected-equivalences/weka";

  public AccuracyWeka3() {
    super(WEKA_3_SRC, WEKA_3_BIN, WEKA_3_GOAL_DIR);
  }

  //    @Test
  //    public void testAssociations_FPGrowth() {
  //        test("weka.associations.FPGrowth", 1, 1);
  //    }
  //
  //    @Test
  //    public void testAssociations_FilteredAssociator() {
  //        test("weka.associations.FilteredAssociator", 1, 1);
  //    }
  //
  //    @Test
  //    public void testAssociations_AssociationRulesProducer() {
  //        test("weka.associations.AssociationRulesProducer", 1, 1);
  //    }
  //
  //    @Test
  //    public void testAssociations_Apriori() {
  //        test("weka.associations.Apriori", 1, 1);
  //    }

  //    @Test
  //    public void testCore_Instances() {
  //        test("weka.core.Instances", 1, 1);
  //    }
  //
  //    @Test
  //    public void testCore_Copyable() {
  //        test("weka.core.Copyable", 1, 1);
  //    }

  @Test
  public void testCore_BinarySparseInstance() {
    test("weka.core.BinarySparseInstance", 1, 0);
  }

  @Test
  public void testXml_XMLSerializationMethodHandler() {
    test("weka.core.xml.XMLSerializationMethodHandler", 0, 1);
  }

  //    @Test
  //    public void testPmml_Apply() {
  //        test("weka.core.pmml.Apply", 1, 1);
  //    }

  //    @Test
  //    public void testPmml_Expression() {
  //        test("weka.core.pmml.Expression", 1, 1);
  //    }

  //    @Test
  //    public void testPmml_Array() {
  //        test("weka.core.pmml.Array", 1, 1);
  //    }

  @Test
  public void testCore_Instance() {
    test("weka.core.Instance", 0, 0);
  }

  //    @Test
  //    public void testNeighboursearch_CoverTree() {
  //        test("weka.core.neighboursearch.CoverTree", 1, 1);
  //    }
  //
  //    @Test
  //    public void testCore_BatchPredictor() {
  //        test("weka.core.BatchPredictor", 1, 1);
  //    }

  @Test
  public void testCore_DenseInstance() {
    test("weka.core.DenseInstance", 1, 1);
  }

  //    @Test
  //    public void testMatrix_Matrix() {
  //        test("weka.core.matrix.Matrix", 1, 1);
  //    }

  @Test
  public void testExperiment_Stats() {
    test("weka.experiment.Stats", 1, 1);
  }

  //    @Test
  //    public void testJ48_GainRatioSplitCrit() {
  //        test("weka.classifiers.trees.j48.GainRatioSplitCrit", 1, 1);
  //    }
  //
  //    @Test
  //    public void testJ48_InfoGainSplitCrit() {
  //        test("weka.classifiers.trees.j48.InfoGainSplitCrit", 1, 1);
  //    }

}
