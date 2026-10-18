# Binary Tree Zigzag Level Order Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return  *the zigzag level order traversal of its nodes' values*. (i.e., from left to right, then right to left for the next level and alternate between).

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

```

 **Example 2:** 

```
Input: root = [1]
Output: [[1]]

```

 **Example 3:** 

```
Input: root = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 2000].
- -100 <= Node.val <= 100

## Solution

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 15.1 MB (beats 77.29%)  
**Submitted:** 2026-10-18T11:36:51.974Z  

```cpp
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
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)