package org.callmemaybe.translator;

import edu.stanford.nlp.semgraph.SemanticGraph;

import java.util.List;
import java.util.ArrayList;

public class TemporalPropSeries extends PropositionSeries {

    String temporalSpecific;
    private final List<TemporalRelation> tempRelations;

    TemporalPropSeries(SemanticGraph semanticGraph) {
        super(semanticGraph);
        this.tempRelations = new ArrayList<>();
    }

    TemporalPropSeries(SemanticGraph semanticGraph, List<Proposition> propositions, List<Conjunction> conjunctions) {
        super(semanticGraph, propositions, conjunctions);
        this.tempRelations = new ArrayList<>();
    }

    TemporalPropSeries(SemanticGraph semanticGraph, List<Proposition> propositions, List<Conjunction> conjunctions,
                        String specific){
        super(semanticGraph, propositions, conjunctions);
        this.temporalSpecific = specific;
        this.tempRelations = new ArrayList<>();
    }

    /**
     *
     * @param temporalRelation
     * @param proposition
     */
    public void add(TemporalRelation temporalRelation, Proposition proposition) {
        if (super.getPropositions().isEmpty()) {
            throw new IllegalStateException("Proposition series is empty. Use add(Proposition)");
        }
        this.tempRelations.add(temporalRelation);
    }
}
