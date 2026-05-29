class Solution {    
    public int[] singleNumber(int[] nums) {        
        //your code goes here
        int[] result = new int[2];
        int n = nums.length;
        int xor = 0;

        for(int i = 0; i < n; i++) {
            xor = xor ^ nums[i];
        }

        int rightMostSet = xor & (~(xor - 1));

        int xorSetBit = 0, xorUnsetBit = 0;

        for(int i = 0; i < n; i++) {
            if((rightMostSet & nums[i]) != 0) {
                xorSetBit ^= nums[i];
            } else {
                xorUnsetBit ^= nums[i];
            }
        }

        return xorSetBit <= xorUnsetBit ? new int[]{xorSetBit, xorUnsetBit} : new int[]{xorUnsetBit, xorSetBit};
    }
}
