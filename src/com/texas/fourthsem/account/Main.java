package com.texas.fourthsem.account;

import java.util.Scanner;

/**
 * @Author Main
 * java-suraj -- 2024-01-08
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String accountNumber = sc.nextLine();
        System.out.println("Enter your account Name:");
        String accountName = sc.nextLine();
        System.out.println("Enter your account balance:");
        Float accountBalance = sc.nextFloat();


        Account account = new Account(accountNumber, accountBalance, accountName);
        System.out.println("Your account name is:" + account.getAccountName());
        System.out.println("your account balance is:" + account.getBalance());
        System.out.println("your account number is:" + account.getAccountNumber());

    }
}
