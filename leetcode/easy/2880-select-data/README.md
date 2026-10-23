# Select Data

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame students
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| student_id  | int    |
| name        | object |
| age         | int    |
+-------------+--------+

```

Write a solution to select the name and age of the student with `student_id = 101`.

The result format is in the following example.

 

```
Example 1:
Input:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 101        | Ulysses | 13  |
| 53         | William | 10  |
| 128        | Henry   | 6   |
| 3          | Henry   | 11  |
+------------+---------+-----+
Output:
+---------+-----+
| name    | age | 
+---------+-----+
| Ulysses | 13  |
+---------+-----+
Explanation:
Student Ulysses has student_id = 101, we select the name and age.
```

## Solution

**Language:** Python  
**Runtime:** 287 ms (beats 55.16%)  
**Memory:** 66.3 MB (beats 95.03%)  
**Submitted:** 2026-10-23T15:53:03.550Z  

```py
import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    df = pd.DataFrame(students[['name','age']]) # that code select these exact column from the table
    df = df.loc[students['student_id']==101] # that code filter out the exact requirment
    return df
```

---

[View on LeetCode](https://leetcode.com/problems/select-data/)