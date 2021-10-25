package org.callmemaybe.translator.spec;

import java.util.LinkedList;

public class Body {
  private final LinkedList<String> statements;

  public Body(LinkedList<String> statements) {
    this.statements = statements;
  }

  public boolean isEmpty() {
    return this.statements.isEmpty();
  }

  public LinkedList<String> getStatements() {
    return statements;
  }

  String getBodyAsString() {
    StringBuilder bodyAsString = new StringBuilder();
    for (String s : statements) {
      // Exclude start and end of method
      // FIXME these checks are ugly.
      if (!s.contains("{") && !s.contains("}")
          || ((s.contains("{") || s.contains("}"))
              && (s.matches("if ?\\(.*") || s.matches("for ?\\(.*")))) {
        bodyAsString.append(s);
      }
    }
    return bodyAsString.toString();
  }

  @Override
  public String toString() {
    return String.join("\n", statements);
  }
}
