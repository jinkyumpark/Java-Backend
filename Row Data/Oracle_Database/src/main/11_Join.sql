-- JOIN : �� �� �̻��� ���̺� ������ �ִ� ���� �����͵��� �ϳ��� ���̺�� ��Ƽ� ��ȸ�ϰ��� �� �� ����ϴ� ���

-- 1 �̸� Douglas Grant�� �ٹ��ϴ� �μ���, �μ��� ������ ���
select * from employees;
select * from departments;

select department_id from employees where emp_name = 'Douglas Grant';
select department_name, parent_id from departments where department_id = 50;
select department_name from departments where department_id = 10;

-- cross join : �� �� �̻��� ���̺��� ���εɶ� where���� ���� ����Ǵ� �÷��� ���� ������ �߻����� �ʴ� ���

-- ���� �־��� ����� ��� ���� ���
-- A ���̺�� B ���̺��� cross join �ȴٸ�
-- A ���̺��� 1�� ���ڵ�� B ���̺��� ��� ���ڵ�� �ϳ��ϳ� ��� ����
-- A ���̺��� 2�� ���ڵ�� B ���̺��� ��� ���ڵ�� �ϳ��ϳ� ��� ����
-- A ���̺��� 3�� ���ڵ�� B ���̺��� ��� ���ڵ�� �ϳ��ϳ� ��� ����

select * from dept
select * from emp

select * from dept, emp

-- equi join : ���� ����� �Ǵ� �� ���̺��� ���������� �����ϴ� �÷��� ���� ��ġ�ϴ� ���� �����Ͽ� ����� ����
select * from dept, emp where emp.deptno = dept.deptnp;

-- �� ����� �̸�, �μ���ȣ, �μ���, ���� ���
select emp.ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno;

-- ���蹮�� Douglas Grant�� �ٹ��ϴ� �μ���� ��޺μ��� �̸��� ���

-- �̸��� scott�� ����� �̸�, �μ���ȣ, �μ���, ��ġ ���
select ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno and emp.ename='SCOTT';
