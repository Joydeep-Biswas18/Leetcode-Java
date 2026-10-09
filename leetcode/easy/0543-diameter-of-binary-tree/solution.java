/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter =0;
        max_height(root);
        return diameter;
    }


    public static int max_height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = max_height(root.left);
        int rh = max_height(root.right);
        diameter = Math.max(diameter, (lh + rh));
        return 1 + Math.max(lh, rh);
    }

}