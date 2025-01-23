class Solution {
    public boolean issolver(char [][]board,int row,int col,int number)
    {
        // check in hhorizontal & vertical
        for(int i=0; i<board.length; i++)
        {
            if(board[row][i]==(char)(number+'0'))
              return false;
            if(board[i][col]==(char)(number+'0'))
              return false;
        }
        int sr=(row/3) *3;
        int sc=(col/3 )*3;
        // check in grid
        for(int i=sr; i<sr+3; i++)
        {
            for(int j=sc; j<sc+3; j++)
            {
                if(board[i][j]==(char)(number+'0'))
                return false;
            }
        }
        return true;
    }
    public boolean helper(char [][]board, int row, int col)
    {
        if(row==board.length)
        return true;
        int nrow=0;
        int ncol=0;
        if(col!=board.length-1)
        {
            ncol=col+1;
            nrow=row;
        }
        else {
            nrow=row+1;
            ncol=0;
        }

        if(board[row][col]!='.')
        {
           if( helper(board, nrow,ncol))
           {
             return true;
           }

        }
        else{
            for(int i=1; i<=9; i++)
            {
                if(issolver(board,row,col,i))
                 {
                    board[row][col]=(char)(i+'0');
                    if(helper(board, nrow,ncol))
                    {
                    return true;
                    }
                    else{
                     board[row][col]='.';
                    }
                 }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0,0);
    }
}