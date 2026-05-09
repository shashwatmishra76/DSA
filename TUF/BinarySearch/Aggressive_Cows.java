class Solution {
    private boolean predicate(int[] nums, int k, int distance) {
        int numberOfCowsPlaced = 1;
        int last = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - last >= distance) {
                last = nums[i];
                numberOfCowsPlaced += 1;
            }

            if(numberOfCowsPlaced >= k) {
                return true;
            } 
        }

        return false;
    }
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;

        int r = nums[nums.length - 1] - nums[0];

        int l = 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(predicate(nums, k, mid)) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }
}
