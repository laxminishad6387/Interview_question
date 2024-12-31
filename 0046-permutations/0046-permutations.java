class Solution {
    public void swap(int []nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void   backtracking(List<List<Integer>>result, int []nums, int index)
    {
        if(index==nums.length)
        {
            List<Integer> temp=new ArrayList<>();
            for(int i=0; i<nums.length; i++)
            {
                temp.add(nums[i]);
            }
               result.add(new ArrayList<>(temp));
               return ;
        }
        for(int i=index; i<nums.length; i++)
        {
            if(i!=index)
            swap(nums,i,index);
            backtracking(result, nums, index+1);
            if(i!=index)
            swap(nums,i,index);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtracking(result,nums, 0);
        return result;
    }
}