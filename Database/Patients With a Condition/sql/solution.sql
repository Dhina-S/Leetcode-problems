# Write your MySQL query statement below
select patient_id,patient_name,conditions
from patients
where conditions like 'DIAB100%' or conditions like '% DIAB100';