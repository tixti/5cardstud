package fivecardstud.logic;

import java.util.ArrayList;

/**
 *
 * Suora.
 */
public class Straight implements Rank {

    private final int highestCard;

    /**
     * Etsii annetuista korteista suoran suurimman kortin.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public Straight(ArrayList<Card> cards) {
        if (cards.get(3).getValue() == 5 && cards.get(4).getValue() == 14) {
            this.highestCard = 5;
        } else {
            this.highestCard = cards.get(4).getValue();
        }
    }

    /**
     * Palauttaa suoran korkeimman kortin, jonka avulla suoraa voidaan vertailla
     * muihin suoriin.
     *
     * @return suoran korkeimman kortin arvo
     */
    public int getHighestCard() {
        return highestCard;
    }

    @Override
    public int rankAsNumber() {
        return 5;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        Straight s = (Straight) r;
        return highestCard - s.getHighestCard();
    }

    @Override
    public String toString() {
        return "a Straight";
    }

}
