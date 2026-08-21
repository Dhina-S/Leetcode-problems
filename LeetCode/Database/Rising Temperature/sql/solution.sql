# Write your MySQL query statement below
SELECT t.id
FROM Weather y
CROSS JOIN Weather t

on DATEDIFF(t.recordDate,y.recordDate) = 1
    AND t.temperature > y.temperature;