# Write your MySQL query statement below

SELECT 
    e1.employee_id AS employee_id,
    e1.name AS name,
    (SELECT COUNT(*) FROM Employees e2 WHERE e2.reports_to = e1.employee_id) AS reports_count,
    (SELECT ROUND(AVG(e2.age)) FROM Employees e2 WHERE e2.reports_to = e1.employee_id) AS average_age
FROM Employees e1
WHERE EXISTS (SELECT 1 FROM Employees e2 WHERE e2.reports_to = e1.employee_id)
ORDER BY e1.employee_id;
