package com.lalitha;

import com.lalitha.model.BankAccount;
import com.lalitha.model.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Lalitha","lalitha@gmail.com","76524363");
        BankAccount acc1 = new BankAccount(cust1,20);
        System.out.println(acc1.getAcctInfo());
    }
}