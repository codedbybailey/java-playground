/**
 * @author : Bailey Thompson.
 * @course : CS 1101 – Intro to Computer Science Lab.
 * @instructor : Kuldeep Singh (Ph.D.)
 * @assignment : ArrayBasics.
 * @description : Create an array, display values,
 * change an element, and display the array length.
 */

public class ArrayBasics {
    public static void main(String[] args) {

        //Create an array with five values
        int[] numbers = {10, 20, 30, 40, 50};

        //Display first and last element
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[4]);

        //Change the third element
        numbers[2] = 100;

        //Display updated third element
        System.out.println("Updated Third Element: " + numbers[2]);

        //Display array length
        System.out.println("Array Length: " + numbers.length);

    }
}
