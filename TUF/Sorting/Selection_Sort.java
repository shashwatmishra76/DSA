class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] selectionSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int minM = nums[i];
            int minIndex = i;

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < minM) {
                    minM = nums[j];
                    minIndex = j;
                }
            }

            swap(nums, i, minIndex);      
        }

        return nums;
    }
}
