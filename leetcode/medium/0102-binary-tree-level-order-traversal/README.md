# Binary Tree Level Order Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return  *the level order traversal of its nodes' values*. (i.e., from left to right, level by level).

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

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
- -1000 <= Node.val <= 1000

## Solution

**Language:** C++  
**Runtime:** 2 ms (beats 31.87%)  
**Memory:** 17.2 MB (beats 44.05%)  
**Submitted:** 2026-10-10T11:59:25.065Z  

```cpp
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
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal/)