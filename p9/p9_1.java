package p9;
import java.util.Scanner;

public class p9_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int[][] rating = {
            {4, 5, 4},
            {3, 5, 3}, 
            {4, 5, 3}, 
            {1, 2, 1}  
        };

        
        System.out.println("Rating\tProduct\tPackaging\tDelivery");

      
        double totalProduct = 0;
        double totalPackaging = 0;
        double totalDelivery = 0;

        for (int i = 0; i < rating.length; i++) { 
            totalProduct += rating[i][0];
            totalPackaging += rating[i][1];
            totalDelivery += rating[i][2];
        }

        double avgProduct = totalProduct / rating.length;
        double avgPackaging = totalPackaging / rating.length;
        double avgDelivery = totalDelivery / rating.length;

      
        System.out.printf("Average\t%.2f\t%.2f\t%.2f\n", avgProduct, avgPackaging, avgDelivery);

      
        for (int i = 0; i < rating.length; i++) {
            double sum = 0;
            for (int j = 0; j < rating[i].length; j++) {
                sum += rating[i][j];
            }
            double avg = sum / rating[i].length;
            System.out.printf("Customer "+(i + 1)+" provide the average rating %.2f\n", avg);
        }
    }
}
