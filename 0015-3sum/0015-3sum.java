class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to make it easier to avoid duplicates and use two pointers
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the current index i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Use two pointers to find the remaining two numbers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move left and right pointers to the next different values
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase the sum by moving the left pointer to the right
                } else {
                    right--; // Decrease the sum by moving the right pointer to the left
                }
            }
        }

        return result;
    }
}
