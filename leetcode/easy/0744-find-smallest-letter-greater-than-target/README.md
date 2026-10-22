# Find Smallest Letter Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of characters `letters` that is sorted in  **non-decreasing order**, and a character `target`. There are  **at least two different**  characters in `letters`.

Return  *the smallest character in* `letters` *that is lexicographically greater than* `target`. If such a character does not exist, return the first character in `letters`.

 

 **Example 1:** 

```
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

```

 **Example 2:** 

```
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

```

 **Example 3:** 

```
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

```

 

 **Constraints:** 

- 2 <= letters.length <= 104
- letters[i] is a lowercase English letter.
- letters is sorted in non-decreasing order.
- letters contains at least two different characters.
- target is a lowercase English letter.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.9 MB (beats 94.97%)  
**Submitted:** 2026-10-22T15:41:10.731Z  

```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // here the mainconcept is breaking existing array in two half and compare target Char with mid elelment of the letters array
        //at frist assign low as 0 indx
        int low = 0;
        // and assign high as the last index
        int high = letters.length - 1;
        // here ask about the smallest character in letters that is lexigraphically greater than target char
        // so i save the result in the form of ans char and update the high below mid 
        char ans = letters[low];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < letters[mid]) {
                ans = letters[mid];
                // that is check further smallest element is present or not
                high = mid - 1;
                // reduce the array and go to the left half
            } else {
                low = mid + 1;
                // go to the right half
            }
        }
        // at last return the ans that is update in every time when it find smallest elelment that is lexigraphically greater than target char
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)