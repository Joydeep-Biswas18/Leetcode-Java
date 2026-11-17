# Write your MySQL query statement below
SELECT w.name as "name" , w.population as "population" , w.area as "area"
from World w
where w.population >= 25000000 or w.area >= 3000000 ;