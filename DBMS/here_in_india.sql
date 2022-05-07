Select e.employee_name, s.salary, d.department_name from employees e
JOIN salaries s
ON s.employee_id = e.employee_id
JOIN departments d
ON s.department_id = d.department_id
Where s.salary > 10000
AND department_location = 'India'; 