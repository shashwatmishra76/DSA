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
    private int computeMaxHeight(TreeNode node, int[] diameter) {
        if(node == null) {
            return 0;
        }

        if(node.left == null && node.right == null) {
            return 1;
        }

        int lh = computeMaxHeight(node.left, diameter);
        int rh = computeMaxHeight(node.right, diameter);

        diameter[0] = Math.max(diameter[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        //your code goes here
        int[] diameter = {0};

        computeMaxHeight(root, diameter);

        return diameter[0];
    }
}
