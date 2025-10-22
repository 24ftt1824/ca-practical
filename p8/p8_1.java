package P8;
import java.util.Scanner;
public class p8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] letters = {
            "a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};

       
        for (int i = 0, j = 25; i < 26; i++, j--) {
            System.out.print(letters[i] + " " + letters[j]); 
                System.out.print(" "); 
        }
    }
}
