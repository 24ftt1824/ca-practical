package p3;
import java.util.Scanner;

public class p3_5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("What is your target amount?: $");
            double targetmoney = input.nextDouble();
         System.out.println("How many month(s) to reach your goal?");
            int months = input.nextInt();

            int daysinmonth = 30;
            double savingperday = (double)(targetmoney / (months * daysinmonth));

            System.out.printf("The amount you need to save per day is $%.2f\n", savingperday);
    }
    

}
