# Write your MySQL query statement below
SELECT 'Average Salary' category,
(SELECT COUNT(income) FROM Accounts WHERE income >= 20000 AND income <= 50000) accounts_count
UNION 
SELECT 'Low Salary' category,
(SELECT COUNT(income) FROM Accounts WHERE income < 20000) accounts_count
UNION
SELECT 'High Salary' category,
(SELECT COUNT(income) FROM Accounts WHERE income > 50000) accounts_count