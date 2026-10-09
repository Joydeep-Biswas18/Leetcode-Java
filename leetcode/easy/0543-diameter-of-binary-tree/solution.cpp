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
    int diameter = 0;
    int diameterOfBinaryTree(TreeNode* root) {
        max_height(root);
        return diameter;
    }
    int max_height(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }
        int lh = max_height(root->left);
        int rh = max_height(root->right);
        diameter = max(diameter, lh + rh);

        return 1 + max(lh, rh);
    }
};