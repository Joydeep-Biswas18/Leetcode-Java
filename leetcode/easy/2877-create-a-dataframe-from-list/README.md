# Create a DataFrame from List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a solution to  **create**  a DataFrame from a 2D list called `student_data`. This 2D list contains the IDs and ages of some students.

The DataFrame should have two columns, `student_id` and `age`, and be in the same order as the original 2D list.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
student_data:
[
  [1, 15],
  [2, 11],
  [3, 11],
  [4, 20]
]
Output:
+------------+-----+
| student_id | age |
+------------+-----+
| 1          | 15  |
| 2          | 11  |
| 3          | 11  |
| 4          | 20  |
+------------+-----+
Explanation:
A DataFrame was created on top of student_data, with two columns named student_id and age.

```

## Solution

**Language:** Python  
**Runtime:** 267 ms (beats 35.13%)  
**Memory:** 65.1 MB (beats 97.46%)  
**Submitted:** 2026-10-22T15:19:00.178Z  

```py
import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    column_name =['student_id','age']
    # here it should be remember that pd.DataFrame automatically fetch data from list of list so we dont need to use two nested for loop for fetching data inside any list of list
    result_df = pd.DataFrame(student_data , columns = column_name)
    return  result_df
    
```

---

[View on LeetCode](https://leetcode.com/problems/create-a-dataframe-from-list/)