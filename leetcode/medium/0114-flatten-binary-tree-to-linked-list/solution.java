class Solution {

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        prev = null;
        helper(root);
    }

    public void helper(TreeNode node) {

        if(node == null){
            return;
        }

        helper(node.right);
        helper(node.left);

        node.right = prev;
        node.left = null;

        prev = node;
    }
}