# Count Negative Numbers in a Sorted Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a `m x n` matrix `grid` which is sorted in non-increasing order both row-wise and column-wise, return  *the number of  **negative**  numbers in*  `grid`.

 

 **Example 1:** 

```
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

```

 **Example 2:** 

```
Input: grid = [[3,2],[1,0]]
Output: 0

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 100
- -100 <= grid[i][j] <= 100

 

 **Follow up:**  Could you find an `O(n + m)` solution?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.7 MB (beats 86.23%)  
**Submitted:** 2026-10-23T13:45:06.977Z  

```java
class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int m = grid.length;
        int n = grid[0].length;
        int row =0;
        int col = n-1;

        while(row < m && col>=0){
            if(grid[row][col]<0){
                count += m - row;
                col--;
            }
            else{
                row++;
            }
        }
        return count;
       
    }

}
// class Solution {
//     public int countNegatives(int[][] grid) {
//         int count =0;
//         for(int i =0;i<grid.length -1; i++){
//             int low =0;
//             int high = grid[0].length-1;
//             while(low<= high){
//                 int mid =  low +(high -low)/2;
//                 if(grid[i][low]>grid[i][mid] && grid[i][mid]<0){
//                     if(grid[i][mid]<0){
                        
//                     }

//                 }
//                 else if (grid[i][mid]>grid[i][high] && grid[i][high] <0){
//                     if()
//                 }
//             }
//         }
        
//     }
// }
```

---

[View on LeetCode](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)