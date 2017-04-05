/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Omistaja
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;
    private Rank rank;
    
    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
        this.hand = new ArrayList();
        hand.add(c1);
        hand.add(c2);
        hand.add(c3);
        hand.add(c4);
        hand.add(c5);
        Collections.sort(hand);
        rankHand();
    }    
    public void addCard(Card card) {
        hand.add(card);
    }
    
    public void rankHand() {
        if (isStraightFlush()) {
            int highestCard = 0;
            if (hand.get(3).getValue() == 5 && hand.get(4).getValue() == 14) {
                highestCard = 5;
            } else {
                highestCard = hand.get(4).getValue();
            }
            StraightFlush straightFlush = new StraightFlush(highestCard);
            this.rank = straightFlush;
        } else if (isFourOfAKind()) {        
            FourOfAKind fourOfAKind = new FourOfAKind(hand.get(2).getValue());
            this.rank = fourOfAKind;
        } else if (isFullHouse()) {
            FullHouse fullHouse = new FullHouse(hand.get(2).getValue());
            this.rank = fullHouse;
        } else if (isFlush()) {
            Flush flush = new Flush(hand.get(4).getValue(), hand.get(3).getValue(), hand.get(2).getValue(), hand.get(1).getValue(), hand.get(0).getValue());
            this.rank = flush;
        } else if (isStraight()) {
            int highestCard = 0;
            if (hand.get(3).getValue() == 5 && hand.get(4).getValue() == 14) {
                highestCard = 5;
            } else {
                highestCard = hand.get(4).getValue();
            }
            Straight straight = new Straight(highestCard);
            this.rank = straight;
        } else if (isThreeOfAKind()) {
            ThreeOfAKind threeOfAKind = new ThreeOfAKind(hand.get(2).getValue());
            this.rank = threeOfAKind;
        } else if (isTwoPair()) {
            int kicker = 0;
            if (hand.get(0).getValue() != hand.get(1).getValue()) {
                kicker = hand.get(0).getValue();
            } else if (hand.get(2).getValue() != hand.get(3).getValue()) {
                kicker = hand.get(2).getValue();
            } else {
                kicker = hand.get(4).getValue();
            }
            TwoPair twoPair = new TwoPair(hand.get(3).getValue(), hand.get(1).getValue(), kicker);
            this.rank = twoPair;
        } else if (isPair()) {
            int value = 0;
            ArrayList<Integer> kickers = new ArrayList();
            int pairLocation = 999;         
            for (int i = 0; i < 4; i++) {
                if (hand.get(i).getValue() == hand.get(i + 1).getValue()) {
                    value = hand.get(i).getValue();
                    pairLocation = i;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (i != pairLocation && i != pairLocation + 1) {
                    kickers.add(hand.get(i).getValue());
                }
            }
            Pair pair = new Pair(value, kickers.get(2), kickers.get(1), kickers.get(0));
            this.rank = pair;
        } else {
            HighCard highCard = new HighCard(hand.get(4).getValue(), hand.get(3).getValue(), hand.get(2).getValue(), hand.get(1).getValue(), hand.get(0).getValue());
            this.rank = highCard;
        }
        
    }
    
    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }
    
    public boolean isFourOfAKind() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 4; i++) {
            a.add(hand.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 1; i < 5; i++) {
            b.add(hand.get(i).getValue());
        }
        if (a.size() == 1) {
            return true;
        }
        return b.size() == 1;
    }
    
    public boolean isFullHouse() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 3; i++) {
            a.add(hand.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 3; i < 5; i++) {
            b.add(hand.get(i).getValue());
        }
        if (a.size() == 1 && b.size() == 1) {
            return true;
        }
        Set<Integer> c = new TreeSet();
        for (int i = 0; i < 2; i++) {
            c.add(hand.get(i).getValue());
        }
        Set<Integer> d = new TreeSet();
        for (int i = 2; i < 5; i++) {
            d.add(hand.get(i).getValue());
        }
        return (c.size() == 1 && d.size() == 1);
    }
    
    public boolean isFlush() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 5; i++) {
            a.add(hand.get(i).getSuit());
        }
        return a.size() == 1;
    }
    
    public boolean isStraight() {
        if (hand.get(0).getValue() == hand.get(1).getValue() - 1) {
            if (hand.get(1).getValue() == hand.get(2).getValue() - 1) {
                if (hand.get(2).getValue() == hand.get(3).getValue() - 1) {
                    if (hand.get(3).getValue() == hand.get(4).getValue() - 1) {
                        return true;
                    }
                }
            }
        }
        if (hand.get(0).getValue() == 2) {
            if (hand.get(1).getValue() == 3) {
                if (hand.get(2).getValue() == 4) {
                    if (hand.get(3).getValue() == 5) {
                        if (hand.get(4).getValue() == 14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean isThreeOfAKind() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 3; i++) {
            a.add(hand.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 1; i < 4; i++) {
            b.add(hand.get(i).getValue());
        }
        Set<Integer> c = new TreeSet();
        for (int i = 2; i < 5; i++) {
            c.add(hand.get(i).getValue());
        }
        return (a.size() == 1 || b.size() == 1 || c.size() == 1);
    }
    
    public boolean isTwoPair() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 2; i++) {
            a.add(hand.get(i).getValue());
        }
        Set<Integer> b = new TreeSet();
        for (int i = 2; i < 5; i++) {
            b.add(hand.get(i).getValue());
        }
        if (a.size() == 1 && b.size() == 2) {
            return true;
        }
        
        Set<Integer> c = new TreeSet();
        for (int i = 0; i < 3; i++) {
            c.add(hand.get(i).getValue());
        }
        Set<Integer> d = new TreeSet();
        for (int i = 3; i < 5; i++) {
            d.add(hand.get(i).getValue());
        }
        return c.size() == 2 && d.size() == 1;
    }
    
    public boolean isPair() {
        Set<Integer> a = new TreeSet();
        for (int i = 0; i < 5; i++) {
            a.add(hand.get(i).getValue());
        }
        return a.size() == 4;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public int compareTo(Hand h) {
        if (rank.rankAsNumber() != h.getRank().rankAsNumber()) {
            return rank.rankAsNumber() - h.getRank().rankAsNumber();
        }
        if (rank.rankAsNumber() == 9) {
            StraightFlush ownSf = (StraightFlush) rank;
            StraightFlush hSf = (StraightFlush) h.getRank();
            return ownSf.getHighestCard() - hSf.getHighestCard();
        }
        if (rank.rankAsNumber() == 8) {
            FourOfAKind ownF = (FourOfAKind) rank;
            FourOfAKind hF = (FourOfAKind) h.getRank();
            return ownF.getValue() - hF.getValue();
        }
        if (rank.rankAsNumber() == 7) {
            FullHouse ownFh = (FullHouse) rank;
            FullHouse hFh = (FullHouse) h.getRank();
            return ownFh.getValueOfThreeOfAKind() - hFh.getValueOfThreeOfAKind();
        }
        if (rank.rankAsNumber() == 6) {
            Flush ownF = (Flush) rank;
            Flush hF = (Flush) h.getRank();
            for (int i = 0; i < 5; i++) {
                if (ownF.getValues().get(i) != hF.getValues().get(i)) {
                    return ownF.getValues().get(i) - hF.getValues().get(i);
                }
            }
            return 0;
        }
        if (rank.rankAsNumber() == 5) {
            Straight ownS = (Straight) rank;
            Straight hS = (Straight) h.getRank();
            return ownS.getHighestCard() - hS.getHighestCard();
        }
        if (rank.rankAsNumber() == 4) {
            ThreeOfAKind ownT = (ThreeOfAKind) rank;
            ThreeOfAKind hT = (ThreeOfAKind) h.getRank();
            return ownT.getValue() - hT.getValue();
        }
        if (rank.rankAsNumber() == 3) {
            TwoPair ownTp = (TwoPair) rank;
            TwoPair hTp = (TwoPair) h.getRank();
            if (ownTp.getValueOfBiggerPair() != hTp.getValueOfBiggerPair()) {
                return ownTp.getValueOfBiggerPair() - hTp.getValueOfBiggerPair();
            }    
            if (ownTp.getValueOfSmallerPair() != hTp.getValueOfSmallerPair()) {
                return ownTp.getValueOfSmallerPair() - hTp.getValueOfSmallerPair();
            }
            return ownTp.getKicker() - hTp.getKicker();
        }
        if (rank.rankAsNumber() == 2) {
            Pair ownP = (Pair) rank;
            Pair hP = (Pair) h.getRank();
            if (ownP.getValueOfPair() != hP.getValueOfPair()) {
                return ownP.getValueOfPair() - hP.getValueOfPair();
            }
            for (int i = 0; i < 3; i++) {
                if (ownP.getKickers().get(i) != hP.getKickers().get(i)) {
                    return ownP.getKickers().get(i) - hP.getKickers().get(i);
                }
            }
            return 0;
        }
        HighCard ownHc = (HighCard) rank;
        HighCard hHc = (HighCard) h.getRank();
        for (int i = 0; i < 5; i++) {
            if (ownHc.getValues().get(i) != hHc.getValues().get(i)) {
                return ownHc.getValues().get(i) - hHc.getValues().get(i);
            }
        }
        return 0;
    }
    
    
    
    
    
    

    
    
}
