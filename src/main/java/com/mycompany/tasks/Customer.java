/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasks;

/**
 *
 * @author acer1
 */
public class Customer {

    private String customerId;
    private String name;
    private SavingAccount savingsAccount;
    private CheckingAccount checkingAccount;

    public Customer(String customerId, String name, SavingAccount savingsAccount, CheckingAccount checkingAccount) {
        this.customerId = customerId;
        this.name = name;
        this.savingsAccount = savingsAccount;
        this.checkingAccount = checkingAccount;
    }

    public String getCustomerID() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public double getSavingBalance() {
        return savingsAccount.getBalance();
    }

    public double getCheckingBalance() {
        return checkingAccount.getBalance();
    }

    public void depositToSaving(double amount) {
        savingsAccount.deposide(amount);
    }

    public void withdrawFromSaving(double amount) {
        savingsAccount.withdraw(amount);
    }

    public void depositToChecking(double amount) {
        checkingAccount.deposide(amount);
    }

    public void withdrawFromChecking(double amount) {
        checkingAccount.withdraw(amount);
    }
}
