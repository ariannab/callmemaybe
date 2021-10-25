package org.callmemaybe.extractor;

import com.crtomirmajer.wmd4j.WordMovers;
import edu.stanford.nlp.semgraph.SemanticGraph;
import org.callmemaybe.CallMeMaybe;
import org.callmemaybe.translator.Parser;
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
   * @param
   * @return TemporalMatch object containing information such as the matched signature, empty if
   *     no match
   */
  public static TemporalMatch findProtocolInComment(CommentContent commentContent,  DocumentedExecutable excMember) {
    // TODO look for advcl and obl in the comment. See if it can be parsed with enhanced dependencies.
    List<SemanticGraph> semanticGraphs = Parser.extractSemanticGraphs(commentContent, excMember);

    return new TemporalMatch();
  }

}


