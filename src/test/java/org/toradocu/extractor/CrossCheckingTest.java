package org.toradocu.extractor;

import org.junit.Test;
import org.toradocu.Toradocu;

public class CrossCheckingTest {

  @Test
  public void multimapTest() throws Exception {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multimap",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true"
        });
  }

  @Test
  public void multisetTest() throws Exception {
    Toradocu.main(
        new String[] {
          "--target-class",
          "com.google.common.collect.Multiset",
          "--class-dir",
          "src/test/resources/bin/guava-19.0.jar",
          "--source-dir",
          "src/test/resources/src/guava-19.0-sources",
          "--disable-semantics",
          "true"
        });
  }
}
