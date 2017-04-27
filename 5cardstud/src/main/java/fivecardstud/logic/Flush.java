package fivecardstud.logic;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * Väri.
 */
public class Flush implements Rank {

    private ArrayList<Integer> values;

    /**
     * Lisää kortit joista väri koostuu listaan suuruusjärjestyksessä.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public Flush(ArrayList<Card> cards) {
        values = new ArrayList();
        values.add(cards.get(4).getValue());
        values.add(cards.get(3).getValue());
        values.add(cards.get(2).getValue());
        values.add(cards.get(1).getValue());
        values.add(cards.get(0).getValue());
    }

    /**
     * Palauttaa värin korttien arvot. Näiden avulla väriä voidaan vertailla
     * toisiin väreihin. .
     *
     * @return korttien arvot josta väri koostuu
     */
    public ArrayList<Integer> getValues() {
        return values;
    }

    @Override
    public int rankAsNumber() {
        return 6;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        Flush f = (Flush) r;
        for (int i = 0; i < 5; i++) {
            if (!Objects.equals(values.get(i), f.getValues().get(i))) {
                return values.get(i) - f.getValues().get(i);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "a Flush";
    }

}
