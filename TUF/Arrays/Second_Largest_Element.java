class Solution {
    public int secondLargestElement(int[] nums) {
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            largestElement = Math.max(largestElement, nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != largestElement) {
                secondLargestElement = Math.max(secondLargestElement, nums[i]);
            }
        }

        return secondLargestElement == Integer.MIN_VALUE ? -1 : secondLargestElement;
    }
}
