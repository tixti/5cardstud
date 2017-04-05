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
public class TwoPair implements Rank {
    private int valueOfBiggerPair;
    private int valueOfSmallerPair;
    private int kicker;

    public TwoPair(int valueOfBiggerPair, int valueOfSmallerPair, int kicker) {
        this.valueOfBiggerPair = valueOfBiggerPair;
        this.valueOfSmallerPair = valueOfSmallerPair;
        this.kicker = kicker;
    }

    public int getValueOfBiggerPair() {
        return valueOfBiggerPair;
    }

    public int getValueOfSmallerPair() {
        return valueOfSmallerPair;
    }

    public int getKicker() {
        return kicker;
    }    

    @Override
    public int rankAsNumber() {
        return 3;
    }
}
