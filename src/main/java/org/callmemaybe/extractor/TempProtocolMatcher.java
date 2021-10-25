package org.callmemaybe.extractor;

import com.crtomirmajer.wmd4j.WordMovers;
import org.callmemaybe.CallMeMaybe;
import org.callmemaybe.translator.semantic.GloveModelWrapper;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TempProtocolMatcher {

  /**
   * This method answers to the question "does the comment express a TP?". Entry point of TP Finder.
   *
   * @param comment comment to parse
   * @param codeSnippet code snippet in comment, if any
   * @return TemporalMatch object containing information such as the matched signature, empty if
   *     no match
   */
  public static TemporalMatch findProtocolInComment(String comment, CodeSnippet codeSnippet) {
    // TODO look for advcl and obl in the comment. See if it can be parsed with enhanced dependencies.

    return new TemporalMatch();
  }
}


