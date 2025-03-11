class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int MaximumProduct=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            int temp=Math.max(maxProduct*nums[i], Math.max(minProduct*nums[i],nums[i]));
            minProduct=Math.min(maxProduct*nums[i], Math.min(minProduct*nums[i],nums[i]));
            maxProduct=temp;
            MaximumProduct=Math.max(MaximumProduct,maxProduct);

        }
        return MaximumProduct;
    }
}