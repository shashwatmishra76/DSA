class Solution {
    private int findMaxValue(int[] money, int index) {
        if(index == 0) {
            return money[0];
        }

        if(index == 1) {
            return Math.max(money[0], money[1]);
        }

        return Math.max(findMaxValue(money, index - 1), money[index] + findMaxValue(money, index - 2));
    }

    public int houseRobber(int[] money) {
        int[] exclFirst = Arrays.copyOfRange(money, 1, money.length);
        int[] exclLast = Arrays.copyOfRange(money, 0, money.length - 1);

        
        return Math.max(findMaxValue(exclFirst, exclFirst.length - 1), 
                            findMaxValue(exclLast, exclLast.length - 1));
    }
}
