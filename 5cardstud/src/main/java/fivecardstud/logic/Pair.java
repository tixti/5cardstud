package fivecardstud.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * Pari.
 */
public class Pair implements Rank {

    private int valueOfPair;
    private final ArrayList<Integer> kickers;

    /**
     * Etsii annetun käden korteista niiden sisältämän parin ja haipelien arvot.
     *
     * @param cards kortit joista käsi muodostuu
     */
    public Pair(ArrayList<Card> cards) {
        this.kickers = new ArrayList();
        int pairLocation = 999;
        for (int i = 0; i < 4; i++) {
            if (cards.get(i).getValue() == cards.get(i + 1).getValue()) {
                this.valueOfPair = cards.get(i).getValue();
                pairLocation = i;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i != pairLocation && i != pairLocation + 1) {
                kickers.add(cards.get(i).getValue());
            }
        }
        Collections.reverse(kickers);
    }

    /**
     * Palauttaa parin arvon. Tällä voidaan vertailla paria toisiin pareihin.
     *
     * @return parin arvo
     */
    public int getValueOfPair() {
        return valueOfPair;
    }

    /**
     * Palauttaa parin haikorttien arvot. Näillä voidaan vertailla paria toisiin
     * pareihin.
     *
     * @return parin haikorttien arvot
     */
    public ArrayList<Integer> getKickers() {
        return kickers;
    }

    @Override
    public int rankAsNumber() {
        return 2;
    }

    @Override
    public int compareTo(Rank r) {
        if (rankAsNumber() != r.rankAsNumber()) {
            return rankAsNumber() - r.rankAsNumber();
        }
        Pair p = (Pair) r;
        if (valueOfPair != p.getValueOfPair()) {
            return valueOfPair - p.getValueOfPair();
        }
        for (int i = 0; i < 3; i++) {
            if (!Objects.equals(kickers.get(i), p.getKickers().get(i))) {
                return kickers.get(i) - p.getKickers().get(i);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "a Pair";
    }

}
