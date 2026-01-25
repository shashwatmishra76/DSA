class Solution {
    public int climbStairs(int n) {
        // Handle base case
        if(n <= 2) {
            return n;
        }

        // Declarations
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;

        // Calculate ways using bottom up approach
        for(int i = 2; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }
}
