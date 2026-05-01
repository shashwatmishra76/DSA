class Solution {
    public int longestOnes(int[] nums, int k) {
        //your code goes here
        int maxLength = 0;

        int l = 0, r = 0;
        int zeros = 0;

        for(r = 0; r < nums.length; r++) {
            if(nums[r] == 0) {
                zeros += 1;
            }

            // if zeros in current window are more than k, shift window
            while(zeros > k) {
                if(nums[l] == 0) {
                    zeros -= 1;
                }

                l += 1;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
