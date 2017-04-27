package fivecardstud.logic;

import java.util.ArrayList;

/**
 *
 * Täyskäsi.
 */
public class FullHouse implements Rank {

    private final int valueOfThreeOfAKind;

    /**
     * Etsii annetun käden korteista, minkä kokoiset kolmoset kädestä muodostuva
     * täyskäsi sisältää.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public FullHouse(ArrayList<Card> cards) {
        this.valueOfThreeOfAKind = cards.get(2).getValue();
    }

    /**
     * Palauttaa arvon, josta täyskäden kolmoset koostuvat. Tällä voidaan
     * vertailla täyskäsiä toisiin täyskäsiin.
     *
     * @return arvo josta täyskäden kolmoset koostuvat
     */
    public int getValueOfThreeOfAKind() {
        return valueOfThreeOfAKind;
    }

    @Override
    public int rankAsNumber() {
        return 7;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        FullHouse fh = (FullHouse) r;
        return valueOfThreeOfAKind - fh.getValueOfThreeOfAKind();
    }

    @Override
    public String toString() {
        return "Full House";
    }

}
