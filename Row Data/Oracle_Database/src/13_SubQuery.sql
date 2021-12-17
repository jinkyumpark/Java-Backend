-- SubQuery - �ϳ��� select ������ �� �ȿ� ���Ե� �� �ϳ��� select ���� ��

-- SCOTT �� �ٹ��ϴ� ���� �μ���� ���� ���
-- ������ �������� : ���� ���� ����� �ϳ�
select deptno from emp where ename = 'SCOTT';
select dname, loc from dept where deptno = 30;

select dname, loc from dept
where deptno = (select deptno from emp where ename = 'SCOTT');

-- �������� SCOTT �� ��������(job)�� ���� ����� ��� ������ ���
select * from EMPLOYEES;
select * from job;

select * from emp where job = (select job from emp where ename='SCOTT');

select ename, sal from emp where sal >= (select sal from emp where ename='SCOTT');

-- �������� & �׷��Լ�
select ename, sal, job from emp where sal >= (select avg(sal) from emp);

-- �������� IN SOME ANI ALL ��

select ename, deptno, job from emp
where deptno in (select distinct deptno from emp where sal >= 3000);

-- �������� 30�� �μ� �Ҽ� ����� �߿��� �޿��� ���� ���� �޴� ������� �޿��� �� ���� ����� �̸��� job, �޿�
select * from emp;
select job, sal from emp where sal < (select max(sal) from emp)
-- �������� �μ���ȣ�� 30���� ������� �޿� �߿��� ���� ���� �޿����� ���� �޿��� �޴� ����� �̸��� job, �޿�
select job, sal from emp where deptno = 30 and sal > (select min(sal) from emp);
-- �������� �������(job='SALESMAN')���� �ּ� �޿����� ���� �޴� ������� �̸��� �޿��� ����. ��������� ��� �� ��
select ename, sal, job from emp where sal > (select min(sal) from emp where job = 'SALESMAN');

select ename, jon, sal from emp
where sal > any(select sal from emp where deptno = 30);