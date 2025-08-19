package p4;
import java.util.Scanner;
public class p4_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer between 100 and 999: ");
    int n = input.nextInt();

    int firstdigit = n / 100;
    int seconddigit = (n / 10) % 10;
    int thirddigit = n % 10;

   
    System.out.println("The reverse of " + n + " is " + thirddigit+seconddigit+firstdigit );
  }  
}
