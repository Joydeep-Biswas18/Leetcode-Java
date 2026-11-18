# Recyclable and Low Fat Products

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Products`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| product_id  | int     |
| low_fats    | enum    |
| recyclable  | enum    |
+-------------+---------+
product_id is the primary key (column with unique values) for this table.
low_fats is an ENUM (category) of type ('Y', 'N') where 'Y' means this product is low fat and 'N' means it is not.
recyclable is an ENUM (category) of types ('Y', 'N') where 'Y' means this product is recyclable and 'N' means it is not.
```

 

Write a solution to find the ids of products that are both low fat and recyclable.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Products table:
+-------------+----------+------------+
| product_id  | low_fats | recyclable |
+-------------+----------+------------+
| 0           | Y        | N          |
| 1           | Y        | Y          |
| 2           | N        | Y          |
| 3           | Y        | Y          |
| 4           | N        | N          |
+-------------+----------+------------+
Output: 
+-------------+
| product_id  |
+-------------+
| 1           |
| 3           |
+-------------+
Explanation: Only products 1 and 3 are both low fat and recyclable.

```

## Solution

**Language:** Python  
**Runtime:** 349 ms (beats 8.60%)  
**Memory:** 76.3 MB (beats 5.04%)  
**Submitted:** 2026-11-18T05:48:06.103Z  

```py
import pandas as pd

def find_products(products: pd.DataFrame) -> pd.DataFrame:
    return products.loc[((products['low_fats'] =='Y') & (products['recyclable'] =='Y')) ,['product_id']]
    
```

---

[View on LeetCode](https://leetcode.com/problems/recyclable-and-low-fat-products/)