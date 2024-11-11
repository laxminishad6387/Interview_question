// 45 days challenge question
class Solution {
public int maxArea(int[] nums) {
    //solve using two pointer approch
         int maxWater=0;
         int j=nums.length-1;
         int i=0;
         
         while(i<j)
         {
            
             int currentValue=Math.min(nums[i],nums[j])*(j-i);
              maxWater=Math.max(currentValue,maxWater);
             
            if(nums[i]>nums[j])
              j--;
              else
               i++;
         }
        return maxWater;
    }
}