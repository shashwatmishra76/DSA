class Solution {
    private int noOfWays(int i, int j, int[][] matrix) {
        if(i < 0 || j < 0) {
            return 0;
        }

        if(matrix[i][j] == 1) {
            return 0;
        }

        if(i == 0 && j == 0) {
            return 1;
        }

        return noOfWays(i - 1, j, matrix) + noOfWays(i, j - 1, matrix);
    }

    public int uniquePathsWithObstacles(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        return noOfWays(m - 1, n - 1, matrix);
    }
}
