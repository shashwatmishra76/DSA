class Solution {
    public int ninjaTraining(int[][] matrix) {
        // State - memo[i][j] - max attainable points till day i given the ninja does activity j on day in
        // if you are at day 0 and activity j, you can only get matrix[0][j] number of points
        int n = matrix.length;
        int[][] dp = new int[n][3];
        int result = 0;

        for(int j = 0; j < 3; j++) {
            dp[0][j] = matrix[0][j];
            result = Math.max(dp[0][j], result);
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(k != j)
                        dp[i][j] = Math.max(dp[i][j], matrix[i][j] + dp[i - 1][k]);
                        result = Math.max(dp[i][j], result);
                }
            }
        }

        return result;
    }
}
