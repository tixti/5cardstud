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
public class Pair implements Rank {
    private int valueOfPair;
    private ArrayList<Integer> kickers;

    public Pair(int valueOfPair, int kicker1, int kicker2, int kicker3) {
        this.valueOfPair = valueOfPair;
        kickers = new ArrayList();
        kickers.add(kicker1);
        kickers.add(kicker2);
        kickers.add(kicker3);
    }

    public int getValueOfPair() {
        return valueOfPair;
    }

    public ArrayList<Integer> getKickers() {
        return kickers;
    }  

    @Override
    public int rankAsNumber() {
        return 2;
    }
}
