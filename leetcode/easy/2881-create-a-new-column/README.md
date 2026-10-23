# Create a New Column

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame employees
+-------------+--------+
| Column Name | Type.  |
+-------------+--------+
| name        | object |
| salary      | int.   |
+-------------+--------+

```

A company plans to provide its employees with a bonus.

Write a solution to create a new column name `bonus` that contains the  **doubled values**  of the `salary` column.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
DataFrame employees
+---------+--------+
| name    | salary |
+---------+--------+
| Piper   | 4548   |
| Grace   | 28150  |
| Georgia | 1103   |
| Willow  | 6593   |
| Finn    | 74576  |
| Thomas  | 24433  |
+---------+--------+
Output:
+---------+--------+--------+
| name    | salary | bonus  |
+---------+--------+--------+
| Piper   | 4548   | 9096   |
| Grace   | 28150  | 56300  |
| Georgia | 1103   | 2206   |
| Willow  | 6593   | 13186  |
| Finn    | 74576  | 149152 |
| Thomas  | 24433  | 48866  |
+---------+--------+--------+
Explanation: 
A new column bonus is created by doubling the value in the column salary.
```

## Solution

**Language:** Python  
**Runtime:** 281 ms (beats 47.27%)  
**Memory:** 65.6 MB (beats 94.85%)  
**Submitted:** 2026-10-23T15:57:28.640Z  

```py
import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['bonus'] = employees['salary']* 2
    # that is the code of creating a new column in existing dataframe thats why i directly use the employees DataFrame not create another df
    return employees
    
```

---

[View on LeetCode](https://leetcode.com/problems/create-a-new-column/)