class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int s3 = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() < nums[i]) {
                s3 = st.peek();
                st.pop();
            }

            if(nums[i] < s3) {
                return true;
            }

            st.push(nums[i]);
        }

        return false;
    }
}
