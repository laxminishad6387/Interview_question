class Solution {
    public int jump(int[] nums) {
        
        if(nums.length==1)
        return 0;
        int maxjump=0;
        int jump=0;
        int tempjump=0;
        for(int i=0;i<nums.length; i++)
        {
           if(maxjump>=0 && i==nums.length-1)
           return jump;
           if(nums[i]>tempjump )
              tempjump=nums[i]-1;
           if(maxjump==0)
           {
            maxjump=Math.max(tempjump,nums[i]);
           jump++;
           }
           else if(nums[i]<=tempjump)
            tempjump=tempjump-1;
           
            maxjump=maxjump-1;
        }
        return jump;
    }
}