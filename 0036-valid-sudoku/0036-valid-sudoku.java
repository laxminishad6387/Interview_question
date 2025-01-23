class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Validate rows, columns, and sub-boxes
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();
            
            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }
                // Check column
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }
                // Check sub-box
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != '.' && !boxSet.add(board[rowIndex][colIndex])) {
                    return false;
                }
            }
        }
        return true; // All rows, columns, and sub-boxes are valid
    }
}
