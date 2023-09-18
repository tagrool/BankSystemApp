/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasks;

/**
 *
 * @author acer1
 */
public class BankAccount {

    public String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposide(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Qeyd edilen mebleg 0'dan asagidir");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            }
            else{
                System.out.println("Balansda kifayet qeder vesait yoxdur");
            }
        }
        else{
            System.out.println("Daxil edilen mebleg 0'dan boyuk olmalidir");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
