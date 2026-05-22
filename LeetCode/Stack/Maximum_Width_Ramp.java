class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int maxWidth = 0;

        for(int i = 0; i < nums.length; i++) {
            if(st.isEmpty() || nums[i] < nums[st.peek()]) {
                st.push(i);
            }
        }

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]) {
                maxWidth = Math.max(maxWidth, i - st.peek());
                st.pop();
            }
        }

        return maxWidth;
    }
}
