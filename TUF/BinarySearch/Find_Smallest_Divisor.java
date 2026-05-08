class Solution {
    private int predicate(int[] nums, int limit, int divisor) {
        int score = 0;

        for(int i = 0; i < nums.length; i++) {
            score += (int) Math.ceil((double)nums[i] / (double)divisor);
            if(score > limit) {
                return 2;
            }
        }

        if(score == limit) {
            return 1;
        }

        return 0;
    }

    public int smallestDivisor(int[] nums, int limit) {
        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        int l = 1, r = max;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(predicate(nums, limit, mid) == 0) {
                result = mid;
                r = mid - 1;
            } else if(predicate(nums, limit, mid) == 1) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}
