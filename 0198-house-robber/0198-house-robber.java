// solve using dp algorithm
// use previous value in current position
class Solution {
    public int rob(int[] nums) {
         int ans[]=new int[nums.length];
        if(nums.length==1)
          return nums[0];
          else if(nums.length==2)
           return Math.max(nums[0],nums[1]);
       else
        {
          ans[0]=nums[0];
            ans[1]=Math.max(nums[0],nums[1]);
            for(int i=2; i<nums.length; i++)
             ans[i]=Math.max(ans[i-1],ans[i-2]+nums[i]);
        }
        return ans[nums.length-1];
    }
}