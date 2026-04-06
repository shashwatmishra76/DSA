class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        int left = 0; int right = 0;
        int n = nums1.length; int m = nums2.length;

        while(left < n && right < m) {
            if(nums1[left] < nums2[right]) {
                left++;
            } else if(nums1[left] == nums2[right]) {
                result.add(nums1[left++]);
                right++;
            } else {
                right++;
            }
        }

        int[] res = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
