class Solution {
    public int totalFruits(int[] fruits) {
        //your code goes here
        Map<Integer, Integer> fruitFrequencyMap = new HashMap<>();
        int l = 0, r = 0;
        int maxFruits = 0;

        for(r = 0; r < fruits.length; r++) {
            // Insert / update the current fruit's frequency
            fruitFrequencyMap.put(fruits[r], fruitFrequencyMap.getOrDefault(fruits[r], 0) + 1);

            while(fruitFrequencyMap.size() > 2) {
                fruitFrequencyMap.put(fruits[l], fruitFrequencyMap.get(fruits[l]) - 1);

                if(fruitFrequencyMap.get(fruits[l]) == 0) {
                    fruitFrequencyMap.remove(fruits[l]);
                }

                l++; 
            }

            maxFruits = Math.max(maxFruits, r - l + 1);
        }

        return maxFruits;
    }
}
