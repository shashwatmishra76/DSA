class Solution {
    public int lowerBound(int[] nums, int x) {
        int l = 0, r = nums.length - 1;

        while(r - l > 1) {
            int mid = (l + r) / 2;

            if(nums[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        if(nums[l] >= x) {
            return l;
        }

        if(nums[r] >= x) {
            return r;
        }

        return nums.length;
    }
}
