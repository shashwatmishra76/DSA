/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    private int computeMaxPathSum(TreeNode node, int[] maxSum) {
        if(node == null) {
            return 0;
        }

        if(node.left == null && node.right == null) {
            maxSum[0] = Math.max(maxSum[0], node.data);
            return node.data;
        }

        int lMax = Math.max(0, computeMaxPathSum(node.left, maxSum));
        int rMax = Math.max(0, computeMaxPathSum(node.right, maxSum));

        maxSum[0] = Math.max(lMax + rMax + node.data, maxSum[0]);

        return node.data + Math.max(lMax, rMax);
    }

    public int maxPathSum(TreeNode root) {
        //your code goes here
        int[] maxSum = {Integer.MIN_VALUE};

        computeMaxPathSum(root, maxSum);

        return maxSum[0];
    }
}
