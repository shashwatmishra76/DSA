class Solution {
    public int floorSqrt(int n) {
        int l = 1, r = n;

        while(l <= r) {
            int mid = l + ((r - l) / 2);

            long val = (long)mid * (long)mid;

            if(val < (long) n) {
                l = mid + 1;
            } else if(val == (long) n) {
                return mid;
            } else {
                r = mid - 1;
            }
        }

        return r;
    }
}
