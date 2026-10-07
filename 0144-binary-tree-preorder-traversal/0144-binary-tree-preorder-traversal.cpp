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
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> list;
        preorder(root, list);
        return list;
    }
    void preorder(TreeNode* root, vector<int>& list) {
        if (root == NULL) {
            return;
        }
        list.push_back(root->val);
        preorder(root->left, list);
        preorder(root->right, list);
    }
};