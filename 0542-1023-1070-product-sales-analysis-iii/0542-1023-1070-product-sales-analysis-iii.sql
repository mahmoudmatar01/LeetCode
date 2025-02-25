# Write your MySQL query statement below

WITH FIRST_YEAR_PRODUCT AS(
    SELECT product_id, 
           MIN(year) AS first_year
    FROM Sales
    GROUP BY product_id
)

SELECT s.product_id,
       s.year AS first_year,
       s.quantity,
       s.price
FROM Sales s JOIN FIRST_YEAR_PRODUCT f
ON f.product_id = s.product_id AND f.first_year = s.year