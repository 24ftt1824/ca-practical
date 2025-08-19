package p4;
import java.util.Scanner;

public class p4_1 {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);

    int a = (int)(Math.random() * 101);
    int b = (int)(Math.random() * 101);

    System.out.println("What is " + a + " + " + b + "?");
    int suminput = input.nextInt();
    System.out.println( a + " + " + b + " = " + suminput + " is " + (suminput == a+b) );

    System.out.println("What is " + a + " % " + b + "?");
    int percentageinput = input.nextInt();
    System.out.println( a + " + " + b + " = " + percentageinput + " is " + (percentageinput == a%b) );

    }
}
