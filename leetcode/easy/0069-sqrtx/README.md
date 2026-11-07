# Sqrt(x)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer `x`, return  *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be  **non-negative**  as well.

You  **must not use**  any built-in exponent function or operator.

- For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

 **Example 1:** 

```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

```

 **Example 2:** 

```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

```

 

 **Constraints:** 

- 0 <= x <= 231 - 1

## Solution

**Language:** Python  
**Runtime:** 4 ms (beats 52.39%)  
**Memory:** 19.1 MB (beats 76.45%)  
**Submitted:** 2026-11-07T13:50:27.819Z  

```py
class Solution:
    def mySqrt(self, x: int) -> int:
        low = 0
        high = x
        ans = 0
        while low <= high:
            mid = low + (high - low) // 2
            if mid == 0 or mid <= x // mid:
                ans = mid
                low = mid + 1
            else:
                high = mid - 1
        return ans

```

---

[View on LeetCode](https://leetcode.com/problems/sqrtx/)