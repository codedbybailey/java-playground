/*
@author : Bailey Thompson.
@course : CS 1101 – Intro to Computer Science Lab.
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 Classwork – Temperature.
@description :
*/

import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input Temperature
        System.out.print("Enter Temperature (Fahrenheit): ");
        double tempF = input.nextDouble();

        //Convert Temperature to Celsius
        double tempC = (5.0 / 9.0) * (tempF - 32);

        //Display
        System.out.print("Temperature in Celcius: " + tempC);

    }
}
