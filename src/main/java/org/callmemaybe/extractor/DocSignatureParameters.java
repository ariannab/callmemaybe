package org.callmemaybe.extractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.callmemaybe.util.ComplianceChecks;

/**
 * Stores signatures (extracted from comments) and their correct args filling (according to the
 * comment).
 */
public class DocSignatureParameters {
  /** Maps each String signature to a list of String arguments */
  Map<String, List<String>> arguments;
  /**
   * This Map and the one below map a signature with A PAIR INT (PARAM POSITION), STRING (PARAM
   * NAME)
   */
  Map<String, Map<Integer, String>> hardcodedParams;

  Map<String, Map<Integer, String>> staticFinalParams;
  Map<String, Map<Integer, String>> typeParams;

  public DocSignatureParameters() {}

  public DocSignatureParameters(Map<String, List<String>> arguments) {
    // Basic use case: just store the signatures and their default arguments.
    this.arguments = arguments;
    this.hardcodedParams = new HashMap<>();
    this.staticFinalParams = new HashMap<>();
    this.typeParams = new HashMap<>();
  }

  public DocSignatureParameters(
      String singleSignature, List<DocumentedParameter> documentedParameters) {
    List<String> arguments = new ArrayList<>();
    for (DocumentedParameter dp : documentedParameters) {
      // FIXME Check if it's name we want
      arguments.add(dp.getName());
    }
    this.arguments = new HashMap<>();
    this.arguments.put(singleSignature, arguments);
    this.hardcodedParams = new HashMap<>();
    this.staticFinalParams = new HashMap<>();
    this.typeParams = new HashMap<>();
  }

  public DocSignatureParameters(
      Map<String, List<String>> arguments,
      Map<String, Map<Integer, String>> hardcodedParams,
      Map<String, Map<Integer, String>> staticFinalParams,
      Map<String, Map<Integer, String>> typeParams) {
    this.arguments = arguments;
    this.hardcodedParams = hardcodedParams;
    this.staticFinalParams = staticFinalParams;
    this.typeParams = typeParams;
  }

  public void doArgsFillingForSignatures(Map<String, String> methodSignatures) {
    if (!methodSignatures.isEmpty()) {
      this.hardcodedParams = areArgsHardcoded(methodSignatures);
      this.staticFinalParams = areArgsStaticFinal(methodSignatures);
      this.typeParams = areArgsTypes(methodSignatures);
    } else {
      this.hardcodedParams = new HashMap<>();
      this.staticFinalParams = new HashMap<>();
      this.typeParams = new HashMap<>();
    }
  }

  /**
   * Are values for the parameter hardcoded? e.g. digits for an int, a string between quotes for a
   * String, etc.
   *
   * @param methodSignatures
   * @return
   */
  private Map<String, Map<Integer, String>> areArgsHardcoded(Map<String, String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures.keySet()) {
      Map<Integer, String> constArgs = new HashMap<>();
      List<String> patterns = new ArrayList<>();
      // Is the value a number?
      patterns.add("-?[0-9]+(\\.[0-9]+)?");
      // Is the value an hardcoded code expression ?
      patterns.add("true|false|null");
      // Is the value a string between quotes?
      patterns.add("\"[a-zA-Z]+\"");
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          for (String pattern : patterns) {
            String arg = arguments.get(i);
            java.util.regex.Matcher matchConstant =
                Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(arg);
            if (matchConstant.matches()) {
              constArgs.put(i, matchConstant.group(0));
            }
          }
        }
      }
      map.put(signature, constArgs);
    }
    return map;
  }

  /**
   * Are arguments static final fields?
   *
   * @param methodSignatures
   * @return
   */
  private Map<String, Map<Integer, String>> areArgsStaticFinal(
      Map<String, String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures.keySet()) {
      Map<Integer, String> sfArgs = new HashMap<>();
      String staticFinalRegex = "[A-Z]{2,}|\\w+(\\.[A-Z_]+|#[A-Z_]+)+";
      List<String> signatureArgs = this.arguments.get(signature);
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          String arg = signatureArgs.get(i);
          Matcher staticFinalMatch = Pattern.compile(staticFinalRegex).matcher(arg);
          if (staticFinalMatch.matches()) {
            sfArgs.put(i, staticFinalMatch.group(0));
          }
        }
      }
      map.put(signature, sfArgs);
    }
    return map;
  }

  /**
   * Are arguments expressed only with their type? e.g. add(int, Object)
   *
   * @param methodSignatures
   * @return
   */
  private Map<String, Map<Integer, String>> areArgsTypes(Map<String, String> methodSignatures) {
    Map<String, Map<Integer, String>> map = new HashMap<>();
    for (String signature : methodSignatures.keySet()) {
      Map<Integer, String> tArgs = new HashMap<>();
      List<String> signatureArgs = this.arguments.get(signature);
      List<String> arguments = this.arguments.get(signature);
      if (arguments != null) {
        for (int i = 0; i < arguments.size(); i++) {
          String arg = signatureArgs.get(i);
          Map<Integer, String> sfParams = this.staticFinalParams.get(signature);
          if (!sfParams.containsKey(i) && !arg.isEmpty() && Character.isUpperCase(arg.charAt(0))
              || arg.contains("[]")
              || ComplianceChecks.primitiveTypes().contains(arg)) {
            tArgs.putIfAbsent(i, arg);
          }
        }
      }
      map.put(signature, tArgs);
    }
    return map;
  }

  public Map<String, List<String>> getArguments() {
    return arguments;
  }

  public Map<String, Map<Integer, String>> getHardcodedParams() {
    return hardcodedParams;
  }

  public Map<String, Map<Integer, String>> getStaticFinalParams() {
    return staticFinalParams;
  }

  public Map<String, Map<Integer, String>> getTypeParams() {
    return typeParams;
  }
}
