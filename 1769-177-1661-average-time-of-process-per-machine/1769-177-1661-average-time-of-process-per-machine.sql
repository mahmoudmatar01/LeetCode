# Write your MySQL query statement below

WITH ProcessTimes AS(
    SELECT 
        machine_id, 
        process_id,
        MAX(timestamp) - MIN(timestamp) AS process_time 
    FROM Activity 
    GROUP BY machine_id, process_id
) 

SELECT 
    machine_id,
    ROUND(AVG(process_time), 3) AS processing_time
FROM ProcessTimes
GROUP BY machine_id
