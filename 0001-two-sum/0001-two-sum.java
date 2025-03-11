class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            int remainingValue=target-nums[i];
            if(map.containsKey( remainingValue)){
                result[0]=i;
                result[1]=map.get( remainingValue);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}