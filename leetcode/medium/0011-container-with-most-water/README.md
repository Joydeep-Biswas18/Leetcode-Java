# Container With Most Water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return  *the maximum amount of water a container can store*.

 **Notice**  that you may not slant the container.

 

 **Example 1:** 

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

```

 **Example 2:** 

```
Input: height = [1,1]
Output: 1

```

 

 **Constraints:** 

- n == height.length
- 2 <= n <= 105
- 0 <= height[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 94.94%)  
**Memory:** 77.1 MB (beats 82.81%)  
**Submitted:** 2026-10-26T06:23:41.190Z  

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_water = 0;
        int area = 0;

        while (left < right) {
            if (height[right] >= height[left]) {
                area = (right - left) * height[left];
                left++;
            } else {
                area = (right - left) * height[right];
                right--;

            }
            max_water = Math.max(area, max_water);
        }
        return max_water;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/container-with-most-water/)