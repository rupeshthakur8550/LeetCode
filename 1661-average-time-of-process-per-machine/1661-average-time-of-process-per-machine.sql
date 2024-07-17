# Write your MySQL query statement below
SELECT machine_id,ROUND(
    AVG(
        CASE 
            WHEN activity_type = 'start' THEN -timestamp
            ELSE timestamp
        END
    ) * 2, -- 2 is the partition as which start and end makes 1 partition here we have 2 partition for each
    3 
) AS processing_time
FROM Activity GROUP BY machine_id;
