package p9;
import java.util.Scanner;

public class p9_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3]; // 3x3 board
        for (int i = 0; i < 3; i++) { // fill board with spaces
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // print empty board
        System.out.println(" | |");
        System.out.println("---------");
        System.out.println(" | |");
        System.out.println("---------");
        System.out.println(" | |");

        boolean gameOver = false;

        while (!gameOver) {
            //Player turn 
            System.out.println("Player's turn");
            int r, c;
            while (true) {
                System.out.print("Enter a row (0,1 or 2): ");
                r = input.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                c = input.nextInt();
                if (r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' ') {
                    board[r][c] = 'X';
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            // check player win
            if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
                (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
                (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
                (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
                (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
                (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
                (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
                (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
                System.out.println("Game ended, Player Win");
                gameOver = true;
                break;
            }

            // check draw 
            boolean full = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        full = false;
                    }
                }
            }
            if (full) {
                System.out.println("Game ended, Draw");
                break;
            }

            // Computer turn
            int cr, cc;
            while (true) {
                cr = (int)(Math.random() * 3);
                cc = (int)(Math.random() * 3);
                if (board[cr][cc] == ' ') {
                    board[cr][cc] = 'O';
                    break;
                }
            }

            // print board
            for (int i = 0; i < 3; i++) {
                System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---------");
            }

            // check computer win
            if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
                (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
                (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
                (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
                (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
                (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
                (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
                System.out.println("Game ended, CPU Win");
                gameOver = true;
                break;
            }

           
            full = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        full = false;
                    }
                }
            }
            if (full) {
                System.out.println("Game ended, Draw");
                break;
            }
        }
    }
}
