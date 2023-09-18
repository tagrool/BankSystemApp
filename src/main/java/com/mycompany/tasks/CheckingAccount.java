/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasks;

/**
 *
 * @author acer1
 */
public class CheckingAccount extends BankAccount {

    private double transactionFee;

    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    public void deductTransactionFee() {
        withdraw(transactionFee);
    }
}
