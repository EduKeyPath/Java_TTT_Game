package Java_TTT_Game;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        char currentPlayer = 'X';

        for(int turn = 0; turn < 9; turn++){
            // printBoard();
            
        }

        System.out.println("abc");
    }
}




// import java.util.Scanner;

// public class TicTacToe {
//     static char[][] board = {
//         {' ', ' ', ' '},
//         {' ', ' ', ' '},
//         {' ', ' ', ' '}
//     };

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         char currentPlayer = 'X';

//         for (int turn = 0; turn < 9; turn++) {
//             printBoard();
//             System.out.println("Player " + currentPlayer + "'s turn.");
//             int row, col;

//             while (true) {
//                 System.out.print("Enter row (0-2): ");
//                 row = scanner.nextInt();
//                 System.out.print("Enter column (0-2): ");
//                 col = scanner.nextInt();

//                 if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
//                     board[row][col] = currentPlayer;
//                     break;
//                 } else {
//                     System.out.println("Invalid move, try again.");
//                 }
//             }

//             if (checkWin(currentPlayer)) {
//                 printBoard();
//                 System.out.println("Player " + currentPlayer + " wins!");
//                 return;
//             }

//             currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//         }

//         printBoard();
//         System.out.println("It's a draw!");
//     }

//     static void printBoard() {
//         System.out.println("-------------");
//         for (char[] row : board) {
//             System.out.print("| ");
//             for (char cell : row) {
//                 System.out.print(cell + " | ");
//             }
//             System.out.println("\n-------------");
//         }
//     }

//     static boolean checkWin(char player) {
//         for (int i = 0; i < 3; i++) {
//             if (
//                 (board[i][0] == player && board[i][1] == player && board[i][2] == player) || // row
//                 (board[0][i] == player && board[1][i] == player && board[2][i] == player)    // column
//             ) return true;
//         }

//         return (
//             (board[0][0] == player && board[1][1] == player && board[2][2] == player) || // main diag
//             (board[0][2] == player && board[1][1] == player && board[2][0] == player)    // anti diag
//         );
//     }
// }
