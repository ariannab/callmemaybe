package org.callmemaybe.translator;

import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.simple.Sentence;
import org.tartarus.snowball.ext.EnglishStemmer;

import java.util.Objects;

public class Verb{

    public enum KindOfVerb{
        COPULA,
        PASSIVE,
        AUX,
        NON_COPULA,
        CONJUNCTION
    }

    IndexedWord word;
    KindOfVerb kindOfVerb;

    public Verb(IndexedWord indexedWord, KindOfVerb kindOfVerb) {
        this.kindOfVerb = kindOfVerb;
        this.word = indexedWord;
    }

    public String getWord() {
        return word.word();
    }

    public KindOfVerb getKindOfVerb() {
        return kindOfVerb;
    }

//    /**
//     * Given a word text, lemmatize it and then stem it.
//     *
//     * @return the result of lemmatization+stemmating
//     */
//    public String getStemmedLemma() {
//        // TODO Ari -- this used to be PorterStemmer, but it seems to have some bugs:
//        // TODO For example, it would stem "one" as "on".
//        // TODO For a reference to how a word should be stem, you can try at:
//        // TODO https://text-processing.com/demo/stem/
//        // TODO For now I switch to EnglishStemmer because it does not present the same bug.
//        String lemma = new Sentence(this.word.word()).lemma(0);
//        EnglishStemmer stemmer = new EnglishStemmer();
//        stemmer.setCurrent(lemma);
//        stemmer.stem();
//        String stem = stemmer.getCurrent();
//        return stem;
//    }
//
//    /**
//     * Given a word text, lemmatize it and then stem it.
//     *
//     * @return the result of lemmatization+stemmating
//     */
//    public String getLemma() {
//        return new Sentence(this.word.word()).lemma(0);
//    }
}
