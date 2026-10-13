/*
@author : Bailey Thompson
@course : CS 1101 – Intro to Computer Science Lab
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 MiniLab — Trip Cost Calculator
@description : Java program that calculates the fuel needed and total gas cost for a trip.
*/

import java.util.Scanner;
public class TripCost {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //User Input of variables
            int gal = 1;
            System.out.print("Enter trip distance (miles): ");
            double distance = input.nextDouble();
            System.out.print("Enter fuel efficiency (MPG): ");
            int mpg = input.nextInt();
            System.out.print("Enter gas price per gallon: ");
            double price = input.nextDouble();

        System.out.println();

        //Calculation of total fuel required
            double totalFuel = distance * gal/mpg;
            System.out.println("Fuel Required: " + totalFuel);

        //Calculation of total cost
            double costFuel = totalFuel * price/gal;
            System.out.println("Fuel Cost: $" + costFuel);
    }
}
