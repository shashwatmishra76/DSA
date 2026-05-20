class Solution {
    private String removeLeadingZeros(String num) {
        int i = 0;

        while(i < num.length() - 1 && num.charAt(i) == '0') {
            i++;
        }

        return num.substring(i);
    }

    public String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder("");
        Stack<Integer> st = new Stack<>();
        int popsLeft = k;

        for(int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            while(!st.isEmpty() && st.peek() > digit && popsLeft > 0) {
                st.pop();
                popsLeft--;
            }

            st.push(digit);
        }

        while(!st.isEmpty() && popsLeft > 0) {
            st.pop();
            popsLeft--;
        }

        if(st.isEmpty()) {
            result.append("0");
        }

        while(!st.isEmpty()) {
            result.append(st.peek());
            st.pop();
        }

        return removeLeadingZeros(result.reverse().toString());
    }
}
