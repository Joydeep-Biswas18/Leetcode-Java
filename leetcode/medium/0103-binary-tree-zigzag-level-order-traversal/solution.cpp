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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> ds;

        if (root == NULL) {
            return ds;
        }

        int flag = 0;
        q.push(root);

        while (!q.empty()) {
            int len = q.size();
            vector<int> list;

            for (int i = 0; i < len; i++) {
                TreeNode* node = q.front();
                q.pop();
                list.push_back(node->val);

                if (node->left != NULL) {
                    q.push(node->left);
                }

                if (node->right != NULL) {
                    q.push(node->right);
                }
            }

            if (flag == 1) {
                reverse(list.begin(), list.end());
            }

            ds.push_back(list);
            flag = 1 - flag;
        }

        return ds;
    }
};