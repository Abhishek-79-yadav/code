public class SudokuSolver {

    private static final int SIZE = 9;

    // Function to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.print("\n");
        }
    }

    // Function to check if a number can be placed in the given position
    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check the row
        for (int x = 0; x < SIZE; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Check the column
        for (int x = 0; x < SIZE; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // Check the 3x3 box
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    // Backtracking function to solve the Sudoku
    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Check for an empty cell
                if (board[row][col] == 0) {
                    // Try possible numbers
                    for (int num = 1; num <= SIZE; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number

                            // Recursively attempt to fill the rest of the board
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // If unsuccessful, reset the cell (backtrack)
                            board[row][col] = 0;
                        }
                    }
                    return false; // Return false if no number can be placed
                }
            }
        }
        return true; // Return true if the board is completely filled
    }

    public static void main(String[] args) {
        // Example Sudoku puzzle (0 represents empty cells)
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
