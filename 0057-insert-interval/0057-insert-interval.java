class Solution {
    public int[][] insert(int[][] arr, int[] nums) {
        ArrayList<int[]> result=new ArrayList<>();
        int i=0;
        int n=arr.length;
        // add arr item while last index of arr is less than nums of first index. because arr iis non overlapping . 
        while(i<n && arr[i][1]<nums[0])
         { result.add(arr[i]);
          i++;
         }

         int start=nums[0];
         int end=nums[1];
         while(i<n && arr[i][0]<=end)  //it fix that all item are overlapping
         {
            start=Math.min(start, arr[i][0]);
            end=Math.max(end,arr[i][1]);
            i++;
         }
         result.add(new int[]{start, end}); //only one overlapping item possible  . beecause one interval given
         while(i<n)  //remaning non overlapping item of arr
         {
            result.add(arr[i]);
            i++;
         }
     return result.toArray(new int[result.size()][]);
    }
}