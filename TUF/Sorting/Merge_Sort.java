class Solution {
    private void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }

        while(left <= mid) {
            temp.add(nums[left++]);
        }

        while(right <= high) {
            temp.add(nums[right++]);
        }

        for(int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    private void mergeSortHelper(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        // Recursively invoke for left half
        mergeSortHelper(nums, low, mid);

        // Recursively invoke for right half
        mergeSortHelper(nums, mid + 1, high);

        // Merge sorted halves
        merge(nums, low, mid, high);
    }

    public int[] mergeSort(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;

        mergeSortHelper(nums, low, high);

        return nums;
    }
}
