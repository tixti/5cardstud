package fivecardstud.logic;

import java.util.ArrayList;

/**
 *
 * Kolmoset.
 */
public class ThreeOfAKind implements Rank {

    private final int value;

    /**
     * Etsii annetun käden korteista, minkä kokoiset kolmoset käsi sisältää.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public ThreeOfAKind(ArrayList<Card> cards) {
        this.value = cards.get(2).getValue();
    }

    /**
     * Palauttaa arvon, josta kolmoset koostuvat. Tällä voidaan vertailla
     * kolmosia toisiin kolmosiin.
     *
     * @return arvo josta kolmoset koostuvat
     */
    public int getValue() {
        return value;
    }

    @Override
    public int rankAsNumber() {
        return 4;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        ThreeOfAKind t = (ThreeOfAKind) r;
        return value - t.getValue();
    }

    @Override
    public String toString() {
        return "Three of A Kind";
    }

}
