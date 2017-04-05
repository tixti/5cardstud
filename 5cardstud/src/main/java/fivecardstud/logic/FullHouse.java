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
public class FullHouse implements Rank {
    private int valueOfThreeOfAKind;

    public FullHouse(int valueOfThreeOfAKind) {
        this.valueOfThreeOfAKind = valueOfThreeOfAKind;
    }

    public int getValueOfThreeOfAKind() {
        return valueOfThreeOfAKind;
    }

    @Override
    public int rankAsNumber() {
        return 7;
    }

}
