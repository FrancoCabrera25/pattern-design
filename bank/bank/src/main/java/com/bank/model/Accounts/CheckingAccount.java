package com.bank.model.Accounts;

import com.bank.model.Interest.CheckingInterestStrategy;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(Integer accountNumber, double balance) {
        super(accountNumber, balance);
        interestStrategy = new CheckingInterestStrategy();
    }

    public double calculateInterest(double amount) {
        return interestStrategy.calculateInterest(amount);
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
}
