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
class Pair {
    TreeNode node;
    long data;

    Pair(TreeNode node, long data) {
        this.node = node;
        this.data = data;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int max_width = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            long prevMin = q.peek().data;
            long first = 0;
            long last = 0;
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                long curr_id = p.data - prevMin;
                TreeNode node = p.node;
                if (i == 0) {
                    first = curr_id;
                }
                if (i == size - 1) {
                    last = curr_id;
                }
                if (node.left != null) {
                    q.add(new Pair(node.left, curr_id * 2 + 1));

                }
                if (node.right != null) {
                    q.add(new Pair(node.right, curr_id * 2 + 2));
                }

            }
            max_width = (int) Math.max(max_width, last - first + 1);

        }
        return max_width;

    }
}