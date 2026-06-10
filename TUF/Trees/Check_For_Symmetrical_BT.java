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
    private boolean checkSymmetry(TreeNode first, TreeNode second) {
        if(first == null && second == null) {
            return true;
        }

        if(first == null || second == null) {
            return false;
        }

        return (first.data == second.data) && checkSymmetry(first.left, second.right) && checkSymmetry(first.right, second.left);
    }
    public boolean isSymmetric(TreeNode root) {
        //your code goes here
        if(root == null) {
            return true;
        }

        return checkSymmetry(root.left, root.right);
    }
}
