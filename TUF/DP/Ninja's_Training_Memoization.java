class Solution {
    private int getMaxMP(int[][] matrix, int day, int activityToBeDone, int[][] memo) {
        if(day == 0) {
            return matrix[day][activityToBeDone];
        }

        if(memo[day][activityToBeDone] != -1) {
            return memo[day][activityToBeDone];
        }

        int result = Integer.MIN_VALUE;

        for(int j = 0; j < 3; j++) {
            if(j != activityToBeDone)
                result =  Math.max(result, matrix[day][activityToBeDone] + getMaxMP(matrix, day - 1, j, memo));
        }

        return memo[day][activityToBeDone] = result;
    }

    public int ninjaTraining(int[][] matrix) {
        // State - memo[i][j] - max attainable points till day i given the ninja does activity j on day in
        int n = matrix.length;
        int[][] memo = new int[n][3];
        
        // Initialize with -1
        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        int result = Integer.MIN_VALUE;

        for(int j = 0; j < 3; j++) {
            result = Math.max(result, getMaxMP(matrix, n - 1, j, memo));
        }

        return result;
    }
}
