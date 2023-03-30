package com.bank.model.Interest;

public class CheckingInterestStrategy implements InterestStrategy {

    @Override
    public double calculateInterest(double amount) {
        // Cálculo de interés para una cuenta corriente
        double interestRate = 0.05; // 5% interest rate
        return amount * interestRate;
    }

}
