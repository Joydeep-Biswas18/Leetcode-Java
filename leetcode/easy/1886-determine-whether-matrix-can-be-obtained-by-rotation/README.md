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

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 14.8 MB (beats 27.80%)  
**Submitted:** 2026-11-09T15:03:34.616Z  

```cpp
class Solution {
public:
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        int n = mat.size();
        for (int rotation = 0; rotation < 4; rotation++) {
            bool same = true;
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

    void Rotate_matrix(vector<vector<int>>&nums){
        int n = nums.size();
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
};
```

---

[View on LeetCode](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)