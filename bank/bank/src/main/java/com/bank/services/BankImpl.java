package com.bank.services;

import java.util.ArrayList;
import java.util.List;

import com.bank.model.Accounts.Account;

public class BankImpl implements Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(Integer accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public boolean transfer(Integer sourceAccountNumber, Integer destinationAccountNumber, double amount) {

        Account sourceAccount = findAccount(sourceAccountNumber);
        Account destinationAccount = findAccount(destinationAccountNumber);

        if (sourceAccount == null || destinationAccount == null) {
            return false;
        }

        if (sourceAccount.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient funds in source account");
        }

        Double transferAmount = calculateTransferAndInterestAmount(sourceAccount, amount);

        sourceAccount.withdraw(transferAmount);
        destinationAccount.deposit(amount);

        return true;
    }

    // public boolean transfer(Integer fromAccountNumber, Integer toAccountNumber,
    // double amount) {
    // Account fromAccount = findAccount(fromAccountNumber);
    // Account toAccount = findAccount(toAccountNumber);

    // if (fromAccount == null || toAccount == null) {
    // return false;
    // }

    // if (!sufficientFunds(fromAccount, amount)) {
    // return false;
    // }

    // double transferAmount = calculateTransferAndInterestAmount(fromAccount,
    // amount);

    // fromAccount.withdraw(transferAmount);
    // toAccount.deposit(amount);

    // return true;
    // }

    // private boolean sufficientFunds(Account account, double amount) {
    // return account.getBalance() >= amount;
    // }

    private double calculateTransferAndInterestAmount(Account account, double amount) {
        return amount + account.calculateInterest(amount);
    }
}
