# Drop Missing Data

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

There are some rows having missing values in the `name` column.

Write a solution to remove the rows with missing values.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 32         | Piper   | 5   |
| 217        | None    | 19  |
| 779        | Georgia | 20  |
| 849        | Willow  | 14  |
+------------+---------+-----+
Output:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 32         | Piper   | 5   |
| 779        | Georgia | 20  | 
| 849        | Willow  | 14  | 
+------------+---------+-----+
Explanation: 
Student with id 217 havs empty value in the name column, so it will be removed.
```

## Solution

**Language:** Python  
**Runtime:** 319 ms (beats 15.65%)  
**Memory:** 66.9 MB (beats 67.89%)  
**Submitted:** 2026-10-23T16:10:20.466Z  

```py
import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    # return students.dropna()
    # that is the good question for remembering the use case of dropna()
    # and one thing if you want to remove inly row then -> use -> dropna()
    # and for Column -> use -> ropna(axis=1) beacause axis = 1 refers to the column
    # taht code gives error because it reove all null value buti in the question ask to return that dataframe ehere only name column is null
    students.dropna(subset=['name'], how='any',inplace =True)
    return students
```

---

[View on LeetCode](https://leetcode.com/problems/drop-missing-data/)