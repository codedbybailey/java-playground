import java.util.Scanner;

public class TicketDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get Age
        System.out.print("Enter age: ");
        int age = input.nextInt();

        //Determine Ticket Price
        double price;

         if (age < 13 ){
             price = 8.00;
         }else if (age < 65){
             price = 12.00;
         }else{
             price = 9.00;
         }

        //Get Ticket Type
        System.out.print("Enter ticket type (1-3): ");
         int type = input.nextInt();

         switch (type){
             case 1:
                 System.out.println("Standard Ticket");
                 break;

             case 2:
                 System.out.println("3D Ticket");
                 break;

             case 3:
                 System.out.println("IMAX Ticket");
                 break;

             default:
                 System.out.println("Invalid Ticket Type");
         }

         System.out.println("Price: $" + price);

    }
}