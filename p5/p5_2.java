package P5;
import java.util.Scanner;
public class p5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.println("Enter the 5 letters word: ");
        String fiveletters = input.nextLine();

        if(fiveletters.length() != 5){
            System.out.println("Word must be exactly 5 letters");
        }
        
        else{
            String reverse ="" +
            fiveletters.charAt(4) +
            fiveletters.charAt(3) +
            fiveletters.charAt(2) +
            fiveletters.charAt(1) +
            fiveletters.charAt(0) ;
     
            System.out.println("The reverse of "+fiveletters+" is "+reverse);
        }

        
    }
}
