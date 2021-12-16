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

-- 이름이 scott인 사원의 이름, 부서번호, 부서명, 위치 출력
select ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno and emp.ename='SCOTT';
