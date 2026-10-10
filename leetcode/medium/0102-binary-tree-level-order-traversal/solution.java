class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Level_wise_node = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return Level_wise_node;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            int len_queue = queue.size();
            List<Integer> sublist = new LinkedList<>();

            for (int i = 0; i < len_queue; i++) {
                sublist.add(queue.peek().val);

                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }

                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }

                queue.poll();
            }

            Level_wise_node.add(sublist);
        }

        return Level_wise_node;
    }
}