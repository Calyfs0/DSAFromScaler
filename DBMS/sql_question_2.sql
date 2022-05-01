Select e.empname as oldest_employee_name, d.deptname as department_name from

((Select deptid, MIN(dob) as dateOfBirth from employee group by deptid) as t
JOIN employee e
ON e.deptid = t.deptid AND e.dob = t.dateOfBirth
JOIN department d
ON d.deptid = t.deptid);