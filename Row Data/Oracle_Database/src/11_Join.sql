-- JOIN : 두 개 이상의 테이블에 나눠져 있는 관련 데이터들을 하나의 테이블로 모아서 조회하고자 할 때 사용하는 명령

-- 1 이름 Douglas Grant가 근무하는 부서명, 부서의 지역명 출력
select * from employees;
select * from departments;

select department_id from employees where emp_name = 'Douglas Grant';
select department_name, parent_id from departments where department_id = 50;
select department_name from departments where department_id = 10;

-- cross join : 두 개 이상의 테이블이 조인될때 where절에 의해 공통되는 컬럼에 의한 결합이 발생하지 않는 경우

-- 가장 최악의 결과를 얻는 조인 방식
-- A 테이블과 B 테이블의 cross join 된다면
-- A 테이블의 1번 레코드와 B 테이블의 모든 레코드와 하나하나 모두 조합
-- A 테이블의 2번 레코드와 B 테이블의 모든 레코드와 하나하나 모두 조합
-- A 테이블의 3번 레코드와 B 테이블의 모든 레코드와 하나하나 모두 조합

select * from dept
select * from emp

select * from dept, emp

-- equi join : 조인 대상이 되는 두 테이블에서 공통적으로 존재하는 컬럼의 값이 일치하는 행을 연결하여 결과를 생성
select * from dept, emp where emp.deptno = dept.deptnp;

-- 각 사원의 이름, 부서번호, 부서명, 지역 출력
select emp.ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno;

-- 시험문제 Douglas Grant가 근무하는 부서명과 상급부서의 이름을 출력
select employees.emp_name, employees.department_id, departments.department_name, employees.salary from departments, employees 
where employees.emp_name = 'Douglas Grant' and employees.department_id = departments.department_id;

-- 이름이 scott인 사원의 이름, 부서번호, 부서명, 위치 출력
select ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno and emp.ename='SCOTT';


select * from rentlist;
select * from booklist;
select * from rentlist, booklist;
select * from rentlist, booklist where rentlist.booknum = booklist.num;
select rentlist.rentdate, rentlist.num, rentlist.booknum, booklist.subject
from rentlist, booklist where rentlist.booknum = booklist.num;

-- rentlist의 membernum에 해당하는 회원의 이름과 전화번호를 rentlist의 rentdate, num, membernum과 함께 출력
select * from memberlist;

select rentlist.rentdate, rentlist.num, rentlist.membernum, memberlist.name, memberlist.phone
from rentlist, memberlist where rentlist.num = memberlist.num;

select a.ename, b.dname, b.loc, a.deptno from emp a, dept b
where a.deptno = b.deptno and e.name = 'SCOTT';

-- non-equi join
-- 동일 컬럼이 없어서 다른 조건을 사용하여 조인
-- 조인 조건에 특정 범위내에 있는지를 조사하기 위해 조건절에 조인 조건을 '=' 연산자 이외의 비교

select * from emp;
select * from salgrade;

-- 비교 연산자
select a.ename, a.sal, b.grade from emp a, salgrade b
where a.sal >= b.losal and a.sal <= b.hisal;

select a.ename, a.sal, b.grade from emp a, salgrade b
where a.sal between b.losal and b.hisal;

-- 세 개의 테이블을 하나로 JOIN(equi, nonequi)
select a.ename, a.sal, c.grade, d.dname from emp a, dept b, salgrade c
where a.deptno = b.deptno and a.sal between c.losal and c.hisal;


-- 연습문제
-- rentlist 테이블의 rentdate, booknum, membernum 을 조회하되,
-- booklist 와 memberlist 테이블을 조인해서 대여가격/책제목/회원이름/사은포인트 출력
-- 별칭은 a, b, c

select * from rentlist;
select * from booklist;
select * from memberlist;

select a.rentdate, b.subject, c.name, c.bpoint
from rentlist a, booklist b, memberlist c
where a.booknum = a.membernum

-- 조인된 테이블에 계산식으로 필드를 생성할 수도 있음
select a.rentdate, b.subject, c.name, c.bpoint, b.rentprice - a.discount
from rentlist a, booklist b, memberlist c
where a.booknum = b.booknum and a.membernum = c.membernum;

-- outer join
-- 조인 조건에 만족하지 못해서 해당 결과를 출력시에 누락이 되는 문제점이 발생할 때 해당 레코드를 출력하는 조인
select a.booknum, a.subject, b.rentdate from booklist a, rentlist b
where a.num = b.booknum(+);

-- ANSI join
-- 1. ANSI Cross join
select * from emp, dept
select * from emp cross join dept

-- 2. ANSI inner join
select ename, dname from emp a, dept b where a.deptno = b.deptno;
select ename, dname from emp inner join dept on emp.deptno = dept.deptno;
select ename, dname from emp inner join dept using (deptno);

-- 3. ANSI outer join
select * from emp, dept where emp.deptno = dept.deptno(+);
select * from emp, dept where emp.deptno(+) = dept.deptno;

select * from emp left outer join dept on emp.deptno = dept.deptno;
select * from emp right outer join dept on emp.deptno = dept.deptno;

