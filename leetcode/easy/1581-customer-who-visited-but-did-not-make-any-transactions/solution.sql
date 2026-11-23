# Write your MySQL query statement below
select v.customer_id as 'customer_id',
count(v.visit_id) as 'count_no_trans'
from Visits v
where v.visit_id Not in 
(select t.visit_id from Transactions t)
group by v.customer_id; 