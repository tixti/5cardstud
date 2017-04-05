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
public class FourOfAKind implements Rank {
    private int value;

    public FourOfAKind(int value) {
        this.value = value;
    }      

    public int getValue() {
        return value;
    }

    @Override
    public int rankAsNumber() {
        return 8;
    }

}
