# Write your MySQL query statement below
SELECT project_id, 
       ROUND(AVG(exp_years), 2) AS average_years
FROM (
    SELECT p.project_id, e.experience_years AS exp_years
    FROM Project p
    LEFT JOIN Employee e ON p.employee_id = e.employee_id
) T
GROUP BY project_id;
      