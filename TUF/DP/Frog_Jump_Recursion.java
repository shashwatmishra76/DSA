class Solution {
    private int solveByRecursion(int n, int[] heights) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return Math.abs(heights[1] - heights[0]);
        }

        return Math.min(solveByRecursion(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]),
                        solveByRecursion(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]));
    }

    public int frogJump(int[] heights) {
        return solveByRecursion(heights.length - 1, heights);
    }
}
