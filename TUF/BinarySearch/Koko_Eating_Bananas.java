class Solution {
    private int predicate(int[] nums, int rateOfConsumption, int hours) {
        int timeTaken = 0;

        for(int num : nums) {
            timeTaken += (int) Math.ceil((double) num / (double) rateOfConsumption);
            if(timeTaken > hours) {
                return 2;
            }
        }

        if(timeTaken == hours) {
            return 1;
        }

        return 0;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        int l = 1, r = max;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(predicate(nums, mid, h) == 0 || predicate(nums, mid, h) == 1) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}
