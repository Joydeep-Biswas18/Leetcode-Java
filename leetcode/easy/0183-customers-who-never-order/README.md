# Customers Who Never Order

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Customers`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table indicates the ID and name of a customer.

```

 

Table: `Orders`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| customerId  | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
customerId is a foreign key (reference columns) of the ID from the Customers table.
Each row of this table indicates the ID of an order and the ID of the customer who ordered it.

```

 

Write a solution to find all customers who never order anything.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Customers table:
+----+-------+
| id | name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Orders table:
+----+------------+
| id | customerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
Output: 
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+

```

## Solution

**Language:** SQL  
**Runtime:** 797 ms (beats 11.71%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-19T15:07:26.145Z  

```sql
# Write your MySQL query statement below
select c.name as Customers 
from Customers c
left join Orders o 
-- combine these two table on basis of customer id and customerId in orders table
on c.id = o.customerId 
where o.customerId is null;
-- that chek where order table contains null value that means they never order anything
```

---

[View on LeetCode](https://leetcode.com/problems/customers-who-never-order/)