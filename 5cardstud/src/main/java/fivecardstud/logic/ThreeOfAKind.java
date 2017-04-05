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
public class ThreeOfAKind implements Rank {
    private int value;

    public ThreeOfAKind(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int rankAsNumber() {
        return 4;
    }
      
}
