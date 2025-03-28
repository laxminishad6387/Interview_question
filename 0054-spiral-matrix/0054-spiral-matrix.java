// Boundary Tracking Algorithm or Layer-by-Layer Spiral Traversal.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        
       
int top=0; int left=0; int right=col-1;  int bottom=row-1;
      while(left<=right && top<=bottom)
        {
               // move right
          for(int i=left; i<=right; i++)
            
               result.add(matrix[top][i]);
               
            
          top++;
            // move down
        
            for(int i=top; i<=bottom; i++)
            {
                result.add(matrix[i][right]);
               
            }
            right--;
            // move left
            if(top<=bottom){
            for(int i=right; i>=left; i--)
            {
                result.add(matrix[bottom][i]);
               
            }
            
            bottom--;
            }
            if(left<=right){
            for(int i=bottom; i>=top; i--)
            {
                result.add(matrix[i][left]);
               
            }
           left++;
            }

        }
        return result;

    }
}