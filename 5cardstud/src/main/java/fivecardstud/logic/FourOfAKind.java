package fivecardstud.logic;

import java.util.ArrayList;

/**
 * Neloset.
 */
public class FourOfAKind implements Rank {

    private final int value;

    /**
     * Etsii annetun käden korteista, minkä kokoiset neloset käsi sisältää.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public FourOfAKind(ArrayList<Card> cards) {
        this.value = cards.get(2).getValue();
    }

    /**
     * Palauttaa arvon, josta neloset koostuvat. Tällä voidaan vertailla nelosia
     * toisiin nelosiin.
     *
     * @return arvo josta neloset koostuvat
     */
    public int getValue() {
        return value;
    }

    @Override
    public int rankAsNumber() {
        return 8;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        FourOfAKind f = (FourOfAKind) r;
        return value - f.getValue();
    }

    @Override
    public String toString() {
        return "Four of a Kind";
    }

}
