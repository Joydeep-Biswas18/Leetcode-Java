# Kth Missing Positive Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `arr` of positive integers sorted in a  **strictly increasing order**, and an integer `k`.

Return  *the*  `kth`  ***positive**  integer that is  **missing**  from this array.*

 

 **Example 1:** 

```
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

```

 **Example 2:** 

```
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

```

 

 **Constraints:** 

- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000
- 1 <= k <= 1000
- arr[i] < arr[j] for 1 <= i < j <= arr.length

 

 **Follow up:** 

Could you solve this problem in less than O(n) complexity?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.8 MB (beats 98.49%)  
**Submitted:** 2026-10-24T13:38:00.779Z  

```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - mid - 1 < k) {
                //that counts how many numbers are present before that number
                low = mid + 1;
            } else {
                high = mid -1 ;
            }
        }
        return high + k +1;

    }
}
// int low = 0;
//         int high = arr.length;
//          here the array is said to 1 index based
//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] - mid - 1 < k) {
//                 //that counts how many numbers are present before that number
//                 low = mid + 1;
//             } else {
//                 high = mid  ;
//                  i use this because of while(low <high)
//             }
//         }
//         return high + k;

//     }
```

---

[View on LeetCode](https://leetcode.com/problems/kth-missing-positive-number/)