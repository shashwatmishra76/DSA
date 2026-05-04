class Solution {    
    private boolean containsAllChars(int[] freqHash) {
        if(freqHash['a'] > 0 && freqHash['b'] > 0 && freqHash['c'] > 0) {
            return true;
        }

        return false;
    }

    public int numberOfSubstrings(String s) {
        //your code goes here
        int[] freqHash = new int[256];
        int count = 0;

        int l = 0, r = 0;

        for(r = 0; r < s.length(); r++) {
            freqHash[s.charAt(r)]++;

            while(containsAllChars(freqHash)) {
                count += 1;
                count += s.length() - 1 - r;

                freqHash[s.charAt(l++)]--;
            }
        }

        return count;
    }
}
