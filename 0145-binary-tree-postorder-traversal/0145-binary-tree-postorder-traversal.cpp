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
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> list;
        postorder(root, list);
        return list;
    }
        void postorder(TreeNode* root, vector<int>& list) {
        if (root == NULL) {
            return;
        }
        postorder(root->left, list);
        postorder(root->right, list);
        list.push_back(root->val);
    }
};