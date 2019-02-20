package org.toradocu.extractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// FIXME turn this into:
/*
EqSpecification extends Specification {

    public EqSpecification(Guard guard) {
        Checks.nonNullParameter(guard, "guard");
        this.guard = guard;
    }
 */
public class EquivalentMethodMatch {

  private String methodSignature;
  private String simpleName;
  private boolean equivalence;
  private boolean similarity;
  private List<String> arguments;
  private String oracle;
  private Map<Integer, String> hardcodedParams;

  private Map<Integer, String> staticFinalParams;
  private boolean isNegated;

  public EquivalentMethodMatch() {
    this.methodSignature = "";
    this.simpleName = "";
    this.equivalence = false;
    this.similarity = false;
    this.oracle = "";
  }

  EquivalentMethodMatch(
      String methodSignature,
      boolean equivalence,
      boolean similarity,
      List<String> arguments,
      boolean isNegated) {
    this.methodSignature = methodSignature;
    this.equivalence = equivalence;
    this.similarity = similarity;
    this.arguments = arguments;
    this.hardcodedParams = areArgsHardcoded();
    this.staticFinalParams = areArgsStaticFinal();
    if (methodSignature.contains("(")) {
      this.simpleName = methodSignature.substring(0, methodSignature.indexOf("("));
    } else {
      this.simpleName = methodSignature;
    }
    this.isNegated = isNegated;
    this.oracle = "";
  }

  public String getMethodSignature() {
    return methodSignature;
  }

  public boolean isSimilarity() {
    return similarity;
  }

  public boolean isEquivalence() {
    return equivalence;
  }

  public List<String> getArguments() {
    return arguments;
  }

  public String getSimpleName() {
    return simpleName;
  }

  public void setOracle(String oracle) {
    this.oracle = oracle;
  }

  public String getOracle() {
    return this.oracle;
  }

  public Map<Integer, String> getHardcodedParams() {
    return hardcodedParams;
  }

  public Map<Integer, String> getStaticFinalParams() {
    return staticFinalParams;
  }

  private Map<Integer, String> areArgsHardcoded() {
    Map<Integer, String> constants = new HashMap<>();
    List<String> patterns = new ArrayList<>();
    patterns.add("[0-9]");
    patterns.add("true|false");
    patterns.add("\"[a-zA-Z]+\"");
    if (this.arguments != null) {
      for (int i = 0; i < this.arguments.size(); i++) {
        for (String pattern : patterns) {
          java.util.regex.Matcher matchConstant =
              Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(this.arguments.get(i));
          if (matchConstant.find()) {
            constants.put(i, matchConstant.group(0));
          }
        }
      }
    }
    return constants;
  }

  private Map<Integer, String> areArgsStaticFinal() {
    Map<Integer, String> staticFinals = new HashMap<>();
    String staticFinalRegex = "\\w+(\\.[A-Z]+|#[A-Z]+)+";
    // instead of parsing patterns as for hardcoded params, search for code matchings.
    // But I wouldn't do the match HERE: here I just verify if there are static final args!
    if (this.arguments != null) {
      for (int i = 0; i < this.arguments.size(); i++) {
        Matcher staticFinalMatch = Pattern.compile(staticFinalRegex).matcher(this.arguments.get(i));
        if (staticFinalMatch.find()) {
          staticFinals.put(i, staticFinalMatch.group(0));
        }
      }
    }
    return staticFinals;
  }

  public boolean isNegated() {
    return isNegated;
  }
}
