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