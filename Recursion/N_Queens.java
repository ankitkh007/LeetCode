import java.util.*;

public class N_Queens {
    private static void solveNQueens(int col, int n, char board[][], int leftRow[], int lowerDiagonal[],
            int upperDiagonal[], List<List<String>> ans) {
        if (col == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }

        for (int row = 0; row < n; row++) {
            // check if it's valid position to place a Queen
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {

                // Place Queen: update the postional-values in helper arrays
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                // Recurse: move to next col
                solveNQueens(col + 1, n, board, leftRow, lowerDiagonal, upperDiagonal, ans);

                // Backtrack: after coming back reset the positional value to default
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];

        for (char row[] : board)
            Arrays.fill(row, '.');

        int leftRow[] = new int[n];
        int lowerDiagonal[] = new int[2 * n - 1];
        int upperDiagonal[] = new int[2 * n - 1];

        solveNQueens(0, n, board, leftRow, lowerDiagonal, upperDiagonal, ans);

        for (List<String> list : ans)
            System.out.println(list);
        sc.close();
    }
}
