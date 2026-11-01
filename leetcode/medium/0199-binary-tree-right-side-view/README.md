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

**Language:** Java  
**Runtime:** 1 ms (beats 77.80%)  
**Memory:** 43.1 MB (beats 91.69%)  
**Submitted:** 2026-11-01T08:13:53.166Z  

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ds = new ArrayList<>();
        Right_sude_View_func(root , 0 ,ds);
        return ds;

    }
    public static void Right_sude_View_func(TreeNode root , int level , List<Integer> ds){
        if(root == null){
            return;
        }
        if(level == ds.size()){
            ds.add(root.val);
        }
        Right_sude_View_func(root.right , level+1 ,ds);
        Right_sude_View_func(root.left , level+1 , ds);


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-right-side-view/)