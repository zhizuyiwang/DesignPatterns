package com.hsf.design.bridge;

import java.sql.DriverManager;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
//        DriverManager
    }
    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account;
    }
}
