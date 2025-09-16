package P6;
import java.util.Scanner;
public class p6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an arithmetic expression:");
        int no1 = input.nextInt();
        String operator = input.next();
        int no2 = input.nextInt();

        switch (operator) {
            case "+":
                System.out.println("The sum is " + (no1 + no2));
                break;
            case "-":
                System.out.println("The subtraction is " + (no1 - no2));
                break;
            case "*":
                System.out.println("The multiplication is " + (no1 * no2));
                break;
            case "/":
                if (no2 == 0) {
                    System.out.println("Math error: The divisor cannot be Zero");
                } 
                else {
                    System.out.println("The division is " + (no1 / no2));
                }
                break;
            default:
                System.out.println("Unknown operator.");
        }


    }
}
