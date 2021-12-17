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
select employees.emp_name, employees.department_id, departments.department_name, employees.salary from departments, employees 
where employees.emp_name = 'Douglas Grant' and employees.department_id = departments.department_id;

-- �̸��� scott�� ����� �̸�, �μ���ȣ, �μ���, ��ġ ���
select ename, emp.deptno, dept.dname, dept.loc from dept, emp
where emp.deptno = dept.deptno and emp.ename='SCOTT';


select * from rentlist;
select * from booklist;
select * from rentlist, booklist;
select * from rentlist, booklist where rentlist.booknum = booklist.num;
select rentlist.rentdate, rentlist.num, rentlist.booknum, booklist.subject
from rentlist, booklist where rentlist.booknum = booklist.num;

-- rentlist�� membernum�� �ش��ϴ� ȸ���� �̸��� ��ȭ��ȣ�� rentlist�� rentdate, num, membernum�� �Բ� ���
select * from memberlist;

select rentlist.rentdate, rentlist.num, rentlist.membernum, memberlist.name, memberlist.phone
from rentlist, memberlist where rentlist.num = memberlist.num;

select a.ename, b.dname, b.loc, a.deptno from emp a, dept b
where a.deptno = b.deptno and e.name = 'SCOTT';

-- non-equi join
-- ���� �÷��� ��� �ٸ� ������ ����Ͽ� ����
-- ���� ���ǿ� Ư�� �������� �ִ����� �����ϱ� ���� �������� ���� ������ '=' ������ �̿��� ��

select * from emp;
select * from salgrade;

-- �� ������
select a.ename, a.sal, b.grade from emp a, salgrade b
where a.sal >= b.losal and a.sal <= b.hisal;

select a.ename, a.sal, b.grade from emp a, salgrade b
where a.sal between b.losal and b.hisal;

-- �� ���� ���̺��� �ϳ��� JOIN(equi, nonequi)
select a.ename, a.sal, c.grade, d.dname from emp a, dept b, salgrade c
where a.deptno = b.deptno and a.sal between c.losal and c.hisal;


-- ��������
-- rentlist ���̺��� rentdate, booknum, membernum �� ��ȸ�ϵ�,
-- booklist �� memberlist ���̺��� �����ؼ� �뿩����/å����/ȸ���̸�/��������Ʈ ���
-- ��Ī�� a, b, c

select * from rentlist;
select * from booklist;
select * from memberlist;

select a.rentdate, b.subject, c.name, c.bpoint
from rentlist a, booklist b, memberlist c
where a.booknum = a.membernum

-- ���ε� ���̺� �������� �ʵ带 ������ ���� ����
select a.rentdate, b.subject, c.name, c.bpoint, b.rentprice - a.discount
from rentlist a, booklist b, memberlist c
where a.booknum = b.booknum and a.membernum = c.membernum;

-- outer join
-- ���� ���ǿ� �������� ���ؼ� �ش� ����� ��½ÿ� ������ �Ǵ� �������� �߻��� �� �ش� ���ڵ带 ����ϴ� ����
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

