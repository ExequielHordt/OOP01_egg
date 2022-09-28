/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask05;

import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 22 Sep 2022
 */
public class OOPExtraTask05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String[] months = {"enero", "febrero", "marzo", "abril",
            "mayo", "junio", "julio", "agosto", "septiembre",
            "octubre", "noviembre", "diciembre"};
        int random;
        random = (int) (Math.random() * (11 - 0 + 1) + 0);
        String secretMonth = months[random];
        //Function
        guessGame(months, secretMonth);

    }

    /**
     * This function consist in guess the secret month
     *
     * @param months
     * @param secretMonth
     */
    public static void guessGame(String[] months, String secretMonth) {
        //Variable
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String guess;
        boolean correct;

        //Procedures
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        guess = read.next().toLowerCase();
        while (!guess.equals(secretMonth)) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            guess = read.next().toLowerCase();
        }
        System.out.println("¡Ha acertado!");

    }
}
