# Guess Number Higher or Lower

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

- -1: Your guess is higher than the number I picked (i.e. num > pick).
- 1: Your guess is lower than the number I picked (i.e. num < pick).
- 0: your guess is equal to the number I picked (i.e. num == pick).

Return  *the number that I picked*.

 

 **Example 1:** 

```
Input: n = 10, pick = 6
Output: 6

```

 **Example 2:** 

```
Input: n = 1, pick = 1
Output: 1

```

 **Example 3:** 

```
Input: n = 2, pick = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1
- 1 <= pick <= n

## Solution

**Language:** C++  
**Runtime:** 1 ms (beats 57.46%)  
**Memory:** 7.9 MB (beats 72.06%)  
**Submitted:** 2026-10-31T12:50:00.687Z  

```cpp
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int low =0;
        int high = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(guess(mid) ==0){
                return mid;
            }
            else if (guess(mid) == -1){
                high = mid -1;
            }
            else{
                low = mid +1;
            }

        }
        return 0;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/guess-number-higher-or-lower/)