package com.bank.model.Interest;

public class SavingsInterestStrategy implements InterestStrategy {

    @Override
    public double calculateInterest(double amount) {
          // Cálculo de interés para una cuenta de caja de ahorro
          double interestRate = 0.01; // 1% interest rate
          return amount * interestRate;
    }
    
}
