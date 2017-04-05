/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Omistaja
 */
public class HandTest {
    
    @Test
    public void straightFlushIsRecognized() {
        Card c1 = new Card(13, 4);
        Card c2 = new Card(10, 4);
        Card c3 = new Card(9, 4);
        Card c4 = new Card(12, 4);
        Card c5 = new Card(11, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isStraightFlush());
        assertThat(hand.getRank(), instanceOf(StraightFlush.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(3, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 3);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isStraightFlush());
    }
    
    @Test
    public void fourOfAKindIsRecognized() {
        Card c1 = new Card(2, 1);
        Card c2 = new Card(2, 2);
        Card c3 = new Card(3, 3);
        Card c4 = new Card(2, 3);
        Card c5 = new Card(2, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isFourOfAKind());
        assertThat(hand.getRank(), instanceOf(FourOfAKind.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(3, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 3);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isFourOfAKind());
    }
    
    @Test 
    public void fullHouseIsRecognized() {
        Card c1 = new Card(3, 1);
        Card c2 = new Card(2, 2);
        Card c3 = new Card(3, 3);
        Card c4 = new Card(2, 3);
        Card c5 = new Card(3, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isFullHouse());
        assertThat(hand.getRank(), instanceOf(FullHouse.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(3, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 3);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isFullHouse());
    }
    
    @Test
    public void flushIsRecognized() {
        Card c1 = new Card(3, 1);
        Card c2 = new Card(5, 1);
        Card c3 = new Card(7, 1);
        Card c4 = new Card(9, 1);
        Card c5 = new Card(11, 1);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isFlush());
        assertThat(hand.getRank(), instanceOf(Flush.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(3, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(8, 3);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isFlush());     
    }
    
    @Test
    public void straightIsRecognized() {
        Card c1 = new Card(3, 1);
        Card c2 = new Card(4, 4);
        Card c3 = new Card(6, 1);
        Card c4 = new Card(5, 3);
        Card c5 = new Card(7, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isStraight());
        assertThat(hand.getRank(), instanceOf(Straight.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(3, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 3);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.isStraight());
        assertThat(hand.getRank(), instanceOf(Straight.class));
        Card c11 = new Card(9, 1);
        Card c12 = new Card(9, 2);
        Card c13 = new Card(9, 3);
        Card c14 = new Card(4, 3);
        Card c15 = new Card(5, 4);
        Hand hand3 = new Hand(c11, c12, c13, c14, c15);
        assertFalse(hand3.isStraight());    
    }
    
    @Test
    public void threeOfAKindisRecognized() {
        Card c1 = new Card(5, 1);
        Card c2 = new Card(5, 4);
        Card c3 = new Card(6, 1);
        Card c4 = new Card(5, 3);
        Card c5 = new Card(7, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isThreeOfAKind());
        assertThat(hand.getRank(), instanceOf(ThreeOfAKind.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(3, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 3);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isThreeOfAKind());
    }
    
    @Test
    public void twoPairIsRecognized() {
        Card c1 = new Card(8, 2);
        Card c2 = new Card(9, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(8, 3);
        Card c5 = new Card(9, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isTwoPair());
        assertThat(hand.getRank(), instanceOf(TwoPair.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(2, 2);
        Card c8 = new Card(3, 3);
        Card c9 = new Card(4, 3);
        Card c10 = new Card(11, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isTwoPair());
    }
    
    @Test
    public void pairIsRecognized() {
        Card c1 = new Card(8, 2);
        Card c2 = new Card(9, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(8, 3);
        Card c5 = new Card(5, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertTrue(hand.isPair());
        assertThat(hand.getRank(), instanceOf(Pair.class));
        Card c6 = new Card(2, 1);
        Card c7 = new Card(7, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(9, 3);
        Card c10 = new Card(11, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertFalse(hand2.isPair());
    }   
    
    @Test
    public void highCardIsRecognized() {
        Card c1 = new Card(8, 2);
        Card c2 = new Card(9, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(5, 3);
        Card c5 = new Card(2, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        assertThat(hand.getRank(), instanceOf(HighCard.class));
    }
    
    @Test
    public void straightFlushHasRightHighestCard() {
        Card c1 = new Card(13, 4);
        Card c2 = new Card(10, 4);
        Card c3 = new Card(9, 4);
        Card c4 = new Card(12, 4);
        Card c5 = new Card(11, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        StraightFlush sf = (StraightFlush)hand.getRank();
        assertTrue(sf.getHighestCard() == 13);
        Card c6 = new Card(2, 4);
        Card c7 = new Card(3, 4);
        Card c8 = new Card(5, 4);
        Card c9 = new Card(4, 4);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        StraightFlush sf2 = (StraightFlush)hand2.getRank();
        assertTrue(sf2.getHighestCard() == 5);       
    }
    
    @Test
    public void fourOfAKindHasRightValue() {
        Card c1 = new Card(8, 2);
        Card c2 = new Card(8, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(8, 1);
        Card c5 = new Card(8, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        FourOfAKind f = (FourOfAKind)hand.getRank();
        assertTrue(f.getValue() == 8);
    }
    
    @Test
    public void fullHouseHasRightValueOfThreeOfAKind() {
        Card c1 = new Card(3, 2);
        Card c2 = new Card(3, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(3, 1);
        Card c5 = new Card(10, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        FullHouse fh = (FullHouse)hand.getRank();
        assertTrue(fh.getValueOfThreeOfAKind() == 3);
    }
    
    @Test
    public void flushHasRightValues() {
        Card c1 = new Card(13, 4);
        Card c2 = new Card(3, 4);
        Card c3 = new Card(7, 4);
        Card c4 = new Card(2, 4);
        Card c5 = new Card(9, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Flush f = (Flush)hand.getRank();
        assertTrue(f.getValues().get(0) == 13);
        assertTrue(f.getValues().get(1) == 9);
        assertTrue(f.getValues().get(2) == 7);
        assertTrue(f.getValues().get(3) == 3);
        assertTrue(f.getValues().get(4) == 2);
    }
    
    @Test
    public void straightHasRightHighestCard() {
        Card c1 = new Card(13, 4);
        Card c2 = new Card(10, 3);
        Card c3 = new Card(9, 4);
        Card c4 = new Card(12, 2);
        Card c5 = new Card(11, 1);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Straight s = (Straight)hand.getRank();
        assertTrue(s.getHighestCard() == 13);
        Card c6 = new Card(2, 2);
        Card c7 = new Card(3, 3);
        Card c8 = new Card(5, 4);
        Card c9 = new Card(4, 1);
        Card c10 = new Card(14, 4);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        Straight s2 = (Straight)hand2.getRank();
        assertTrue(s2.getHighestCard() == 5);       
    }
    
    @Test
    public void threeOfAKindHasRightValue() {
        Card c1 = new Card(8, 2);
        Card c2 = new Card(8, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(8, 1);
        Card c5 = new Card(3, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        ThreeOfAKind t = (ThreeOfAKind)hand.getRank();
        assertTrue(t.getValue() == 8);
    }
    
    @Test
    public void twoPairPairsAndKickerAreRight() {
        Card c1 = new Card(6, 2);
        Card c2 = new Card(6, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(11, 1);
        Card c5 = new Card(11, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        TwoPair tp = (TwoPair)hand.getRank();
        assertTrue(tp.getValueOfBiggerPair() == 11);
        assertTrue(tp.getValueOfSmallerPair() == 6);
        assertTrue(tp.getKicker() == 10);
    }
    
    @Test
    public void PairAndKickersAreRight() {
        Card c1 = new Card(6, 2);
        Card c2 = new Card(12, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(11, 1);
        Card c5 = new Card(11, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Pair p = (Pair)hand.getRank();
        assertTrue(p.getValueOfPair() == 11);
        assertTrue(p.getKickers().get(0) == 12);
        assertTrue(p.getKickers().get(1) == 10);
        assertTrue(p.getKickers().get(2) == 6);             
    }
    
    @Test
    public void highCardValuesAreRight() {
        Card c1 = new Card(6, 2);
        Card c2 = new Card(12, 4);
        Card c3 = new Card(10, 1);
        Card c4 = new Card(5, 1);
        Card c5 = new Card(2, 3);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        HighCard hc = (HighCard)hand.getRank();
        assertTrue(hc.getValues().get(0) == 12);
        assertTrue(hc.getValues().get(1) == 10);
        assertTrue(hc.getValues().get(2) == 6);
        assertTrue(hc.getValues().get(3) == 5);
        assertTrue(hc.getValues().get(4) == 2);
    }
    
    @Test
    public void straightFlushBeatsPair() {
        Card c1 = new Card(13, 4);
        Card c2 = new Card(10, 4);
        Card c3 = new Card(9, 4);
        Card c4 = new Card(12, 4);
        Card c5 = new Card(11, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(2, 4);
        Card c7 = new Card(2, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 2);
        Card c10 = new Card(14, 1);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand.compareTo(hand2) > 0);
    }
    
    @Test 
    public void highCardLosesToThreeOfAKind() {
        Card c1 = new Card(13, 4);
        Card c2 = new Card(13, 2);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(12, 1);
        Card c5 = new Card(13, 1);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(2, 4);
        Card c7 = new Card(11, 2);
        Card c8 = new Card(5, 3);
        Card c9 = new Card(4, 2);
        Card c10 = new Card(14, 1);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.compareTo(hand) < 0);
    }
    
    @Test
    public void tenHighStraightTiesWithTenHighStraight() {
        Card c1 = new Card(10, 4);
        Card c2 = new Card(8, 2);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(6, 1);
        Card c5 = new Card(7, 1);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(6, 4);
        Card c7 = new Card(7, 2);
        Card c8 = new Card(9, 1);
        Card c9 = new Card(10, 2);
        Card c10 = new Card(8, 3);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.compareTo(hand) == 0);
    }
    
    @Test
    public void biggerStraightFlushBeatsSmallerStraightFlush() {
        Card c1 = new Card(14, 4);
        Card c2 = new Card(13, 4);
        Card c3 = new Card(12, 4);
        Card c4 = new Card(11, 4);
        Card c5 = new Card(10, 4);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(6, 2);
        Card c7 = new Card(7, 2);
        Card c8 = new Card(9, 2);
        Card c9 = new Card(10, 2);
        Card c10 = new Card(8, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand.compareTo(hand2) > 0);
    }
    
    @Test
    public void smallerFourOfAKindLosesToBiggerFourOfAKind() {
        Card c1 = new Card(14, 1);
        Card c2 = new Card(14, 4);
        Card c3 = new Card(12, 4);
        Card c4 = new Card(14, 3);
        Card c5 = new Card(14, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(6, 1);
        Card c7 = new Card(6, 2);
        Card c8 = new Card(6, 3);
        Card c9 = new Card(6, 4);
        Card c10 = new Card(8, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.compareTo(hand) < 0);
    }
    
    @Test
    public void biggerFullHouseBeatsSmallerFullHouse() {
        Card c1 = new Card(14, 1);
        Card c2 = new Card(14, 4);
        Card c3 = new Card(12, 4);
        Card c4 = new Card(12, 3);
        Card c5 = new Card(14, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(6, 1);
        Card c7 = new Card(6, 2);
        Card c8 = new Card(6, 3);
        Card c9 = new Card(13, 4);
        Card c10 = new Card(13, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand.compareTo(hand2) > 0);
    }
    
    @Test
    public void smallerFlushLosesToBiggerFlush() {
        Card c1 = new Card(14, 1);
        Card c2 = new Card(10, 1);
        Card c3 = new Card(9, 1);
        Card c4 = new Card(8, 1);
        Card c5 = new Card(5, 1);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(10, 2);
        Card c7 = new Card(9, 2);
        Card c8 = new Card(8, 2);
        Card c9 = new Card(14, 2);
        Card c10 = new Card(2, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.compareTo(hand) < 0);
    }
    
    @Test
    public void biggerStraightBeatsSmallerStraight() {
        Card c1 = new Card(11, 1);
        Card c2 = new Card(10, 1);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(8, 1);
        Card c5 = new Card(12, 1);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(5, 3);
        Card c7 = new Card(4, 4);
        Card c8 = new Card(3, 2);
        Card c9 = new Card(14, 2);
        Card c10 = new Card(2, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand.compareTo(hand2) > 0);
    }
    
    @Test
    public void smallerThreeOfAKindLosesToBiggerThreeOfAKind() {
        Card c1 = new Card(11, 1);
        Card c2 = new Card(10, 1);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(10, 3);
        Card c5 = new Card(10, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(2, 3);
        Card c7 = new Card(2, 4);
        Card c8 = new Card(3, 2);
        Card c9 = new Card(14, 2);
        Card c10 = new Card(2, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.compareTo(hand) < 0);
    }
    
    @Test
    public void biggerTwoPairBeatsSmallerTwopair() {
        Card c1 = new Card(11, 1);
        Card c2 = new Card(10, 1);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(11, 3);
        Card c5 = new Card(10, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(2, 3);
        Card c7 = new Card(2, 4);
        Card c8 = new Card(3, 2);
        Card c9 = new Card(14, 1);
        Card c10 = new Card(14, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand2.compareTo(hand) > 0);
        
        Card c11 = new Card(9, 1);
        Card c12 = new Card(9, 2);
        Card c13 = new Card(8, 3);
        Card c14 = new Card(8, 4);
        Card c15 = new Card(10, 2);
        Hand hand3 = new Hand(c11, c12, c13, c14, c15);
        Card c16 = new Card(9, 3);
        Card c17 = new Card(9, 4);
        Card c18 = new Card(14, 2);
        Card c19 = new Card(8, 1);
        Card c20 = new Card(8, 2);
        Hand hand4 = new Hand(c16, c17, c18, c19, c20);
        assertTrue(hand4.compareTo(hand3) > 0);
    }
    
    @Test
    public void smallerPairLosesToBiggerPair() {
        Card c1 = new Card(11, 1);
        Card c2 = new Card(2, 1);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(11, 3);
        Card c5 = new Card(3, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(2, 3);
        Card c7 = new Card(6, 4);
        Card c8 = new Card(3, 2);
        Card c9 = new Card(14, 1);
        Card c10 = new Card(14, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand.compareTo(hand2) < 0);
        
        Card c11 = new Card(3, 1);
        Card c12 = new Card(2, 2);
        Card c13 = new Card(8, 3);
        Card c14 = new Card(8, 4);
        Card c15 = new Card(10, 2);
        Hand hand3 = new Hand(c11, c12, c13, c14, c15);
        Card c16 = new Card(6, 3);
        Card c17 = new Card(7, 4);
        Card c18 = new Card(13, 2);
        Card c19 = new Card(8, 1);
        Card c20 = new Card(8, 2);
        Hand hand4 = new Hand(c16, c17, c18, c19, c20);
        assertTrue(hand3.compareTo(hand4) < 0);
    }
    
    @Test
    public void biggerHighCardWinsSmallerHighCard() {
        Card c1 = new Card(11, 1);
        Card c2 = new Card(2, 1);
        Card c3 = new Card(9, 3);
        Card c4 = new Card(13, 3);
        Card c5 = new Card(3, 2);
        Hand hand = new Hand(c1, c2, c3, c4, c5);
        Card c6 = new Card(2, 3);
        Card c7 = new Card(6, 4);
        Card c8 = new Card(3, 1);
        Card c9 = new Card(7, 1);
        Card c10 = new Card(8, 2);
        Hand hand2 = new Hand(c6, c7, c8, c9, c10);
        assertTrue(hand.compareTo(hand2) > 0);
        
        Card c11 = new Card(5, 1);
        Card c12 = new Card(13, 2);
        Card c13 = new Card(8, 3);
        Card c14 = new Card(9, 4);
        Card c15 = new Card(10, 2);
        Hand hand3 = new Hand(c11, c12, c13, c14, c15);
        Card c16 = new Card(3, 3);
        Card c17 = new Card(13, 4);
        Card c18 = new Card(8, 2);
        Card c19 = new Card(9, 1);
        Card c20 = new Card(10, 4);
        Hand hand4 = new Hand(c16, c17, c18, c19, c20);
        assertTrue(hand3.compareTo(hand4) > 0);
    }
    
    
    
    
     
}
