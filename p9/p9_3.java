package p9;
import java.util.Scanner;

public class p9_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}
        };
        int turn = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + "| " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {System.out.println("---------");}
        }
        while (true) {
            System.out.println("Player's turn");
            System.out.print("Enter a row (0,1 or 2): ");
            int r = input.nextInt();
            System.out.print("Enter a column (0,1 or 2): ");
            int c = input.nextInt();

            if (r < 0 || r > 2 || c < 0 || c > 2 || board[r][c] != ' ') {
                System.out.println("Invalid move. Try again.\n");
                continue;
            }
            board [r][c] = 'X';
            turn++;
        if ((board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X')||
                (board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X')||
                (board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X')||
                (board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X')||
                (board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X')||
                (board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X')||
                (board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X')||
                (board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X')) {
                System.out.println("Game ended, Player Win");
                break;
            }
            if (turn == 9){
                System.out.println("Game ended, Draw");
                break;
            }
            
            while (true) {
                int row = (int)(Math.random() * 3);
                int col = (int)(Math.random() * 3);
                if (board[row][col] == ' ') {
                    board[row][col] = 'O';
                    turn++;
                    break;
                }
            }
            if ((board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O')||
                (board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O')||
                (board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O')||
                (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O')||
                (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O')||
                (board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O')||
                (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O')||
                (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O')) {
                System.out.println("Game ended, CPU Win");
                break;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + board[i][0] + "| " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---------");
            }
            if (turn == 9){
                System.out.println("Game ended, Draw");
                break;
            }

        }
        for (int i = 0; i < 3; i++) {
                System.out.println(" " + board[i][0] + "| " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---------");
            }

    }
}
