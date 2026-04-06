class Solution {
    public int majorityElement(int[] nums) {
        int majElement = nums[0];
        int freqCount = 1;
        int n = nums.length;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == majElement) {
                freqCount += 1;
            } else {
                freqCount -= 1;
            }

            if(freqCount == 0) {
                majElement = nums[i];
                freqCount = 1;
            }
        }

        freqCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == majElement) {
                freqCount += 1;
            }
        }

        if(freqCount > n / 2) {
            return majElement;
        }

        return Integer.MIN_VALUE;
    }
}
