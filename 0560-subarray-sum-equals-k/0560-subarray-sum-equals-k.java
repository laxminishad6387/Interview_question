class Solution {
    int count=0;
    public void recurion(int nums[], int k, int next)
    {
        if(next==nums.length)
        return ;
        int sum=0;
        for(int i=next; i<nums.length; i++)
        {
            sum+=nums[i];
            if(sum==k)
             {
                count++;
               
             }
            //  else if(sum>k)
            //  break;
        }
        recurion(nums, k, next+1);

    }
    public int subarraySum(int[] nums, int k) {
        recurion(nums,k,0);
        return count;
    }
}