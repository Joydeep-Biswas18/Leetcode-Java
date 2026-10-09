# Binary Tree Maximum Path Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

A  **path**  in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence  **at most once**. Note that the path does not need to pass through the root.

The  **path sum**  of a path is the sum of the node's values in the path.

Given the `root` of a binary tree, return  *the maximum  **path sum**  of any  **non-empty**  path*.

 

 **Example 1:** 

```
Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

```

 **Example 2:** 

```
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 3 * 104].
- -1000 <= Node.val <= 1000

## Solution

**Language:** C++  
**Runtime:** 4 ms (beats 7.31%)  
**Memory:** 27.9 MB (beats 78.82%)  
**Submitted:** 2026-10-09T18:27:50.052Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-maximum-path-sum/)