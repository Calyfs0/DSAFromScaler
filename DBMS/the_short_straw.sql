Select d.department_location, s.salary as min_sal from departments d
JOIN salaries s
ON s.department_id = d.department_id
HAVING s.salary = (Select MIN(salary) from salaries);