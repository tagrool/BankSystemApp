/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasks;

/**
 *
 * @author acer1
 */
public class BankingSystem {

    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount(1000.0, "SA001", 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 1500.0, 1.0);

        Customer customer = new Customer("C001", "John Doe", savingsAccount, checkingAccount);

        customer.depositToSaving(500.0);
        customer.depositToChecking(200.0);
        customer.withdrawFromSaving(300.0);
        customer.withdrawFromChecking(100.0);

        savingsAccount.addInterest();
        checkingAccount.deductTransactionFee();

        System.out.println("\nCustomer Details:");
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Customer Name: " + customer.getName());
        System.out.printf("Savings Account Balance: $%.2f%n", customer.getSavingBalance());
        System.out.printf("Checking Account Balance: $%.2f%n", customer.getCheckingBalance());
    }
}
