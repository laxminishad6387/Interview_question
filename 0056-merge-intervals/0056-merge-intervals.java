class Solution {
    public int[][] merge(int[][] arr) {
        // sort  in incresing  order
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
         int start=arr[0][0];
         int end=arr[0][1];
        
          ArrayList<int[]> tempresult = new ArrayList<>();
         for(int i=1; i<arr.length; i++)
         {
            if(arr[i][0]<=end)
                 end = Math.max(end, arr[i][1]);
            else
             {
               tempresult.add(new int[]{start,end});
                start=arr[i][0];
                end=arr[i][1];
             }
         }

        // Add the last interval
        tempresult.add(new int[]{start, end});


        // Convert the list to a 2D array
        return tempresult.toArray(new int[tempresult.size()][]);
      
    }
}