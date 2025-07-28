class Solution {
    public void nextPermutation(int[] nums) {
        int gola_index=-1;
        int greater_index=-1;
        for(int i=nums.length-1; i>0; i--)   //find first small value from the last
        {
            if(nums[i-1] <nums[i]){
                gola_index=i-1;
                break;
            }
        }
        if(gola_index!=-1)
        {
             for(int i=nums.length-1; i>gola_index; i--)  //find just large value of gola_index value from the last index
          {
            if(nums[i]>nums[gola_index])
            {
                greater_index=i;
                break;
            }
          
          }
          int temp=nums[gola_index];
            nums[gola_index]=nums[greater_index];
            nums[greater_index]=temp;
        }
        int left=gola_index+1; int right=nums.length-1;
       while(left<right)
       {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
       }
    }
}