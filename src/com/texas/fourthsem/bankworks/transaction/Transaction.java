package com.texas.fourthsem.bankworks.transaction;

import com.texas.fourthsem.bankworks.Account;
import com.texas.fourthsem.bankworks.dto.AccountInformationRequestDto;
import com.texas.fourthsem.bankworks.dto.DepositRequestDto;

/**
 * @Author Transaction
 * java-suraj -- 2024-01-16
 */
public class Transaction extends TransactionValidation {
    public void displayAccountInformation(Account[] accounts,
                                          AccountInformationRequestDto accountInformationRequestDto) {
        for (Account account : accounts) {
            if (account.getPin().equals(accountInformationRequestDto.getPin()) &&
                    account.getAccountNumber().equals(accountInformationRequestDto.getAccountNumber())) {
                System.out.println(account);
            }
        }
    }

    public void deposit(Account[] accounts, DepositRequestDto depositRequestDto) {
        System.out.println("Deposit initated !!");
        boolean isValid = validateDepositRequest(accounts, depositRequestDto);
        if (isValid) {
            Account account = pullMatchingAccount(accounts, depositRequestDto.getAccountNumber());
            account.setAccountBalance(account.getAccountBalance() + depositRequestDto.getDepositBalance());

            System.out.println("SUCCESS DEPOSIT !!!");
        } else {
            System.out.println("Deposit cannot be completed !!!");
        }
    }
}
