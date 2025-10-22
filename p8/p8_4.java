package P8;
import java.util.Scanner;

public class p8_4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = input.nextInt();

        int[] score = new int[n];  
        char[] grade = new char[n]; 

        System.out.println("Enter the " + n + " scores");
        int best = 0;

        for (int i = 0; i < n; i++) {
            score[i] = input.nextInt(); 
            if (score[i] > best) {
                best = score[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (score[i] >= best - 10) {
                grade[i] = 'A';
            } else if (score[i] >= best - 20) {
                grade[i] = 'B';
            } else if (score[i] >= best - 30) {
                grade[i] = 'C';
            } else if (score[i] >= best - 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " score is " + score[i] + " and grade is " + grade[i]);
        }
    }
}
