class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                j++;
                nums[j]=nums[i];
            }
        }
        for(int i=j+1; i<nums.length; i++)
        nums[i]=0;
    }
}