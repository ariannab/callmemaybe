package org.toradocu.extractor;

import java.util.HashMap;
import java.util.Map;

public class CodeSnippet {
  private String snippet;
  private Map<String, String> symbols;
  private boolean isExpression;
  private boolean isTernaryOp;

  CodeSnippet(String snippet, boolean isExpression, boolean ternaryOp) {
    this.snippet = snippet;
    this.symbols = new HashMap<>();
    this.isExpression = isExpression;
    this.isTernaryOp = ternaryOp;
  }

  public void completeSnippet() {
    for (String symbol : symbols.keySet()) {
      String compilableExpression = symbols.get(symbol);
      if (compilableExpression != null) {
        if (symbol.contains("(")) {
          symbol = symbol.substring(0, symbol.indexOf("("));
          compilableExpression =
              compilableExpression.substring(0, compilableExpression.indexOf("("));
        }
        this.snippet = this.snippet.replaceAll("\\b" + symbol + "\\b", compilableExpression);
      }
    }
  }

  public void addMatchToSymbol(String symbol, String match) {
    this.symbols.put(symbol, match);
  }

  public Map<String, String> getSymbols() {
    return symbols;
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
}
