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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left_height = Count_left_subtree_height(root);
        int right_height = Count_right_subtree_height(root);

        //check if the height of both side are not same
        if(left_height == right_height){
            return (1<<left_height) -1;
        }
        else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

        
    }
    public static int Count_left_subtree_height(TreeNode node){
        int height =0;
        while(node!=null){
            height++;
            node = node.left;
        }
        return height;
    }
    public static int Count_right_subtree_height(TreeNode node){
        int height =0;
        while(node != null){
            height++;
            node = node.right;
        }
        return height;
    }
}