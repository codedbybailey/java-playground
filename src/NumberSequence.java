/*
@author : Bailey Thompson.
@course : CS 1101 – Intro to Computer Science Lab.
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 Classwork – NumberSequence.
@description :
*/
import java.util.Scanner;
public class NumberSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for starting/ending Integers
        System.out.print("Input starting Integer: ");
        int start = input.nextInt();
        System.out.print("Input ending Integer: ");
        int end = input.nextInt();

        //Loop
        for (int number = start; number <= end; number++) {
            System.out.println(number);
        }

        //End
        System.out.println("Sequence complete.");


    }
}
