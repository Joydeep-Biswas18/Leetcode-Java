# Count Complete Tree Nodes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a  **complete**  binary tree, return the number of the nodes in the tree.

According to  **Wikipedia**, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between `1` and `2h` nodes inclusive at the last level `h`.

Design an algorithm that runs in less than `O(n)` time complexity.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,5,6]
Output: 6

```

 **Example 2:** 

```
Input: root = []
Output: 0

```

 **Example 3:** 

```
Input: root = [1]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 5 * 104].
- 0 <= Node.val <= 5 * 104
- The tree is guaranteed to be complete.

## Solution

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 31.1 MB (beats 97.73%)  
**Submitted:** 2026-11-10T07:36:49.374Z  

```cpp
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
    int countNodes(TreeNode* root) {
        if(root == NULL){
            return 0;
        }
        int left_height = count_left_height(root);
        int right_height = count_right_height(root);
        if(left_height == right_height){
            return (1<<left_height) -1;
        }
        else{
            return 1 + countNodes(root->left) + countNodes(root->right);
        }
    }
    int count_left_height(TreeNode* node){
        int height =0;
        while(node){
            height++;
            node = node->left;
        }
        return height;
    }
    int count_right_height(TreeNode*node){
        int height=0;
        while(node){
            height++;
            node = node->right;
        }
        return height;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/count-complete-tree-nodes/)