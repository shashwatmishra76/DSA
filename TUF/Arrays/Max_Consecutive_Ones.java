class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int curr = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                curr += 1;
                result = Math.max(result, curr);
            } else {
                curr = 0;
            }
        }

        return result;
    }
}
