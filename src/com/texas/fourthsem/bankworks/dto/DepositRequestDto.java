package com.texas.fourthsem.bankworks.dto;

/**
 * @Author DepositRequestDto
 * java-suraj -- 2024-01-16
 */
public class DepositRequestDto {
    // account number , balance , pin
    private String accountNumber;
    private float depositBalance;
    private String pin;

    public DepositRequestDto() {
    }

    public DepositRequestDto(String accountNumber,
                             float depositBalance,
                             String pin) {
        this.accountNumber = accountNumber;
        this.depositBalance = depositBalance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(float depositBalance) {
        this.depositBalance = depositBalance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
