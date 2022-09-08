/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask05;

import java.util.Scanner;
import ooptask05.entity.Account;
import ooptask05.service.AccountService;

/**
 *
 * @author Exe
 */
public class OOPTask05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccountService as = new AccountService();
        Scanner read = new Scanner(System.in);
        char option = ' ';
        double cash;
        double withdrawCash;
        System.out.println("Cuenta bancaria");
        System.out.println("***************");
        Account a = as.createAccount();
        while (option != 'f') {
            System.out.println("");
            System.out.print("¡Bienvenido/a! Seleccione una opción:\n1) Realizar depósito\n2) Retirar dinero\n3) Extracción rápida del dinero\n4) Consultar Saldo\n5) Consultar Datos\n6)Salir (Presione f)\nOpción seleccionada:  ");
            option = read.next().charAt(0);
            option = Character.toLowerCase(option);
            switch (option) {
                case '1':
                    System.out.println("");
                    System.out.print("Monto a depositar: ");
                    cash = read.nextDouble();
                    as.addCredit(cash, a);
                    break;
                case '2':
                    System.out.println("");
                    System.out.println("Ingrese el monto a retirar: ");
                    withdrawCash = read.nextDouble();
                    as.removeCredit(withdrawCash, a);
                    break;
                case '3':
                    System.out.println("");
                    System.out.println("Ingrese el monto a retirar (Extracción rápida): ");
                    withdrawCash = read.nextDouble();
                    as.quickRemoval(withdrawCash, a);
                    break;
                case '4':
                    System.out.println("");
                    System.out.println(as.checkBalance(a));
                    break;
                case '5':
                    System.out.println("");
                    System.out.println(as.checkData(a));
                    break;
                default:
                    break;
            }
        }

    }

}
