// sliding window problem solve using two pointer approch
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum=0;
        int count=0;
        int minLength=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            count+=1;
            if(sum>=target)
            {
                sum=sum-nums[j]-nums[i];
                j++;

                minLength=Math.min(minLength,count);
                count=count-2;
                i--;
            }
        }
        if(minLength>nums.length)
           return 0;
           else
        return minLength;
    }
}