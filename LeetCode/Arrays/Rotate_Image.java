class Solution {
    public void rotate(int[][] matrix) {
        // 1. convert rows to columns
        // 2. reverse elements of each row

        int n = matrix.length;
        
        // Finding transpose of the matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // // Reverse elements of each row
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }


    }
}
