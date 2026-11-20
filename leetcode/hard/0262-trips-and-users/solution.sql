# Write your MySQL query statement below
select request_at as 'Day',
round(sum(case when t.status != 'completed' then 1 else 0 end)
/count(*) , 2) as 'Cancellation Rate'
from Trips t
left join Users u1 on t.client_id = u1.users_id 
left join Users u2 on t.driver_id = u2.users_id
where request_at between '2013-10-01' and '2013-10-03'
and u1.banned ='No' 
and u2.banned ='No'
group by t.request_at;
