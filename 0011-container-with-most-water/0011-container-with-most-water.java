class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0; int j=height.length-1;
        int curr=0;
        while(i<j)
        {
            curr=Math.min(height[i], height[j])*(j-i);
            max=Math.max(max,curr);
            if(height[i]<=height[j])
            i++;
            else
            j--;

        }
        return max;
    }
}