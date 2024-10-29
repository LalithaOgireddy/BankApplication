package com.lalitha.util;

public class AccountNumberGenerator {
    private static int seq = 1000;

    public static int nextAcctNum(){
        return ++seq;
    }
}
