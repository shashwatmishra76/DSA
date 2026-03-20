class Solution {
    private int noOfWays(int i, int j, int[][] matrix, int[][] memo) {
        if(i < 0 || j < 0) {
            return 0;
        }

        if(matrix[i][j] == 1) {
            return memo[i][j] = 0;
        }

        if(i == 0 && j == 0) {
            return memo[i][j] = 1;
        }

        if(memo[i][j] != -1) {
            return memo[i][j];
        }

        return memo[i][j] = noOfWays(i - 1, j, matrix, memo) + noOfWays(i, j - 1, matrix, memo);
    }

    public int uniquePathsWithObstacles(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] memo = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }

        return noOfWays(m - 1, n - 1, matrix, memo);
    }
}
