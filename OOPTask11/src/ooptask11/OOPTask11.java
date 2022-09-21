/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 20 Sep 2022
 */
public class OOPTask11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner read = new Scanner(System.in);
        Date current_date = new Date();
        Date dateBefore;
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEEE, dd 'de' MMMMMM 'de' yyyy");
        int day, month, year, yearsDifference;
        //Application
        System.out.println("Fechas");
        System.out.println("******");
        do {
            System.out.print("Ingrese un día: ");
            day = read.nextInt();
            System.out.print("Ingrese un mes: ");
            month = read.nextInt();
            System.out.print("Ingrese un año: ");
            year = read.nextInt();
            //Months starts in zero, so months are betwwen 0 to 11.
            dateBefore = new Date(year - 1900, month - 1, day);
            if (current_date.compareTo(dateBefore) == -1) {
                System.out.println("¡La fecha ingresada es posterior a la fecha actual!"
                        + "\nPor favor, ingrese una fecha anterior. Ingrese una fecha válida.");
                System.out.println("");
            }
        } while (current_date.compareTo(dateBefore) == -1);
        System.out.println("");
        System.out.println(formatDate.format(current_date));
        System.out.println(formatDate.format(dateBefore));
        System.out.println("");
        yearsDifference = current_date.getYear() - dateBefore.getYear();
        System.out.println("Existen " + yearsDifference + " años de diferencia.");
    }

}
