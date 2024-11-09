// 45 days challenege question
class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<minProfit)
            minProfit=nums[i];
            else if((nums[i]-minProfit)>maxProfit)
             maxProfit=nums[i]-minProfit;
        }
        return maxProfit;
    }
}