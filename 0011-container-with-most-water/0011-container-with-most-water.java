class Solution {
    public int maxArea(int[] height) {
        int i=0; int j=height.length-1;
        int maxWater=0;
        while(i<j)
        {
            int currentWater=(j-i)*Math.min(height[i], height[j]);
                maxWater=Math.max(currentWater, maxWater);
            if(height[i]<=height[j])
                i++;
            
            else
              j--;
            

        }
        return maxWater;
    }
}