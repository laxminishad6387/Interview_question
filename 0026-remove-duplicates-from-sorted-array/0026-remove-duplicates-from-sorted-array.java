// 45 days challenge question
class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
       ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
          if(map.containsKey(nums[i]))
           continue;
          else
          {
            map.put(nums[i],1);
            arr.add(nums[i]);
 
          }

        }
        for(int i=0; i<map.size(); i++)
        {
            nums[i]=arr.get(i);
        }
       
     
        return map.size();
    }
}