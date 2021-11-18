package org.callmemaybe.translator;


import org.callmemaybe.extractor.TemporalMatch;

public class TemporalRule {
    public enum TemporalRelation {
        UNTIL,
        BEFORE,
        AFTER
    }

    public static String getTemporalTranslation(TemporalMatch temporalMatch){
        switch (temporalMatch.getRelations().get(0)){
            case UNTIL: return notUntilTranslation(temporalMatch.getMethodA(), temporalMatch.getMethodB());
            case AFTER: return afterTranslation(temporalMatch.getMethodA(), temporalMatch.getMethodB());
            case BEFORE: return beforeTranslation(temporalMatch.getMethodA(), temporalMatch.getMethodB());
            default: return "";
        }
    }

    // FIXME What are A and B? If they're object is a thing, if they're methods
    // FIXME it's another thing
    /**
     * Translates "A before B".
     * (e.g., "A must be called before B"
     *
     * @param A
     * @param B
     * @return
     */
    // TODO reason a bit better about types -- String...???
    public static String beforeTranslation(String A, String B){
        return A + "->" + B;
    }

    /**
     * Translates "A after B".
     * (e.g., "A can only be called after B"
     *
     * @param A
     * @param B
     * @return
     */
    public static String afterTranslation(String A, String B){
        return B + "->" + A;
    }

    /**
     * Translates "not A until B".
     * (e.g., "A should not be called until B is called",
     *       ~~ "B should precede A")
     *
     * @param A
     * @param B
     * @return
     */
    public static String notUntilTranslation(String A, String B){
        return afterTranslation(A, B);
    }

}

