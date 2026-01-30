class Solution {
    public int frogJump(int[] heights, int k) {
        if(heights.length <= 1) {
            return 0;
        }

        int[] dp = new int[heights.length];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);
        
        for(int i = 2; i < heights.length; i++) {
            for(int j = 1; j <= k; j++) {
                if((i - j) >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(heights[i] - heights[i - j]));
                }
            }
        }

        return dp[heights.length - 1];
    }
}
