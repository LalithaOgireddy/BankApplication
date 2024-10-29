package com.lalitha.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testCreateAccountWithValidDeposit(){
        Customer customer = new Customer("Test","test@mail.com","9876564");
        BankAccount account = new BankAccount(customer,20.00);
        Assertions.assertEquals(20.00,account.getBalance());
    }

    @Test
    public void testCreateAccountWithInValidDeposit(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Customer customer = new Customer("Test","test@mail.com","9876564");
            BankAccount account = new BankAccount(customer,2.00);
        });
    }
}
