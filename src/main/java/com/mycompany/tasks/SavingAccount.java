/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasks;

/**
 *
 * @author acer1
 */
public class SavingAccount extends BankAccount {

    public double interestRate;

    public SavingAccount(double interestRate, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interestAmount = getBalance() * interestRate / 100;
        deposide(interestAmount);
    }
}
