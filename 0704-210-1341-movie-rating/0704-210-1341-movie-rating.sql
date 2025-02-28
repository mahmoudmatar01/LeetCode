# Write your MySQL query statement below

WITH MovieRatings AS (
    SELECT m.title, AVG(mr.rating) AS avg_rating
    FROM MovieRating mr
    JOIN Movies m ON mr.movie_id = m.movie_id
    WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY m.title
),
MaxMovie AS (
    SELECT title
    FROM MovieRatings
    WHERE avg_rating = (SELECT MAX(avg_rating) FROM MovieRatings)
    ORDER BY title
    LIMIT 1
),
UserRatings AS(
    SELECT u.name AS name,
           COUNT(*) AS rating_count
    FROM MovieRating m JOIN Users u
    ON m.user_id = u.user_id
    GROUP BY u.user_id
),
MaxUser AS(
    SELECT ur.name
    FROM UserRatings ur
    WHERE ur.rating_count = (SELECT MAX(rating_count) FROM UserRatings)
    ORDER BY ur.name
    LIMIT 1
)

SELECT name AS results FROM MaxUser
UNION ALL
SELECT title AS results FROM MaxMovie
