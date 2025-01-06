class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        // Left-to-right pass
        int operations = 0; // Count of operations
        int balls = 0;      // Count of balls encountered
        for (int i = 0; i < n; i++) {
            answer[i] += operations; // Add operations so far
            if (boxes.charAt(i) == '1') {
                balls++; // Increment ball count if current box has a ball
            }
            operations += balls; // Increment operations by balls encountered
        }

        // Right-to-left pass
        operations = 0; 
        balls = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += operations; // Add operations from the right side
            if (boxes.charAt(i) == '1') {
                balls++; // Increment ball count if current box has a ball
            }
            operations += balls; // Increment operations by balls encountered
        }

        return answer;
    }
}
