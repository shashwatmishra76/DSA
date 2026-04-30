class Solution {
    private int findMaxScore(int[] cardScore, int k, int[] result, int l, int r) {
        if(k == 0) {
            return 0;
        }

        if(l >= r) {
            return 0;
        }

        int pickLeft = cardScore[l] + findMaxScore(cardScore, k - 1, result, l + 1, r);
        int pickRight = cardScore[r] + findMaxScore(cardScore, k - 1, result, l, r - 1);

        return result[0] = Math.max(pickLeft, pickRight);
    }


    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int l = 0;
        int r = cardScore.length - 1;

        int[] result = new int[1];
        result[0] = 0;

        findMaxScore(cardScore, k, result, l, r);

        return result[0];
    }
}
