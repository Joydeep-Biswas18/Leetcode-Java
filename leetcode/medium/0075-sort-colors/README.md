# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

 **Example 1:** 

 **Input:**  nums = [2,0,2,1,1,0]

 **Output:**  [0,0,1,1,2,2]

 **Explanation:** 

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

 **Example 2:** 

 **Input:**  nums = [2,0,1]

 **Output:**  [0,1,2]

 **Explanation:** 

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 11.5 MB (beats 97.76%)  
**Submitted:** 2026-10-26T08:09:36.984Z  

```cpp
class Solution {
public:
    void sortColors(vector<int>& nums) {
       int n = nums.size();
        int low =0;
        int high = n-1;
        int mid =0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low , mid);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums ,mid ,high);
                high--;
            }
        }
        
    }
    void swap(vector<int>& nums ,int low ,int high){

        while(low<high){

        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;

        low++;
        high--;

        }
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)