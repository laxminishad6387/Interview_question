

class Solution {
    // Memoization map to store the results of subproblems
    private HashMap<String, Integer> memo;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        memo = new HashMap<>();
        return helper(price, special, needs);
    }

    // Helper function to compute the minimum price recursively
    private int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        // Convert the list of needs into a string to use as a key for memoization
        String key = needs.toString();
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // The base case: if no needs left, the cost is 0
        int minCost = 0;
        for (int i = 0; i < needs.size(); i++) {
            minCost += price.get(i) * needs.get(i);
        }

        // Try each special offer and calculate the cost recursively
        for (List<Integer> offer : special) {
            List<Integer> newNeeds = new ArrayList<>(needs);
            boolean isValidOffer = true;

            // Apply the special offer if it's valid (i.e., doesn't exceed remaining needs)
            for (int i = 0; i < needs.size(); i++) {
                newNeeds.set(i, newNeeds.get(i) - offer.get(i));
                if (newNeeds.get(i) < 0) {
                    isValidOffer = false;
                    break;
                }
            }

            // If the offer is valid, apply it and recursively calculate the cost
            if (isValidOffer) {
                int costWithOffer = offer.get(needs.size()) + helper(price, special, newNeeds);
                minCost = Math.min(minCost, costWithOffer);
            }
        }

        // Memoize the result and return the minimum cost
        memo.put(key, minCost);
        return minCost;
    }
}
