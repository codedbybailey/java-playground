/*
@author : Bailey Thompson.
@course : CS 1101 – Intro to Computer Science Lab.
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 Classwork – Withdrawal.
@description : Java program that checks if there is enough money for a withdrawal and displays the remaining balance.
*/

import java.util.Scanner;
public class Withdrawal {
    public static void main(String[] args) {
        //Initial balance
        double x = 500.00;

        //Input withdrawal amount
        Scanner input = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: $");
        double amount = input.nextDouble();

        //Determine Sufficient Funds/Subtract funds to make end total
        if (amount > 500) {
            System.out.println("Insufficient Funds");
        }else {
            double finalTotal = x - amount;
            System.out.println("Transaction Complete");
            System.out.println("New Balance:$" + finalTotal);
        }


    }
}