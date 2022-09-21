/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask10.entity;

/**
 *
 * @author exe10
 */
public class listNumbers {
    private double[] listNumbers_1;
    private double[] listNumbers_2;

    public listNumbers() {
    }

    public listNumbers(double[] listNumbers_1, double[] listNumbers_2) {
        this.listNumbers_1 = listNumbers_1;
        this.listNumbers_2 = listNumbers_2;
    }

    public double[] getListNumbers_1() {
        return listNumbers_1;
    }

    public double[] getListNumbers_2() {
        return listNumbers_2;
    }

    public void setListNumbers_1(double[] listNumbers_1) {
        this.listNumbers_1 = listNumbers_1;
    }

    public void setListNumbers_2(double[] listNumbers_2) {
        this.listNumbers_2 = listNumbers_2;
    }
    
}
