package com.hsf.design.bridge;

public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return null;
    }

    @Override
    public void showAccountType() {
        System.out.println("这是活期账号");
    }
}
