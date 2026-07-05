class Solution {
    private long getSumOfSquares(int[] nums) {
        long result = 0l;

        for(int num : nums) {
            result += (long) Math.pow(num, 2);
        }

        return result;
    }

    private long getSum(int[] nums) {
        long result = 0l;

        for(int num : nums) {
            result += num;
        }

        return result;
    }

    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = (long) nums.length;
        long sumOfSquares = (n * (n + 1) * ((2 * n) + 1)) / 6;
        long sum = (n * (n + 1)) / 2;        

        long diffOfSquares = sumOfSquares - getSumOfSquares(nums);
        long diffOfSum = sum - getSum(nums);

        long sumOfMissingAndRepeating = diffOfSquares / diffOfSum;

        int a = (int)((sumOfMissingAndRepeating + diffOfSum) / 2);
        int b = (int)((sumOfMissingAndRepeating - diffOfSum) / 2);

        return new int[]{b, a};

    }
}
