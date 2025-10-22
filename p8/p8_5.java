package P8;

import java.util.Scanner;

public class p8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int[] num = new int[10]; 

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }

     
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (num[i] == num[j]) {
                    num[j] = 0; 
                }
            }
        }

    
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (num[i] != 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }
}
