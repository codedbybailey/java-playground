/**
 * @author : Bailey Thompson.
 * @course : CS 1101 – Intro to Computer Science Lab.
 * @instructor : Kuldeep Singh (Ph.D.)
 * @assignment : StudentScores.
 * @description : Store five student scores in an array,
 * calculate the sum and average, and display the results.
 */

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Create an array for five student scores
        int[] scores = new int[5];

        //Ask user to enter five scores
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student score: ");
            scores[i] = input.nextInt();
        }

        //Calculate the sum of scores
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + scores[i];
        }

        //Calculate average score
        double average = sum / 5.0;

        //Display sum and average
        System.out.println("Total Score: " + sum);
        System.out.println("Average Score: " + average);

        input.close();
    }
}
