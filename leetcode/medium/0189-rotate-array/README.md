# Rotate Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

 

 **Example 1:** 

```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

```

 **Example 2:** 

```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -231 <= nums[i] <= 231 - 1
- 0 <= k <= 105

 

 **Follow up:** 

- Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
- Could you do it in-place with O(1) extra space?

## Solution

**Language:** Python  
**Runtime:** 136 ms (beats 35.33%)  
**Memory:** 34.8 MB (beats 95.90%)  
**Submitted:** 2026-11-07T06:43:00.642Z  

```py
class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k %n
        self.reverse_array(nums, 0 , n-k-1)
        self.reverse_array(nums , n-k , n-1)
        self.reverse_array(nums , 0 , n-1)

    def reverse_array(self , nums:list[int], low : int , high : int)->None:
        while(low<=high):
            temp = nums[low]
            nums[low] = nums[high]
            nums[high] = temp
            low +=1
            high -=1
        
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-array/)