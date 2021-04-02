package org.memo.output.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.memo.extractor.DocumentedExecutable;
import org.memo.extractor.DocumentedParameter;
import org.memo.extractor.ParamTag;
import org.memo.extractor.ReturnTag;
import org.memo.extractor.ThrowsTag;
import org.memo.translator.spec.EqOperationSpecification;
import org.memo.translator.spec.EquivalenceSpec;
import randoop.condition.specification.OperationSpecification;
import randoop.condition.specification.Postcondition;
import randoop.condition.specification.Precondition;
import randoop.condition.specification.ThrowsCondition;

public class JsonOutput {
  public String signature;
  public String name;
  public org.memo.output.util.Type containingClass;
  public String targetClass;
  public boolean isVarArgs;
  public org.memo.output.util.Type returnType;
  public List<org.memo.output.util.Parameter> parameters;
  public List<ParamTagOutput> paramTags;
  public ReturnTagOutput returnTag;
  public List<ThrowsTagOutput> throwsTags;
  public EquivalenceOutput equivalence;

  private void createEquivalences(
      DocumentedExecutable member, EqOperationSpecification specification) {
    StringBuilder oracle = new StringBuilder();
    int i = 0;
    boolean moreThanOne = false;
    for (EquivalenceSpec m : specification.getEquivalenceSpecs()) {
      // We have more than one equivalence spec: add them all in the oracle, they all must hold!
      if (i > 0) {
        moreThanOne = true;
      }
      boolean closingCurly = false;
      if (!m.getGuard().getConditionSource().equals("true")) {
        if (moreThanOne) {
          oracle.append(" && ");
          moreThanOne = false;
        }
        oracle.append("if(").append(m.getGuard().getConditionSource()).append(")").append("{");
        closingCurly = true;
      }
      if (!m.getPostAssertion().toString().isEmpty()) {
        if (moreThanOne) oracle.append(" && ");
        oracle.append(m.getPostAssertion().toString());
        i++;
        if (closingCurly) {
          oracle.append("}");
        }
      }
    }
    this.equivalence =
        new EquivalenceOutput(
            member.getFreeText().getComment().getText(),
            member.getSignature(),
            member.getFreeText().getKind().toString(),
            oracle.toString());
  }

  public JsonOutput(DocumentedExecutable member, OperationSpecification specification) {
    // TODO translate the executable member to a serializable format
    this.signature = member.getSignature();
    this.name = member.getName();
    this.containingClass =
        new org.memo.output.util.Type(
            member.getDeclaringClass().getName(),
            member.getDeclaringClass().getSimpleName(),
            member.getDeclaringClass().isArray());
    this.targetClass = member.getDeclaringClass().getName();
    this.isVarArgs = member.isVarArgs();

    String returnTypeName = member.getExecutable().getAnnotatedReturnType().getType().getTypeName();
    this.returnType =
        new org.memo.output.util.Type(
            returnTypeName, returnTypeName, returnTypeName.endsWith("]"));

    createParameters(member);

    if (specification instanceof EqOperationSpecification) {
      createEquivalences(member, (EqOperationSpecification) specification);
    } else {
      createParamTags(member, specification.getPreconditions());
      createThrowsTags(member, specification.getThrowsConditions());
      createReturnTags(member, specification.getPostconditions());
    }
  }

  private void createReturnTags(DocumentedExecutable member, List<Postcondition> specs) {
    if (specs.size() > 2) {
      throw new IllegalArgumentException("Old MeMo had a limited support for return specs");
    }

    ReturnTag mrt = member.returnTag();
    if (mrt != null) { // If member has a @return comment.
      String spec = "";
      if (!specs.isEmpty()) { // If MeMo produced a translation for the @return comment.
        Postcondition postSpec = specs.get(0);
        spec =
            postSpec.getGuard().getConditionSource()
                + " ? "
                + postSpec.getProperty().getConditionSource();
        if (specs.size() > 1) {
          postSpec = specs.get(1);
          spec += " : " + postSpec.getProperty().getConditionSource();
        }
      }
      this.returnTag = new ReturnTagOutput(mrt.getComment().getText(), mrt.getKind().name(), spec);
    }
  }

  private void createThrowsTags(DocumentedExecutable member, List<ThrowsCondition> specs) {
    this.throwsTags = new ArrayList<>();
    for (int i = 0; i < member.throwsTags().size(); i++) {
      String condition = "";
      ThrowsTag throwsTag = member.throwsTags().get(i);
      Class eType = throwsTag.getException();
      Type exType = new Type(eType.getName(), eType.getSimpleName(), eType.isArray());
      if (!specs.isEmpty() && specs.get(i) != null) {
        final ThrowsCondition throwsSpecification = specs.get(i);
        condition = throwsSpecification.getGuard().getConditionSource();
      }
      ThrowsTagOutput paramJsonObj =
          new ThrowsTagOutput(
              exType, throwsTag.getComment(), throwsTag.getKind().name(), condition);
      throwsTags.add(paramJsonObj);
    }
  }

  private void createParamTags(DocumentedExecutable member, List<Precondition> specs) {
    this.paramTags = new ArrayList<>();
    for (int i = 0; i < member.paramTags().size(); i++) {
      String preSpecText = "";
      ParamTag paramTag = member.paramTags().get(i);
      DocumentedParameter param = paramTag.getParameter();
      Class pType = param.asReflectionParameter().getType();
      Type paramType = new Type(pType.getName(), pType.getSimpleName(), pType.isArray());
      Parameter paramObj = new Parameter(paramType, param.getName(), param.isNullable());
      if (!specs.isEmpty() && specs.get(i) != null) {
        final Precondition preSpecification = specs.get(i);
        preSpecText = preSpecification.getGuard().getConditionSource();
      }
      ParamTagOutput paramJsonObj =
          new ParamTagOutput(
              paramObj, paramTag.getComment(), paramTag.getKind().name(), preSpecText);
      paramTags.add(paramJsonObj);
    }
  }

  private void createParameters(DocumentedExecutable member) {
    this.parameters = new ArrayList<>();
    for (DocumentedParameter param : member.getParameters()) {
      Class pType = param.asReflectionParameter().getType();
      Type paramType = new Type(pType.getName(), pType.getSimpleName(), pType.isArray());
      Parameter paramObj = new Parameter(paramType, param.getName(), param.isNullable());
      parameters.add(paramObj);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof JsonOutput)) return false;
    JsonOutput that = (JsonOutput) o;
    return isVarArgs == that.isVarArgs
        && Objects.equals(signature, that.signature)
        && Objects.equals(name, that.name)
        && Objects.equals(containingClass, that.containingClass)
        && Objects.equals(targetClass, that.targetClass)
        && Objects.equals(returnType, that.returnType)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(paramTags, that.paramTags)
        && Objects.equals(returnTag, that.returnTag)
        && Objects.equals(throwsTags, that.throwsTags)
        && Objects.equals(equivalence, that.equivalence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        signature,
        name,
        containingClass,
        targetClass,
        isVarArgs,
        returnType,
        parameters,
        paramTags,
        returnTag,
        throwsTags,
        equivalence);
  }

  @Override
  public String toString() {
    return "JsonOutput{"
        + "signature='"
        + signature
        + '\''
        + ", name='"
        + name
        + '\''
        + ", containingClass="
        + containingClass
        + ", targetClass='"
        + targetClass
        + '\''
        + ", isVarArgs="
        + isVarArgs
        + ", returnType="
        + returnType
        + ", parameters="
        + parameters
        + ", paramTags="
        + paramTags
        + ", returnTag="
        + returnTag
        + ", throwsTags="
        + throwsTags
        + ", equivalence="
        + equivalence
        + '}';
  }

  public static class JsonOutputComparator implements Comparator<JsonOutput> {
    @Override
    public int compare(JsonOutput o1, JsonOutput o2) {
      return o1.signature.compareTo(o2.signature);
    }
  }
}
