-- SubQuery - 하나의 select 문장의 절 안에 포함된 또 하나의 select 쿼리 문

-- SCOTT 이 근무하는 곳의 부서명과 지역 출력
-- 단일행 서브쿼리 : 서브 쿼리 결과가 하나
select deptno from emp where ename = 'SCOTT';
select dname, loc from dept where deptno = 30;

select dname, loc from dept
where deptno = (select deptno from emp where ename = 'SCOTT');

-- 연습문제 SCOTT 과 동일직업(job)을 가진 사원의 모든 정보를 출력
select * from EMPLOYEES;
select * from job;

select * from emp where job = (select job from emp where ename='SCOTT');

select ename, sal from emp where sal >= (select sal from emp where ename='SCOTT');

-- 서브쿼리 & 그룹함수
select ename, sal, job from emp where sal >= (select avg(sal) from emp);

-- 서브쿼리 IN SOME ANI ALL 등

select ename, deptno, job from emp
where deptno in (select distinct deptno from emp where sal >= 3000);

-- 연습문제 30번 부서 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 급여가 더 많은 사원의 이름과 job, 급여
select * from emp;
select job, sal from emp where sal < (select max(sal) from emp)
-- 연습문제 부서번호가 30번인 사원들의 급여 중에서 가장 낮은 급여보다 높은 급여를 받는 사원의 이름과 job, 급여
select job, sal from emp where deptno = 30 and sal > (select min(sal) from emp);
-- 연습문제 영업사원(job='SALESMAN')들의 최소 급여보다 많이 받는 사원들의 이름과 급여와 직급. 영업사원은 출력 안 함
select ename, sal, job from emp where sal > (select min(sal) from emp where job = 'SALESMAN');

select ename, jon, sal from emp
where sal > any(select sal from emp where deptno = 30);