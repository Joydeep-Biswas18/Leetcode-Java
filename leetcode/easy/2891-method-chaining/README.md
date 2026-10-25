# Method Chaining

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame animals
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| name        | object |
| species     | object |
| age         | int    |
| weight      | int    |
+-------------+--------+

```

Write a solution to list the names of animals that weigh  **strictly more than**  `100` kilograms.

Return the animals sorted by weight in  **descending order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
DataFrame animals:
+----------+---------+-----+--------+
| name     | species | age | weight |
+----------+---------+-----+--------+
| Tatiana  | Snake   | 98  | 464    |
| Khaled   | Giraffe | 50  | 41     |
| Alex     | Leopard | 6   | 328    |
| Jonathan | Monkey  | 45  | 463    |
| Stefan   | Bear    | 100 | 50     |
| Tommy    | Panda   | 26  | 349    |
+----------+---------+-----+--------+
Output: 
+----------+
| name     |
+----------+
| Tatiana  |
| Jonathan |
| Tommy    |
| Alex     |
+----------+
Explanation: 
All animals weighing more than 100 should be included in the results table.
Tatiana's weight is 464, Jonathan's weight is 463, Tommy's weight is 349, and Alex's weight is 328.
The results should be sorted in descending order of weight.
```

 

In Pandas,  **method chaining**  enables us to perform operations on a DataFrame without breaking up each operation into a separate line or creating multiple temporary variables. 

Can you complete this task in just  **one line** of code using method chaining?

## Solution

**Language:** Python  
**Runtime:** 292 ms (beats 54.19%)  
**Memory:** 67 MB (beats 70.79%)  
**Submitted:** 2026-10-25T06:18:31.852Z  

```py
import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    filtered_data = animals[animals.weight>100]
    sorted_filterd_data = filtered_data.sort_values(by='weight', ascending=False)
    name = sorted_filterd_data[['name']]
    return name
```

---

[View on LeetCode](https://leetcode.com/problems/method-chaining/)