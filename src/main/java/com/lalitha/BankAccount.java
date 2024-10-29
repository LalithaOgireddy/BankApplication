package com.lalitha;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static int seqNum=1000;

    public BankAccount(String customerName,String email,String phoneNumber){
        this.accountNumber = BankAccount.accountNumberGenerator();
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static String accountNumberGenerator(){
        return "ACC"+ (++seqNum);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdrawal(double amount){
        if(amount > balance) throw new IllegalArgumentException("Balance is insufficient");
        balance += amount;
    }

    public void getAcctInfo(){
        System.out.println("Customer:"+customerName+", Email: "+email+", phone: "+phoneNumber+", Balance: "+balance);
    }
}
