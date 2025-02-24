# Write your MySQL query statement below
WITH FirstLogin AS (
    SELECT player_id, MIN(event_date) AS first_login_date
    FROM Activity
    GROUP BY player_id
)
SELECT 
    ROUND(
        COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2
    ) AS fraction
FROM FirstLogin f
WHERE EXISTS (
    SELECT 1 FROM Activity a
    WHERE a.player_id = f.player_id
    AND a.event_date = DATE_ADD(f.first_login_date, INTERVAL 1 DAY)
);