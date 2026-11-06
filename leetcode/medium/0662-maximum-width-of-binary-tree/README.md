# Maximum Width of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return  *the  **maximum width**  of the given tree*.

The  **maximum width**  of a tree is the maximum  **width**  among all levels.

The  **width**  of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that level are also counted into the length calculation.

It is  **guaranteed**  that the answer will in the range of a  **32-bit**  signed integer.

 

 **Example 1:** 

```
Input: root = [1,3,2,5,3,null,9]
Output: 4
Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).

```

 **Example 2:** 

```
Input: root = [1,3,2,5,null,null,9,6,null,7]
Output: 7
Explanation: The maximum width exists in the fourth level with length 7 (6,null,null,null,null,null,7).

```

 **Example 3:** 

```
Input: root = [1,3,2,5]
Output: 2
Explanation: The maximum width exists in the second level with length 2 (3,2).

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 3000].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 56.10%)  
**Memory:** 44.8 MB (beats 73.69%)  
**Submitted:** 2026-11-06T05:55:25.051Z  

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
class Pair {
    TreeNode node;
    long data;

    Pair(TreeNode node, long data) {
        this.node = node;
        this.data = data;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int max_width = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            long prevMin = q.peek().data;
            long first = 0;
            long last = 0;
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                long curr_id = p.data - prevMin;
                TreeNode node = p.node;
                if (i == 0) {
                    first = curr_id;
                }
                if (i == size - 1) {
                    last = curr_id;
                }
                if (node.left != null) {
                    q.add(new Pair(node.left, curr_id * 2 + 1));

                }
                if (node.right != null) {
                    q.add(new Pair(node.right, curr_id * 2 + 2));
                }

            }
            max_width = (int) Math.max(max_width, last - first + 1);

        }
        return max_width;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-width-of-binary-tree/)