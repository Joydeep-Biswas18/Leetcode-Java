# Search a 2D Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`. This matrix has the following properties:

- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom.

 

 **Example 1:** 

```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

```

 **Example 2:** 

```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= n, m <= 300
- -109 <= matrix[i][j] <= 109
- All the integers in each row are sorted in ascending order.
- All the integers in each column are sorted in ascending order.
- -109 <= target <= 109

## Solution

**Language:** Python  
**Runtime:** 144 ms (beats 49.38%)  
**Memory:** 25.7 MB (beats 23.97%)  
**Submitted:** 2026-10-28T13:52:19.761Z  

```py
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        row =0
        col = n-1

        while(row<m and col>=0):
            if(matrix[row][col] == target):
                return True
            elif(matrix[row][col]<target):
                row +=1
            else:
                col -=1

        return False
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix-ii/)