class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int naturalNumberSum=n*(n+1)/2;
       int givenNumberSum=0;
       for(int i=0; i<nums.length; i++)
        givenNumberSum+=nums[i];
        return naturalNumberSum-givenNumberSum;
    }
}