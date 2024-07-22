# Write your MySQL query statement below
SELECT visited_on, 
       window_amount AS amount, 
       round((CAST(window_amount AS FLOAT) / 7.0), 2) AS average_amount
FROM 
    (
    select visited_on,
           lag(visited_on, 6) over(order by visited_on) AS p_days,
           SUM(s_amount) over(ORDER BY visited_on rows
                              BETWEEN 6 preceding and CURRENT ROW) AS window_amount
    FROM
        (
        SELECT visited_on, SUM(amount) AS s_amount
        FROM Customer
        GROUP BY visited_on
        ) tem1
    ) tem2
WHERE p_days IS NOT NULL