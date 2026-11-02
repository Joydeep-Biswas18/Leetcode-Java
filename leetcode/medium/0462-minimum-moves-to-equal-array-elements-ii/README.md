# Minimum Moves to Equal Array Elements II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of size `n`, return  *the minimum number of moves required to make all array elements equal*.

In one move, you can increment or decrement an element of the array by `1`.

Test cases are designed so that the answer will fit in a  **32-bit**  integer.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

```

 **Example 2:** 

```
Input: nums = [1,10,2,9]
Output: 16

```

 

 **Constraints:** 

- n == nums.length
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 33.80%)  
**Memory:** 46.8 MB (beats 74.85%)  
**Submitted:** 2026-11-02T19:30:54.784Z  

```java
class Solution {
    public int minMoves2(int[] nums) {
        int n= nums.length;
        int count =0;
        Arrays.sort(nums);
        int mid = nums[n/2];
        for(int i =0; i<nums.length ; i++){
            count += Math.abs(mid - nums[i]);
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/)