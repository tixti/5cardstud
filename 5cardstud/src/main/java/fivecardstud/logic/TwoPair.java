package fivecardstud.logic;

import java.util.ArrayList;

/**
 *
 * Kaksi paria.
 */
public class TwoPair implements Rank {

    private final int valueOfBiggerPair;
    private final int valueOfSmallerPair;
    private final int kicker;

    /**
     * Etsii annetun käden korteista niiden sisältämien parien ja haipelien
     * arvot.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public TwoPair(ArrayList<Card> cards) {
        if (cards.get(0).getValue() != cards.get(1).getValue()) {
            this.kicker = cards.get(0).getValue();
        } else if (cards.get(2).getValue() != cards.get(3).getValue()) {
            this.kicker = cards.get(2).getValue();
        } else {
            this.kicker = cards.get(4).getValue();
        }
        this.valueOfBiggerPair = cards.get(3).getValue();
        this.valueOfSmallerPair = cards.get(1).getValue();
    }

    /**
     * Palauttaa kahden parin isomman parin arvon. Tällä voidaan vertailla
     * kaksia pareja toisiin kaksiin pareihin.
     *
     * @return kahden parin suuremman parin arvo
     */
    public int getValueOfBiggerPair() {
        return valueOfBiggerPair;
    }

    /**
     * Palauttaa kahden parin pienemmän parin arvon. Tällä voidaan vertailla
     * kaksia pareja toisiin kaksiin pareihin.
     *
     * @return kahden parin pienemmän parin arvo
     */
    public int getValueOfSmallerPair() {
        return valueOfSmallerPair;
    }

    /**
     * Palauttaa kahden parin haikortin arvon. Tällä voidaan vertailla kaksia
     * pareja toisiin kaksiin pareihin.
     *
     * @return kahden parin haikortin arvo
     */
    public int getKicker() {
        return kicker;
    }

    @Override
    public int rankAsNumber() {
        return 3;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        TwoPair tp = (TwoPair) r;
        if (valueOfBiggerPair != tp.getValueOfBiggerPair()) {
            return valueOfBiggerPair - tp.getValueOfBiggerPair();
        }
        if (valueOfSmallerPair != tp.getValueOfSmallerPair()) {
            return valueOfSmallerPair - tp.getValueOfSmallerPair();
        }
        return kicker - tp.getKicker();
    }

    @Override
    public String toString() {
        return "Two Pairs";
    }

}
