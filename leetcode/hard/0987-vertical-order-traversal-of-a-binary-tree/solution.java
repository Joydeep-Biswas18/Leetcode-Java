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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<>();
        dfs(root, 0, 0, nodes);

        nodes.sort((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[2], b[2]);
        });

        int prev_col = Integer.MIN_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for (int[] node : nodes) {
            int col = node[0];
            int val = node[2];

            if (col != prev_col) {
                result.add(new ArrayList<>());
                prev_col = col;
            }
            result.get(result.size() - 1).add(val);

        }
        return result;

    }

    public static void dfs(TreeNode root, int col, int row, List<int[]> nodes) {
        if (root == null) {
            return;
        }
        nodes.add(new int[] { col, row, root.val });
        dfs(root.left, col - 1, row + 1, nodes);
        dfs(root.right, col + 1, row + 1, nodes);

    }
}