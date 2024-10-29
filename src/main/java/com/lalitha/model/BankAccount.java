package com.lalitha.model;

import com.lalitha.util.AccountNumberGenerator;
import com.lalitha.util.BankAccountConstant;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private Customer customer;

    public BankAccount(Customer customer, double initialDeposit){
        if(initialDeposit< BankAccountConstant.MIN_INITIAL_DEPOSIT) throw new IllegalArgumentException("Initial deposit must be at least "+BankAccountConstant.MIN_INITIAL_DEPOSIT);
        this.deposit(initialDeposit);
        this.accountNumber = AccountNumberGenerator.nextAcctNum();
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid amount for deposit");
        balance += amount;
    }

    public void withdrawal(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid amount for deposit");
        if(amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    public String getAcctInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Acct No: ").append(accountNumber);
        sb.append(", Balance: ").append(balance);
        sb.append(", Customer: ").append(customer.getCustomerInfo());
        return sb.toString();
    }
}