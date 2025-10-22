package p9;

import java.util.Scanner;

public class p9_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char [][] key = {
            {'A','B','C','D','A','B'}, 
            {'C','D','D','A','B','D'}, 
            {'D','D','A','B','B','A'}, 
            {'C','A','D','A','B','C'}, 
        };

        char [] cap = new char [6];

        System.out.println("Enter the key to the MCQ: ");
        for(int i=0 ;i < cap.length;i++){
            cap [i] = input.next().charAt(0);
        }

        for (int i = 0; i < key.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < key[i].length; j++) {
                if (key [i][j] == cap [j]) {
                    correctCount++; 
            }
        }

        if(correctCount<3){
            System.out.println("Student "+ i +" correct count is "+correctCount+". Therefore, he/she failed the test. ");
        }
        else{
            System.out.println("Student "+ i +" correct count is "+correctCount+". Therefore, he/she passed the test. ");
        }


    }
}
}
