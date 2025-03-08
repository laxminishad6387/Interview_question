class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minOperations = Integer.MAX_VALUE;
        int whiteCount = 0;
        
        // Count whites in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') whiteCount++;
        }
        minOperations = whiteCount;
        
        // Sliding window
        for (int i = k; i < blocks.length(); i++) {
            // Remove left element from the window
            if (blocks.charAt(i - k) == 'W') whiteCount--;
            // Add right element to the window
            if (blocks.charAt(i) == 'W') whiteCount++;
            // Update minimum operations
            minOperations = Math.min(minOperations, whiteCount);
        }
        
        return minOperations;
    }
}
