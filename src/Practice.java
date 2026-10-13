import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input monthly salary: ");
        double salary = input.nextDouble();
        System.out.print("Input performance rating: ");
        int rating = input.nextInt();

        double bonusPercent = 0;

        if (rating == 5 ) {
            bonusPercent = 0.20;
        }else if (rating == 4){
            bonusPercent = 0.15;
        }else if (rating == 3){
            bonusPercent = 0.10;
        }else if (rating == 2){
            bonusPercent = 0.05;
        }else if (rating == 1){
            bonusPercent = 0.0;
        }else{
            System.out.println("Invalid Entry\n");
        }

        double bonusAmount = salary * bonusPercent;
        double total = salary + bonusAmount;
        System.out.println("Bonus: " + bonusAmount);
        System.out.print("Total Salary: " + total);



    }
}
