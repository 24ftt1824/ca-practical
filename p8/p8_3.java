package P8;

import java.util.Scanner;

public class p8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i; 
        }

       
        for (int i = 0; i < 10; i++) {
            int j = (int) (Math.random() * 10);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        int[] guess = new int[4];
        int chances = 10;
        boolean win = false;

        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            int score = 0; // reset score
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                win = true;
                break;
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
                } else {
                    System.out.print("The actual number is ");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(numbers[i]);
                        if (i < 3) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(". You Lose.");
                }
            }
        }


    }
}
