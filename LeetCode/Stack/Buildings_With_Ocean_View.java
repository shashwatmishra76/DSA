class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        List<Integer> result = new ArrayList<>();
        int l = 0;

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() < heights[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                result.add(i);
            }

            st.push(heights[i]);
        }

        Collections.reverse(result);

        int[] resultArr = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }

        return resultArr;
    }
}
