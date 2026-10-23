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
**Memory:** 46.6 MB (beats 90.83%)  
**Submitted:** 2026-10-23T14:09:29.691Z  

```java

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        //length of rows
        int m = grid.length;
        //length of col
        int n = grid[0].length;

        for (int i = 0; i < grid.length ; i++) {
            // that loop runs for every row one by one with checking every row element according to binary search
            int low = 0;
            int high = grid[0].length - 1;
            int firstnegative = n;
            //that is the very important line because if i find where the nwgative number is starting  so i can asily calculate the total number of negatives numbers
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (grid[i][mid] < 0) {
                    // store the first negative number where as i find
                    firstnegative = mid;
                    // trim out the right half
                    high = mid - 1;

                } else {
                    // trim out left half
                    low = mid + 1;
                }
            }
            // if i find negative number is 3rd position that means after that all numbers are also nagative 
            // so the count = total length of row - 3rd position
            count += n - firstnegative;
        }
        return count;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)