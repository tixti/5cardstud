/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

import fivecardstud.logic.Card;
import fivecardstud.logic.Deck;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Omistaja
 */
public class FiveCardStudTest {
    
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
    public void deckHas52Cards() {
        Deck deck = new Deck();
        assertTrue(deck.getDeck().length == 52);
    }
    
    @Test
    public void deckHasNoDuplicates() {
        Deck deck = new Deck();
        List<Card> usedCards = new ArrayList();
        for (int i = 0; i < 52; i++) {
            Card card = deck.dealCard();
            if (usedCards.contains(card)) {
                fail();
            }
            usedCards.add(card);
        }
    }
}
