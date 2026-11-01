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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ds = new ArrayList<>();
        Right_sude_View_func(root , 0 ,ds);
        return ds;

    }
    public static void Right_sude_View_func(TreeNode root , int level , List<Integer> ds){
        if(root == null){
            return;
        }
        if(level == ds.size()){
            ds.add(root.val);
        }
        Right_sude_View_func(root.right , level+1 ,ds);
        Right_sude_View_func(root.left , level+1 , ds);


    }
}