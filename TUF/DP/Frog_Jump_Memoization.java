class Solution {
    private int solveByRecursion(int n, int[] memo, int[] heights) {
        if(n == 0) {
            return memo[0] = 0;
        }

        if(n == 1) {
            return memo[1] = Math.abs(heights[1] - heights[0]);
        }

        if(memo[n] != -1) {
            return memo[n];
        }

        return memo[n] = Math.min(solveByRecursion(n - 1, memo, heights) + Math.abs(heights[n] - heights[n - 1]),
                        solveByRecursion(n - 2, memo, heights) + Math.abs(heights[n] - heights[n - 2]));
    }

    public int frogJump(int[] heights) {
        int[] memo = new int[heights.length];
        Arrays.fill(memo, -1);

        return solveByRecursion(heights.length - 1, memo, heights);
    }
}
