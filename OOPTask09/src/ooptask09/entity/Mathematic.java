/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask09.entity;

/**
 *
 * @author exe10
 */
public class Mathematic {

    private double num_1;
    private double num_2;

    public Mathematic() {
    }

    public Mathematic(double num_1, double num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public double getNum_1() {
        return num_1;
    }

    public double getNum_2() {
        return num_2;
    }

    public void setNum_1(double num_1) {
        this.num_1 = num_1;
    }

    public void setNum_2(double num_2) {
        this.num_2 = num_2;
    }

}
