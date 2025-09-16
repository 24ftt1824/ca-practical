package P6;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username= "Ahmad Ali";
        String password= "12345";

        System.out.println("Please enter your username:");
        String usernameinput = input.nextLine();
        
        System.out.println("Please enter the password:");
        String passwordinput = input.nextLine();

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = ldt.format(dtf);

         if (username.equals(usernameinput)) {

            if (password.equals(passwordinput)){
                System.out.println("Welcome Ahmad Ali. The time now is " + time);
            }
            else {
                System.out.println("Error: Password does not match.");
            }
        }
         else {
            System.out.println("Error: Invalid Username.");
        }
}
    }

    

