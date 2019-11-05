package org.toradocu.translator.spec;

import java.util.LinkedList;

public class Body {
  private final LinkedList<String> statements;

  public Body(LinkedList<String> statements) {
    this.statements = statements;
  }

  @Override
  public String toString() {
    return String.join("\n", statements);
  }
}
