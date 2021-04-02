package org.memo.extractor;

public class ParameterNotFoundException extends Error {

  ParameterNotFoundException(String message) {
    super(message);
  }

  public ParameterNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
