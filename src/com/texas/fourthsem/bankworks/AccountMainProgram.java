package com.texas.fourthsem.bankworks;

import com.texas.fourthsem.bankworks.dto.AccountInformationRequestDto;
import com.texas.fourthsem.bankworks.dto.DepositRequestDto;
import com.texas.fourthsem.bankworks.transaction.Transaction;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author BankMainProgram
 * java-suraj -- 2024-01-16
 */
public class AccountMainProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        AccountIO accountIO = new AccountIO();
        Transaction transaction = new Transaction();
        // 3 account
        int size = 2;
        Account[] accounts = new Account[size];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = accountIO.readAccount();
        }

        // Displaying just read accounts
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("____________________________");

        boolean status = true;
        while (status) {
            System.out.println("_______________________");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Fund Transfer");
            System.out.println("4 Account Information");
            System.out.println("5 Exit");
            System.out.println("Enter your choice");
            switch (scanner.nextInt()) {
                case 1:
                    // account number , balance , pin
                    DepositRequestDto depositRequestDto = accountIO.readDepositRequestDto();
                    transaction.deposit(accounts, depositRequestDto);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    AccountInformationRequestDto accountInformationRequestDto = accountIO.readAccountInformationRequestDto();
                    transaction.displayAccountInformation(accounts, accountInformationRequestDto);
                    break;
                case 5:
                    status = false;
                    System.out.println("Thank you !!! ");
                    break;
                default:
                    System.out.println("Galat input !! RESTART");

            }
        }
    }
}
