/*
@author : Bailey Thompson.
@course : CS 1101 – Intro to Computer Science Lab.
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 Classwork – TimeConverter.
@description :
*/
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for # of Seconds
        System.out.print("Enter # of Seconds: ");
        int secondsInitial = input.nextInt();

        //Convert To Hours
        int hours = secondsInitial / 3600;

        //Convert to Minutes
        int minutesRemain = secondsInitial % 3600;
        int minutes = minutesRemain / 60;

        //Remaining Seconds
        int seconds = minutesRemain % 60;

        //Display
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: "+ seconds);
    }
}
