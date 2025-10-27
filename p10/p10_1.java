package p10;
import java.util.Scanner;

public class p10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for the first integer
        System.out.println("Enter first integer:");
        int first = input.nextInt();

        // Ask user for the second integer
        System.out.println("Enter second integer:");
        int second = input.nextInt();

        // Display the result by calling the method commondiv
        // It will return the greatest common divisor (GCD)
        System.out.println("The greatest common divisor for " 
            + first + " and " + second + " is " 
            + commondiv(first, second));
    }
    
    // Method to find the greatest common divisor (GCD)
    public static int commondiv(int num1, int num2) {
        int gcd = 1; // stores the greatest common divisor
        int minimum = Math.min(num1, num2); // find the smaller number

        // Loop from 1 up to the smaller number
        for (int i = 1; i <= minimum; i++) {
            // If both numbers can be divided by i evenly
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // update the gcd
            }
        }

        // Return the greatest common divisor
        return gcd;
    }
}
