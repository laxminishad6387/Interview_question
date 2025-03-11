class Solution {
    public void setZeroes(int[][] mat) {
      boolean zero[][] =new boolean[mat.length][mat[0].length];
      for(int i=0; i<mat.length; i++)
      {
        for(int j=0; j<mat[0].length; j++)
         {
            if(mat[i][j]==0)
            zero[i][j]=true;
         }
      } 

  for(int i=0; i<mat.length; i++)
  {
    for(int j=0; j<mat[0].length; j++)
    {
        if(mat[i][j]==0 && zero[i][j]==true)
        {
            for(int row=0; row<mat.length; row++)
            {
               
                mat[row][j]=0;
            }
             for(int col=0; col<mat[0].length; col++)
            mat[i][col]=0;
        }
    }
  }


    }
}