# Write your MySQL query statement below
select t.id from Weather as t join Weather as y on t.recordDate =Date_add(y.recordDate,INTERVAL 1 Day) where t.temperature > y.temperature;