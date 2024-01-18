package com.texas.fourthsem.bankworks;

import com.texas.fourthsem.bankworks.dto.AccountInformationRequestDto;
import com.texas.fourthsem.bankworks.dto.DepositRequestDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author AccountIO
 * java-suraj -- 2024-01-16
 */
public class AccountIO {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public Account readAccount() throws IOException {
        return new Account(readAccountNumber(),
                readAccountHolderName(),
                readAccountBalance(),
                readMinimumBalance(),
                readAccountPin());

    }

    public String readAccountNumber() throws IOException {
        System.out.println("Enter your account number");
        return bufferedReader.readLine();
    }

    public String readAccountHolderName() throws IOException {
        System.out.println("Enter your account holder name");
        return bufferedReader.readLine();
    }

    public float readAccountBalance() throws IOException {
        System.out.println("Enter your account balance");
        return Float.parseFloat(bufferedReader.readLine());
    }

    public float readMinimumBalance() throws IOException {
        System.out.println("Enter your account minimum balance");
        return Float.parseFloat(bufferedReader.readLine());
    }

    public String readAccountPin() throws IOException {
        String pin = "";
        do {
            System.out.println("Enter your account pin");
            pin = bufferedReader.readLine();

        } while (!(pin.length() >= 4 && pin.length() <= 6));
        return pin;
    }


    public AccountInformationRequestDto readAccountInformationRequestDto() throws IOException {
        System.out.println("You are here to read account information request dto !!");
        AccountInformationRequestDto accountInformationRequestDto = new AccountInformationRequestDto();
        accountInformationRequestDto.setAccountNumber(readAccountNumber());
        accountInformationRequestDto.setPin(readAccountPin());
        return accountInformationRequestDto;
    }


    public DepositRequestDto readDepositRequestDto() throws IOException {
        return new DepositRequestDto(readAccountNumber(), readAccountBalance(), readAccountPin());
    }
}
