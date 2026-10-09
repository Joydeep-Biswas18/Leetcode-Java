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
    public int maxPathSum(TreeNode root) {
        path_sum = Integer.MIN_VALUE;
        max_sum(root);
        return path_sum;

    }

    static int path_sum =Integer.MIN_VALUE;

    public static int max_sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ls = Math.max(0,max_sum(root.left));
        int rs = Math.max(0,max_sum(root.right));

        path_sum = Math.max(path_sum, root.val + ls + rs);

        return root.val + Math.max(ls, rs);

    }
}