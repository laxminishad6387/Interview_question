class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++) // this for loop convert 4sum problem into 3sum problem
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<nums.length-2; j++) //this for loop convert 3sum problem into 2sum problem
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left=j+1; int right=nums.length-1;
                while(left<right)
                {
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(target==sum)
                    {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++; 
                        right--;
                    }
                    else if(sum<target)
                     left++;
                     else
                     right--;
                }
            }
        }
        return result;
    }
}