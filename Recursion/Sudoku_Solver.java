import java.util.*;

public class Sudoku_Solver {
    private static boolean solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') { // check for empty cell
                    for (char c = '1'; c <= '9'; c++) { // try every possible options
                        if (isValid(board, i, j, c)) { // if valid
                            board[i][j] = c; // fill that number

                            if (solveSudoku(board) == true) // recurse: check for next empty cell and fill
                                return true; // if reached at end return true no need to check further; since we need
                                             // only 1 valid answer
                            else
                                board[i][j] = '.'; // if at any place not possible backtarck and reset
                        }
                    }
                    return false; // if not possible to any any of the number from 1-9 return false
                }
            }
        }
        return true; // reached at the end; return true
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) // check for column
                return false;

            if (board[row][i] == c) // check for row
                return false;

            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) // check for 3*3 submatrix
                return false;
        }
        return true; // if all conditions fulfilled, return true
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char board[][] = new char[9][9];

        System.out.println("Enter the Sudoku values: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        solveSudoku(board);

        System.out.println("\n--------------------------------------------\n");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
