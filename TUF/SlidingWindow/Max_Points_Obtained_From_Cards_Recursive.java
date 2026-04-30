class Solution {
    private int findMaxScore(int[] cardScore, int k, int l, int r) {
        if(k == 0) {
            return 0;
        }

        int pickLeft = cardScore[l] + findMaxScore(cardScore, k - 1, l + 1, r);
        int pickRight = cardScore[r] + findMaxScore(cardScore, k - 1, l, r - 1);

        return Math.max(pickLeft, pickRight);
    }


    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int l = 0;
        int r = cardScore.length - 1;

        return findMaxScore(cardScore, k, l, r);
    }
}
