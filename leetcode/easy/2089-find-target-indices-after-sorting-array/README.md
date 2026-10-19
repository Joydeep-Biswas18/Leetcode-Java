# Find Target Indices After Sorting Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  integer array `nums` and a target element `target`.

A  **target index**  is an index `i` such that `nums[i] == target`.

Return  *a list of the target indices of*  `nums` after *sorting* `nums` *in  **non-decreasing**  order*. If there are no target indices, return  *an  **empty**  list*. The returned list must be sorted in  **increasing**  order.

 

 **Example 1:** 

```
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

```

 **Example 2:** 

```
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.

```

 **Example 3:** 

```
Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i], target <= 100

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 71.84%)  
**Memory:** 44.9 MB (beats 75.39%)  
**Submitted:** 2026-10-19T15:49:18.682Z  

```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                ds.add(i);
            }
        }
        return ds;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-target-indices-after-sorting-array/)