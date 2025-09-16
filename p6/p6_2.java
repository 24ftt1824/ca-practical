package P6;
import java.util.Scanner;
public class p6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random1 = (int)(Math.random()*100); 
        int random2 = (int)(Math.random()*100); 
        int random3 = (int)(Math.random()*100); 
        int random4 = (int)(Math.random()*100); 

        System.out.println("What is "+ random1 +" + "+ random2 +" + "+ random3 +" + "+ random4 +"?");
        double userinput = input.nextDouble();

        double answer= random1 + random2 + random3 + random4;

        if (userinput == answer){
            System.out.println("Well done, you are correct!");
        }
        else{
            System.out.println("Nice try, the sum should be "+answer);
        }



    }
}
