# Employee Bonus

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Employee`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| empId       | int     |
| name        | varchar |
| supervisor  | int     |
| salary      | int     |
+-------------+---------+
empId is the column with unique values for this table.
Each row of this table indicates the name and the ID of an employee in addition to their salary and the id of their manager.

```

 

Table: `Bonus`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| empId       | int  |
| bonus       | int  |
+-------------+------+
empId is the column of unique values for this table.
empId is a foreign key (reference column) to empId from the Employee table.
Each row of this table contains the id of an employee and their respective bonus.

```

 

Write a solution to report the name and bonus amount of each employee who satisfies either of the following:

- The employee has a bonus less than 1000.
- The employee did not get any bonus.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employee table:
+-------+--------+------------+--------+
| empId | name   | supervisor | salary |
+-------+--------+------------+--------+
| 3     | Brad   | null       | 4000   |
| 1     | John   | 3          | 1000   |
| 2     | Dan    | 3          | 2000   |
| 4     | Thomas | 3          | 4000   |
+-------+--------+------------+--------+
Bonus table:
+-------+-------+
| empId | bonus |
+-------+-------+
| 2     | 500   |
| 4     | 2000  |
+-------+-------+
Output: 
+------+-------+
| name | bonus |
+------+-------+
| Brad | null  |
| John | null  |
| Dan  | 500   |
+------+-------+

```

## Solution

**Language:** SQL  
**Runtime:** 1100 ms (beats 47.16%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-24T04:30:42.566Z  

```sql
# Write your MySQL query statement below
-- at first select name column from Employee data table and select bonus column from  Bonus table
select e.name as 'name',
b.bonus as 'bonus'
from Employee e
-- use left join because it gives first priority to left column first
left join Bonus b on 
-- based on employee column's empId and Bonus column's empId
e.empId = b.empId
where b.bonus < 1000 OR b.bonus is null;
-- then use condition for filter the given bonus data
```

---

[View on LeetCode](https://leetcode.com/problems/employee-bonus/)