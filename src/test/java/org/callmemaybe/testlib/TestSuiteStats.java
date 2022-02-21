package org.callmemaybe.testlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.callmemaybe.extractor.JavadocComment;
import org.callmemaybe.util.Stats;

/**
 * TestSuiteStats computes the mean and standard deviation of the precision and recall of a
 * collection of testStats.
 */
class TestSuiteStats {

  /** A list of statistics for individual test cases in a test suite. */
  private final List<Stats> testStats = Collections.synchronizedList(new ArrayList<>());

  /**
   * Adds a test case to the list of test cases used to compute statistics for the test suite. Added
   * test cases are not incorporated into the test suite statistics until computeResults is called.
   *
   * @param stats the statistics for the test case
   */
  void addStats(Stats stats) {
    testStats.add(stats);
  }

  /**
   * Returns the average precision of the testStats.
   *
   * @return the average precision of the testStats
   */
  double getAvgPrecision(JavadocComment.Kind kind) {
    final double sum = testStats.stream().mapToDouble(stats -> stats.getPrecision(kind)).sum();
    return sum / testStats.size();
  }

  /**
   * Returns the average recall of the testStats.
   *
   * @return the average recall of the testStats
   */
  double getAvgRecall(JavadocComment.Kind kind) {
    final double sum = testStats.stream().mapToDouble(stats -> stats.getRecall(kind)).sum();
    return sum / testStats.size();
  }

  double getOverallRecall(JavadocComment.Kind kind) {
    return testStats.stream().mapToDouble(Stats::getCorrectEqTranslations).sum()
        / ((testStats.stream().mapToDouble(Stats::getCorrectEqTranslations).sum()
            + testStats.stream().mapToDouble(Stats::getWrongEqTranslations).sum()
            + testStats.stream().mapToDouble(Stats::getMissingEqTranslations).sum()));
  }

  double getOverallPrecision(JavadocComment.Kind kind) {
    return testStats.stream().mapToDouble(Stats::getCorrectEqTranslations).sum()
        / (testStats.stream().mapToDouble(Stats::getCorrectEqTranslations).sum()
            + testStats.stream().mapToDouble(Stats::getWrongEqTranslations).sum()
            + testStats.stream().mapToDouble(Stats::getUnexpectedEqTranslations).sum());
  }
  /**
   * Returns the total number of conditions in the testStats.
   *
   * @return the total number of conditions in the testStats
   */
  int getTotalNumConditions() {
    return testStats.stream().mapToInt(Stats::numberOfConditions).sum();
  }

  int getTotalCorrectTranslation() {
    return testStats.stream().mapToInt(Stats::getCorrectEqTranslations).sum();
  }

  int getTotalMissingTranslation() {
    return testStats.stream().mapToInt(Stats::getMissingEqTranslations).sum();
  }

  int getTotalWrongTranslation() {
    return testStats.stream().mapToInt(Stats::getWrongEqTranslations).sum();
  }

  int getTotalUnexpectedTranslation() {
    return testStats.stream().mapToInt(Stats::getUnexpectedEqTranslations).sum();
  }
}
