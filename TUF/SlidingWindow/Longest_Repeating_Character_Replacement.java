class Solution {
    private int getMaxFreq(int[] freqMap) {
        int maxFreq = 0;

        for(int i = 0; i < freqMap.length; i++) {
            maxFreq = Math.max(maxFreq, freqMap[i]);
        }

        return maxFreq;
    }

    public int characterReplacement(String s, int k) {
        //your code goes here
        int[] freqMap = new int[256];
        int l = 0, r = 0;
        int n = s.length();
        int maxLength = 0;

        for(r = 0; r < n; r++) {
            freqMap[s.charAt(r)]++;

            int windowSize = r - l + 1;
            int maxFreq = getMaxFreq(freqMap);

            while(windowSize - maxFreq > k) {
                freqMap[s.charAt(l++)]--;

                windowSize = r - l + 1;
                maxFreq = getMaxFreq(freqMap);
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
