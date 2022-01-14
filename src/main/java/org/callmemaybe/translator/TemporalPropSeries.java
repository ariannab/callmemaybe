package org.callmemaybe.translator;

import edu.stanford.nlp.semgraph.SemanticGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This class represents a series of propositions and temporalRelations in a sentence, as in
 * "PROPOSITION_A CONJUNCTION_AB PROPOSITION_B CONJUNCTION_BC PROPOSITION_C ...". It provides
 * methods to retrieve propositions and temporalRelations between propositions.
 *
 * <p>Propositions are represented using a series rather than a tree because is difficult to express
 * the precedence of temporalRelations with natural language.
 */
public class TemporalPropSeries {

    /**
     * Propositions composing this {@code PropositionSeries}. {@literal Invariant:
     * (propositions.size() = 0 && temporalRelations.size() = 0) || propositions.size() =
     * temporalRelations.size() + 1}
     */
    // FIXME For a temporal prop., we assume  always 2 propositions only, connected by a temp.rel.
    private final List<TemporalProposition> propositions;
    /**
     * Conjunctions composing this {@code PropositionSeries}. Each conjunction links two propositions.
     * {@literal Invariant: (propositions.size() = 0 && temporalRelations.size() = 0) ||
     * temporalRelations.size() = propositions.size() - 1}
     */
    private final List<TemporalRule.TemporalRelation> temporalRelations;

    /**
     * All the verbs in this temporal prop. series
     */
    public Set<Verb> verbsDB;

    private final SemanticGraph semanticGraph;

    /** Initializes an empty {@code PropositionSeries}. */
    TemporalPropSeries(SemanticGraph semanticGraph) {
        this.semanticGraph = semanticGraph;
        propositions = new ArrayList<>();
        temporalRelations = new ArrayList<>();
        verbsDB = new HashSet<>();
    }

    /**
     * Initializes a {@code PropositionSeries} with the given propositions interlaced with the given
     * temporalRelations.
     *
     * @param propositions the propositions contained in this series
     * @param conjunctions the temporalRelations between the propositions
     * @throws IllegalArgumentException if the number of temporalRelations is not exactly 1 less than the
     *     number of propositions, unless both are empty
     */
    TemporalPropSeries(SemanticGraph semanticGraph,
                       List<TemporalProposition> propositions,
                       List<TemporalRule.TemporalRelation> conjunctions) {
        if (!propositions.isEmpty()
                && !conjunctions.isEmpty()
                && propositions.size() - conjunctions.size() != 1) {
            throw new IllegalArgumentException();
        }
        this.semanticGraph = semanticGraph;
        this.propositions = propositions;
        this.temporalRelations = conjunctions;
    }

    /**
     * Adds an initial proposition to an empty {@code PropositionSeries}. If this series is not empty,
     * an {@code IllegalStateException} is thrown.
     *
     * @param proposition the initial proposition to add to the series
     * @throws IllegalStateException if the series not empty
     */
    public void add(TemporalProposition proposition) {
        if (!propositions.isEmpty()) {
            throw new IllegalStateException(
                    "Proposition series is not empty. Use add(Proposition, Conjunction).");
        }
        propositions.add(proposition);
    }

    /**
     * Adds a conjunction and proposition to the series. The conjunction links the formerly last
     * proposition in the series with this proposition. An {@code IllegalStateException} is thrown if
     * there are no propositions in the series when this method is called (since there is then nothing
     * to link the conjunction with).
     *
     * @param conjunction the conjunction between the formerly last proposition and the given
     *     proposition
     * @param proposition the proposition to add to the end of the series
     * @throws IllegalStateException if there is not already at least one proposition in the series
     */
    public void add(TemporalRule.TemporalRelation conjunction, TemporalProposition proposition) {
        if (propositions.isEmpty()) {
            throw new IllegalStateException("Proposition series is empty. Use add(Proposition)");
        }
        temporalRelations.add(conjunction);
        propositions.add(proposition);
    }

    /**
     * Returns true if the series contains the given proposition.
     *
     * @param proposition the proposition that is checked
     * @return true if the series contains the given proposition
     */
    public boolean contains(TemporalProposition proposition) {
        return propositions.contains(proposition);
    }

    /**
     * Returns true if the series is empty (no propositions or temporalRelations).
     *
     * @return true if there are no propositions or temporalRelations in the series
     */
    public boolean isEmpty() {
        return propositions.isEmpty();
    }

    /**
     * Returns the number of propositions in the series.
     *
     * @return the number of propositions in the series
     */
    int numberOfPropositions() {
        return propositions.size();
    }

    /**
     * Returns an unmodifiable list view of the propositions in this series.
     *
     * @return an unmodifiable list view of the propositions in this series
     */
    public List<TemporalProposition> getTemporalPropositions() {
        return Collections.unmodifiableList(propositions);
    }

    /**
     * Returns an unmodifiable list view of the temporalRelations in this series.
     *
     * @return an unmodifiable list view of the temporalRelations in this series
     */
    public List<TemporalRule.TemporalRelation> getTemporalRelations() {
        return Collections.unmodifiableList(temporalRelations);
    }

    /**
     * Returns the translation of this series of propositions to a Java expression.
     *
     * @return the translation of this series of propositions to a Java expression
     */
    public String getTranslation() {
        StringBuilder output = new StringBuilder();
        // Only output translations for those propositions that actually have a translation.
        // The conjunction used to link a proposition is the one immediately preceding it in
        // the series regardless of if the previous proposition has a translation.
        int i = 0;
        while (i < numberOfPropositions() && !propositions.get(i).getTranslation().isPresent()) {
            i++;
        }
        if (i < numberOfPropositions()) {
            String current = propositions.get(i).getTranslation().get();
            output.append(current);
            for (int j = i + 1; j < numberOfPropositions(); j++) {
                if (propositions.get(j).getTranslation().isPresent()) {
                    String next = propositions.get(j).getTranslation().get();
                    if (!current.equals(next)) {
                        output.append(temporalRelations.get(j - 1));
                        output.append(next);
                    }
                }
            }
        }
        return output.toString();
    }

    public List<String> getAllPredicates(){
        return propositions.stream().map(Proposition::getPredicate)
                .collect(Collectors.toList());
    }

//  public List<Verb> getAllVerbs(){
//    return propositions.stream().map(Proposition::getVerb)
//            .collect(Collectors.toList());
//  }

    /**
     * Returns a string representation of this series. The returned string is formatted as
     * "PROPOSITION_A CONJUNCTION_AB PROPOSITION_B CONJUNCTION_BC PROPOSITION_C ..." where
     * CONJUNCTION_ij is the conjunction linking propositions PROPOSITION_i and PROPOSITION_j.
     *
     * @return a string representation of this series
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (!isEmpty()) {
            output.append(propositions.get(0));
            for (int i = 1; i < numberOfPropositions(); i++) {
                output.append(temporalRelations.get(i - 1));
                output.append(propositions.get(i));
            }
        }
        return output.toString();
    }

    public SemanticGraph getSemanticGraph() {
        return semanticGraph;
    }

    public Set<Verb> getVerbsDB() {
        return verbsDB;
    }
}
