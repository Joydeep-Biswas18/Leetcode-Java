# Count Number of Nice Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`. A continuous subarray is called  **nice**  if there are `k` odd numbers on it.

Return  *the number of  **nice**  sub-arrays*.

 

 **Example 1:** 

```
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

```

 **Example 2:** 

```
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

```

 **Example 3:** 

```
Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16

```

 

 **Constraints:** 

- 1 <= nums.length <= 50000
- 1 <= nums[i] <= 10^5
- 1 <= k <= nums.length

## Solution

**Language:** Python  
**Runtime:** 174 ms (beats 6.50%)  
**Memory:** 24.9 MB (beats 58.88%)  
**Submitted:** 2026-11-09T12:50:24.098Z  

```py
class Solution:
    def numberOfSubarrays(self, nums: list[int], k: int) -> int:
        return (self.no_of_subArray_less_than_equal_odd_elements(nums , k) - self.no_of_subArray_less_than_equal_odd_elements(nums ,k-1))
    def no_of_subArray_less_than_equal_odd_elements(self , nums :list[int] , k:int)->int:
        low =0
        high =0
        count = 0
        odd_ele =0
        if(k<0):
            return 0
        while(high < (len(nums))):
            odd_ele +=nums[high] % 2
            while(odd_ele > k):
                odd_ele -= nums[low] % 2
                low+=1
            count += (high -low +1)
            high +=1
        return count
            

```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-nice-subarrays/)