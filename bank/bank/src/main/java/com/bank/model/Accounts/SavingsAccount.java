package com.bank.model.Accounts;

import com.bank.model.Interest.SavingsInterestStrategy;

public class SavingsAccount extends Account {

    public SavingsAccount() {
    }

    public SavingsAccount(Integer accountNumber, double balance) {
        super(accountNumber, balance);
        interestStrategy = new SavingsInterestStrategy();
    }

    public double calculateInterest(double amount) {
        return interestStrategy.calculateInterest(amount);
    }
    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
}
