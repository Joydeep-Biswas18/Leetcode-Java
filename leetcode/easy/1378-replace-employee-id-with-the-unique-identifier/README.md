# Replace Employee ID With The Unique Identifier

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Employees`

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| name          | varchar |
+---------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table contains the id and the name of an employee in a company.

```

 

Table: `EmployeeUNI`

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| unique_id     | int     |
+---------------+---------+
(id, unique_id) is the primary key (combination of columns with unique values) for this table.
Each row of this table contains the id and the corresponding unique id of an employee in the company.

```

 

Write a solution to show the  **unique ID** of each user, If a user does not have a unique ID replace just show `null`.

Return the result table in  **any**  order.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employees table:
+----+----------+
| id | name     |
+----+----------+
| 1  | Alice    |
| 7  | Bob      |
| 11 | Meir     |
| 90 | Winston  |
| 3  | Jonathan |
+----+----------+
EmployeeUNI table:
+----+-----------+
| id | unique_id |
+----+-----------+
| 3  | 1         |
| 11 | 2         |
| 90 | 3         |
+----+-----------+
Output: 
+-----------+----------+
| unique_id | name     |
+-----------+----------+
| null      | Alice    |
| null      | Bob      |
| 2         | Meir     |
| 3         | Winston  |
| 1         | Jonathan |
+-----------+----------+
Explanation: 
Alice and Bob do not have a unique ID, We will show null instead.
The unique ID of Meir is 2.
The unique ID of Winston is 3.
The unique ID of Jonathan is 1.

```

## Solution

**Language:** SQL  
**Runtime:** 990 ms (beats 98.62%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-11-20T15:55:32.896Z  

```sql
# Write your MySQL query statement below
select eu.unique_id as 'unique_id', e.name as 'name'
from Employees e
Left Join EmployeeUNI eu 
on e.id = eu.id;
```

---

[View on LeetCode](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/)