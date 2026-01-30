class Solution {
    private int findMinEnergy(int[] heights, int index, int k) {
        if(index == 0) {
            return 0;
        }

        if(index == 1) {
            return Math.abs(heights[0] - heights[1]);
        }

        int result = Integer.MAX_VALUE;

        for(int i = 1; i <= k; i++) {
            if(index - i >= 0) {
                result = Math.min(findMinEnergy(heights, index - i, k) + Math.abs(heights[index] - heights[index - i]), result);
            }
        }

        return result;
    }

    public int frogJump(int[] heights, int k) {
        int index = heights.length - 1;
        return findMinEnergy(heights, index, k);
    }
}
