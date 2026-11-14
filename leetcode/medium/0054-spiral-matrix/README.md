# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return  *all elements of the*  `matrix`  *in spiral order*.

 

Original
Java
 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 91.45%)  
**Submitted:** 2026-11-14T10:53:11.212Z  

```java

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        List<Integer> ds = new ArrayList<>();
        int n = matrix[0].length;

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                ds.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ds.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ds.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ds.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ds;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)