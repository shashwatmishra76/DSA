class Solution {
    private int getXOR(int n) {
        if(n % 4 == 0) {
            return n;
        } else if(n % 4 == 1) {
            return 1;
        } else if(n % 4 == 2) {
            return n + 1;
        }

        return 0;
    }
    public int findRangeXOR(int l, int r) {
         //your code goes here
         return getXOR(l - 1) ^ getXOR(r);
    }
}
