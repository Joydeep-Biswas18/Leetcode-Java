# Binary Tree Right Side View

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, imagine yourself standing on the  **right side**  of it, return  *the values of the nodes you can see ordered from top to bottom*.

 

 **Example 1:** 

 **Input:**  root = [1,2,3,null,5,null,4]

 **Output:**  [1,3,4]

 **Explanation:** 

 **Example 2:** 

 **Input:**  root = [1,2,3,4,null,null,null,5]

 **Output:**  [1,3,4,5]

 **Explanation:** 

 **Example 3:** 

 **Input:**  root = [1,null,3]

 **Output:**  [1,3]

 **Example 4:** 

 **Input:**  root = []

 **Output:**  []

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Python  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 19.3 MB (beats 62.85%)  
**Submitted:** 2026-11-01T08:28:17.988Z  

```py
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: TreeNode | None) -> list[int]:
        ds = []
        self.rightSideViewFunc(root, 0, ds)
        return ds

    def rightSideViewFunc(
        self, root: TreeNode | None, level: int, ds: list[int]
    ) -> None:

        if root is None:
            return

        if level == len(ds):
            ds.append(root.val)

        self.rightSideViewFunc(root.right, level + 1, ds)
        self.rightSideViewFunc(root.left, level + 1, ds)

```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-right-side-view/)