select * from booklist;
select * from memberlist;

-- �̸��� ȫ���� �����ϴ� ȸ������
select * from memberlist where name like 'R%';
-- 1983�⵵ ���ķ� �¾ ȸ���� ȸ������
select * from memberlist where birth > '1982/12/31';
-- ��������Ʈ�� 250�� �̻��̰� 1982�� ���ķ� �¾ ȸ���� ȸ������
select * from memberlist where bpoint >= 250 and birth >= '1982/01/01';

-- ���۳⵵�� 2016�� �����̰ų� �԰����� 18000 ������ book ����
select * from booklist where makeyear < 2016 or inprice <= 18000;
-- ������ �̷� �����ϴ� ȸ���� ����
select * from memberlist where name like '��%';
-- �̸��� ������ ������ ȸ���� ����
select * from memberlist where name like '%��';
-- ���� ���� �̰� ���ԵǴ� ���� ����
select * from booklist where subject like '%��%';
-- memberlist���� ������ null�� �ƴ� ȸ���� �̸��� ��ȭ��ȣ
select name, phone from memberlist where gender is null;
-- ������ ���� ���� ��� M���� ����
update memberlist set gender = 'M' where gender = null;
-- booklist���� ���� ���� �� ��° ���ڰ� ���� ���� ����
select * from booklist where name like '_��%';

select * from emp where deptno = 10 or deptno = 20 or deptno = 30;

select * from emp where deptno = any(10, 20, 30);

select * from emp where deptno = some(10, 20, 30);
select * from emp where deptno in(10, 20, 30);

select * from emp where deptno = ALL(10, 20 , 40);

select * from emp where deptno <> ALL(10, 20, 40);
select * from emp where deptno <> 10 and deptno <> 20 and deptno <> 40;

select * from emp where deptno not in(10, 20, 40);

select * from emp where sal >= 1000 order by ename;

-- sal�� 1000 �̻��� �����͸� ename�� �������� ����
select * from emp where sal > 1000 order by ename;
-- sal�� 1000 �̻��� �����͸� ename�� ������������ ����
select * from emp where sal > 1000 order by ename desc;
-- job���� �������� ����
select * from emp order by job desc;
-- job���� �������� ���� �� ���� job_id ���̿����� ������ hireedate�� ������������ ����
select * from emp order by job desc, hiredate desc;

select * from emp where not (emptno = 10);
select * from emp where deptno <> 10;

select * from emp where sal >= 100 and sal <= 3000;
select * from emp where sal between 1000 and 3000;


