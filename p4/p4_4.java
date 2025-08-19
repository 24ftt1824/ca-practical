package p4;
import java.util.Scanner;
public class p4_4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 1 to convert bnd to rm and 2 vise versa:");
    int choice = input.nextInt();
    System.out.println("Enter the amount to be converted: $");
    double amount = input.nextDouble();

    double convertedAmount = choice == 1 ? amount * 3 : amount / 3;
    System.out.printf("The change is $%.2f " , convertedAmount);

    }
}
