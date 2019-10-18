package org.toradocu.output.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.toradocu.extractor.*;
import org.toradocu.extractor.DocumentedParameter;
import org.toradocu.extractor.EquivalentMatch;
import randoop.condition.specification.OperationSpecification;
import randoop.condition.specification.PostSpecification;
import randoop.condition.specification.PreSpecification;
import randoop.condition.specification.ThrowsSpecification;

public class JsonOutput {
  public String signature;
  public String name;
  public org.toradocu.output.util.Type containingClass;
  public String targetClass;
  public boolean isVarArgs;
  public org.toradocu.output.util.Type returnType;
  public List<org.toradocu.output.util.Parameter> parameters;
  public List<ParamTagOutput> paramTags;
  public ReturnTagOutput returnTag;
  public List<ThrowsTagOutput> throwsTags;
  public EquivalenceOutput equivalence;

  public JsonOutput(DocumentedExecutable member, ArrayList<EquivalentMatch> specification) {
    // TODO translate the executable member to a serializable format
    this.signature = member.getSignature();
    this.name = member.getName();
    this.containingClass =
        new org.toradocu.output.util.Type(
            member.getDeclaringClass().getName(),
            member.getDeclaringClass().getSimpleName(),
            member.getDeclaringClass().isArray());
    this.targetClass = member.getDeclaringClass().getName();
    this.isVarArgs = member.isVarArgs();

    String returnTypeName = member.getExecutable().getAnnotatedReturnType().getType().getTypeName();
    this.returnType =
        new org.toradocu.output.util.Type(
            returnTypeName, returnTypeName, returnTypeName.endsWith("]"));

    createParameters(member);
    createEquivalences(member, specification);
  }

  private void createEquivalences(
      DocumentedExecutable member, ArrayList<EquivalentMatch> specification) {
    String oracle = "";
    int i = 0;
    for (EquivalentMatch m : specification) {
      if (i > 0) {
        oracle += " && ";
      }
      if (!m.getOracle().isEmpty()) {
        oracle += m.getOracle();
        //        if (specification.size() > 1) {
        //          // FIXME I don't like this, exploit join() or smt
        //          oracle += ";";
        //        }
      }
      i++;
    }
    this.equivalence =
        new EquivalenceOutput(
            member.getFreeText().getComment().getText(),
            member.getSignature(),
            member.getFreeText().getKind().toString(),
            oracle);
  }

  public JsonOutput(DocumentedExecutable member, OperationSpecification specification) {
    // TODO translate the executable member to a serializable format
    this.signature = member.getSignature();
    this.name = member.getName();
    this.containingClass =
        new org.toradocu.output.util.Type(
            member.getDeclaringClass().getName(),
            member.getDeclaringClass().getSimpleName(),
            member.getDeclaringClass().isArray());
    this.targetClass = member.getDeclaringClass().getName();
    this.isVarArgs = member.isVarArgs();

    String returnTypeName = member.getExecutable().getAnnotatedReturnType().getType().getTypeName();
    this.returnType =
        new org.toradocu.output.util.Type(
            returnTypeName, returnTypeName, returnTypeName.endsWith("]"));

    createParameters(member);
    createParamTags(member, specification.getPreSpecifications());
    createThrowsTags(member, specification.getThrowsSpecifications());
    createReturnTags(member, specification.getPostSpecifications());
  }

  private void createReturnTags(DocumentedExecutable member, List<PostSpecification> specs) {
    if (specs.size() > 2) {
      throw new IllegalArgumentException("Old Toradocu had a limited support for return specs");
    }

    ReturnTag mrt = member.returnTag();
    if (mrt != null) { // If member has a @return comment.
      String spec = "";
      if (!specs.isEmpty()) { // If Toradocu produced a translation for the @return comment.
        PostSpecification postSpec = specs.get(0);
        spec =
            postSpec.getGuard().getConditionText()
                + " ? "
                + postSpec.getProperty().getConditionText();
        if (specs.size() > 1) {
          postSpec = specs.get(1);
          spec += " : " + postSpec.getProperty().getConditionText();
        }
      }
      this.returnTag = new ReturnTagOutput(mrt.getComment().getText(), mrt.getKind().name(), spec);
    }
  }

  private void createThrowsTags(DocumentedExecutable member, List<ThrowsSpecification> specs) {
    this.throwsTags = new ArrayList<>();
    for (int i = 0; i < member.throwsTags().size(); i++) {
      String condition = "";
      ThrowsTag throwsTag = member.throwsTags().get(i);
      Class eType = throwsTag.getException();
      Type exType = new Type(eType.getName(), eType.getSimpleName(), eType.isArray());
      if (!specs.isEmpty() && specs.get(i) != null) {
        final ThrowsSpecification throwsSpecification = specs.get(i);
        condition = throwsSpecification.getGuard().getConditionText();
      }
      ThrowsTagOutput paramJsonObj =
          new ThrowsTagOutput(
              exType, throwsTag.getComment(), throwsTag.getKind().name(), condition);
      throwsTags.add(paramJsonObj);
    }
  }

  private void createParamTags(DocumentedExecutable member, List<PreSpecification> specs) {
    this.paramTags = new ArrayList<>();
    for (int i = 0; i < member.paramTags().size(); i++) {
      String preSpecText = "";
      ParamTag paramTag = member.paramTags().get(i);
      DocumentedParameter param = paramTag.getParameter();
      Class pType = param.asReflectionParameter().getType();
      Type paramType = new Type(pType.getName(), pType.getSimpleName(), pType.isArray());
      Parameter paramObj = new Parameter(paramType, param.getName(), param.isNullable());
      if (!specs.isEmpty() && specs.get(i) != null) {
        final PreSpecification preSpecification = specs.get(i);
        preSpecText = preSpecification.getGuard().getConditionText();
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
