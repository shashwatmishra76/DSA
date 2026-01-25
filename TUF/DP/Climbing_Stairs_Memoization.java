class Solution {
    private int memo(int n, int[] ways) {
        if(n <= 2) {
            return ways[n] = n;
        }

        if(ways[n] != -1) {
            return ways[n];
        }

        return ways[n] = memo(n - 1, ways) + memo(n - 2, ways);
    }
    public int climbStairs(int n) {
        // Declaration
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);

        return memo(n, ways);
    }
}
