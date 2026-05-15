class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charHashS = new int[256];
        int[] charHashT = new int[256];

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            charHashS[s.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++) {
            charHashT[t.charAt(i)]++;
        }

        for(int i = 0; i < charHashT.length; i++) {
            if(charHashT[i] != charHashS[i]) {
                return false;
            }
        }

        return true;
    }
}
