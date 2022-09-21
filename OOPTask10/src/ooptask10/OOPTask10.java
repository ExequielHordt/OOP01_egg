/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask10;

import ooptask10.entity.listNumbers;
import ooptask10.service.listNumbersService;

/**
 *
 * @author exe10
 */
public class OOPTask10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        listNumbersService numServ = new listNumbersService();
        double[] listNumbers_A = new double[50];
        double[] listNumbers_B = new double[20];
        System.out.println("Lista de números");
        System.out.println("****************");
        //Application
        listNumbers numList = numServ.createList(listNumbers_A);
        numServ.showArrayNumbers_A();
        numServ.fillArrays(listNumbers_A, listNumbers_B);
        System.out.println("");
        numServ.showArrayNumbers_AB();
        System.out.println("");
        System.out.println("");
    }

}
