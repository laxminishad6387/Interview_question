class Solution {
    public int singleNumber(int[] nums) {
        int initalValue=0;
        for(int i=0; i<nums.length; i++)
        {
            initalValue=initalValue^nums[i];
        }
        return initalValue;
    }
}