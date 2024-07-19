# Write your MySQL query statement below
SELECT * FROM Patients WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%';

#Using Regular Expression
SELECY * FROM Patients WHERE conditions REGEXP '\\bDIAB1';