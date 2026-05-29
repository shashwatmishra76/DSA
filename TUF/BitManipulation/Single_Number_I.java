class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}
