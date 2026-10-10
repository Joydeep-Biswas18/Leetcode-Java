class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> Level_wise_node;
        queue<TreeNode*> q;

        if (root == nullptr) {
            return Level_wise_node;
        }

        q.push(root);

        while (!q.empty()) {
            int len_queue = q.size();
            vector<int> sublist;

            for (int i = 0; i < len_queue; i++) {
                sublist.push_back(q.front()->val);

                if (q.front()->left != nullptr) {
                    q.push(q.front()->left);
                }

                if (q.front()->right != nullptr) {
                    q.push(q.front()->right);
                }

                q.pop();
            }

            Level_wise_node.push_back(sublist);
        }

        return Level_wise_node;
    }
};