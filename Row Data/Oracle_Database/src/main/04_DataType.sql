select * from tab;
select * from tabs;

desc dept
desc memberlist
desc rentlist

select subject, makeyear from booklist;

select empno || '-' || ename as emp_info from emp;

select empno as eno, ename as ena from emp;

select * from rentlist;
select subject, makeyear from booklist;
select subject as booksubject, makeyear as publishyear from booklist;

insert into rentlist values('2021/12/15', rent_seqa.nextVal, 7, 9, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 8, 10, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 7, 10, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 7, 9, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 8, 9, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 7, 1, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 8, 2, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 7, 1, 100)
insert into rentlist values('2021/12/15', rent_seqa.nextVal, 8, 2, 100)

-- �԰����� 20000�� �̻��� book ���
select * from booklist;
select subject from booklist where inprice > 15000;
-- �̸��� ȫ���� �����ϴ� ȸ���� ��� ȸ������
select subject from booklist where 
-- 1983�⵵ ���ķ� �¾ ȸ���� ��� ȸ������

-- ��������Ʈ�� 250�� �̻��̰� 1982�� ���ķ� �¾ ȸ���� ��� ȸ������(and, or)

