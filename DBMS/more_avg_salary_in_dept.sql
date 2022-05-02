SELECT e.ename, e.sal, e.deptno from
(SELECT deptno, AVG(sal) as avgs from emp group by deptno) as t
JOIN emp e
ON e.deptno = t.deptno
WHERE sal > avgs;