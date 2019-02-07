package org.toradocu.translator;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;
import org.toradocu.Toradocu;

public class CrossCheckingTest {

  private final Path actualOutput = Paths.get("CrossOracles_out.json");

  @Test
  public void multimapTest() {
    // Equivalence with object parameters:
    // If values is empty, this is equivalent to removeAll(Object).
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          actualOutput.toString()
        });
  }
  /*
  @Test
  public void LongAdderTest() {
    // Equivalence with primitive parameters
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.cache.LongAdder",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          actualOutput.toString()
        });
  }
  */

  /*
    @Test
    public void multisetTest() {
      // (Simple) Conditional equivalence
      Toradocu.main(
          new String[] {
            "--target-class",
            "com.google.common.collect.Multiset",
            "--class-dir",
            "src/test/resources/bin/guava-19.0.jar",
            "--source-dir",
            "src/test/resources/src/guava-19.0-sources",
            "--disable-semantics",
            "true",
            "--cross-oracles",
            "true",
            "--condition-translator-output",
            actualOutput.toString()
          });
    }
  */

  @Test
  public void rateLimiterTest() {
    // Equivalence with primitive parameters:
    // This method is equivalent to acquire(1)
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.util.concurrent.RateLimiter",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true",
          "--cross-oracles",
          "true",
          "--condition-translator-output",
          actualOutput.toString()
        });
  }
}
