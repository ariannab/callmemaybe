package org.callmemaybe.translator;

import edu.stanford.nlp.ling.IndexedWord;

public class Verb extends IndexedWord{

    public enum KindOfVerb{
        COPULA,
        PASSIVE,
        AUX,
        NON_COPULA,
        CONJUNCTION
    }

    IndexedWord indexedWord;
    String word;
    KindOfVerb kindOfVerb;

    public Verb(IndexedWord indexedWord, KindOfVerb kindOfVerb) {
        this.indexedWord = indexedWord;
        this.kindOfVerb = kindOfVerb;
        this.word = indexedWord.word();
    }

    public IndexedWord getIndexedWord() {
        return indexedWord;
    }

    public String getWord() {
        return word;
    }

    public KindOfVerb getKindOfVerb() {
        return kindOfVerb;
    }
}
