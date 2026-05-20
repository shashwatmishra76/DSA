class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<List<Integer>> buckets = new ArrayList<>(n + 1);
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] result = new int[k];
        
        for(int i = 0; i <= n; i++) {
            buckets.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            freqMap.put(nums[i], 1 + freqMap.getOrDefault(nums[i], 0));
        }

        for(int key : freqMap.keySet()) {
            int val = freqMap.get(key);

            buckets.get(val).add(key);
        }

        int numsAdded = 0;

        for(int i = n; i >= 1 && numsAdded != k; i--) {
            for(int j = 0; j < buckets.get(i).size(); j++) {
                result[numsAdded++] = buckets.get(i).get(j); 
            }
        }

        return result;
    }
}
