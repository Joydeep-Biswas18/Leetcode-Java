# Koko Eating Bananas

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return  *the minimum integer*  `k`  *such that she can eat all the bananas within*  `h`  *hours*.

 

 **Example 1:** 

```
Input: piles = [3,6,7,11], h = 8
Output: 4

```

 **Example 2:** 

```
Input: piles = [30,11,23,4,20], h = 5
Output: 30

```

 **Example 3:** 

```
Input: piles = [30,11,23,4,20], h = 6
Output: 23

```

 

 **Constraints:** 

- 1 <= piles.length <= 104
- piles.length <= h <= 109
- 1 <= piles[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 85.98%)  
**Memory:** 47.3 MB (beats 95.44%)  
**Submitted:** 2026-10-20T08:13:30.896Z  

```java
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1;
        int high = 0;
        for (int num : piles) {
            high = Math.max(high ,num);
        }
        int answer = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(piles, h, mid)) {
                answer = mid;
                high = mid-1;

            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    public static boolean isValid(int[] nums, int h, int speed) {
        int hour = 0;

        for (int num : nums) {
            hour += (num + speed - 1) / speed;

            if (hour > h) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/koko-eating-bananas/)