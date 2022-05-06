Select e.employee_name from employees e JOIN
salaries s
ON s.employee_id = e.employee_id
where department_id IN (Select department_id from salaries where employee_id IN (Select employee_id from employees where employee_name like '%q%'))