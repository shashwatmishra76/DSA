class Solution {
    private void countPaths(int x, int y, int m, int n, int[] result) {
        if(x >= m || y >= n) {
            return;
        }

        if(x == m - 1 && y == n - 1) {
            result[0] += 1;
        }

        countPaths(x + 1, y, m, n, result);
        countPaths(x, y + 1, m, n, result);
    }

    public int uniquePaths(int m, int n) {
        int[] result = new int[1];
        result[0] = 0;

        countPaths(0, 0, m, n, result);

        return result[0];
    }
}
