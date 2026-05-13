class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1];
        int[] temp = new int[n2];
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = n2 - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            temp[i] = st.isEmpty() ? -1 : st.peek();

            st.push(nums2[i]);
        }

        for(int i = 0; i < n2; i++) {
            mp.put(nums2[i], temp[i]);
        }

        for(int i = 0; i < n1; i++) {
            result[i] = mp.get(nums1[i]);
        }

        return result;
    }
}
