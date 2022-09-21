/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask10.service;

import java.util.Arrays;
import java.util.Random;
import ooptask10.entity.listNumbers;

/**
 *
 * @author exe10
 */
public class listNumbersService {

    private listNumbers listNum;
    private Random r = new Random();
//This method consist in created array of numbers between -100 to 100.

    public listNumbers createList(double[] listNum_A) {
        listNum = new listNumbers();
        int i;
        for (i = 0; i < listNum_A.length; i++) {
            //Range of numbers -100 to 100.
            listNum_A[i] = r.nextInt((100 - (-100)) + 1) + (-100);
        }
        listNum.setListNumbers_1(listNum_A);
        return listNum;
    }
//This method consist in show the array A numbers (not order)

    public void showArrayNumbers_A() {
        int i;
        System.out.print("Arreglo A (Sin Ordenar): ");
        for (i = 0; i < listNum.getListNumbers_1().length; i++) {
            System.out.print("[" + listNum.getListNumbers_1()[i] + "]");
        }
    }

    /**
     * This method consist in to order the numbers ascendent And also, fill the
     * array B.
     */
    public void fillArrays(double[] listNum_A, double[] listNum_B) {
        int i;
        Arrays.sort(listNum.getListNumbers_1());
        for (i = 0; i < listNum_B.length; i++) {
            if (i < 10) {
                listNum_B[i] = listNum.getListNumbers_1()[i];
            } else {
                listNum_B[i] = 0.5;
            }
        }
        listNum.setListNumbers_2(listNum_B);
    }
//This method consist in show the numbers in array A and B

    public void showArrayNumbers_AB() {
        int i, j;
        System.out.print("Arreglo A: ");
        for (i = 0; i < listNum.getListNumbers_1().length; i++) {
            System.out.print("[" + listNum.getListNumbers_1()[i] + "]");
        }
        System.out.println("");
        System.out.print("Arreglo B: ");
        for (j = 0; j < listNum.getListNumbers_2().length; j++) {
            System.out.print("[" + listNum.getListNumbers_2()[j] + "]");
        }
    }

}
