class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0; int j=0; 
        while(i<nums.length)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                i++; j++;
            }
            else i++;

        }
        return j;
    }
}