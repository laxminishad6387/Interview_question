class Solution {
 
    public void nextPermutation(int[] nums) {
        int golaIndex=-1;
        int greaterIndex=-1;
        for(int i=nums.length-1; i>0; i--)
        {
            if(nums[i-1]<nums[i]){
            golaIndex=i-1;
            break;
            }
        }
        if(golaIndex!=-1)
        {
            for(int i=nums.length-1; i>golaIndex;i--)
            {
                if(nums[i]>nums[golaIndex])
                {
               greaterIndex=i;
               break;
                }
            }
            int temp=nums[golaIndex];
            nums[golaIndex]=nums[greaterIndex];
            nums[greaterIndex]=temp;
        }
       
        int left=golaIndex+1; int right=nums.length-1;
        while(left<right){
         int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}