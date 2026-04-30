class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int n = cardScore.length;
        int totalSum = 0;
        int minWindowSum = 0;
        int currWindowSum = 0;
        int l = 0;
        int r = n - k - 1;

        for(int i = 0; i < n; i++) {
            totalSum += cardScore[i];
        }

        for(int i = l; i <= r; i++) {
            currWindowSum += cardScore[i];
        }

        minWindowSum = currWindowSum;

        for(r = r + 1; r < n; r++) {
            currWindowSum += cardScore[r];
            currWindowSum -= cardScore[l++];

            minWindowSum = Math.min(minWindowSum, currWindowSum);
        }

        return totalSum - minWindowSum;
    }
}
