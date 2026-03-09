class Solution {
    private int countPaths(int x, int y, int[][] memo) {
        if(x < 0 || y < 0) {
            return 0;
        }

        if(x == 0 && y == 0) {
            return memo[x][y] = 1;
        }

        if(memo[x][y] != -1) {
            return memo[x][y];
        }
        
        return memo[x][y] = countPaths(x - 1, y, memo) + countPaths(x, y - 1, memo);
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        return countPaths(m - 1, n - 1, memo);
    }
}
