class Solution {
    public int frogJump(int[] heights) {
        if(heights.length <= 1) {
            return 0;
        }

        if(heights.length == 2) {
            return Math.abs(heights[1] - heights[0]);
        }

        int[] dp = new int[heights.length];
        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);

        for(int i = 2; i <= heights.length - 1; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(heights[i] - heights[i - 1]), 
                            dp[i - 2] + Math.abs(heights[i] - heights[i - 2]));
        }

        return dp[heights.length - 1];
    }
}
