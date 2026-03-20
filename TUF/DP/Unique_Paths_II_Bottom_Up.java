class Solution {
    public int uniquePathsWithObstacles(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = matrix[0][0] == 1 ? 0 : 1;

        int valToBeFilled = 1;

        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 1) {
                valToBeFilled = 0;
            }

            dp[i][0] = valToBeFilled;
        }
        
        valToBeFilled = 1;

        for(int i = 0; i < n; i++) {
            if(matrix[0][i] == 1) {
                valToBeFilled = 0;
            }

            dp[0][i] = valToBeFilled;
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = matrix[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        return dp[m - 1][n - 1];
    }
}
