/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(p==NULL || q==NULL){
            //That check the number same or not and give answer in form of boolean
            return (p==q);

        }
        //that check every node from left and right wheher they are same or not and give answer in boolean format
        return (p->val == q->val) && isSameTree(p->left , q-> left) && isSameTree(p->right , q->right);
    }
};