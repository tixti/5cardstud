/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Omistaja
 */
public class DeckTest {
    
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
