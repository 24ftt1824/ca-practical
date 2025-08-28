package P5;
import java.util.Scanner;
public class p5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word");
        String firstword = input.nextLine();
        System.out.println("Enter the second word");
        String secondword = input.nextLine();
        
        System.out.println("are both word the same? " + firstword.equalsIgnoreCase(secondword));

    }
}
