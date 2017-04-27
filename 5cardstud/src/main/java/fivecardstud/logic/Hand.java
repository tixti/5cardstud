package fivecardstud.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Luokka, joka muodostaa annetusta viidestä kortista pokerikäden.
 */
public final class Hand implements Comparable<Hand> {

    private final ArrayList<Card> cards;
    private Rank rank;

    /**
     * Muodostaa annetuista korteista pokerikäden.
     *
     * @param c1 ensimmäinen kortti
     * @param c2 toinen kortti
     * @param c3 kolmas kortti
     * @param c4 neljäs kortti
     * @param c5 viides kortti
     */
    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
        this.cards = new ArrayList();
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        cards.add(c4);
        cards.add(c5);
        Collections.sort(cards);
        rankHand();
    }

    /**
     * Metodi tarkastaa mikä pokerikäsi on kyseessä.
     */
    public void rankHand() {
        if (isStraightFlush()) {
            StraightFlush straightFlush = new StraightFlush(cards);
            this.rank = straightFlush;
        } else if (isFourOfAKind()) {
            FourOfAKind fourOfAKind = new FourOfAKind(cards);
            this.rank = fourOfAKind;
        } else if (isFullHouse()) {
            FullHouse fullHouse = new FullHouse(cards);
            this.rank = fullHouse;
        } else if (isFlush()) {
            Flush flush = new Flush(cards);
            this.rank = flush;
        } else if (isStraight()) {
            Straight straight = new Straight(cards);
            this.rank = straight;
        } else if (isThreeOfAKind()) {
            ThreeOfAKind threeOfAKind = new ThreeOfAKind(cards);
            this.rank = threeOfAKind;
        } else if (isTwoPair()) {
            TwoPair twoPair = new TwoPair(cards);
            this.rank = twoPair;
        } else if (isPair()) {
            Pair pair = new Pair(cards);
            this.rank = pair;
        } else {
            HighCard highCard = new HighCard(cards);
            this.rank = highCard;
        }
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa värisuoran.
     */
    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa neloset.
     */
    public boolean isFourOfAKind() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 4; i++) {
            a.add(cards.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 1; i < 5; i++) {
            b.add(cards.get(i).getValue());
        }
        if (a.size() == 1) {
            return true;
        }
        return b.size() == 1;
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa täydenkäden.
     */
    public boolean isFullHouse() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 3; i++) {
            a.add(cards.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 3; i < 5; i++) {
            b.add(cards.get(i).getValue());
        }
        if (a.size() == 1 && b.size() == 1) {
            return true;
        }
        Set<Integer> c = new TreeSet();
        for (int i = 0; i < 2; i++) {
            c.add(cards.get(i).getValue());
        }
        Set<Integer> d = new TreeSet();
        for (int i = 2; i < 5; i++) {
            d.add(cards.get(i).getValue());
        }
        return (c.size() == 1 && d.size() == 1);
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa värin.
     */
    public boolean isFlush() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 5; i++) {
            a.add(cards.get(i).getSuit());
        }
        return a.size() == 1;
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodsotaa suoran.
     */
    public boolean isStraight() {
        if (cards.get(0).getValue() == cards.get(1).getValue() - 1 && cards.get(1).getValue() == cards.get(2).getValue() - 1) {
            if (cards.get(2).getValue() == cards.get(3).getValue() - 1 && cards.get(3).getValue() == cards.get(4).getValue() - 1) {
                return true;
            }
        }
        if (cards.get(0).getValue() == 2 && cards.get(1).getValue() == 3 && cards.get(2).getValue() == 4) {
            if (cards.get(3).getValue() == 5 && cards.get(4).getValue() == 14) {
                return true;
            }
        }
        return false;
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa kolmoset.
     */
    public boolean isThreeOfAKind() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 3; i++) {
            a.add(cards.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 1; i < 4; i++) {
            b.add(cards.get(i).getValue());
        }
        Set<Integer> c = new TreeSet();
        for (int i = 2; i < 5; i++) {
            c.add(cards.get(i).getValue());
        }
        return (a.size() == 1 || b.size() == 1 || c.size() == 1);
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa kahdet parit.
     */
    public boolean isTwoPair() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 2; i++) {
            a.add(cards.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 2; i < 5; i++) {
            b.add(cards.get(i).getValue());
        }
        if (a.size() == 1 && b.size() == 2) {
            return true;
        }

        Set<Integer> c = new TreeSet();
        for (int i = 0; i < 3; i++) {
            c.add(cards.get(i).getValue());
        }
        Set<Integer> d = new TreeSet();
        for (int i = 3; i < 5; i++) {
            d.add(cards.get(i).getValue());
        }
        return c.size() == 2 && d.size() == 1;
    }

    /**
     * .
     * @return Kertoo, voiko kädestä muodostaa parin.
     */
    public boolean isPair() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 5; i++) {
            a.add(cards.get(i).getValue());
        }
        return a.size() == 4;
    }

    public Rank getRank() {
        return rank;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public int compareTo(Hand h) {
        return rank.compareTo(h.getRank());
    }
}
