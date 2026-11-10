class Solution {
    public void flatten(TreeNode root) {

        if(root == null) return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        TreeNode prev = null;

        while(!st.isEmpty()){

            TreeNode curr = st.pop();

            if(curr.right != null){
                st.push(curr.right);
            }

            if(curr.left != null){
                st.push(curr.left);
            }

            if(prev != null){
                prev.right = curr;
                prev.left = null;
            }

            prev = curr;
        }
    }
}