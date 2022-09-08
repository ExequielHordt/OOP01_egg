/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask05.entity;

/**
 *
 * @author Exe
 */
public class Account {

    private int accountNum;
    private long customerId;
    private double currentBalance;

    public Account() {
    }

    public Account(int accountNum, long customerId, double currentBalance) {
        this.accountNum = accountNum;
        this.customerId = customerId;
        this.currentBalance = currentBalance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public long getCustomerId() {
        return customerId;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNum=" + accountNum + ", customerId=" + customerId + ", currentBalance=" + currentBalance + '}';
    }

}
