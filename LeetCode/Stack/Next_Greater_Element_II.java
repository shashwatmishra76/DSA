class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] temp = new int[2 * n];
        int[] answer = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < 2 * n; i++) {
            temp[i] = i < n ? nums[i] : nums[i - n];
        }

        for(int i = (2 * n) - 1; i >= n; i--) {
            while(!st.isEmpty() && st.peek() <= temp[i]) {
                st.pop();
            }

            st.push(temp[i]);
        }

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= temp[i]) {
                st.pop();
            }

            answer[i] = st.isEmpty() ? -1 : st.peek();

            st.push(nums[i]);
        }

        return answer;
    }
}
