class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int flag=-1;
        for(int i=0; i<map.size(); i++)
        {
            if(map.get(nums[i])>1)
            {
                flag=nums[i];
                break;
            }
        }
        return flag;
        
    }
}