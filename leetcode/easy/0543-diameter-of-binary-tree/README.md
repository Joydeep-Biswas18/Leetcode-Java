# Diameter of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *the length of the  **diameter**  of the tree*.

The  **diameter**  of a binary tree is the  **length**  of the longest path between any two nodes in a tree. This path may or may not pass through the `root`.

The  **length**  of a path between two nodes is represented by the number of edges between them.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

```

 **Example 2:** 

```
Input: root = [1,2]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 43.71%)  
**Memory:** 46.8 MB (beats 93.10%)  
**Submitted:** 2026-10-09T17:38:04.910Z  

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
    static int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter =0;
        max_height(root);
        return diameter;
    }


    public static int max_height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = max_height(root.left);
        int rh = max_height(root.right);
        diameter = Math.max(diameter, (lh + rh));
        return 1 + Math.max(lh, rh);
    }

}
```

---

[View on LeetCode](https://leetcode.com/problems/diameter-of-binary-tree/)