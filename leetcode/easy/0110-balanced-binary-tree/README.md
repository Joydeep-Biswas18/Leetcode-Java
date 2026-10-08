# Balanced Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary tree, determine if it is  **height-balanced**.

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: true

```

 **Example 2:** 

```
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

```

 **Example 3:** 

```
Input: root = []
Output: true

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 5000].
- -104 <= Node.val <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.3 MB (beats 94.78%)  
**Submitted:** 2026-10-08T08:12:39.312Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return CheckbalanceTree(root) != -1;
    }

    public static int CheckbalanceTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left_height = CheckbalanceTree(root.left);
        if (left_height == -1) {
            return -1;
        }

        int right_height = CheckbalanceTree(root.right);
        if (right_height == -1) {
            return -1;
        }

        if (Math.abs(left_height - right_height) > 1) {
            return -1;
        }

        return 1 + Math.max(left_height, right_height);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/balanced-binary-tree/)