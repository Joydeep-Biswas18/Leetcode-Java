# Binary Subarrays With Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums` and an integer `goal`, return  *the number of non-empty  **subarrays**  with a sum*  `goal`.

A  **subarray**  is a contiguous part of the array.

 

 **Example 1:** 

```
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

```

 **Example 2:** 

```
Input: nums = [0,0,0,0,0], goal = 0
Output: 15

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- nums[i] is either 0 or 1.
- 0 <= goal <= nums.length

## Solution

**Language:** Python  
**Runtime:** 46 ms (beats 9.74%)  
**Memory:** 20.1 MB (beats 80.46%)  
**Submitted:** 2026-11-09T12:00:44.053Z  

```py
class Solution:
    def numSubarraysWithSum(self, nums: list[int], goal: int) -> int:
        return (self.no_of_subArray_less_than_equal_than_goal(nums,goal) - 
        self.no_of_subArray_less_than_equal_than_goal(nums , goal -1))
    def no_of_subArray_less_than_equal_than_goal(self , nums:list[int] , k:int) -> int:
        low =0
        high =0
        sum =0
        count =0
        if(k<0):
            return 0
        while(high < len(nums)):
            sum +=nums[high]
            while(sum>k):
                sum -= nums[low]
                low+=1
            count +=(high -low +1)
            high +=1
        return count
```

---

[View on LeetCode](https://leetcode.com/problems/binary-subarrays-with-sum/)