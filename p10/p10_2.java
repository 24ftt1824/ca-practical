package p10;
import java.util.Scanner;

public class p10_2 {
 
    public static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10; 
            number /= 10; 
        }
        return rev;
    }

  
    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0; 
        int rounds = 3; 

        int i = 0;
        while (i < rounds) {  
            int number = (int)(Math.random() * 900) + 100; 
            
            System.out.print("Enter the reverse of " + number + ": ");
            int userInput = input.nextInt();

            while (userInput < 100 || userInput > 999) {
                System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
                userInput = input.nextInt();
            }

            boolean isPalin = isPalindrome(userInput, reverse(number));
            
            if (isPalin == true) {
                counter++;
            }

            System.out.println("The digit " + userInput + " is palindrome of " 
                + reverse(number) + " is " + isPalin + ".");
            System.out.println();

            i++; 
        }

        System.out.println("Total correct answers: " + counter);
    }
}
