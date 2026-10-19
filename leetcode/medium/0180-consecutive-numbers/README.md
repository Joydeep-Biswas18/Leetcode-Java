# Consecutive Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Table: `Logs`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| num         | varchar |
+-------------+---------+
In SQL, id is the primary key for this table.
id is an autoincrement column starting from 1.

```

 

Find all numbers that appear at least three times consecutively.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Logs table:
+----+-----+
| id | num |
+----+-----+
| 1  | 1   |
| 2  | 1   |
| 3  | 1   |
| 4  | 2   |
| 5  | 1   |
| 6  | 2   |
| 7  | 2   |
+----+-----+
Output: 
+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
Explanation: 1 is the only number that appears consecutively for at least three times.

```

## Solution

**Language:** SQL  
**Runtime:** 815 ms (beats 11.09%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-19T14:32:53.129Z  

```sql
# Write your MySQL query statement below
select distinct num as ConsecutiveNums 
from (
    select num,
    LAG(num , 1) over (order by id) as prev1,
    lag(num , 2) over (order by id) as prev2
    from logs
) as occurence
where num = prev1 and num = prev2;
```

---

[View on LeetCode](https://leetcode.com/problems/consecutive-numbers/)