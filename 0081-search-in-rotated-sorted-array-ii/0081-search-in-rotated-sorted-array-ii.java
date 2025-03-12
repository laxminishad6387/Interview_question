class Solution {
    public boolean search(int[] nums, int target) {
        int low=0; int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            return true;
             // Handle duplicates - shrink the search space
          else  if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } 
            else if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<nums[mid])
                 high=mid-1;
                 else
                 low=mid+1;
            }
            else
            {
                if(nums[high]>=target && target>nums[mid])
                low=mid+1;
                else
                high=mid-1;
            }
        }
        return false;
    }
}