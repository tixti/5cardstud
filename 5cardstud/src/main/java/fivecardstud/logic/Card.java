/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstud.logic;

/**
 *
 * @author Omistaja
 */
public class Card implements Comparable<Card> {
         
    private final int value;
    private final int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(String cardAsText) {
        if (cardAsText.contains("Hearts")) {
            this.suit = 4;
        } else if (cardAsText.contains("Diamonds")) {
            this.suit = 3;
        } else if (cardAsText.contains("Clubs")) {
            this.suit = 2;
        } else {
            this.suit = 1;
        }
        if (cardAsText.contains("Ace")) {
            this.value = 14;
        } else if (cardAsText.contains("King")) {
            this.value = 13;
        } else if (cardAsText.contains("Queen")) {
            this.value = 12;
        } else if (cardAsText.contains("Jack")) {
            this.value = 11;
        } else if (cardAsText.contains("10")) {
            this.value = 10;
        } else if (cardAsText.contains("9")) {
            this.value = 9;
        } else if (cardAsText.contains("8")) {
            this.value = 8;
        } else if (cardAsText.contains("7")) {
            this.value = 7;
        } else if (cardAsText.contains("6")) {
            this.value = 6;
        } else if (cardAsText.contains("5")) {
            this.value = 5;
        } else if (cardAsText.contains("4")) {
            this.value = 4;
        } else if (cardAsText.contains("3")) {
            this.value = 3;
        } else {
            this.value = 2;
        }
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

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }
       
    public int compareTo(Card c) {
        if (c.getValue() < this.value) {
            return 1;
        } else if (c.getValue() > this.value) {
            return -1;
        } else {
            return 0;
        }
    }


    
    
    
    
    
    
}
