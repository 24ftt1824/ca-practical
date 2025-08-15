package p3;
import java.util.Scanner;
public class p3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Each durian cost $15.75");

        System.out.print("How much money do you have? $");
        double money = input.nextDouble();

        int durian = (int)(money / 15.75);
        System.out.println("The number of durian(s) you can buy is " + durian);
       
         
    }
}
