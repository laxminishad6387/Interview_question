// ask in MSFT
class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int i=(nums.length-1)/2;
        int j=nums.length-1;
        int temp[]=new int[nums.length];
       for(int k=0; k<nums.length; k++)
        {
            if(k%2==0)
            
                temp[k]=nums[i--];
            
            else
          
                temp[k]=nums[j--];
           
        }
      for(int k=0; k<temp.length;  k++)
      
        nums[k]=temp[k];
      

    }
}