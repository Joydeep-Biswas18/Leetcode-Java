# Determine Whether Matrix Can Be Obtained By Rotation

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two `n x n` binary matrices `mat` and `target`, return `true` *if it is possible to make* `mat` *equal to* `target` *by  **rotating*** `mat` *in  **90-degree increments**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

```

 **Example 2:** 

```
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.

```

 **Example 3:** 

```
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

```

 

 **Constraints:** 

- n == mat.length == target.length
- n == mat[i].length == target[i].length
- 1 <= n <= 10
- mat[i][j] and target[i][j] are either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 91.86%)  
**Submitted:** 2026-11-09T15:02:21.977Z  

```java
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int rotation = 0; rotation < 4; rotation++) {
            Boolean same = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        same = false;
                        break;
                    }
                }
                if (!same) {
                    break;
                }
            }
            if(same){
                return true;
            }
            else{
                Rotate_matrix(mat);
            }
        }
        return false;
    }

    public static void Rotate_matrix(int[][] nums){
        int n = nums.length;
        //Transposing
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n ;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
            for(int col =0;col<n/2 ;col++){
                for(int row =0; row< n ;row++){
                    int temp = nums[row][col] ;
                    nums[row][col] = nums[row][n-1-col];
                    nums[row][n-1-col] = temp;
                }
            }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)