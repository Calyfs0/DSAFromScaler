Select employee_name from employees where employee_id IN (Select employee_id from (Select * from salaries  order by salary desc) t group by department_id) order by employee_id;