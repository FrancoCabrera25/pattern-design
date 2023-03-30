package com.bank;

import java.util.Scanner;

import com.bank.model.Accounts.Account;
import com.bank.model.Accounts.CheckingAccount;
import com.bank.model.Accounts.SavingsAccount;
import com.bank.services.Bank;
import com.bank.services.BankImpl;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Bank bank = new BankImpl();
        Scanner scanner = new Scanner(System.in);
        Account accountCA = new SavingsAccount(100,  2500);
        Account accountCCA = new CheckingAccount(1001, 3000);

        bank.addAccount(accountCA);
        bank.addAccount(accountCCA);

        try {
            while (true) {
                System.out.println("Ingrese un comando (\"transferir\", \"saldo\", \"salir\"): ");
                String command = scanner.nextLine();
                if (command.equals("transferir")) {
                    System.out.println("Ingrese el número de cuenta origen: ");
                    Integer fromAccountNumber = Integer.parseInt(scanner.nextLine());

                    System.out.println("Ingrese el número de cuenta destino: ");
                    Integer toAccountNumber = Integer.parseInt(scanner.nextLine());

                    System.out.println("Ingrese el monto a transferir: ");
                    double amount = Double.parseDouble(scanner.nextLine());

                    boolean success = bank.transfer(fromAccountNumber, toAccountNumber, amount);

                    if (success) {
                        System.out.println("Transferencia realizada con éxito.");
                        System.out.println("saldo." + accountCA.getBalance() );
                        System.out.println("saldo." + accountCCA.getBalance() );
                    } else {
                        System.out.println("Error al realizar la transferencia.");
                    }
                } else if (command.equals("saldo")) {
                    System.out.println("Ingrese el número de cuenta: ");
                    Integer accountNumber = Integer.parseInt(scanner.nextLine());

                    Account account = bank.findAccount(accountNumber);

                    if (account != null) {
                        System.out.println("El saldo de la cuenta " + accountNumber + " es " + account.getBalance());
                    } else {
                        System.out.println("No se encontró la cuenta.");
                    }
                } else if (command.equals("salir")) {
                    break;
                }
                scanner.close();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // double interestCA = accountCA.calculateInterest(500);
        // System.out.println("El interés calculado para una cuenta de caja de ahorro
        // es: " + interestCA);

        // double interestCCA = accountCCA.calculateInterest(500);
        // System.out.println("El interés calculado para una cuenta corriente es: " +
        // interestCCA);
    }
}
