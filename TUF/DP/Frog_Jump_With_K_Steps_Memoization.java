class Solution {
    private int findMinEnergy(int[] heights, int[] memo, int index, int k) {
        if(index == 0) {
            return memo[index] = 0;
        }

        if(index == 1) {
            return memo[index] = Math.abs(heights[0] - heights[1]);
        }

        if(memo[index] != -1) {
            return memo[index];
        }

        int result = Integer.MAX_VALUE;

        for(int i = 1; i <= k; i++) {
            if(index - i >= 0) {
                result = Math.min(findMinEnergy(heights, memo, index - i, k) + Math.abs(heights[index] - heights[index - i]), result);
            }
        }

        return memo[index] = result;
    }

    public int frogJump(int[] heights, int k) {
        int index = heights.length - 1;
        int[] memo = new int[heights.length];
        Arrays.fill(memo, -1);
        return findMinEnergy(heights, memo, index, k);
    }
}
