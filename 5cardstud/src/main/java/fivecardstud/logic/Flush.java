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
public class Flush implements Rank {
    private ArrayList<Integer> values;

    public Flush(int value1, int value2, int value3, int value4, int value5) {
        values = new ArrayList();
        values.add(value1);
        values.add(value2);
        values.add(value3);
        values.add(value4);
        values.add(value5);
    }       

    public ArrayList<Integer> getValues() {
        return values;
    }

    @Override
    public int rankAsNumber() {
        return 6;
    }
     
}
