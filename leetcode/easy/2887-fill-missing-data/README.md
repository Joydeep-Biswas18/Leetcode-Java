# Fill Missing Data

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame products
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| name        | object |
| quantity    | int    |
| price       | int    |
+-------------+--------+

```

Write a solution to fill in the missing value as `0` in the `quantity` column.

The result format is in the following example.

 

```
Example 1:
Input:+-----------------+----------+-------+
| name            | quantity | price |
+-----------------+----------+-------+
| Wristwatch      | None     | 135   |
| WirelessEarbuds | None     | 821   |
| GolfClubs       | 779      | 9319  |
| Printer         | 849      | 3051  |
+-----------------+----------+-------+
Output:
+-----------------+----------+-------+
| name            | quantity | price |
+-----------------+----------+-------+
| Wristwatch      | 0        | 135   |
| WirelessEarbuds | 0        | 821   |
| GolfClubs       | 779      | 9319  |
| Printer         | 849      | 3051  |
+-----------------+----------+-------+
Explanation: 
The quantity for Wristwatch and WirelessEarbuds are filled by 0.
```

## Solution

**Language:** Python  
**Runtime:** 273 ms (beats 64.11%)  
**Memory:** 65.4 MB (beats 97.44%)  
**Submitted:** 2026-10-25T05:12:56.152Z  

```py
import pandas as pd

def fillMissingValues(products: pd.DataFrame) -> pd.DataFrame:
    products.quantity.fillna(0 ,inplace = True)
    return products
    
```

---

[View on LeetCode](https://leetcode.com/problems/fill-missing-data/)