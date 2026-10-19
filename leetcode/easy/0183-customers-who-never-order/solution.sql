# Write your MySQL query statement below
select c.name as Customers 
from Customers c
left join Orders o 
-- combine these two table on basis of customer id and customerId in orders table
on c.id = o.customerId 
where o.customerId is null;
-- that chek where order table contains null value that means they never order anything