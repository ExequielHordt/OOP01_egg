/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask09.service;

import ooptask09.entity.Mathematic;

/**
 *
 * @author exe10
 */
public class MathematicService {
//This method obtain a major number
    public double majorNumber(Mathematic m) {
        if (m.getNum_1() > m.getNum_2()) {
            return m.getNum_1();
        } else {
            return m.getNum_2();
        }
    }
//This method gives the power of the largest number.
    public double calculatePower(Mathematic m) {
        double num_1_round = Math.round(m.getNum_1());
        double num_2_round = Math.round(m.getNum_2());
        if (num_1_round > num_2_round) {
            return Math.pow(num_1_round, num_2_round);
        } else {
            return Math.pow(num_2_round, num_1_round);
        }
    }
//This method gives the square root of the lowest number.
    public double squareRoot(Mathematic m) {
        if (m.getNum_1() < m.getNum_2()) {
            double absoluteValue_1 = Math.abs(m.getNum_1());
            return Math.sqrt(absoluteValue_1);
        } else {
            double absoluteValue_2 = Math.abs(m.getNum_2());
            return Math.sqrt(absoluteValue_2);
        }
    }

}
