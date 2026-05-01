class Solution {
    public int longestNonRepeatingSubstring(String s) {
        //your code goes here
        int[] charToIndexMap = new int[256];
        Arrays.fill(charToIndexMap, -1);

        int l = 0, r = 0;
        int maxLength = 0;

        for(r = 0; r < s.length(); r++) {
            // if character not encountered yet
            if(charToIndexMap[s.charAt(r)] == -1) {
                charToIndexMap[s.charAt(r)] = r;
                maxLength = Math.max(maxLength, r - l + 1);
            } else {
                l = Math.max(charToIndexMap[s.charAt(r)] + 1, l);
                charToIndexMap[s.charAt(r)] = r;
                maxLength = Math.max(maxLength, r - l + 1);      
            }
        }

        return maxLength;
    }
}
