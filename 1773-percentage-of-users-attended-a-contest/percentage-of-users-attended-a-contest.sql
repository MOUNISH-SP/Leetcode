# Write your MySQL query statement below
select r.contest_id, Round((count(r.user_id)*100)/(select count(*)from Users),2) as percentage from Register as r cross join Users as u on r.user_id=u.user_id group by r.contest_id 
Order by percentage DESC ,r.contest_id ASC;
