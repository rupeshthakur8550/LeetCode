# Write your MySQL query statement below
SELECT product_id, year as first_year, quantity, price 
FROM (
    SELECT *, RANK() OVER(PARTITION BY product_id ORDER BY year) product_rank
    FROM Sales
) T 
WHERE product_rank = 1; 