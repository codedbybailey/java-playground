/*
@author : Bailey Thompson.
@course : CS 1101 – Intro to Computer Science Lab.
@instructor : Kuldeep Singh (Ph.D.)
@assignment : Module 1 Classwork – FoodOrder.
@description :
*/
import java.util.Scanner;
public class FoodOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        //Show the Items and prices
        System.out.println("1. Burger $8");
        System.out.println("2. Pizza $12");
        System.out.println("3. Salad $7");

        //Give the prompt for choice/quantity
        System.out.print("Enter order number: ");
        int choiceN = input.nextInt();
        System.out.print("Enter quantity: ");
        int choiceQ = input.nextInt();
        System.out.println(" ");

        //Establish Values
        switch (choiceN) {
            case 1:
                System.out.println(choiceQ +" Burger");
                total = 8;
                break;

            case 2:
                System.out.println(choiceQ +" Pizza");
                total = 12;
                break;

            case 3:
                System.out.println(choiceQ +" Salad");
                total = 7;
                break;

            default:
                System.out.println("Invalid choice");
        }

        //Calculate order total
        double orderT = total * choiceQ;

        //Determine discount
        double discount = 0;
        if (orderT < 20) {
            discount = 0.0;
        } else if (orderT <= 50) {
            discount = 0.10;
        } else if (orderT > 50) {
            discount = 0.20;
        }

        //Determine final order total
        double orderDC = orderT * discount;
        double orderFT = orderT - orderDC;

        //Display final totals
        System.out.println("Order Total: $" + orderT);
        System.out.println("Discount: $" + orderDC);
        System.out.println("Final Total: $" + orderFT);
        System.out.println("Order Complete");
    }
}
