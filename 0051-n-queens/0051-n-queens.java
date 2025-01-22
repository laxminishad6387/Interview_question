// backtracking pproblem question(it's required all possible outcomes)

class Solution {
    public boolean isSafe(ArrayList<String> board, int row, int col, int n) {
        // check horizontal
        for (int i = 0; i < n; i++) {
            if (board.get(row).charAt(i) == 'Q')
                return false;
        }
        // check vertical
        for (int i = 0; i < n; i++) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }
        // check left side diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        // check right side diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        return true;
    }

    public void backtrack(List<List<String>> result, ArrayList<String> board, int row, int n) {
        if (row == n) {
            result.add(new ArrayList<>(board));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {
                char[] rowArray = board.get(row).toCharArray();
                rowArray[i] = 'Q';
                board.set(row, new String(rowArray));

                // Recur to the next row
                backtrack(result, board, row + 1, n);

                // Backtrack: remove the queen
                rowArray[i] = '.';
                board.set(row, new String(rowArray));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        ArrayList<String> board = new ArrayList<>();
        String row = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(row);
        }

        List<List<String>> result = new ArrayList<>();
        backtrack(result, board, 0, n);
        return result;
    }
}