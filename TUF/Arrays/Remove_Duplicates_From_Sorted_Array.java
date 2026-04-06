class Solution {
    public int removeDuplicates(int[] nums) {
        int sortedTill = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[sortedTill]) {
                nums[++sortedTill] = nums[i];
            } else {
                continue;
            }
        }

        return sortedTill + 1;
    }
}
