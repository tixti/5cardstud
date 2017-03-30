/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

import java.util.ArrayList;

/**
 *
 * @author Omistaja
 */
public class Hand {
    
    private ArrayList<Card> hand;
    
    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
        this.hand = new ArrayList();
        hand.add(c1);
        hand.add(c2);
        hand.add(c3);
        hand.add(c4);
        hand.add(c5);

    }    
    public void addCard(Card card) {
        hand.add(card);
    }
    
    

    
    
}
