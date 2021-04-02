package org.memo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.memo.MeMo;
import org.memo.extractor.JavadocComment;
import org.memo.output.util.EquivalenceOutput;
import org.memo.output.util.JsonOutput;
import org.memo.output.util.ReturnTagOutput;
import org.memo.output.util.TagOutput;

/**
 * Represents MeMo precision/recall for a given Java element (for example, it can be a class or
 * a method). The Java element is only referred by its name and is used only to output the collected
 * statistics.
 */
public class Stats {

  /** Java element (for example a class or method name) this statistics refer to. */
  private final String identifier;

  /** Number of @throws conditions correctly translated by MeMo. */
  private int correctThrowsTranslations = 0;
  /** Number of @throws conditions wrongly translated by MeMo. */
  private int wrongThrowsTranslations = 0;
  /** Number of @throws conditions unexpectedly translated by MeMo. */
  private int unexpectedThrowsTranslations = 0;
  /** Number of @throws conditions not translated at all by MeMo. */
  private int missingThrowsTranslations = 0;

  /** Number of @param conditions correctly translated by MeMo. */
  private int correctParamTranslations = 0;
  /** Number of @param conditions wrongly translated by MeMo. */
  private int wrongParamTranslations = 0;
  /** Number of @param conditions unexpectedly translated by MeMo. */
  private int unexpectedParamTranslations = 0;
  /** Number of @param conditions not translated at all by MeMo. */
  private int missingParamTranslations = 0;

  /** Number of @return conditions correctly translated by MeMo (true positives). */
  private int correctReturnTranslations = 0;
  /** Number of @return conditions wrongly translated by MeMo (false positives). */
  private int wrongReturnTranslations = 0;
  /** Number of @return conditions unexpectedly translated by MeMo. */
  private int unexpectedReturnTranslations = 0;
  /** Number of @return conditions not translated at all by MeMo (false negatives). */
  private int missingReturnTranslations = 0;

  /** Number of equivalence conditions correctly translated by MeMo (true positives). */
  private int correctEqTranslations = 0;
  /** Number of equivalence conditions wrongly translated by MeMo (false positives). */
  private int wrongEqTranslations = 0;
  /** Number of equivalence conditions unexpectedly translated by MeMo. */
  private int unexpectedEqTranslations = 0;
  /** Number of equivalence conditions not translated at all by MeMo (false negatives). */
  private int missingEqTranslations = 0;

  /**
   * Creates new stats for a given element with specified identifier. For example, identifier could
   * be a class name or a method name.
   *
   * @param identifier a string used in the output to identify of what these statistics are about
   */
  private Stats(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Returns the precision for the given kind of tag.
   *
   * @param kind the kind of the tag
   * @return the precision for the given kind of tag
   */
  public double getPrecision(JavadocComment.Kind kind) {
    int translated, wrong;
    switch (kind) {
      case THROWS:
        wrong = unexpectedThrowsTranslations + wrongThrowsTranslations;
        translated = correctThrowsTranslations + wrong;
        return translated == 0 ? 1 : correctThrowsTranslations / (double) translated;
      case PARAM:
        wrong = unexpectedParamTranslations + wrongParamTranslations;
        translated = correctParamTranslations + wrong;
        return translated == 0 ? 1 : correctParamTranslations / (double) translated;
      case RETURN:
        wrong = unexpectedReturnTranslations + wrongReturnTranslations;
        translated = correctReturnTranslations + wrong;
        return translated == 0 ? 1 : correctReturnTranslations / (double) translated;
      case FREETEXT:
        wrong = unexpectedEqTranslations + wrongEqTranslations;
        translated = correctEqTranslations + wrong;
        return translated == 0 ? 1 : correctEqTranslations / (double) translated;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Returns the recall for the specified tag kind.
   *
   * @param kind the kind of the tag
   * @return the recall for the specified {@code JavadocComment.Kind}
   */
  public double getRecall(JavadocComment.Kind kind) {
    final int conditions = numberOfConditions(kind);
    switch (kind) {
      case THROWS:
        return conditions == 0 ? 1 : correctThrowsTranslations / (double) conditions;
      case PARAM:
        return conditions == 0 ? 1 : correctParamTranslations / (double) conditions;
      case RETURN:
        return conditions == 0 ? 1 : correctReturnTranslations / (double) conditions;
      case FREETEXT:
        return conditions == 0 ? 1 : correctEqTranslations / (double) conditions;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Return the total number of conditions for a given tag kind.
   *
   * @return the number of conditions for the given {@code JavadocComment.Kind}
   */
  private int numberOfConditions(JavadocComment.Kind kind) {
    switch (kind) {
      case THROWS:
        return correctThrowsTranslations + wrongThrowsTranslations + missingThrowsTranslations;
      case PARAM:
        return correctParamTranslations + wrongParamTranslations + missingParamTranslations;
      case RETURN:
        return correctReturnTranslations + wrongReturnTranslations + missingReturnTranslations;
      case FREETEXT:
        return correctEqTranslations + wrongEqTranslations + missingEqTranslations;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Return the total number of conditions from @param, @return, and @throws tags. The return value
   * includes correct, wrong, missing, and unexpected specifications.
   *
   * @return the total number of conditions from @param, @return, and @throws tags
   */
  public int numberOfConditions() {
    return numberOfCorrectTranslations()
        + numberOfWrongTranslations()
        + numberOfMissingTranslations()
        + numberOfUnexpectedTranslations();
  }

  /**
   * Return the total number of correct translations from @param, @return, and @throws tags.
   *
   * @return the total number of correct translations
   */
  private int numberOfCorrectTranslations() {
    return correctParamTranslations
        + correctThrowsTranslations
        + correctReturnTranslations
        + correctEqTranslations;
  }

  /**
   * Return the total number of wrong translations from @param, @return, and @throws tags.
   *
   * @return the total number of wrong translations
   */
  private int numberOfWrongTranslations() {
    return wrongParamTranslations
        + wrongThrowsTranslations
        + wrongReturnTranslations
        + wrongEqTranslations;
  }

  /**
   * Return the total number of missing translations from @param, @return, and @throws tags.
   *
   * @return the total number of missing translations
   */
  private int numberOfMissingTranslations() {
    return missingParamTranslations
        + missingThrowsTranslations
        + missingReturnTranslations
        + missingEqTranslations;
  }

  /**
   * Return the total number of unexpected translations from @param, @return, and @throws tags.
   *
   * @return the number of unexpected conditions
   */
  private int numberOfUnexpectedTranslations() {
    return unexpectedParamTranslations
        + unexpectedThrowsTranslations
        + unexpectedReturnTranslations
        + unexpectedEqTranslations;
  }

  /**
   * Increments the number of correct translations produced by MeMo by 1.
   *
   * @param kind the kind of tag for which increment the number of correct translations
   */
  private void addCorrectTranslation(JavadocComment.Kind kind) {
    switch (kind) {
      case THROWS:
        ++correctThrowsTranslations;
        break;
      case PARAM:
        ++correctParamTranslations;
        break;
      case RETURN:
        ++correctReturnTranslations;
        break;
      case FREETEXT:
        ++correctEqTranslations;
        break;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Increments the number of wrong translations produced by MeMo by 1.
   *
   * @param kind the kind of tag for which increment the number of wrong translations
   */
  private void addWrongTranslation(JavadocComment.Kind kind) {
    switch (kind) {
      case THROWS:
        ++wrongThrowsTranslations;
        break;
      case PARAM:
        ++wrongParamTranslations;
        break;
      case RETURN:
        ++wrongReturnTranslations;
        break;
      case FREETEXT:
        ++wrongEqTranslations;
        break;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Increments the number of missing translations produced by MeMo by 1.
   *
   * @param kind the kind of tag for which increment the number of missing translations
   */
  private void addMissingTranslation(JavadocComment.Kind kind) {
    switch (kind) {
      case THROWS:
        ++missingThrowsTranslations;
        break;
      case PARAM:
        ++missingParamTranslations;
        break;
      case RETURN:
        ++missingReturnTranslations;
        break;
      case FREETEXT:
        ++missingEqTranslations;
        break;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Increments the number of unexpected translations produced by MeMo by 1.
   *
   * @param kind the kind of tag for which increment the number of missing translations
   */
  private void addUnexpectedTranslation(JavadocComment.Kind kind) {
    switch (kind) {
      case THROWS:
        ++unexpectedThrowsTranslations;
        break;
      case PARAM:
        ++unexpectedParamTranslations;
        break;
      case RETURN:
        ++unexpectedReturnTranslations;
        break;
      case FREETEXT:
        ++unexpectedEqTranslations;
        break;
      default:
        throw new IllegalStateException("Unsupported JavadocComment.Kind " + kind);
    }
  }

  /**
   * Returns the representation of this object as comma-separated values.
   *
   * @return the representation of this object as comma-separated values
   */
  public String asCSV() {
    final String SEPARATOR = ",";
    return "\""
        + identifier
        + "\""
        + SEPARATOR
        + MeMo.configuration.getDistanceThreshold()
        + SEPARATOR
        + MeMo.configuration.getWordRemovalCost()
        + SEPARATOR
        + correctThrowsTranslations
        + SEPARATOR
        + wrongThrowsTranslations
        + SEPARATOR
        + unexpectedThrowsTranslations
        + SEPARATOR
        + missingThrowsTranslations
        + SEPARATOR
        + correctParamTranslations
        + SEPARATOR
        + wrongParamTranslations
        + SEPARATOR
        + unexpectedParamTranslations
        + SEPARATOR
        + missingParamTranslations
        + SEPARATOR
        + correctReturnTranslations
        + SEPARATOR
        + wrongReturnTranslations
        + SEPARATOR
        + unexpectedReturnTranslations
        + SEPARATOR
        + missingReturnTranslations;
  }

  /**
   * Compares the given {@code actualMethodList} with {@code expectedMethodList}. This method is
   * used to generate statistics (precision and recall) of MeMo for each method in {@code
   * actualMethodList}.
   *
   * @param actualMethodList methods with tags translated by MeMo
   * @param expectedMethodList methods with tags manually translated
   * @return statistics for each method of the given lists
   * @throws IllegalArgumentException if {@code actualMethodList} and {@code expectedMethodList} are
   *     not of the same size
   */
  public static List<Stats> getStats(
      List<JsonOutput> actualMethodList, List<JsonOutput> expectedMethodList) {

    if (actualMethodList.size() != expectedMethodList.size()) {
      throw new IllegalArgumentException(
          "Actual and expected method list should be of the same size.");
    }

    List<Stats> stats = new ArrayList<>();
    for (int methodIndex = 0; methodIndex < expectedMethodList.size(); methodIndex++) {
      JsonOutput actualMethod = actualMethodList.get(methodIndex);
      JsonOutput expectedMethod = expectedMethodList.get(methodIndex);

      Stats methodStats =
          new Stats(actualMethod.containingClass.getQualifiedName() + "." + actualMethod.signature);
      collectStats(
          methodStats,
          actualMethod.throwsTags,
          expectedMethod.throwsTags,
          JavadocComment.Kind.THROWS);
      collectStats(
          methodStats, actualMethod.paramTags, expectedMethod.paramTags, JavadocComment.Kind.PARAM);

      List<ReturnTagOutput> actualMethodReturnTag = new ArrayList<>();
      List<ReturnTagOutput> expectedMethodReturnTag = new ArrayList<>();
      actualMethodReturnTag.add(actualMethod.returnTag);
      expectedMethodReturnTag.add(expectedMethod.returnTag);
      collectStats(
          methodStats, actualMethodReturnTag, expectedMethodReturnTag, JavadocComment.Kind.RETURN);

      stats.add(methodStats);
    }
    return stats;
  }

  /**
   * Compares the given {@code actualMethodList} with {@code expectedMethodList}. This method is
   * used to generate statistics (precision and recall) of MeMo for each method in {@code
   * actualMethodList}.
   *
   * @param actualMethodList methods with tags translated by MeMo
   * @param expectedMethodList methods with tags manually translated
   * @return statistics for each method of the given lists
   * @throws IllegalArgumentException if {@code actualMethodList} and {@code expectedMethodList} are
   *     not of the same size
   */
  public static List<Stats> getEqStats(
      Map<String, JsonOutput> actualMethodList, Map<String, JsonOutput> expectedMethodList) {

    if (actualMethodList.size() != expectedMethodList.size()) {
      throw new IllegalArgumentException(
          "Actual and expected method list should be of the same size.");
    }

    List<Stats> stats = new ArrayList<>();
    // for (int methodIndex = 0; methodIndex < expectedMethodList.size(); methodIndex++) {
    for (String signature : actualMethodList.keySet()) {

      JsonOutput actualMethod = actualMethodList.get(signature);
      JsonOutput expectedMethod = expectedMethodList.get(signature);

      Stats methodStats =
          new Stats(actualMethod.containingClass.getQualifiedName() + "." + actualMethod.signature);
      collectEqStats(
          methodStats,
          actualMethod.equivalence,
          expectedMethod.equivalence,
          JavadocComment.Kind.FREETEXT);

      stats.add(methodStats);
    }
    return stats;
  }

  /**
   * Compares the given {@code actualMethodList} with {@code expectedMethodList}. This method is
   * used to generate statistics (precision and recall) of MeMo for each method in {@code
   * actualMethodList}. The statistics are aggregated per class, we assume that the {@code
   * actualMethodList} contains methods belonging to one class.
   *
   * @param targetClass the class for which collect statistics
   * @param actualMethodList methods with tags translated by MeMo
   * @param expectedMethodList methods with tags manually translated
   * @param output the output message to be populated
   * @return statistics for each method of the given lists, aggregated per class
   * @throws IllegalArgumentException if {@code actualMethodList} and {@code expectedMethodList} are
   *     not of the same size
   */
  public static Stats getStats(
      String targetClass,
      List<JsonOutput> actualMethodList,
      List<JsonOutput> expectedMethodList,
      StringBuilder output) {

    if (actualMethodList.size() != expectedMethodList.size()) {
      throw new IllegalArgumentException(
          "Actual and expected method list should be of the same size.");
    }

    Stats stats = new Stats(targetClass);
    for (int methodIndex = 0; methodIndex < expectedMethodList.size(); methodIndex++) {
      JsonOutput actualMethod = actualMethodList.get(methodIndex);
      JsonOutput expectedMethod = expectedMethodList.get(methodIndex);

      List<ReturnTagOutput> actualMethodReturnTag = new ArrayList<>();
      List<ReturnTagOutput> expectedMethodReturnTag = new ArrayList<>();
      actualMethodReturnTag.add(actualMethod.returnTag);
      expectedMethodReturnTag.add(expectedMethod.returnTag);

      output
          .append(
              collectStats(
                  stats,
                  actualMethod.throwsTags,
                  expectedMethod.throwsTags,
                  JavadocComment.Kind.THROWS))
          .append(
              collectStats(
                  stats,
                  actualMethod.paramTags,
                  expectedMethod.paramTags,
                  JavadocComment.Kind.PARAM))
          .append(
              collectStats(
                  stats,
                  actualMethodReturnTag,
                  expectedMethodReturnTag,
                  JavadocComment.Kind.RETURN));
    }
    return stats;
  }

  private static StringBuilder collectStats(
      Stats stats,
      List<? extends TagOutput> actualTags,
      List<? extends TagOutput> expectedTags,
      JavadocComment.Kind kind) {

    final StringBuilder outputMessage = new StringBuilder();
    final TagOutput[] actualTagsArray = actualTags.toArray(new TagOutput[actualTags.size()]);
    final TagOutput[] expectedTagsArray = expectedTags.toArray(new TagOutput[expectedTags.size()]);
    for (int tagIndex = 0; tagIndex < actualTagsArray.length; tagIndex++) {
      TagOutput actualTag = actualTagsArray[tagIndex];
      TagOutput expectedTag = expectedTagsArray[tagIndex];

      if (actualTag != null && expectedTag != null) {
        String expectedConditionNoSpace = expectedTag.getCondition().replaceAll("\\n ", "");
        String actualConditionNoSpace = actualTag.getCondition().replaceAll("\\n ", "");

        if (actualConditionNoSpace.equals(expectedConditionNoSpace)) {
          if (!expectedConditionNoSpace.isEmpty()) {
            stats.addCorrectTranslation(kind);
            outputMessage.append("Correct ");
          } else {
            continue; // No output message when MeMo does not output anything as expected.
          }
        } else {
          if (expectedConditionNoSpace.isEmpty()) {
            stats.addUnexpectedTranslation(kind);
            outputMessage.append("Unexpected ");
          } else if (actualConditionNoSpace.isEmpty()) {
            stats.addMissingTranslation(kind);
            outputMessage.append("Missing ");
          } else {
            stats.addWrongTranslation(kind);
            outputMessage.append("Wrong ");
          }
        }
        outputMessage
            .append(kind)
            .append(" condition. CommentContent: ")
            .append(actualTag.getComment())
            .append("\n\tExpected condition: ")
            .append(expectedTag.getCondition())
            .append("\n\tActual condition: ")
            .append(actualTag.getCondition())
            .append("\n");
      }
    }
    return outputMessage;
  }

  private static StringBuilder collectEqStats(
      Stats stats,
      EquivalenceOutput actualTag,
      EquivalenceOutput expectedTag,
      JavadocComment.Kind kind) {

    final StringBuilder outputMessage = new StringBuilder();
    //    final TagOutput[] actualTagsArray = actualTags.toArray(new TagOutput[actualTags.size()]);
    //    final TagOutput[] expectedTagsArray = expectedTags.toArray(new
    // TagOutput[expectedTags.size()]);
    //    for (int tagIndex = 0; tagIndex < actualTagsArray.length; tagIndex++) {
    //      TagOutput actualTag = actualTagsArray[tagIndex];
    //      TagOutput expectedTag = expectedTagsArray[tagIndex];

    if (actualTag != null && expectedTag != null) {
      String expectedConditionNoSpace = expectedTag.getCondition().replaceAll("[\\n ]", "");
      String actualConditionNoSpace = actualTag.getCondition().replaceAll("[\\n ]", "");

      if (expectedConditionNoSpace.isEmpty() && actualConditionNoSpace.isEmpty()) {
        // Both empty, nothing interesting to print!
        return outputMessage;
      }

      outputMessage.append("\n\n");

      if (actualConditionNoSpace.equals(expectedConditionNoSpace)) {
        if (!expectedConditionNoSpace.isEmpty()) {
          stats.addCorrectTranslation(kind);
          outputMessage.append("Correct ");
        }
      } else {
        if (expectedConditionNoSpace.isEmpty()) {
          stats.addUnexpectedTranslation(kind);
          outputMessage.append("Unexpected ");
        } else if (actualConditionNoSpace.isEmpty()) {
          stats.addMissingTranslation(kind);
          outputMessage.append("Missing ");
        } else {
          stats.addWrongTranslation(kind);
          outputMessage.append("Wrong ");
        }
      }
      outputMessage
          .append(kind)
          .append("condition ")
          .append("for method: ")
          .append(actualTag.getMember().substring(0, actualTag.getMember().indexOf(")") + 1))
          .append("\n")
          .append("CommentContent: ")
          .append(actualTag.getComment())
          .append("\n\tExpected condition: ")
          .append(expectedTag.getCondition())
          .append("\n\tActual condition: ")
          .append(actualTag.getCondition())
          .append("\n");
    }
    //    }
    return outputMessage;
  }

  /**
   * Compares the given {@code actualMethodList} with {@code expectedMethodList}. This method is
   * used to generate statistics (precision and recall) of MeMo for each method in {@code
   * actualMethodList}. The statistics are aggregated per class, we assume that the {@code
   * actualMethodList} contains methods belonging to one class.
   *
   * @param targetClass the class for which collect statistics
   * @param actualMethodList methods with tags translated by MeMo
   * @param expectedMethodList methods with tags manually translated
   * @param output the output message to be populated
   * @return statistics for each method of the given lists, aggregated per class
   * @throws IllegalArgumentException if {@code actualMethodList} and {@code expectedMethodList} are
   *     not of the same size
   */
  public static Stats getEqStats(
      String targetClass,
      List<JsonOutput> actualMethodList,
      List<JsonOutput> expectedMethodList,
      StringBuilder output) {

    if (actualMethodList.size() != expectedMethodList.size()) {
      throw new IllegalArgumentException(
          "Actual and expected method list should be of the same size.");
    }

    Collections.sort(actualMethodList, new JsonOutput.JsonOutputComparator());
    Collections.sort(expectedMethodList, new JsonOutput.JsonOutputComparator());

    Stats stats = new Stats(targetClass);
    for (int methodIndex = 0; methodIndex < expectedMethodList.size(); methodIndex++) {
      JsonOutput actualMethod = actualMethodList.get(methodIndex);
      JsonOutput expectedMethod = expectedMethodList.get(methodIndex);

      List<EquivalenceOutput> actualMethodReturnTag = new ArrayList<>();
      List<EquivalenceOutput> expectedMethodReturnTag = new ArrayList<>();
      actualMethodReturnTag.add(actualMethod.equivalence);
      expectedMethodReturnTag.add(expectedMethod.equivalence);

      output.append(
          collectEqStats(
              stats,
              actualMethod.equivalence,
              expectedMethod.equivalence,
              JavadocComment.Kind.FREETEXT));
    }
    return stats;
  }
}
