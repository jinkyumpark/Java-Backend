-- Group Function : ������ �ʵ��� �� ��ü�� ������� �� �� ����ϴ� �Լ�

-- sum() : Ư�� �ʵ��� �հ�
select sum(rentprice) as "�뿩���� �հ�" from booklist;
select sum(rentprice) as "�뿩���� �հ�" from booklist where inrpice >= 18000;

-- count(*) : �ʵ峻�� ������ ����(���ڵ� ����)
select count(*) as "ȸ���ο���" from memberlist;
select count(*) as "ȸ���ο���" from memberlist where bpoint >= 150;

-- avg : ���
select round(avg(inprice), 0) from booklist;

-- max : �ִ밪
select max(inprice) from booklist;

-- min : �ּҰ�
select min(inprice) from booklist;

-- variance, stddev
select variance(salary), stddev(salary) from employees;

-- group by : �ϳ��� �ʵ带 �����ؼ� ���� ������ �׷��� ������ ����� ����
-- ��ü �뿩�Ǽ�
select count(*) from rentlist;

-- �� ������ �뿩�Ǽ� : �� ���� �뿩 �� �� ���� ����
select booknum, count(*) from rentlist group by booknum;

-- rentlist ��¥�� ���αݾ� ���
select rentdate, round(avg(discount), 0) from rentlist
group by rentdate order by rentdate desc;

-- rentlist ��¥�� �뿩 �Ǽ�
select rentdate, count(*) from rentlist
group by rentdate order by rentdate desc;

-- employees ���̺��� �μ�id�� �޿��� ���
select * from employees;
select DEPARTMENT_ID, avg(SALARY) from employees
group by DEPARTMENT_ID order by DEPARTMENT_ID;
-- kor_loan_status ���̺��� period(�⵵�� ��)�� �׷����� ���� �ܾ�(loan_jan_amt)�� �հ�
select * from kor_loan_status;
select period, sum(loan_jan_amt) from kor_loan_status
group by period order by period;

-- HAVIHG �� : �׷��ε� ����鿡 ������ ���϶�
-- ��¥�� ���αݾ��� ����� ���, �ٸ� �� ��� �ݾ��� 100 �̸��� �׷츸 ���
select rentdate as ��¥, avg(discount) as ������� from rentlist
group by rentdate
having avg(discounbt) < 180;

-- group by ������ select�� from ���̿� ������ �Լ��� ������ ��� �ʵ带 �ݵ�� �� ��� ��

