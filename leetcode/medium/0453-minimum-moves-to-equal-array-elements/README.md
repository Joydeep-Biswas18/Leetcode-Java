# Minimum Moves to Equal Array Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of size `n`, return  *the minimum number of moves required to make all array elements equal*.

In one move, you can increment `n - 1` elements of the array by `1`.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]

```

 **Example 2:** 

```
Input: nums = [1,1,1]
Output: 0

```

 

 **Constraints:** 

- n == nums.length
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- The answer is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Python  
**Runtime:** 20 ms (beats 7.71%)  
**Memory:** 20.6 MB (beats 15.19%)  
**Submitted:** 2026-11-03T12:27:23.186Z  

```py
class Solution:
    def minMoves(self, nums: list[int]) -> int:
        min_ele = nums[0]
        move = 0
        for i in range(len(nums)):
            min_ele = min(min_ele, nums[i])
        for i in range(len(nums)):
            if nums[i] > min_ele:
                move += (nums[i] - min_ele)
        return move

```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/)