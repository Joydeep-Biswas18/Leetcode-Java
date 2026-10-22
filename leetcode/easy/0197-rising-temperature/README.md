# Rising Temperature

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Weather`

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| recordDate    | date    |
| temperature   | int     |
+---------------+---------+
id is the column with unique values for this table.
There are no different rows with the same recordDate.
This table contains information about the temperature on a certain day.

```

 

Write a solution to find all dates' `id` with higher temperatures compared to its previous dates (yesterday).

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Weather table:
+----+------------+-------------+
| id | recordDate | temperature |
+----+------------+-------------+
| 1  | 2015-01-01 | 10          |
| 2  | 2015-01-02 | 25          |
| 3  | 2015-01-03 | 20          |
| 4  | 2015-01-04 | 30          |
+----+------------+-------------+
Output: 
+----+
| id |
+----+
| 2  |
| 4  |
+----+
Explanation: 
In 2015-01-02, the temperature was higher than the previous day (10 -> 25).
In 2015-01-04, the temperature was higher than the previous day (20 -> 30).

```

## Solution

**Language:** SQL  
**Runtime:** 510 ms (beats 56.08%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-22T14:50:44.024Z  

```sql
# Write your MySQL query statement below
select w1.id
from Weather w1 
Inner join Weather w2
on datediff(w1.recordDate ,w2.recordDate )=1 AND 
w1.temperature > w2.temperature ;
```

---

[View on LeetCode](https://leetcode.com/problems/rising-temperature/)