package fivecardstud.logic;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * Hai.
 */
public class HighCard implements Rank {

    private final ArrayList<Integer> values;

    /**
     * Lisää haipelin haikortit suuruusjärjestyksessä listaan.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public HighCard(ArrayList<Card> cards) {
        this.values = new ArrayList();
        values.add(cards.get(4).getValue());
        values.add(cards.get(3).getValue());
        values.add(cards.get(2).getValue());
        values.add(cards.get(1).getValue());
        values.add(cards.get(0).getValue());
    }

    /**
     * Palauttaa haipelin haikorttien arvot. Näillä voidaan vertailla haipeliä
     * toisiin haipeleihin.
     *
     * @return haikorttien arvot
     */
    public ArrayList<Integer> getValues() {
        return values;
    }

    @Override
    public int rankAsNumber() {
        return 1;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        HighCard hc = (HighCard) r;
        for (int i = 0; i < 5; i++) {
            if (!Objects.equals(values.get(i), hc.getValues().get(i))) {
                return values.get(i) - hc.getValues().get(i);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "High Card";
    }

}
