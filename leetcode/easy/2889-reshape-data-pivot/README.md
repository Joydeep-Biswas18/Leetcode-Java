# Reshape Data: Pivot

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame weather
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| city        | object |
| month       | object |
| temperature | int    |
+-------------+--------+

```

Write a solution to  **pivot**  the data so that each row represents temperatures for a specific month, and each city is a separate column.

The result format is in the following example.

 

```
Example 1:
Input:
+--------------+----------+-------------+
| city         | month    | temperature |
+--------------+----------+-------------+
| Jacksonville | January  | 13          |
| Jacksonville | February | 23          |
| Jacksonville | March    | 38          |
| Jacksonville | April    | 5           |
| Jacksonville | May      | 34          |
| ElPaso       | January  | 20          |
| ElPaso       | February | 6           |
| ElPaso       | March    | 26          |
| ElPaso       | April    | 2           |
| ElPaso       | May      | 43          |
+--------------+----------+-------------+
Output:
+----------+--------+--------------+
| month    | ElPaso | Jacksonville |
+----------+--------+--------------+
| April    | 2      | 5            |
| February | 6      | 23           |
| January  | 20     | 13           |
| March    | 26     | 38           |
| May      | 43     | 34           |
+----------+--------+--------------+
Explanation:
The table is pivoted, each column represents a city, and each row represents a specific month.
```

## Solution

**Language:** Python  
**Runtime:** 357 ms (beats 8.29%)  
**Memory:** 67.1 MB (beats 89.56%)  
**Submitted:** 2026-10-25T05:51:22.044Z  

```py
import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    weather = weather.pivot(index='month', columns ='city', values ='temperature')
    return weather
```

---

[View on LeetCode](https://leetcode.com/problems/reshape-data-pivot/)