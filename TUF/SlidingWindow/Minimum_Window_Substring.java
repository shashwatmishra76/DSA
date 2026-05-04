class Solution {
    private boolean containsAllCharacters(int[] currHash, int[] targetHash) {
        for(int i = 0; i < targetHash.length; i++) {
            if(targetHash[i] > 0) {
                if(currHash[i] < targetHash[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public String minWindow(String s, String t) {
        //your code goes here
        int[] currHash = new int[256];
        int[] targetHash = new int[256];
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < t.length(); i++) {
            targetHash[t.charAt(i)]++;
        }

        int l = 0, r = 0;
        int lInd = 0, rInd = 0;

        for(r = 0; r < s.length(); r++) {
            currHash[s.charAt(r)]++;

            while(containsAllCharacters(currHash, targetHash)) {

                if(r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    lInd = l;
                    rInd = r;
                }

                currHash[s.charAt(l++)]--;

            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(lInd, rInd + 1);
    }
}
