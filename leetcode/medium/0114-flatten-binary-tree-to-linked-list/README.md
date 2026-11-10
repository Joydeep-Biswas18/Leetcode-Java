# Flatten Binary Tree to Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, flatten the tree into a "linked list":

- The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
- The "linked list" should be in the same order as a pre-order traversal of the binary tree.

 

 **Example 1:** 

```
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]

```

 **Example 2:** 

```
Input: root = []
Output: []

```

 **Example 3:** 

```
Input: root = [0]
Output: [0]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 2000].
- -100 <= Node.val <= 100

 

 **Follow up:**  Can you flatten the tree in-place (with `O(1)` extra space)?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 1.77%)  
**Memory:** 43.7 MB (beats 66.98%)  
**Submitted:** 2026-11-10T08:59:32.528Z  

```java
class Solution {
    public void flatten(TreeNode root) {

        if(root == null) return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        TreeNode prev = null;

        while(!st.isEmpty()){

            TreeNode curr = st.pop();

            if(curr.right != null){
                st.push(curr.right);
            }

            if(curr.left != null){
                st.push(curr.left);
            }

            if(prev != null){
                prev.right = curr;
                prev.left = null;
            }

            prev = curr;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)