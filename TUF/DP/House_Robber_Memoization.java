class Solution {
  private int findMaxValue(int[] money, int[] memo, int index) {
    if (index < 0) return 0;

    if (memo[index] != -1) return memo[index];

    int pick = money[index] + findMaxValue(money, memo, index - 2);
    int nonPick = findMaxValue(money, memo, index - 1);

    return memo[index] = Math.max(pick, nonPick);
}

  public int houseRobber(int[] money) {
    if (money.length == 1) {
      return money[0];
    }

    if (money.length == 2) {
      return Math.max(money[0], money[1]);
    }

    int[] exclFirst = new int[money.length - 1];
    int[] exclLast = new int[money.length - 1];

    for (int i = 0; i < money.length; i++) {
      if (i != 0) {
        exclFirst[i - 1] = money[i];
      }

      if (i != money.length - 1) {
        exclLast[i] = money[i];
      }
    }

    int[] memoOne = new int[money.length - 1];
    Arrays.fill(memoOne, -1);
    int ans1 = findMaxValue(exclFirst, memoOne, exclFirst.length - 1);

    int[] memoTwo = new int[money.length - 1];
    Arrays.fill(memoTwo, -1);
    int ans2 = findMaxValue(exclLast, memoTwo, exclLast.length - 1);

    return Math.max(ans1, ans2);
  }
}
