// 45 days challenge question
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int arr[]=new int[2];
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0; i<nums.length; i++)
       {
          map.put(nums[i],i);
       } 
       for(int i=0; i<nums.length; i++)
       {
        if(nums[i]==target && map.containsKey(0) )
         {
               arr[0]=map.get(0);
               arr[1]=map.get(nums[i]); 
               break;
            
         }
         else if(nums[i]!=target && map.containsKey(target-nums[i]))
         {
            if(map.get(target-nums[i])>i)
            {
                arr[0]=i;
                arr[1]=map.get(target-nums[i]);
                break;
            }
         }
       }
       return arr;
    }
}