/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    int maxPathSum(TreeNode* root) {
        path_sum = INT_MIN;
        max_sum(root);
        return path_sum;
    }
    int path_sum = INT_MIN;
    int max_sum(TreeNode* root) {
        if(root == NULL){
            return 0;
        }
        int ls = max(0 , max_sum(root->left));
        int rs = max(0, max_sum(root->right));

        path_sum = max(path_sum , root->val + ls + rs);

        return root->val +max(ls, rs);
    }
};