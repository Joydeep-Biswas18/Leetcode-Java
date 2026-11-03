# Minimum Moves to Equal Array Elements III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

In one move, you may  **increase**  the value of any single element `nums[i]` by 1.

Return the  **minimum total**  number of  **moves**  required so that all elements in `nums` become  **equal**.

 

 **Example 1:** 

 **Input:**  nums = [2,1,3]

 **Output:**  3

 **Explanation:** 

To make all elements equal:

- Increase nums[0] = 2 by 1 to make it 3.
- Increase nums[1] = 1 by 1 to make it 2.
- Increase nums[1] = 2 by 1 to make it 3.

Now, all elements of `nums` are equal to 3. The minimum total moves is `3`.

 **Example 2:** 

 **Input:**  nums = [4,4,5]

 **Output:**  2

 **Explanation:** 

To make all elements equal:

- Increase nums[0] = 4 by 1 to make it 5.
- Increase nums[1] = 4 by 1 to make it 5.

Now, all elements of `nums` are equal to 5. The minimum total moves is `2`.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 29.52%)  
**Memory:** 45.7 MB (beats 96.33%)  
**Submitted:** 2026-11-03T11:39:02.344Z  

```java
class Solution {
    public int minMoves(int[] nums) {
        //i only do increase the elements nums[i] by only 1 not decrease so i need to find the highest eleement at first
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max , num);
        }
        int count =0;
        for(int i =0; i<nums.length ; i++){
            count +=(max- nums[i]);
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/)