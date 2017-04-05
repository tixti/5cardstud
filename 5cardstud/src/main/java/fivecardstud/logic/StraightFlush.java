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
public class StraightFlush implements Rank {
    private int highestCard;

    public StraightFlush(int highestCard) {
        this.highestCard = highestCard;
    }

    public int getHighestCard() {
        return highestCard;
    }

    @Override
    public int rankAsNumber() {
        return 9;
    }
  
}
