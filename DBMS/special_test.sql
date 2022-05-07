Select s.student_name, t.test_score, d.department_name from
 (Select * from test_stats where test_id IN (Select test_id from tests where test_type = 'hiring')) as t
 JOIN students s
 ON s.student_id = t.student_id
 JOIN departments d
 ON d.test_id = t.test_id
 Where t.test_score >= 90;   