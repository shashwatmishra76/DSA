
class Solution {
    private boolean predicate(int[] nums, int k, int m, int days) {
        int possibleBoquets = 0;
        int windowCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= days) {
                windowCount += 1;
            } else {
                possibleBoquets += (windowCount / k);
                windowCount = 0;
            }
        }

        possibleBoquets += (windowCount / k);
        
        if(possibleBoquets >= m) {
            return true;
        }

        return false;
    }

    public int roseGarden(int n, int[] nums, int k, int m) {
        int max = Integer.MIN_VALUE;
        int result = -1;

        for(int num : nums) {
            max = Math.max(max, num);
        }

        int l = 1, r = max;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(predicate(nums, k, m, mid)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}


