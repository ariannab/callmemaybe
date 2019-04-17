package org.toradocu.extractor;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class CodeSnippet {
  private String snippet;
  private Map<String, String> symbols;

  CodeSnippet(String snippet) {
    this.snippet = snippet;
    this.symbols = new HashMap<>();
  }

  public void completeSnippet() {
    for (String symbol : symbols.keySet()) {
      String compilableExpression = symbols.get(symbol);
      if (symbol.contains("(")) {
        symbol = symbol.substring(0, symbol.indexOf("("));
        compilableExpression = compilableExpression.substring(0, compilableExpression.indexOf("("));
      }
      this.snippet = this.snippet.replaceAll(Pattern.quote(symbol), compilableExpression);
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
}
