# Duplicate Emails

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Person`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.

```

 

Write a solution to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Person table:
+----+---------+
| id | email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
Output: 
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Explanation: a@b.com is repeated two times.

```

## Solution

**Language:** SQL  
**Runtime:** 461 ms (beats 23.95%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-09T13:05:10.520Z  

```sql
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email)>1


```

---

[View on LeetCode](https://leetcode.com/problems/duplicate-emails/)