package com.texas.fourthsem.bankworks.dto;

/**
 * @Author AccountInformationDto
 * java-suraj -- 2024-01-16
 */
public class AccountInformationRequestDto {
    private String accountNumber;
    private String pin;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
