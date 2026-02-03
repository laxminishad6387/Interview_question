class Solution {
    public int trap(int[] nums) {
         int left[]=new int[nums.length];
         left[0]=nums[0];
         int max1=nums[0];
        //  traverse from the left side
         for(int i=1; i<nums.length; i++)
         {
            max1=Math.max(max1,nums[i]);
            left[i]=max1;
         }
        //  traverse from the right side
         int right[]=new int[nums.length];
         right[0]=nums[nums.length-1];
         int max2=nums[nums.length-1];
          for(int i=nums.length-2; i>=0; i--)
         {
            max2=Math.max(max2,nums[i]);
            right[i]=max2;
         }
         int ans[]=new int[nums.length-1];
         int sum=0;
         for(int i=0; i<ans.length; i++)
         {
            ans[i]=Math.min(left[i], right[i])-nums[i];
            sum+=ans[i];
         }
         return sum;
    }
}