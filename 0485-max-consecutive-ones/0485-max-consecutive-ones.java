class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes=0;
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                count+=1;
                consecutiveOnes=Math.max(consecutiveOnes,count);
            }
           else 
            count=0;
        }
        return consecutiveOnes;
    }
}