class Solution {
    private int getMaxMP(int[][] matrix, int day, int disallowedActivity) {
        int n = matrix.length;

        if(day == n) {
            return 0;
        }

        int result = Integer.MIN_VALUE;

        for(int j = 0; j < 3; j++) {
            if(j != disallowedActivity) {
                result = Math.max(matrix[day][j] + getMaxMP(matrix, day + 1, j), result);
            }
        }

        return result;
    }

    public int ninjaTraining(int[][] matrix) {
        return getMaxMP(matrix, 0, -1);
    }
}
