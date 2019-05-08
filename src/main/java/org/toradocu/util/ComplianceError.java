package org.toradocu.util;

import java.util.ArrayList;
import java.util.List;

public class ComplianceError {
  static final String MISSING_SYMBOL_PATTERN = "message=cannot find symbol";
  static final String FIRST_TOKEN = "symbol:";
  String message;
  List<String> missingSymbols;

  //  public ComplianceError(String errorMessage) {
  //    int startOfPattern = errorMessage.indexOf(MISSING_SYMBOL_PATTERN);
  //    if (startOfPattern != -1) {
  //      String missingSymbols =
  //          errorMessage.substring(startOfPattern + MISSING_SYMBOL_PATTERN.length());
  //      this.messageTokens = missingSymbols.replaceAll("[\n ]+", " ").trim().split(" ");
  //    }
  //  }

  public ComplianceError() {
    this.missingSymbols = new ArrayList<>();
  }

  //  public String getMissingSymbol() {
  //    if(messageTokens!=null) {
  //      if (messageTokens[0].equals(FIRST_TOKEN)) {
  //        // String codeElementType = messageTokens[1];
  //        String symbol = messageTokens[2];
  //        return symbol;
  //      }
  //    }
  //    return null;
  //  }

  public void build(String errorMessage) {
    this.message = errorMessage;
    String[] missingMessages = errorMessage.split(MISSING_SYMBOL_PATTERN);
    for (String message : missingMessages) {
      int startOfPattern = message.indexOf(FIRST_TOKEN);
      if (startOfPattern != -1) {
        String missingSymbols = message.substring(startOfPattern + FIRST_TOKEN.length());
        String[] messageTokens = missingSymbols.replaceAll("[\n ]+", " ").trim().split(" ");
        this.missingSymbols.add(messageTokens[1]);
      }
    }
  }

  public List<String> getMissingSymbols() {
    return this.missingSymbols;
  }
}
