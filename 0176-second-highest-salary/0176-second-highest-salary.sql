# Write your MySQL query statement below
SELECT IFNULL((SELECT distinct Salary
	             FROM Employee 
				 ORDER BY Salary DESC 
				 LIMIT 1,1),NULL) AS SecondHighestSalary
                 