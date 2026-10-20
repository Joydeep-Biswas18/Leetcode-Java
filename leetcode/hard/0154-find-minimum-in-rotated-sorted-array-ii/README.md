# Find Minimum in Rotated Sorted Array II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Suppose an array of length `n` sorted in ascending order is  **rotated**  between `1` and `n` times. For example, the array `nums = [0,1,4,4,5,6,7]` might become:

- [4,5,6,7,0,1,4] if it was rotated 4 times.
- [0,1,4,4,5,6,7] if it was rotated 7 times.

Notice that  **rotating**  an array `[a[0], a[1], a[2],..., a[n-1]]` 1 time results in the array `[a[n-1], a[0], a[1], a[2],..., a[n-2]]`.

Given the sorted rotated array `nums` that may contain  **duplicates**, return  *the minimum element of this array*.

You must decrease the overall operation steps as much as possible.

 

 **Example 1:** 

```
Input: nums = [1,3,5]
Output: 1

```

 **Example 2:** 

```
Input: nums = [2,2,2,0,1]
Output: 0

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5000
- -5000 <= nums[i] <= 5000
- nums is sorted and rotated between 1 and n times.

 

 **Follow up:**  This problem is similar to Find Minimum in Rotated Sorted Array, but `nums` may contain  **duplicates**. Would this affect the runtime complexity? How and why?

## Solution

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 16.2 MB (beats 62.77%)  
**Submitted:** 2026-10-20T14:01:41.245Z  

```cpp
class Solution {
public:
    int findMin(vector<int>& nums) {
        int low = 0;
        int high = nums.size() - 1;
        int ans = INT_MAX;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                ans = min(ans, nums[low]);
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                ans = min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/)