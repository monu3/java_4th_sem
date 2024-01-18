package com.texas.fourthsem.bankworks;

/**
 * @Author Bank
 * java-suraj -- 2024-01-16
 */
public class Account {
    private String accountNumber;
    private String accountHolderName;
    private float accountBalance;
    private float minimumBalance;
    private String pin;

    public Account(String accountNumber,
                   String accountHolderName,
                   float accountBalance,
                   float minimumBalance,
                   String pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(float minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                ", minimumBalance=" + minimumBalance +
                ", pin='" + pin + '\'' +
                '}';
    }
    // Account@122342435
}
