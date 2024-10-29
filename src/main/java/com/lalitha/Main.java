package com.lalitha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Lalitha","lalitha@gmail.com","76524363");
        acc1.getAcctInfo();
        acc1.deposit(20);
        //acc1.withdrawal(30);
        acc1.getAcctInfo();

        BankAccount acc2 = new BankAccount("Dinesh","dinesh@gmail.com","765223363");
        acc2.getAcctInfo();
    }
}