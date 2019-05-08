package org.toradocu.extractor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeSnippet {
  private String snippet;
  private Map<String, String> symbols;
  private Map<String, Boolean> solvedSymbols;
  private boolean isExpression;
  private boolean isTernaryOp;
  private boolean isComplexSignature;

  CodeSnippet(String snippet, boolean isExpression, boolean ternaryOp, boolean complexSignature) {
    this.snippet = snippet;
    this.symbols = new HashMap<>();
    this.solvedSymbols = new HashMap<>();
    this.isExpression = isExpression;
    this.isTernaryOp = ternaryOp;
    this.isComplexSignature = complexSignature;
  }

  public void completeSnippet() {
    Map<String, Boolean> unsolved =
        solvedSymbols
            .entrySet()
            .stream()
            .filter(x -> !x.getValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    for (String symbol : unsolved.keySet()) {
      String compilableExpression = symbols.get(symbol);
      if (compilableExpression != null) {
        String toSubstitute = symbol;
        if (symbol.contains("(")) {
          toSubstitute = symbol.substring(0, symbol.indexOf("("));
          compilableExpression =
              compilableExpression.substring(0, compilableExpression.indexOf("("));
        }
        this.snippet = this.snippet.replaceAll("\\b" + toSubstitute + "\\b", compilableExpression);
        this.solvedSymbols.put(symbol, true);
      }
    }
  }

  public void addMatchToSymbol(String symbol, String match) {
    this.symbols.put(symbol, match);
  }

  public Map<String, String> getSymbols() {
    return symbols;
  }

  public Map<String, Boolean> getSolvedSymbols() {
    return solvedSymbols;
  }

  public String getSnippet() {
    return snippet;
  }

  public boolean isExpression() {
    return isExpression;
  }

  public boolean isTernary() {
    return isTernaryOp;
  }

  public boolean isComplexSignature() {
    return isComplexSignature;
  }
}
