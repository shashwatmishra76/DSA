class Solution {
    private void minFallingPath(int[][] matrix, int i, int j, int currSum, int[] result) {
        if(j < 0 || j > matrix[0].length - 1 || i > matrix.length - 1) {
            return;
        }

        currSum += matrix[i][j];

        if(i == matrix.length - 1) {
            result[0] = Math.min(result[0], currSum);
        }

        minFallingPath(matrix, i + 1, j - 1, currSum, result);
        minFallingPath(matrix, i + 1, j, currSum, result);
        minFallingPath(matrix, i + 1, j + 1, currSum, result);
    }

    public int minFallingPathSum(int[][] matrix) {
        int[] result = new int[1];
        result[0] = Integer.MAX_VALUE;

        for(int j = 0; j < matrix[0].length; j++) {
            minFallingPath(matrix, 0, j, 0, result);
        }

        return result[0];
    }
}
