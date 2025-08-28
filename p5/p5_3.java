package P5;
import java.util.Scanner;
public class p5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your message: ");
        String message = input.nextLine();

        System.out.println("Enter the substring to replace: ");
        String oldsubstring = input.nextLine();

        System.out.println("Enter the replacement string:  ");
        String newsubstring = input.nextLine();

        String updatedMessage = message.replace(oldsubstring, newsubstring);

        System.out.println("The updated message is:");
        System.out.println(updatedMessage);
    }
    
}
