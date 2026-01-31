class Solution {
    private int findMaxSum(int[] nums, int index) {
        if(index == 0) {
            return nums[0];
        }

        if(index == 1) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(findMaxSum(nums, index - 1), findMaxSum(nums, index - 2) + nums[index]);
    }

    public int nonAdjacent(int[] nums) {
        return findMaxSum(nums, nums.length - 1);
    }
}
