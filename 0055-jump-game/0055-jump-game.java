// solve using dp algorithm
// choice and previous value use both concept use
class Solution {
    public boolean canJump(int[] nums) {
       int maxjump=0;
       for(int i=0; i<nums.length; i++)
       {
          if(maxjump==0 && nums[i]==0 && i!=nums.length-1)
        return false;
       else if(nums[i]>=maxjump)
        maxjump=nums[i]-1;
        else if(nums[i]<maxjump)
        maxjump=maxjump-1;
       
       } 
       return true;
    }
}