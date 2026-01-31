class Solution {
    private int findMaxSum(int[] nums, int[] memo, int index) {
        if(index == 0) {
            return memo[0] = nums[0];
        }

        if(index == 1) {
            return memo[1] = Math.max(nums[0], nums[1]);
        }

        if(memo[index] != -1) {
            return memo[index];
        }

        return memo[index] = Math.max(findMaxSum(nums, memo, index - 1), findMaxSum(nums, memo, index - 2) + nums[index]);
    }

    public int nonAdjacent(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return findMaxSum(nums, memo, nums.length - 1);
    }
}
