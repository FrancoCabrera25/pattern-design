package com.bank.services;

import com.bank.model.Accounts.Account;

public interface Bank {
    public boolean transfer(Integer sourceAccountNumber, Integer destinationAccountNumber, double amount);
    public Account findAccount(Integer accountNumber);
    public void addAccount(Account account);
}
