# Write your MySQL query statement below
WITH employee_department AS 
(
    SELECT 
        d.name AS Department, 
        e.salary AS Salary, 
        e.name AS Employee, 
        DENSE_RANK() OVER(PARTITION BY d.name ORDER BY e.salary DESC) AS dept_rank
    FROM Employee e 
    JOIN Department d
    ON e.departmentId = d.id
)

SELECT Department, Employee, Salary 
FROM employee_department
WHERE dept_rank <= 3;
