# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 24.94%)  
**Memory:** 48.5 MB (beats 82.28%)  
**Submitted:** 2026-10-26T06:10:18.009Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merge = merge_array(nums1,nums2);
        int n = merge.length;
        if(n%2==1){
            return(double) merge[n/2];

        }
        else{
            return(double) (merge[n/2] + merge[n/2-1])/2;
        }
        
    }
    public static int[] merge_array(int[]nums1 ,int[]nums2){
        int m = nums1.length;
        int n = nums2.length;
        int i =0;
        int j =0;
        int k=0;
        int [] merge = new int[n+m];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k++]= nums1[i];
                i++;
            }
            else{
                merge[k++] = nums2[j];
                j++;
            }
        }
        while(i<m){
            merge[k++]= nums1[i];
            i++;
            
        }
        while(j<n){
            merge[k++]= nums2[j];
            j++;

        }
        return merge;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)