package org.callmemaybe.extractor;

import java.util.List;

public class KeywordsSet {
  private List<String> kw;
  private Category category;

  public enum Category {
    EQUIVALENCE,
    SIMILARITY
  }

  public KeywordsSet(List<String> kw, Category category) {
    this.kw = kw;
    this.category = category;
  }

  public List<String> getKw() {
    return kw;
  }

  public Category getCategory() {
    return category;
  }
}
