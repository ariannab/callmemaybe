package org.callmemaybe.translator;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.callmemaybe.conf.Configuration;
import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.DocumentedParameter;
import org.callmemaybe.extractor.DocumentedType;
import org.callmemaybe.extractor.EquivalentMatch;
import org.callmemaybe.extractor.ParamTag;
import org.callmemaybe.extractor.ReturnTag;
import org.callmemaybe.extractor.TempProtocolMatcher;
import org.callmemaybe.extractor.TemporalMatch;
import org.callmemaybe.extractor.ThrowsTag;
import org.callmemaybe.output.util.CMMToRandoop;
import org.callmemaybe.translator.preprocess.PreprocessorFactory;
import org.callmemaybe.translator.spec.Assertion;
import org.callmemaybe.translator.spec.Body;
import org.callmemaybe.translator.spec.EqOperationSpecification;
import org.callmemaybe.translator.spec.EquivalenceSpec;
import org.callmemaybe.translator.spec.PostAssertion;
import org.callmemaybe.translator.spec.ProtocolSpec;
import org.callmemaybe.translator.spec.ProtocolSpecification;
import org.callmemaybe.util.Checks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import randoop.condition.specification.Guard;
import randoop.condition.specification.Identifiers;
import randoop.condition.specification.OperationSignature;
import randoop.condition.specification.OperationSpecification;
import randoop.condition.specification.Postcondition;
import randoop.condition.specification.Precondition;
import randoop.condition.specification.ThrowsCondition;

/**
 * Translates comments into procedure specifications.
 */
public class CommentTranslator {

    /**
     * Logger of this class.
     */
    private static Logger log = LoggerFactory.getLogger(CommentTranslator.class);

    /**
     * Translates the given free text comment into a specification.
     *
     * @param excMember the executable member commented with {@code freeTextComment}
     * @return a specification
     */
    public static List<EquivalentMatch> translateEq(
            DocumentedType documentedType, DocumentedExecutable excMember) {
        // PreprocessorFactory.create(freeTextComment.getKind()).preprocess(freeTextComment, excMember);
        //    log.info("Translating " + tag + " of " + excMember.getSignature());
        return new FreeTextTranslator().translateEq(documentedType, excMember);
    }

    /**
     * Translates the given free text comment into a specification.
     *
     * @param excMember the executable member commented with {@code freeTextComment}
     * @return a specification
     */
    public static List<TemporalMatch> translateTP(
            TempProtocolMatcher tempProtocolMatcher, DocumentedExecutable excMember) {
        // PreprocessorFactory.create(freeTextComment.getKind()).preprocess(freeTextComment, excMember);
        //    log.info("Translating " + tag + " of " + excMember.getSignature());
        return new FreeTextTranslator().translateTP(tempProtocolMatcher, excMember);
    }

    /**
     * Translates the given @param comment into a precondition specification.
     *
     * @param tag       the comment to be translated
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
     * @param tag       the comment to be translated
     * @param excMember the executable member commented with {@code tag}
     * @return a list of precondition specifications (each specification can be empty if the
     * translation failed)
     */
    public static List<Postcondition> translate(ReturnTag tag, DocumentedExecutable excMember) {
        PreprocessorFactory.create(tag.getKind()).preprocess(tag, excMember);
        //    log.info("Translating " + tag + " of " + excMember.getSignature());
        return new ReturnTranslator().translate(tag, excMember);
    }

    /**
     * Translates the given @throws/@exception comment into a precondition specification.
     *
     * @param tag       the comment to be translated
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
     * that includes pre-, post-, and exceptional specifications.
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

    public static Map<DocumentedExecutable, EqOperationSpecification> mapExecutablesToCrossOracles(
            DocumentedType documentedType) {
        Map<DocumentedExecutable, EqOperationSpecification> methodsSpecs = new LinkedHashMap<>();
        List<DocumentedExecutable> members = documentedType.getDocumentedExecutables();
        for (DocumentedExecutable member : members) {
            OperationSignature operation = OperationSignature.of(member.getExecutable());
            List<String> paramNames =
                    member.getParameters().stream().map(DocumentedParameter::getName).collect(toList());

            Identifiers identifiers =
                    new Identifiers(Configuration.RECEIVER, paramNames, Configuration.RETURN_VALUE);

            EqOperationSpecification opSpec = new EqOperationSpecification(operation, identifiers);
            List<EquivalentMatch> equivalentMatches = CommentTranslator.translateEq(documentedType, member);

            List<EquivalenceSpec> eqSpecifications = createEqSpecifications(member, equivalentMatches);

            opSpec.addSpecifications(eqSpecifications);
            methodsSpecs.put(member, opSpec);
        }

        return methodsSpecs;
    }

    public static Map<DocumentedExecutable, List<TemporalMatch>> translateTemporalMatchesFor(DocumentedType documentedType){
        List<DocumentedExecutable> members = documentedType.getDocumentedExecutables();
        TempProtocolMatcher tempProtocolMatcher = new TempProtocolMatcher();
        Map<DocumentedExecutable, List<TemporalMatch>> methodsSpecs = new LinkedHashMap<>();
        for (DocumentedExecutable member : members) {
            List<TemporalMatch> temporalMatches = CommentTranslator.translateTP(tempProtocolMatcher, member);
            methodsSpecs.put(member, temporalMatches);
        }
        return methodsSpecs;
    }

    public static Map<DocumentedExecutable, ProtocolSpecification> mapExecutablesToProtocolSpecs(
            DocumentedType documentedType) {
        Map<DocumentedExecutable, ProtocolSpecification> methodsSpecs = new LinkedHashMap<>();
        List<DocumentedExecutable> members = documentedType.getDocumentedExecutables();
        TempProtocolMatcher tempProtocolMatcher = new TempProtocolMatcher();
        for (DocumentedExecutable member : members) {
            OperationSignature operation = OperationSignature.of(member.getExecutable());
            List<String> paramNames =
                    member.getParameters().stream().map(DocumentedParameter::getName).collect(toList());

            // FIXME Check this is what we want?
            Identifiers identifiers =
                    new Identifiers(Configuration.RECEIVER, paramNames, Configuration.RETURN_VALUE);

            ProtocolSpecification opSpec = new ProtocolSpecification(operation, identifiers);
            List<TemporalMatch> temporalMatches = CommentTranslator.translateTP(tempProtocolMatcher, member);

            List<ProtocolSpec> protocolSpecifications = createProtocolSpecifications(member, temporalMatches);

            opSpec.addSpecifications(protocolSpecifications);
            methodsSpecs.put(member, opSpec);
        }

        return methodsSpecs;
    }

    public static Map<DocumentedExecutable, CMMToRandoop> mapExecutablesToCMMRandoopOutput(
            DocumentedType documentedType) {
        Map<DocumentedExecutable, CMMToRandoop> methodsSpecs = new LinkedHashMap<>();
        List<DocumentedExecutable> members = documentedType.getDocumentedExecutables();
        TempProtocolMatcher tempProtocolMatcher = new TempProtocolMatcher();
        for (DocumentedExecutable member : members) {
            List<TemporalMatch> temporalMatches = CommentTranslator.translateTP(tempProtocolMatcher, member);
            // FIXME Quick&Dirty: assume it's only one. Ofc it may happen we have multiple protocols for
            // FIXME the same method. For sure, it's not the most common.
            if(!temporalMatches.isEmpty()) {
                TemporalMatch theOnlyMatchICareAbout = temporalMatches.get(0);
                CMMToRandoop output = theOnlyMatchICareAbout.toMachineReadableOutput();
                methodsSpecs.put(member, output);
            }
        }

        return methodsSpecs;
    }

    private static List<EquivalenceSpec> createEqSpecifications(
            DocumentedExecutable member, List<EquivalentMatch> equivalentMatches) {

        List<EquivalenceSpec> eqSpecifications = new ArrayList<>();
        for (EquivalentMatch em : equivalentMatches) {
            PostAssertion postAssertion;
            String precondition = em.getCondition().isEmpty() ? "true" : em.getCondition();
            String assertion;
            String originalOracle = em.getOracle();

            // TODO be sure that at this point a snippet oracle is already correct, i.e.:
            // TODO 1. compilable out of the box
            // TODO 2. with /n statements
            // TODO 3. with last statement being the assertion!

            if (originalOracle.contains("\n")) {
                LinkedList<String> statements = new LinkedList<>();
                LinkedList<String> dummyMethod = new LinkedList<>();
                Collections.addAll(statements, originalOracle.split("\n"));

                if (originalOracle.contains("//END OF METHOD")) {
                    for (String e : statements) {
                        if (e.equals("//END OF METHOD")) {
                            break;
                        }
                        dummyMethod.add(e);
                    }
                    //                    method = statements.subList(0, statements.indexOf("//END OF
                    // METHOD"));s
                    statements.removeAll(dummyMethod);
                    statements.remove("//END OF METHOD");
                }
                assertion = statements.get(statements.size() - 1);
                statements.remove(assertion);
                // FIXME statements.indexOf("//END OF METHOD");
                // FIXME here we could fill the dummy method, but do we care..?
                postAssertion =
                        new PostAssertion(
                                new Body(statements), new Assertion(assertion), new Body(dummyMethod));
            } else {
                assertion = originalOracle;
                postAssertion =
                        new PostAssertion(
                                new Body(new LinkedList<>()),
                                new Assertion(assertion),
                                new Body(new LinkedList<>()));
            }

            eqSpecifications.add(
                    new EquivalenceSpec(
                            member.getFreeText().getComment().getText(),
                            new Guard("", precondition),
                            postAssertion));
        }

        return eqSpecifications;
    }

    private static List<ProtocolSpec> createProtocolSpecifications(
            DocumentedExecutable member, List<TemporalMatch> temporalMatches) {

        List<ProtocolSpec> protocolSpecs = new ArrayList<>();
        for (TemporalMatch tm : temporalMatches) {
            PostAssertion postAssertion;
//      String precondition = tm.getCondition().isEmpty() ? "true" : tm.getCondition();
            String assertion;
            String originalOracle = tm.getOracle();

            assertion = originalOracle;
            postAssertion =
                    new PostAssertion(
                            new Body(new LinkedList<>()),
                            new Assertion(assertion),
                            new Body(new LinkedList<>()));

            protocolSpecs.add(
                    new ProtocolSpec(
                            member.getFreeText().getComment().getText(),
                            new Guard("", "true"),
                            postAssertion));
        }

        return protocolSpecs;
    }

    /**
     * Replace "args" identifiers in specifications generated by CallMeMaybe with the actual parameter name
     * the identifiers refers to.
     *
     * @param condition  the condition in which replace names, must not be null
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
