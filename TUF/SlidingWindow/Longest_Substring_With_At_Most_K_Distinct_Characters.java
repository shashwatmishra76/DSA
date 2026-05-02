class Solution {
    private boolean hasAtMostKDistinct(int[] charFrequencyMap, int k) {
        int nonZeroFreq = 0;

        for(int i = 0; i < charFrequencyMap.length; i++) {
            if(charFrequencyMap[i] > 0) {
                nonZeroFreq += 1;
            }
        }

        return nonZeroFreq > k ? false : true;
    }

    public int kDistinctChar(String s, int k) {
        //your code goes here
        //Map<char, Integer> charFrequencyMap = new HashMap<>();
        int[] charFrequencyMap = new int[256];
        int n = s.length();
        int l = 0, r = 0;
        int maxLength = 0;

        for(r = 0; r < n; r++) {
            // Insert / update frequency of current character
            charFrequencyMap[s.charAt(r)]++;

            // adjust left pointer if distinct characters exceed k
            while(!hasAtMostKDistinct(charFrequencyMap, k)) {
                // decrement frequency
                charFrequencyMap[s.charAt(l++)]--;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
