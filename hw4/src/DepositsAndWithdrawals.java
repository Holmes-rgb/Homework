/*
Luke Holmes
CS 2100
9/26/2023

A short program to practice java objects. Simulates a very basic savings account.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DepositsAndWithdrawals {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // prompt for interest rate
        System.out.print("Enter the savings account's annual interest rate: ");
        double interestRate = input.nextDouble();

        // prompt for initial balance
        System.out.print("Starting Balance: $");
        double balance = input.nextDouble();

        // create instance of SavingsAccount object called account
        SavingsAccount account = new SavingsAccount(balance, interestRate);

        // create scanner to scan from deposits file
        Scanner deposits = new Scanner(new File("Deposits.txt"));

        // deposit money
        while(deposits.hasNextDouble()){
            double deposit = deposits.nextDouble();
            System.out.printf("Deposit: $%.2f, ", deposit);
            account.deposit(deposit);
            System.out.printf("balance = $%.2f\n", account.getBalance());
        }
        deposits.close();

        // create scanner to scan from withdrawals file
        Scanner withdrawals = new Scanner(new File("Withdrawals.txt"));

        // withdraw money
        while(withdrawals.hasNextDouble()){
            double withdrawal = withdrawals.nextDouble();
            System.out.printf("Withdraw: $%.2f, ", withdrawal);
            account.withdraw(withdrawal);
            System.out.printf("balance = $%.2f\n", account.getBalance());
        }
        withdrawals.close();

        // calculate interest accrued and add it to balance
        account.addInterest();

        // print interest earned for the month
        System.out.printf("Interest earned: %.2f\n", account.getLastInterest());

        // print balance
        System.out.printf("Ending balance: %.2f", account.getBalance());

    }
}
