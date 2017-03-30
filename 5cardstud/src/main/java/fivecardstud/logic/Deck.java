package fivecardstud.logic;


import fivecardstud.logic.Card;

/**
 *  An object of type Deck represents a deck of playing cards.  The deck
 *  is a regular poker deck that contains 52 regular cards and that can
 *  also optionally include two Jokers.
 */
public class Deck {

    private Card[] deck;
    private int cardsUsed;

    public Deck() {
        deck = new Card[52];
        int i = 0; 
        for (int suit = 1; suit < 5; suit++) {
            for (int value = 2; value < 15; value++) {
                deck[i] = new Card(value, suit);
                i++;
            }
        }
        cardsUsed = 0;
    }

    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            Card temp = deck[i];
            int random = (int) (Math.random() * (i + 1));
            deck[i] = deck[random];
            deck[random] = temp;
        }
        cardsUsed = 0;
    }

    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

    public Card dealCard() {
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

    public Card[] getDeck() {
        return deck;
    }
    
    
} 
