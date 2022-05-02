Select d.deptname as department_name, ROUND(AVG(e.salary),2) as average_salary from employee e
JOIN department d
ON d.deptid = e.deptid
group by e.deptid;