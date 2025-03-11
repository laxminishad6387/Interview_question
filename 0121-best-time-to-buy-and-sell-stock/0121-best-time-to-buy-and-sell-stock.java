class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit=0;
        int currentProfit=0;
        int buy=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]>buy)
            {
                currentProfit=nums[i]-buy;
                maxProfit=Math.max(currentProfit, maxProfit);
            }else if(nums[i]<buy)
            buy=nums[i];
        }
        return maxProfit;
    }
}