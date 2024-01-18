package com.texas.fourthsem.bankworks.transaction;

import com.texas.fourthsem.bankworks.Account;
import com.texas.fourthsem.bankworks.dto.DepositRequestDto;

/**
 * @Author TransactionValidation
 * java-suraj -- 2024-01-16
 */
public class TransactionValidation {

    public boolean validateDepositRequest(Account[] accounts, DepositRequestDto dto) {
        if (dto.getDepositBalance() <= 0) {
            System.out.println("Invalid deposit amount");
            return false;
        }
        Account account = pullMatchingAccount(accounts, dto.getAccountNumber());
        if (account != null) {
            if (!account.getPin().equals(dto.getPin())) {
                System.out.println("Invalid pin !!");
                return false;
            }
        } else {
            System.out.println("Invalid account number");
            return false;
        }

        return true;
    }


    public Account pullMatchingAccount(Account[] accounts, String accountNumber) {
        for (Account account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }
}
