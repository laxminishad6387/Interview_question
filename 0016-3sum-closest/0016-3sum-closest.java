class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int result=diff;
        for(int i=0; i<nums.length-2; i++) //this for loop convert 3sum problem in 2sum problem
        {
            int left=i+1; int right=nums.length-1;
            while(left<right)
            {
              int sum=nums[i]+nums[left]+nums[right];
               if(Math.abs(target-sum)<diff)
               {
                diff=Math.abs(target-sum);
                result=sum;
               }  
              if(target==sum)
               return sum;
              
               else if(sum<target)
               left++;
               else right--;
            }
        }
        return result;
    }
}