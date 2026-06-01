class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < (int) Math.pow(2, n); i++) {
            List<Integer> currSubset = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) != 0) {
                    currSubset.add(nums[j]);
                }
            }
            result.add(currSubset);
        }

        return result;
    }
}
