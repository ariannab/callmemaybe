//package org.callmemaybe.accuracy.protocols;
//
//import org.callmemaybe.testlib.AbstractPrecisionRecallTestSuite;
//import org.junit.Test;
//
//public class AccuracyWeka3New extends AbstractPrecisionRecallTestSuite {
//
//    private static final String WEKA_3_SRC = "/Users/arianna/toradocu/src/test/resources/weka-stable-3.8.0-sources";
//    private static final String WEKA_3_BIN = "/Users/arianna/toradocu/src/test/resources/bin/weka-stable-3.8.0.jar";
//    private static final String WEKA_3_DIR = "expected-tp/weka-new";
//
//    public AccuracyWeka3New() {
//        super(WEKA_3_SRC, WEKA_3_BIN, WEKA_3_DIR);
//    }
//
//    @Test
//    public void testClassification_Agrawal() {
//        test("weka.datagenerators.classifiers.classification.Agrawal", 1, 1);
//    }
//
//    @Test
//    public void testClassification_RDG1() {
//        test("weka.datagenerators.classifiers.classification.RDG1", 1, 1);
//    }
//
//    @Test
//    public void testClassification_LED24() {
//        test("weka.datagenerators.classifiers.classification.LED24", 1, 1);
//    }
//
//    @Test
//    public void testClassification_BayesNet() {
//        test("weka.datagenerators.classifiers.classification.BayesNet", 1, 1);
//    }
//
//    @Test
//    public void testClassification_RandomRBF() {
//        test("weka.datagenerators.classifiers.classification.RandomRBF", 1, 1);
//    }
//
//    @Test
//    public void testRegression_MexicanHat() {
//        test("weka.datagenerators.classifiers.regression.MexicanHat", 1, 1);
//    }
//
//    @Test
//    public void testRegression_Expression() {
//        test("weka.datagenerators.classifiers.regression.Expression", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_CheckClassifier() {
//        test("weka.classifiers.CheckClassifier", 1, 1);
//    }
//
//    @Test
//    public void testMisc_InputMappedClassifierBeanInfo() {
//        test("weka.classifiers.misc.InputMappedClassifierBeanInfo", 1, 1);
//    }
//
//    @Test
//    public void testMisc_InputMappedClassifier() {
//        test("weka.classifiers.misc.InputMappedClassifier", 1, 1);
//    }
//
//    @Test
//    public void testMisc_SerializedClassifier() {
//        test("weka.classifiers.misc.SerializedClassifier", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_Evaluation() {
//        test("weka.classifiers.Evaluation", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_RandomizableParallelIteratedSingleClassifierEnhancer() {
//        test("weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_RandomizableMultipleClassifiersCombiner() {
//        test("weka.classifiers.RandomizableMultipleClassifiersCombiner", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_IteratedSingleClassifierEnhancer() {
//        test("weka.classifiers.IteratedSingleClassifierEnhancer", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_Sourcable() {
//        test("weka.classifiers.Sourcable", 1, 1);
//    }
//
//    @Test
//    public void testJ48_C45Split() {
//        test("weka.classifiers.trees.j48.C45Split", 1, 1);
//    }
//
//    @Test
//    public void testJ48_SplitCriterion() {
//        test("weka.classifiers.trees.j48.SplitCriterion", 1, 1);
//    }
//
//    @Test
//    public void testJ48_EntropySplitCrit() {
//        test("weka.classifiers.trees.j48.EntropySplitCrit", 1, 1);
//    }
//
//    @Test
//    public void testJ48_Stats() {
//        test("weka.classifiers.trees.j48.Stats", 1, 1);
//    }
//
//    @Test
//    public void testJ48_NoSplit() {
//        test("weka.classifiers.trees.j48.NoSplit", 1, 1);
//    }
//
//    @Test
//    public void testJ48_BinC45ModelSelection() {
//        test("weka.classifiers.trees.j48.BinC45ModelSelection", 1, 1);
//    }
//
//    @Test
//    public void testJ48_EntropyBasedSplitCrit() {
//        test("weka.classifiers.trees.j48.EntropyBasedSplitCrit", 1, 1);
//    }
//
//    @Test
//    public void testJ48_NBTreeSplit() {
//        test("weka.classifiers.trees.j48.NBTreeSplit", 1, 1);
//    }
//
//    @Test
//    public void testJ48_ClassifierTree() {
//        test("weka.classifiers.trees.j48.ClassifierTree", 1, 1);
//    }
//
//    @Test
//    public void testJ48_C45PruneableClassifierTree() {
//        test("weka.classifiers.trees.j48.C45PruneableClassifierTree", 1, 1);
//    }
//
//    @Test
//    public void testJ48_ModelSelection() {
//        test("weka.classifiers.trees.j48.ModelSelection", 1, 1);
//    }
//
//    @Test
//    public void testJ48_GainRatioSplitCrit() {
//        test("weka.classifiers.trees.j48.GainRatioSplitCrit", 1, 1);
//    }
//
//    @Test
//    public void testJ48_BinC45Split() {
//        test("weka.classifiers.trees.j48.BinC45Split", 1, 1);
//    }
//
//    @Test
//    public void testJ48_C45ModelSelection() {
//        test("weka.classifiers.trees.j48.C45ModelSelection", 1, 1);
//    }
//
//    @Test
//    public void testJ48_NBTreeClassifierTree() {
//        test("weka.classifiers.trees.j48.NBTreeClassifierTree", 1, 1);
//    }
//
//    @Test
//    public void testJ48_InfoGainSplitCrit() {
//        test("weka.classifiers.trees.j48.InfoGainSplitCrit", 1, 1);
//    }
//
//    @Test
//    public void testJ48_NBTreeModelSelection() {
//        test("weka.classifiers.trees.j48.NBTreeModelSelection", 1, 1);
//    }
//
//    @Test
//    public void testJ48_PruneableClassifierTree() {
//        test("weka.classifiers.trees.j48.PruneableClassifierTree", 1, 1);
//    }
//
//    @Test
//    public void testJ48_ClassifierSplitModel() {
//        test("weka.classifiers.trees.j48.ClassifierSplitModel", 1, 1);
//    }
//
//    @Test
//    public void testJ48_Distribution() {
//        test("weka.classifiers.trees.j48.Distribution", 1, 1);
//    }
//
//    @Test
//    public void testJ48_NBTreeNoSplit() {
//        test("weka.classifiers.trees.j48.NBTreeNoSplit", 1, 1);
//    }
//
//    @Test
//    public void testLmt_SimpleLinearRegression() {
//        test("weka.classifiers.trees.lmt.SimpleLinearRegression", 1, 1);
//    }
//
//    @Test
//    public void testLmt_LogisticBase() {
//        test("weka.classifiers.trees.lmt.LogisticBase", 1, 1);
//    }
//
//    @Test
//    public void testLmt_LMTNode() {
//        test("weka.classifiers.trees.lmt.LMTNode", 1, 1);
//    }
//
//    @Test
//    public void testLmt_ResidualSplit() {
//        test("weka.classifiers.trees.lmt.ResidualSplit", 1, 1);
//    }
//
//    @Test
//    public void testLmt_ResidualModelSelection() {
//        test("weka.classifiers.trees.lmt.ResidualModelSelection", 1, 1);
//    }
//
//    @Test
//    public void testTrees_RandomForest() {
//        test("weka.classifiers.trees.RandomForest", 1, 1);
//    }
//
//    @Test
//    public void testTrees_REPTree() {
//        test("weka.classifiers.trees.REPTree", 1, 1);
//    }
//
//    @Test
//    public void testTrees_J48() {
//        test("weka.classifiers.trees.J48", 1, 1);
//    }
//
//    @Test
//    public void testTrees_HoeffdingTree() {
//        test("weka.classifiers.trees.HoeffdingTree", 1, 1);
//    }
//
//    @Test
//    public void testTrees_M5P() {
//        test("weka.classifiers.trees.M5P", 1, 1);
//    }
//
//    @Test
//    public void testHt_NBNodeAdaptive() {
//        test("weka.classifiers.trees.ht.NBNodeAdaptive", 1, 1);
//    }
//
//    @Test
//    public void testHt_NominalConditionalSufficientStats() {
//        test("weka.classifiers.trees.ht.NominalConditionalSufficientStats", 1, 1);
//    }
//
//    @Test
//    public void testHt_ConditionalSufficientStats() {
//        test("weka.classifiers.trees.ht.ConditionalSufficientStats", 1, 1);
//    }
//
//    @Test
//    public void testHt_ActiveHNode() {
//        test("weka.classifiers.trees.ht.ActiveHNode", 1, 1);
//    }
//
//    @Test
//    public void testHt_LeafNode() {
//        test("weka.classifiers.trees.ht.LeafNode", 1, 1);
//    }
//
//    @Test
//    public void testHt_HNode() {
//        test("weka.classifiers.trees.ht.HNode", 1, 1);
//    }
//
//    @Test
//    public void testHt_Split() {
//        test("weka.classifiers.trees.ht.Split", 1, 1);
//    }
//
//    @Test
//    public void testHt_NBNode() {
//        test("weka.classifiers.trees.ht.NBNode", 1, 1);
//    }
//
//    @Test
//    public void testHt_InfoGainSplitMetric() {
//        test("weka.classifiers.trees.ht.InfoGainSplitMetric", 1, 1);
//    }
//
//    @Test
//    public void testHt_InactiveHNode() {
//        test("weka.classifiers.trees.ht.InactiveHNode", 1, 1);
//    }
//
//    @Test
//    public void testHt_SplitMetric() {
//        test("weka.classifiers.trees.ht.SplitMetric", 1, 1);
//    }
//
//    @Test
//    public void testHt_UnivariateNumericBinarySplit() {
//        test("weka.classifiers.trees.ht.UnivariateNumericBinarySplit", 1, 1);
//    }
//
//    @Test
//    public void testHt_SplitCandidate() {
//        test("weka.classifiers.trees.ht.SplitCandidate", 1, 1);
//    }
//
//    @Test
//    public void testHt_WeightMass() {
//        test("weka.classifiers.trees.ht.WeightMass", 1, 1);
//    }
//
//    @Test
//    public void testHt_UnivariateNominalMultiwaySplit() {
//        test("weka.classifiers.trees.ht.UnivariateNominalMultiwaySplit", 1, 1);
//    }
//
//    @Test
//    public void testHt_GaussianConditionalSufficientStats() {
//        test("weka.classifiers.trees.ht.GaussianConditionalSufficientStats", 1, 1);
//    }
//
//    @Test
//    public void testHt_GiniSplitMetric() {
//        test("weka.classifiers.trees.ht.GiniSplitMetric", 1, 1);
//    }
//
//    @Test
//    public void testHt_LearningNode() {
//        test("weka.classifiers.trees.ht.LearningNode", 1, 1);
//    }
//
//    @Test
//    public void testHt_SplitNode() {
//        test("weka.classifiers.trees.ht.SplitNode", 1, 1);
//    }
//
//    @Test
//    public void testM5_M5Base() {
//        test("weka.classifiers.trees.m5.M5Base", 1, 1);
//    }
//
//    @Test
//    public void testM5_Values() {
//        test("weka.classifiers.trees.m5.Values", 1, 1);
//    }
//
//    @Test
//    public void testM5_YongSplitInfo() {
//        test("weka.classifiers.trees.m5.YongSplitInfo", 1, 1);
//    }
//
//    @Test
//    public void testM5_PreConstructedLinearModel() {
//        test("weka.classifiers.trees.m5.PreConstructedLinearModel", 1, 1);
//    }
//
//    @Test
//    public void testM5_Impurity() {
//        test("weka.classifiers.trees.m5.Impurity", 1, 1);
//    }
//
//    @Test
//    public void testM5_CorrelationSplitInfo() {
//        test("weka.classifiers.trees.m5.CorrelationSplitInfo", 1, 1);
//    }
//
//    @Test
//    public void testM5_SplitEvaluate() {
//        test("weka.classifiers.trees.m5.SplitEvaluate", 1, 1);
//    }
//
//    @Test
//    public void testM5_RuleNode() {
//        test("weka.classifiers.trees.m5.RuleNode", 1, 1);
//    }
//
//    @Test
//    public void testM5_Rule() {
//        test("weka.classifiers.trees.m5.Rule", 1, 1);
//    }
//
//    @Test
//    public void testTrees_RandomTree() {
//        test("weka.classifiers.trees.RandomTree", 1, 1);
//    }
//
//    @Test
//    public void testTrees_DecisionStump() {
//        test("weka.classifiers.trees.DecisionStump", 1, 1);
//    }
//
//    @Test
//    public void testTrees_LMT() {
//        test("weka.classifiers.trees.LMT", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_BVDecompose() {
//        test("weka.classifiers.BVDecompose", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_SingleClassifierEnhancer() {
//        test("weka.classifiers.SingleClassifierEnhancer", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_CheckSource() {
//        test("weka.classifiers.CheckSource", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_IntervalEstimator() {
//        test("weka.classifiers.IntervalEstimator", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_UpdateableBatchProcessor() {
//        test("weka.classifiers.UpdateableBatchProcessor", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_UpdateableClassifier() {
//        test("weka.classifiers.UpdateableClassifier", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_AbstractClassifier() {
//        test("weka.classifiers.AbstractClassifier", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_BVDecomposeSegCVSub() {
//        test("weka.classifiers.BVDecomposeSegCVSub", 1, 1);
//    }
//
//    @Test
//    public void testMeta_Stacking() {
//        test("weka.classifiers.meta.Stacking", 1, 1);
//    }
//
//    @Test
//    public void testMeta_AdditiveRegression() {
//        test("weka.classifiers.meta.AdditiveRegression", 1, 1);
//    }
//
//    @Test
//    public void testMeta_RandomSubSpace() {
//        test("weka.classifiers.meta.RandomSubSpace", 1, 1);
//    }
//
//    @Test
//    public void testMeta_WeightedInstancesHandlerWrapper() {
//        test("weka.classifiers.meta.WeightedInstancesHandlerWrapper", 1, 1);
//    }
//
//    @Test
//    public void testMeta_AdaBoostM1() {
//        test("weka.classifiers.meta.AdaBoostM1", 1, 1);
//    }
//
//    @Test
//    public void testMeta_IterativeClassifierOptimizer() {
//        test("weka.classifiers.meta.IterativeClassifierOptimizer", 1, 1);
//    }
//
//    @Test
//    public void testMeta_Vote() {
//        test("weka.classifiers.meta.Vote", 1, 1);
//    }
//
//    @Test
//    public void testMeta_MultiClassClassifierUpdateable() {
//        test("weka.classifiers.meta.MultiClassClassifierUpdateable", 1, 1);
//    }
//
//    @Test
//    public void testMeta_RandomCommittee() {
//        test("weka.classifiers.meta.RandomCommittee", 1, 1);
//    }
//
//    @Test
//    public void testMeta_FilteredClassifier() {
//        test("weka.classifiers.meta.FilteredClassifier", 1, 1);
//    }
//
//    @Test
//    public void testMeta_AttributeSelectedClassifier() {
//        test("weka.classifiers.meta.AttributeSelectedClassifier", 1, 1);
//    }
//
//    @Test
//    public void testMeta_MultiScheme() {
//        test("weka.classifiers.meta.MultiScheme", 1, 1);
//    }
//
//    @Test
//    public void testMeta_LogitBoost() {
//        test("weka.classifiers.meta.LogitBoost", 1, 1);
//    }
//
//    @Test
//    public void testMeta_RandomizableFilteredClassifier() {
//        test("weka.classifiers.meta.RandomizableFilteredClassifier", 1, 1);
//    }
//
//    @Test
//    public void testMeta_ClassificationViaRegression() {
//        test("weka.classifiers.meta.ClassificationViaRegression", 1, 1);
//    }
//
//    @Test
//    public void testMeta_Bagging() {
//        test("weka.classifiers.meta.Bagging", 1, 1);
//    }
//
//    @Test
//    public void testMeta_MultiClassClassifier() {
//        test("weka.classifiers.meta.MultiClassClassifier", 1, 1);
//    }
//
//    @Test
//    public void testMeta_RegressionByDiscretization() {
//        test("weka.classifiers.meta.RegressionByDiscretization", 1, 1);
//    }
//
//    @Test
//    public void testMeta_CVParameterSelection() {
//        test("weka.classifiers.meta.CVParameterSelection", 1, 1);
//    }
//
//    @Test
//    public void testMeta_CostSensitiveClassifier() {
//        test("weka.classifiers.meta.CostSensitiveClassifier", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_ParallelMultipleClassifiersCombiner() {
//        test("weka.classifiers.ParallelMultipleClassifiersCombiner", 1, 1);
//    }
//
//    @Test
//    public void testNet_MarginCalculator() {
//        test("weka.classifiers.bayes.net.MarginCalculator", 1, 1);
//    }
//
//    @Test
//    public void testNet_ParentSet() {
//        test("weka.classifiers.bayes.net.ParentSet", 1, 1);
//    }
//
//    @Test
//    public void testSearch_SearchAlgorithm() {
//        test("weka.classifiers.bayes.net.search.SearchAlgorithm", 1, 1);
//    }
//
//    @Test
//    public void testCi_CISearchAlgorithm() {
//        test("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", 1, 1);
//    }
//
//    @Test
//    public void testCi_ICSSearchAlgorithm() {
//        test("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", 1, 1);
//    }
//
//    @Test
//    public void testLocal_K2() {
//        test("weka.classifiers.bayes.net.search.local.K2", 1, 1);
//    }
//
//    @Test
//    public void testLocal_GeneticSearch() {
//        test("weka.classifiers.bayes.net.search.local.GeneticSearch", 1, 1);
//    }
//
//    @Test
//    public void testLocal_LAGDHillClimber() {
//        test("weka.classifiers.bayes.net.search.local.LAGDHillClimber", 1, 1);
//    }
//
//    @Test
//    public void testLocal_RepeatedHillClimber() {
//        test("weka.classifiers.bayes.net.search.local.RepeatedHillClimber", 1, 1);
//    }
//
//    @Test
//    public void testLocal_SimulatedAnnealing() {
//        test("weka.classifiers.bayes.net.search.local.SimulatedAnnealing", 1, 1);
//    }
//
//    @Test
//    public void testLocal_HillClimber() {
//        test("weka.classifiers.bayes.net.search.local.HillClimber", 1, 1);
//    }
//
//    @Test
//    public void testLocal_TabuSearch() {
//        test("weka.classifiers.bayes.net.search.local.TabuSearch", 1, 1);
//    }
//
//    @Test
//    public void testLocal_LocalScoreSearchAlgorithm() {
//        test("weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm", 1, 1);
//    }
//
//    @Test
//    public void testLocal_TAN() {
//        test("weka.classifiers.bayes.net.search.local.TAN", 1, 1);
//    }
//
//    @Test
//    public void testLocal_Scoreable() {
//        test("weka.classifiers.bayes.net.search.local.Scoreable", 1, 1);
//    }
//
//    @Test
//    public void testFixed_NaiveBayes() {
//        test("weka.classifiers.bayes.net.search.fixed.NaiveBayes", 1, 1);
//    }
//
//    @Test
//    public void testFixed_FromFile() {
//        test("weka.classifiers.bayes.net.search.fixed.FromFile", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_K2() {
//        test("weka.classifiers.bayes.net.search.global.K2", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_GeneticSearch() {
//        test("weka.classifiers.bayes.net.search.global.GeneticSearch", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_RepeatedHillClimber() {
//        test("weka.classifiers.bayes.net.search.global.RepeatedHillClimber", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_SimulatedAnnealing() {
//        test("weka.classifiers.bayes.net.search.global.SimulatedAnnealing", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_HillClimber() {
//        test("weka.classifiers.bayes.net.search.global.HillClimber", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_GlobalScoreSearchAlgorithm() {
//        test("weka.classifiers.bayes.net.search.global.GlobalScoreSearchAlgorithm", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_TabuSearch() {
//        test("weka.classifiers.bayes.net.search.global.TabuSearch", 1, 1);
//    }
//
//    @Test
//    public void testGlobal_TAN() {
//        test("weka.classifiers.bayes.net.search.global.TAN", 1, 1);
//    }
//
//    @Test
//    public void testNet_VaryNode() {
//        test("weka.classifiers.bayes.net.VaryNode", 1, 1);
//    }
//
//    @Test
//    public void testNet_EditableBayesNet() {
//        test("weka.classifiers.bayes.net.EditableBayesNet", 1, 1);
//    }
//
//    @Test
//    public void testNet_BIFReader() {
//        test("weka.classifiers.bayes.net.BIFReader", 1, 1);
//    }
//
//    @Test
//    public void testNet_ADNode() {
//        test("weka.classifiers.bayes.net.ADNode", 1, 1);
//    }
//
//    @Test
//    public void testEstimate_BMAEstimator() {
//        test("weka.classifiers.bayes.net.estimate.BMAEstimator", 1, 1);
//    }
//
//    @Test
//    public void testEstimate_DiscreteEstimatorBayes() {
//        test("weka.classifiers.bayes.net.estimate.DiscreteEstimatorBayes", 1, 1);
//    }
//
//    @Test
//    public void testEstimate_SimpleEstimator() {
//        test("weka.classifiers.bayes.net.estimate.SimpleEstimator", 1, 1);
//    }
//
//    @Test
//    public void testEstimate_DiscreteEstimatorFullBayes() {
//        test("weka.classifiers.bayes.net.estimate.DiscreteEstimatorFullBayes", 1, 1);
//    }
//
//    @Test
//    public void testEstimate_MultiNomialBMAEstimator() {
//        test("weka.classifiers.bayes.net.estimate.MultiNomialBMAEstimator", 1, 1);
//    }
//
//    @Test
//    public void testEstimate_BayesNetEstimator() {
//        test("weka.classifiers.bayes.net.estimate.BayesNetEstimator", 1, 1);
//    }
//
//    @Test
//    public void testNet_GUI() {
//        test("weka.classifiers.bayes.net.GUI", 1, 1);
//    }
//
//    @Test
//    public void testNet_BayesNetGenerator() {
//        test("weka.classifiers.bayes.net.BayesNetGenerator", 1, 1);
//    }
//
//    @Test
//    public void testBayes_NaiveBayesUpdateable() {
//        test("weka.classifiers.bayes.NaiveBayesUpdateable", 1, 1);
//    }
//
//    @Test
//    public void testBayes_NaiveBayesMultinomialText() {
//        test("weka.classifiers.bayes.NaiveBayesMultinomialText", 1, 1);
//    }
//
//    @Test
//    public void testBayes_NaiveBayesMultinomial() {
//        test("weka.classifiers.bayes.NaiveBayesMultinomial", 1, 1);
//    }
//
//    @Test
//    public void testBayes_NaiveBayes() {
//        test("weka.classifiers.bayes.NaiveBayes", 1, 1);
//    }
//
//    @Test
//    public void testBayes_BayesNet() {
//        test("weka.classifiers.bayes.BayesNet", 1, 1);
//    }
//
//    @Test
//    public void testBayes_NaiveBayesMultinomialUpdateable() {
//        test("weka.classifiers.bayes.NaiveBayesMultinomialUpdateable", 1, 1);
//    }
//
//    @Test
//    public void testXml_XMLClassifier() {
//        test("weka.classifiers.xml.XMLClassifier", 1, 1);
//    }
//
//    @Test
//    public void testProducer_AbstractPMMLProducerHelper() {
//        test("weka.classifiers.pmml.producer.AbstractPMMLProducerHelper", 1, 1);
//    }
//
//    @Test
//    public void testProducer_LogisticProducerHelper() {
//        test("weka.classifiers.pmml.producer.LogisticProducerHelper", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_NeuralNetwork() {
//        test("weka.classifiers.pmml.consumer.NeuralNetwork", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_PMMLClassifier() {
//        test("weka.classifiers.pmml.consumer.PMMLClassifier", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_SupportVectorMachineModel() {
//        test("weka.classifiers.pmml.consumer.SupportVectorMachineModel", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_TreeModel() {
//        test("weka.classifiers.pmml.consumer.TreeModel", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_GeneralRegression() {
//        test("weka.classifiers.pmml.consumer.GeneralRegression", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_Regression() {
//        test("weka.classifiers.pmml.consumer.Regression", 1, 1);
//    }
//
//    @Test
//    public void testConsumer_RuleSetModel() {
//        test("weka.classifiers.pmml.consumer.RuleSetModel", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_MultipleClassifiersCombiner() {
//        test("weka.classifiers.MultipleClassifiersCombiner", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_ConditionalDensityEstimator() {
//        test("weka.classifiers.ConditionalDensityEstimator", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_RandomizableParallelMultipleClassifiersCombiner() {
//        test("weka.classifiers.RandomizableParallelMultipleClassifiersCombiner", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_RandomizableClassifier() {
//        test("weka.classifiers.RandomizableClassifier", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_AggregateableEvaluation() {
//        test("weka.classifiers.AggregateableEvaluation", 1, 1);
//    }
//
//    @Test
//    public void testLazy_LWL() {
//        test("weka.classifiers.lazy.LWL", 1, 1);
//    }
//
//    @Test
//    public void testLazy_KStar() {
//        test("weka.classifiers.lazy.KStar", 1, 1);
//    }
//
//    @Test
//    public void testKstar_KStarNumericAttribute() {
//        test("weka.classifiers.lazy.kstar.KStarNumericAttribute", 1, 1);
//    }
//
//    @Test
//    public void testKstar_KStarNominalAttribute() {
//        test("weka.classifiers.lazy.kstar.KStarNominalAttribute", 1, 1);
//    }
//
//    @Test
//    public void testKstar_KStarConstants() {
//        test("weka.classifiers.lazy.kstar.KStarConstants", 1, 1);
//    }
//
//    @Test
//    public void testKstar_KStarCache() {
//        test("weka.classifiers.lazy.kstar.KStarCache", 1, 1);
//    }
//
//    @Test
//    public void testKstar_KStarWrapper() {
//        test("weka.classifiers.lazy.kstar.KStarWrapper", 1, 1);
//    }
//
//    @Test
//    public void testLazy_IBk() {
//        test("weka.classifiers.lazy.IBk", 1, 1);
//    }
//
//    @Test
//    public void testRules_RuleStats() {
//        test("weka.classifiers.rules.RuleStats", 1, 1);
//    }
//
//    @Test
//    public void testRules_OneR() {
//        test("weka.classifiers.rules.OneR", 1, 1);
//    }
//
//    @Test
//    public void testRules_DecisionTable() {
//        test("weka.classifiers.rules.DecisionTable", 1, 1);
//    }
//
//    @Test
//    public void testRules_PART() {
//        test("weka.classifiers.rules.PART", 1, 1);
//    }
//
//    @Test
//    public void testRules_JRip() {
//        test("weka.classifiers.rules.JRip", 1, 1);
//    }
//
//    @Test
//    public void testRules_M5Rules() {
//        test("weka.classifiers.rules.M5Rules", 1, 1);
//    }
//
//    @Test
//    public void testRules_ZeroR() {
//        test("weka.classifiers.rules.ZeroR", 1, 1);
//    }
//
//    @Test
//    public void testRules_DecisionTableHashKey() {
//        test("weka.classifiers.rules.DecisionTableHashKey", 1, 1);
//    }
//
//    @Test
//    public void testPart_PruneableDecList() {
//        test("weka.classifiers.rules.part.PruneableDecList", 1, 1);
//    }
//
//    @Test
//    public void testPart_MakeDecList() {
//        test("weka.classifiers.rules.part.MakeDecList", 1, 1);
//    }
//
//    @Test
//    public void testPart_C45PruneableDecList() {
//        test("weka.classifiers.rules.part.C45PruneableDecList", 1, 1);
//    }
//
//    @Test
//    public void testPart_ClassifierDecList() {
//        test("weka.classifiers.rules.part.ClassifierDecList", 1, 1);
//    }
//
//    @Test
//    public void testRules_Rule() {
//        test("weka.classifiers.rules.Rule", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_SimpleLinearRegression() {
//        test("weka.classifiers.functions.SimpleLinearRegression", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_CheckKernel() {
//        test("weka.classifiers.functions.supportVector.CheckKernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_RegSMO() {
//        test("weka.classifiers.functions.supportVector.RegSMO", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_RBFKernel() {
//        test("weka.classifiers.functions.supportVector.RBFKernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_StringKernel() {
//        test("weka.classifiers.functions.supportVector.StringKernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_KernelEvaluation() {
//        test("weka.classifiers.functions.supportVector.KernelEvaluation", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_CachedKernel() {
//        test("weka.classifiers.functions.supportVector.CachedKernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_Puk() {
//        test("weka.classifiers.functions.supportVector.Puk", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_PrecomputedKernelMatrixKernel() {
//        test("weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_Kernel() {
//        test("weka.classifiers.functions.supportVector.Kernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_RegSMOImproved() {
//        test("weka.classifiers.functions.supportVector.RegSMOImproved", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_NormalizedPolyKernel() {
//        test("weka.classifiers.functions.supportVector.NormalizedPolyKernel", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_RegOptimizer() {
//        test("weka.classifiers.functions.supportVector.RegOptimizer", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_SMOset() {
//        test("weka.classifiers.functions.supportVector.SMOset", 1, 1);
//    }
//
//    @Test
//    public void testSupportVector_PolyKernel() {
//        test("weka.classifiers.functions.supportVector.PolyKernel", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_SMOreg() {
//        test("weka.classifiers.functions.SMOreg", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_LinearRegression() {
//        test("weka.classifiers.functions.LinearRegression", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_SGDText() {
//        test("weka.classifiers.functions.SGDText", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_SGD() {
//        test("weka.classifiers.functions.SGD", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_GaussianProcesses() {
//        test("weka.classifiers.functions.GaussianProcesses", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_Logistic() {
//        test("weka.classifiers.functions.Logistic", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_VotedPerceptron() {
//        test("weka.classifiers.functions.VotedPerceptron", 1, 1);
//    }
//
//    @Test
//    public void testNeural_NeuralMethod() {
//        test("weka.classifiers.functions.neural.NeuralMethod", 1, 1);
//    }
//
//    @Test
//    public void testNeural_NeuralNode() {
//        test("weka.classifiers.functions.neural.NeuralNode", 1, 1);
//    }
//
//    @Test
//    public void testNeural_SigmoidUnit() {
//        test("weka.classifiers.functions.neural.SigmoidUnit", 1, 1);
//    }
//
//    @Test
//    public void testNeural_LinearUnit() {
//        test("weka.classifiers.functions.neural.LinearUnit", 1, 1);
//    }
//
//    @Test
//    public void testNeural_NeuralConnection() {
//        test("weka.classifiers.functions.neural.NeuralConnection", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_SimpleLogistic() {
//        test("weka.classifiers.functions.SimpleLogistic", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_SMO() {
//        test("weka.classifiers.functions.SMO", 1, 1);
//    }
//
//    @Test
//    public void testFunctions_MultilayerPerceptron() {
//        test("weka.classifiers.functions.MultilayerPerceptron", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_RandomizableSingleClassifierEnhancer() {
//        test("weka.classifiers.RandomizableSingleClassifierEnhancer", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_RandomizableIteratedSingleClassifierEnhancer() {
//        test("weka.classifiers.RandomizableIteratedSingleClassifierEnhancer", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_ThresholdProducingMetric() {
//        test("weka.classifiers.evaluation.ThresholdProducingMetric", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_MarginCurve() {
//        test("weka.classifiers.evaluation.MarginCurve", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_Evaluation() {
//        test("weka.classifiers.evaluation.Evaluation", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_TwoClassStats() {
//        test("weka.classifiers.evaluation.TwoClassStats", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_ThresholdCurve() {
//        test("weka.classifiers.evaluation.ThresholdCurve", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_InformationRetrievalEvaluationMetric() {
//        test("weka.classifiers.evaluation.InformationRetrievalEvaluationMetric", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_ConfusionMatrix() {
//        test("weka.classifiers.evaluation.ConfusionMatrix", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_RegressionAnalysis() {
//        test("weka.classifiers.evaluation.RegressionAnalysis", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_CostCurve() {
//        test("weka.classifiers.evaluation.CostCurve", 1, 1);
//    }
//
//    @Test
//    public void testPrediction_HTML() {
//        test("weka.classifiers.evaluation.output.prediction.HTML", 1, 1);
//    }
//
//    @Test
//    public void testPrediction_Null() {
//        test("weka.classifiers.evaluation.output.prediction.Null", 1, 1);
//    }
//
//    @Test
//    public void testPrediction_PlainText() {
//        test("weka.classifiers.evaluation.output.prediction.PlainText", 1, 1);
//    }
//
//    @Test
//    public void testPrediction_XML() {
//        test("weka.classifiers.evaluation.output.prediction.XML", 1, 1);
//    }
//
//    @Test
//    public void testPrediction_AbstractOutput() {
//        test("weka.classifiers.evaluation.output.prediction.AbstractOutput", 1, 1);
//    }
//
//    @Test
//    public void testPrediction_CSV() {
//        test("weka.classifiers.evaluation.output.prediction.CSV", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_Prediction() {
//        test("weka.classifiers.evaluation.Prediction", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_InformationTheoreticEvaluationMetric() {
//        test("weka.classifiers.evaluation.InformationTheoreticEvaluationMetric", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_EvaluationMetricHelper() {
//        test("weka.classifiers.evaluation.EvaluationMetricHelper", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_AbstractEvaluationMetric() {
//        test("weka.classifiers.evaluation.AbstractEvaluationMetric", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_AggregateableEvaluation() {
//        test("weka.classifiers.evaluation.AggregateableEvaluation", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_NumericPrediction() {
//        test("weka.classifiers.evaluation.NumericPrediction", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_EvaluationUtils() {
//        test("weka.classifiers.evaluation.EvaluationUtils", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_IntervalBasedEvaluationMetric() {
//        test("weka.classifiers.evaluation.IntervalBasedEvaluationMetric", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_NominalPrediction() {
//        test("weka.classifiers.evaluation.NominalPrediction", 1, 1);
//    }
//
//    @Test
//    public void testEvaluation_StandardEvaluationMetric() {
//        test("weka.classifiers.evaluation.StandardEvaluationMetric", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_CostMatrix() {
//        test("weka.classifiers.CostMatrix", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_ParallelIteratedSingleClassifierEnhancer() {
//        test("weka.classifiers.ParallelIteratedSingleClassifierEnhancer", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_Classifier() {
//        test("weka.classifiers.Classifier", 1, 1);
//    }
//
//    @Test
//    public void testClassifiers_IterativeClassifier() {
//        test("weka.classifiers.IterativeClassifier", 1, 1);
//    }
//
//
//}
