/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Omistaja
 */
public class CardTest {
    
    @Test
    public void cardSuit4ShouldBeHearts() {
        Card card = new Card (2, 4);
        assertTrue(card.toString().contains("Hearts"));
    }
    
    @Test
    public void cardSuit3ShouldBeDiamonds() {
        Card card = new Card (2, 3);
        assertTrue(card.toString().contains("Diamonds"));
    }
    
    @Test
    public void cardSuit2ShouldBeClubs() {
        Card card = new Card (2, 2);
        assertTrue(card.toString().contains("Clubs"));
    }
    
    @Test
    public void cardSuit1ShouldBeSpades() {
        Card card = new Card (2, 1);
        assertTrue(card.toString().contains("Spades"));
    }
       
    @Test
    public void cardValue14ShouldBeAce() {
        Card card = new Card (14, 4);
        assertTrue(card.toString().contains("Ace"));
    }
    
    @Test
    public void cardValue13ShouldBeKing() {
        Card card = new Card (13, 4);
        assertTrue(card.toString().contains("King"));
    }
    
    @Test
    public void cardValue12ShouldBeQueen() {
        Card card = new Card (12, 4);
        assertTrue(card.toString().contains("Queen"));
    }
    
    @Test
    public void cardValue11ShouldBeJack() {
        Card card = new Card (11, 4);
        assertTrue(card.toString().contains("Jack"));
    }    
    
    @Test
    public void aceIsBiggerThanJack() {
        Card ace = new Card(14, 2);
        Card jack = new Card(11, 3);
        assertTrue(ace.compareTo(jack) > 0);
    }
    
    @Test
    public void queenIsEqualToQueen() {
        Card queenOfHearts = new Card(12, 4);
        Card queenOfDiamonds = new Card(12, 3);
        assertTrue(queenOfHearts.compareTo(queenOfDiamonds) == 0);
    }
    
    @Test 
    public void sevenIsSmallerThanKing() {
        Card seven = new Card(7, 1);
        Card king = new Card(13, 1);
        assertTrue(seven.compareTo(king) < 0);
    }
    
    @Test
    public void cardAsTextConstructorWorks() {
        String ace = "Ace of Hearts";
        Card aceOfHearts = new Card(ace);
        assertTrue(aceOfHearts.getSuit() == 4);
        assertTrue(aceOfHearts.getValue() == 14);
        String nine = "9 of Diamonds";
        Card nineOfDiamonds = new Card(nine);
        assertTrue(nineOfDiamonds.getSuit() == 3);
        assertTrue(nineOfDiamonds.getValue() == 9);
    }
}
