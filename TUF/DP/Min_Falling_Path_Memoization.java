class Solution {
    private int minFallingPath(int[][] matrix, int i, int j, int memo[][]) {
        if(j < 0 || i < 0 || j > matrix[0].length - 1) {
            return Integer.MAX_VALUE;
        }

        if(i == 0) {
            return memo[i][j] = matrix[i][j];
        }

        if(memo[i][j] != Integer.MAX_VALUE) {
            return memo[i][j];
        }

        return memo[i][j] = matrix[i][j] + Math.min(minFallingPath(matrix, i - 1, j - 1, memo), Math.min(minFallingPath(matrix, i - 1, j, memo), minFallingPath(matrix, i - 1, j + 1, memo)));
    }

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] memo = new int[m][n];

        for(int i = 0; i < m; i++) {
            Arrays.fill(memo[i], Integer.MAX_VALUE);
        }   

        for(int j = 0; j < n; j++) {
            minFallingPath(matrix, m - 1, j, memo);
        }

        int result = Integer.MAX_VALUE;

        for(int j = 0; j < n; j++) {
            result = Math.min(result, memo[m - 1][j]);
        }

        return result;
    }
}
