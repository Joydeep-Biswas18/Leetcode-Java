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

**Language:** Java  
**Runtime:** 1 ms (beats 84.11%)  
**Memory:** 43.3 MB (beats 95.79%)  
**Submitted:** 2026-10-18T11:27:39.559Z  

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ds = new ArrayList<>();

        if (root == null) {
            return ds;
        }

        int flag = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            if (flag == 1) {
                Collections.reverse(list);
            }

            ds.add(list);
            flag = 1 - flag;
        }

        return ds;
    }


}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)