# Write your MySQL query statement below
SELECT product_name, year, price FROM Sales INNER JOIN Product WHERE Sales.product_id = Product.product_id;