// 45 days challenges question
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         Arrays.sort(nums);
        
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        for(int j=1; j<nums.length; j++)
        {
           if(nums[i]!=nums[j])
            i++;
            else if(nums[i]==nums[j])
            {
                arr.add(nums[i]);
                i++;
            }
        }
        return arr;
       
    }
}