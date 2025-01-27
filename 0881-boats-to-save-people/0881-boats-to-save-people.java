// two pointer approch
class Solution {
    public int numRescueBoats(int[]arr, int limit) {
       Arrays.sort(arr);
       int left=0;
       int right=arr.length-1;
       int boat=0;
       while(left<=right)
       {
          if(arr[right]==limit)
          {
            boat++;
            right--;
          }
         else if(arr[left]+arr[right]<=limit)
         {
            boat++;
            left++;
            right--;
         }
         else if(arr[right]<limit)
         {
            boat++;
            right--;
         }
         else  if(arr[left]<limit)
         {
            boat++;
            left++;
         }

       } 
       return boat;
    }
}