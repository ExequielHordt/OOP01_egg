/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask04.service;

import java.util.Scanner;
import oopextratask04.entity.Nif;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class NifService {

    //Global Variables
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Nif nif = new Nif();

    /**
     * This method consist in create a NIF
     *
     * @return Nif
     */
    public Nif createNif() {
        //Variables
        long num_id;
        int i;
        char letter;
        letter = ' ';
        char[] letter_array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
//Request to enter the nif numbers
        System.out.print("Ingrese NIF (8 números.Sin las letras): ");
        num_id = read.nextLong();
// Calculating the correct nif letter
        for (i = 0; i < letter_array.length; i++) {
            if (i == (num_id % 23)) {
                letter = letter_array[i];
            }
        }

        nif.setId_num(num_id);
        nif.setLetter(letter);
        return nif;
    }

    /**
     * This method consist in show the NIF
     */
    public void showNif() {
        System.out.println("NIF: " + nif.getId_num() + "-" + nif.getLetter());
    }

}
