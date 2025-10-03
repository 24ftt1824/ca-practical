package p7;
import java.util.Scanner;
public class p7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startnum=1;
        int endnum=20;

        System.out.println("Below is generated using while loop:");
        while(startnum<=endnum){
            System.out.print(startnum+" ");
            startnum++;
        }

        System.out.println();
        System.out.println("Below is generated using dowhile loop:");
        
        int i = 50;
        int b = 35;

        do{
            System.out.print(i+" ");
             i--;
        }while (i>=b);

        System.out.println();
        System.out.println("Below is generated using for loop:");
        
        for(char alphabet='a';alphabet <='z';alphabet++){
            System.out.print(alphabet+" ");
        }


    }
}
