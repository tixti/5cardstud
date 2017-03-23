/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Omistaja
 */
public class Card {
         
    private final int value;
    private final int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String valueAsString = "";
        if (value < 11) {
            valueAsString = "" + value;
        } else {
            switch (value) {
                case 14: valueAsString = "Ace";
                break;
                case 13: valueAsString = "King";
                break;
                case 12: valueAsString = "Queen";
                break;
                case 11: valueAsString = "Jack";
            }
        }
        String suitAsString = "";
        switch (suit) {
            case 4: suitAsString = "Hearts";
            break;
            case 3: suitAsString = "Diamonds";
            break;
            case 2: suitAsString = "Clubs";
            break;
            case 1: suitAsString = "Spades";
        }
        
        return valueAsString + " of " + suitAsString;
    }
    
    
    
    
    
    
}
