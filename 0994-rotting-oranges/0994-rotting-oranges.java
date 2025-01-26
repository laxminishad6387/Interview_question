class Solution {
    public int orangesRotting(int[][] arr) {
       int n= arr.length;  // length  of row
       int m=arr[0].length; // length of col
       int size=0;
       Queue<int[]> q=new LinkedList<>();
    
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j]==2)  // find number of  rotten orange 
                  q.offer(new int []{i,j});
                else if(arr[i][j]==1)  //find number of fresh orange
                 size++;
            }
        }

         // If there are no fresh oranges, return 0
        if (size == 0) return 0;

        // traverse in grid
        int count=0;
        while(!q.isEmpty())
        {
            int length=q.size();
            for(int i=0; i<length; i++)
            {
                int []curr=q.remove();
                int x=curr[0];
                int y=curr[1];
                // check left side
                if(y-1!=-1 && arr[x][y-1]==1)
                {
                    size--;
                    arr[x][y-1]=2;
                    q.offer(new int[]{x,y-1});
                }
                // check right side
                if(y+1!=m && arr[x][y+1]==1)
                {
                    size--;
                    arr[x][y+1]=2;
                    q.offer(new int[]{x,y+1});
                }
                 // check top side
                if(x-1!=-1 && arr[x-1][y]==1)
                {
                    size--;
                    arr[x-1][y]=2;
                    q.offer(new int[]{x-1,y});
                }
                 // check bottom side
                if(x+1!=n && arr[x+1][y]==1)
                {
                    size--;
                    arr[x+1][y]=2;
                    q.offer(new int[]{x+1,y});
                }
            }
            count++;
        }
       if(size!=0)
       return -1;
       else 
       return count-1;
    }

}