// 45 days challenge question
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int result[]=new int[2];
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0; i<nums.length; i++)
       { 
          int remaningValue=target-nums[i];
          if(map.containsKey(remaningValue))
          {
            result[0]=i;
            result[1]=map.get(remaningValue);
            return result;
          }
          map.put(nums[i],i);
       } 
       
       return result;
    }
}