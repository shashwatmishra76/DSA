class Solution {
    public int divide(int dividend, int divisor) {
        //your code goes here
        boolean isPositive = (dividend >= 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? false : true;

        if(dividend == divisor) {
            return isPositive ? 1 : -1;
        }

        long quotient = 0;
        long num = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);

        while(num >= div) {
            int cnt = 0;
            long chunk = 0;

            while(num >= chunk) {
                chunk = div * (1L << cnt);
                cnt++; 
            }

            num = num - (div * (1L << (cnt - 2)));
            quotient += (1L << (cnt - 2));    
        }

        if(quotient >= (1L << 31)) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return isPositive ? (int) quotient : (int) ((-1) * quotient);
    }
}
