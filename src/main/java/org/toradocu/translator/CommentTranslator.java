package org.toradocu.translator;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.toradocu.conf.Configuration;
import org.toradocu.extractor.DocumentedExecutable;
import org.toradocu.extractor.DocumentedParameter;
import org.toradocu.extractor.DocumentedType;
import org.toradocu.extractor.EquivalentMatch;
import org.toradocu.extractor.ParamTag;
import org.toradocu.extractor.ReturnTag;
import org.toradocu.extractor.ThrowsTag;
import org.toradocu.translator.preprocess.PreprocessorFactory;
import org.toradocu.translator.spec.EqOperationSpecification;
import org.toradocu.translator.spec.EquivalenceSpec;
import org.toradocu.util.Checks;
import randoop.condition.specification.Guard;
import randoop.condition.specification.Identifiers;
import randoop.condition.specification.OperationSignature;
import randoop.condition.specification.OperationSpecification;
import randoop.condition.specification.Postcondition;
import randoop.condition.specification.Precondition;
import randoop.condition.specification.Property;
import randoop.condition.specification.ThrowsCondition;

/** Translates comments into procedure specifications. */
public class CommentTranslator {

  /** Logger of this class. */
  private static Logger log = LoggerFactory.getLogger(CommentTranslator.class);

  /**
   * Translates the given free text comment into a specification.
   *
   * @param excMember the executable member commented with {@code freeTextComment}
   * @return a specification
   */
  public static ArrayList<EquivalentMatch> translate(
      DocumentedType documentedType, DocumentedExecutable excMember) {
    // PreprocessorFactory.create(freeTextComment.getKind()).preprocess(freeTextComment, excMember);
    //    log.info("Translating " + tag + " of " + excMember.getSignature());
    return new FreeTextTranslator().translate(documentedType, excMember);
  }

  /**
   * Translates the given @param comment into a precondition specification.
   *
   * @param tag the comment to be translated
   * @param excMember the executable member commented with {@code tag}
   * @return a precondition specification (an empty specification if the translation fails)
   */
  public static Precondition translate(ParamTag tag, DocumentedExecutable excMember) {
    PreprocessorFactory.create(tag.getKind()).preprocess(tag, excMember);
    //    log.info("Translating " + tag + " of " + excMember.getSignature());
    return new ParamTranslator().translate(tag, excMember);
  }

  /**
   * Translates the given @return comment into a list of precondition specifications.
   *
   * @param tag the comment to be translated
   * @param excMember the executable member commented with {@code tag}
   * @return a list of precondition specifications (each specification can be empty if the
   *     translation failed)
   */
  public static List<Postcondition> translate(ReturnTag tag, DocumentedExecutable excMember) {
    PreprocessorFactory.create(tag.getKind()).preprocess(tag, excMember);
    //    log.info("Translating " + tag + " of " + excMember.getSignature());
    return new ReturnTranslator().translate(tag, excMember);
  }

  /**
   * Translates the given @throws/@exception comment into a precondition specification.
   *
   * @param tag the comment to be translated
   * @param excMember the executable member commented with {@code tag}
   * @return a precondition specification (an empty specification if the translation fails)
   */
  public static ThrowsCondition translate(ThrowsTag tag, DocumentedExecutable excMember) {
    PreprocessorFactory.create(tag.getKind()).preprocess(tag, excMember);
    //    log.info("Translating " + tag + " of " + excMember.getSignature());
    return new ThrowsTranslator().translate(tag, excMember);
  }

  /**
   * Creates the specifications from the comments of the given executable members.
   *
   * @param members the executable members whose comments have to be translated into specifications
   * @return a map that associates each executable member (key) with its operation specification
   *     that includes pre-, post-, and exceptional specifications.
   */
  public static Map<DocumentedExecutable, OperationSpecification> createSpecifications(
      List<DocumentedExecutable> members) {
    Map<DocumentedExecutable, OperationSpecification> specs = new LinkedHashMap<>();
    for (DocumentedExecutable member : members) {
      OperationSignature operation = OperationSignature.of(member.getExecutable());
      List<String> paramNames =
          member.getParameters().stream().map(DocumentedParameter::getName).collect(toList());
      Identifiers identifiers =
          new Identifiers(Configuration.RECEIVER, paramNames, Configuration.RETURN_VALUE);
      OperationSpecification spec = new OperationSpecification(operation, identifiers);

      List<Precondition> preSpecifications = new ArrayList<>();
      for (ParamTag paramTag : member.paramTags()) {
        preSpecifications.add(CommentTranslator.translate(paramTag, member));
      }
      spec.addParamSpecifications(preSpecifications);

      List<ThrowsCondition> throwsSpecifications = new ArrayList<>();
      for (ThrowsTag throwsTag : member.throwsTags()) {
        throwsSpecifications.add(CommentTranslator.translate(throwsTag, member));
      }
      spec.addThrowsConditions(throwsSpecifications);

      List<Postcondition> postSpecifications = new ArrayList<>();
      ReturnTag returnTag = member.returnTag();
      if (returnTag != null) {
        postSpecifications.addAll(CommentTranslator.translate(returnTag, member));
      }
      spec.addReturnSpecifications(postSpecifications);

      specs.put(member, spec);
    }
    return specs;
  }

  public static Map<DocumentedExecutable, EqOperationSpecification> createCrossOracles(
      DocumentedType documentedType) {
    Map<DocumentedExecutable, EqOperationSpecification> methodsSpecs = new LinkedHashMap<>();
    List<DocumentedExecutable> members = documentedType.getDocumentedExecutables();
    for (DocumentedExecutable member : members) {
      OperationSignature operation = OperationSignature.of(member.getExecutable());
      List<String> paramNames =
          member.getParameters().stream().map(DocumentedParameter::getName).collect(toList());
      Identifiers identifiers =
          new Identifiers(Configuration.RECEIVER, paramNames, Configuration.RETURN_VALUE);
      // OperationSpecification contains a list for all possible specifications related to the
      // operation,
      // thus Pre, Post, Exc...
      EqOperationSpecification opSpec = new EqOperationSpecification(operation, identifiers);
      ArrayList<EquivalentMatch> equivalentMatches =
          CommentTranslator.translate(documentedType, member);

      // EquivalenceMatch now extends PostSpecification, so the list returned to the translator is
      // stored as a list of PostSpecifications added to the OperationSpec
      List<EquivalenceSpec> eqSpecifications = new ArrayList<>();
      for (EquivalentMatch em : equivalentMatches) {
        String guard = em.getCondition().isEmpty() ? "true" : em.getCondition();
        eqSpecifications.add(
            // FIXME just an experiment, remember there are special cases, e.g. snippets!
            new EquivalenceSpec(
                member.getFreeText().getComment().getText(),
                new Guard("", guard),
                new Property("", em.getOracle())));
      }

      // if(!postSpecifications.isEmpty()) {
      opSpec.addEqSpecifications(eqSpecifications);
      methodsSpecs.put(member, opSpec);
      // }
    }

    return methodsSpecs;
  }

  /**
   * Replace "args" identifiers in specifications generated by Toradocu with the actual parameter
   * name the identifiers refers to.
   *
   * @param condition the condition in which replace names, must not be null
   * @param executable the documented method the condition specifies, must not be null
   * @return the given condition with the actual parameter names
   */
  public static String processCondition(String condition, DocumentedExecutable executable) {
    Checks.nonNullParameter(condition, "condition");
    Checks.nonNullParameter(executable, "executable");

    for (int index = 0; index < executable.getParameters().size(); index++) {
      String paramName = executable.getParameters().get(index).getName();
      condition = condition.replace("args[" + index + "]", paramName);
    }
    return condition;
  }
}
