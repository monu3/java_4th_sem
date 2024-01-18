package com.texas.fourthsem.account;

/**
 * @Author Account
 * java-suraj -- 2024-01-08
 */
public class Account {
    private String accountNumber;
    private float balance;

    private String accountName;

    public Account(){

    }

    public Account(String accountNumber, float balance, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
