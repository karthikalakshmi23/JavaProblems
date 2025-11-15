/*1.ATM Withdrawal System

 - A user enters the withdrawal amount.

 - If the balance is greater than or equal to the withdrawal amount, print "Transaction Successful".

 - Else print "Insufficient Balance".*/

import java.util.Scanner;

public class DAY_3_1 {
    public static void main(String[] args) {
        int balance = 1000; // Example balance

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        if (balance >= withdrawalAmount) {
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
        scanner.close();
    }
}
