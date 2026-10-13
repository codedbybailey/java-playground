/*
@author : Bailey Thompson.
@course : CS 1101 – Intro to Computer Science Lab.
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 Classwork – Variables.
@description :
*/

public class Variables {
    public static void main(String[] args) {

        // Declare and initialize variables
        String studentName = "Bailey";
        int studentAge = 19;
        double itemPrice = 12.50;
        boolean student = true;
        char grade = 'A';

        // Arithmetic expression
        double totalPrice = itemPrice * 2;

        // Update a variable using its current value
        studentAge = studentAge + 1;

        // Display variable values
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Total Price for 2 items: $" + totalPrice);
        System.out.println("Is a Student: " + student);
        System.out.println("Grade: " + grade);
    }
}
