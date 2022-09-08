/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask05.service;

import java.util.Scanner;
import ooptask05.entity.Account;

/**
 *
 * @author Exe
 */
public class AccountService {

    Scanner read = new Scanner(System.in);

    public Account createAccount() {
        Account a = new Account();
        System.out.print("Ingrese el número de cuenta: ");
        a.setAccountNum(read.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        a.setCustomerId(read.nextLong());
        a.setCurrentBalance(0.0);
        return a;
    }

    public void addCredit(double income, Account a) {
        a.setCurrentBalance(a.getCurrentBalance() + income);
    }

    public void removeCredit(double withdraw, Account a) {
        if (withdraw >= a.getCurrentBalance()) {
            a.setCurrentBalance(0.0);
        } else {
            a.setCurrentBalance(a.getCurrentBalance() - withdraw);
        }
    }

    public void quickRemoval(double withdraw, Account a) {
        double currentBalance;
        if (withdraw > (a.getCurrentBalance() * 20) / 100) {
            System.out.println("¡Disculpe! Solo puede retirar el 20% del saldo");
        } else {
            a.setCurrentBalance(a.getCurrentBalance() - withdraw);
        }

    }

    public String checkBalance(Account a) {
        return "El saldo actual de su cuenta es: " + a.getCurrentBalance();
    }

    public String checkData(Account a) {
        return a.toString();
    }
}
