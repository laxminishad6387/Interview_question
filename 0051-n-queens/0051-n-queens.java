class Solution {
    boolean isSafe(List<String>board, int row, int col, int n)
    {
       
        // handle row
        for(int i=0; i<n; i++)
        {
            if( board.get(row).charAt(i)=='Q')
            return false;
        }
        // handle col
        for(int i=0; i<n ;i++)
        {
            if( board.get(i).charAt(col)=='Q')
            return false;
        }
        // handle left diagonal
        for(int i=row , j=col; i>=0 && j>=0 ; i--, j--)
        {
            if( board.get(i).charAt(j)=='Q')
            return false;
        }
        // hhandle right diagonal
        for(int i=row, j=col; i>=0 && j<n; i--, j++)
        {
            if( board.get(i).charAt(j)=='Q')
            return false;
        }
        return true;

    }

    void backTracking(List<String> board,int row, int n, List<List<String>> result)
    {
        if(row==n)
        {
             result.add(new ArrayList<>(board));
             return;
        }
          
      
            for( int j=0 ; j<n; j++)
            {
                if(isSafe(board,row,j,n))
                {
                     StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(j, 'Q');
                board.set(row, sb.toString());

                // Recur to next row
                backTracking(board, row + 1, n, result);

                // Undo the change (Backtrack)
                sb.setCharAt(j, '.');
                board.set(row, sb.toString());
                }
            }
        
    }
    public List<List<String>> solveNQueens(int n) {
        List<String> board=new ArrayList<>();
         String row = ".".repeat(n);
         for(int i=0; i<n; i++)
           board.add(row);
           List<List<String>> result=new ArrayList<>();
           backTracking(board,0,n,result);
           return result;
         
    }
}