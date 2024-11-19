class Solution {
    public int minMoves2(int[] nums) {
        // step 1: sort the array in increasing order
      Arrays.sort(nums);
    //   step 2: find the median value
       int target=nums[nums.length/2];
    //    step 3: find absolute difference
    int moves=0;
    for (int num : nums) {
            moves += Math.abs(num - target);
        }
    
      return moves;
    }
}