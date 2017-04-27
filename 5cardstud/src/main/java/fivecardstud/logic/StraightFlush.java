package fivecardstud.logic;

import java.util.ArrayList;

/**
 * Värisuora.
 */
public class StraightFlush implements Rank {

    private final int highestCard;

    /**
     * Etsii annetuista korteista värisuoran suurimman kortin.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public StraightFlush(ArrayList<Card> cards) {
        if (cards.get(3).getValue() == 5 && cards.get(4).getValue() == 14) {
            this.highestCard = 5;
        } else {
            this.highestCard = cards.get(4).getValue();
        }
    }

    /**
     * Palauttaa värisuoran korkeimman kortin, jonka avulla värisuoraa voidaan
     * vertailla muihin värisuoriin.
     *
     * @return värisuoran korkeimman kortin arvo
     */
    public int getHighestCard() {
        return highestCard;
    }

    @Override
    public int rankAsNumber() {
        return 9;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        StraightFlush sf = (StraightFlush) r;
        return highestCard - sf.getHighestCard();
    }

    @Override
    public String toString() {
        return "a Straigh Flush";
    }

}
