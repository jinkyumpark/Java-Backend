-- Oracle DB Function

-- dual : ���̺��� ����� �ƴ� ������ �Ϸ��� �� �� from ������ ���������� ���̴� �����δ� ���� ���̺� �̸�
select * from tab;
select * from dual;

-- 2 �ӽ� ������ ���
select 1234*1234 from dual;

-- 3 lower() ��� ���ڸ� �ҹ��ڷ�
select lower('Hong Kil Dong') as "lower" from dual
-- 4 upper() ��� ���ڸ� �빮�ڷ�
select upper('Hong Kil Dong') as "upper" from dual;
-- 5 initcap() ù ���ڸ� �빮��
select initcap('hong kil dong') as "initcap" from dual;


select upper(name) from emp;
select lower(job) from emp;
select ename, lower('Hong Kil Dong') as "lower" from emp;

-- 6 concat() : ���ڿ� ����
select concat('���� IT', '��ī����') from dual;
select '���� IT' || '��ī����' as stringconcat from dual;

-- 7 length() : ���ڿ��� ����
select length('���� ����Ƽ ��ī����'), length('The ezen IT') from dual;
select ename, length(ename) from emp;

-- 8 substr() : ���ڿ� ����(������, �ε���, ī��Ʈ)
select substr('ȫ�浿 ����', 2 4) from dual;

-- 9 instr() : ���ڿ� ���� ��ġ
select instr('ȫ�浿 ���� ���׶��', '��') from dual;

-- 10 lpad(), rpad() : �ڸ� ä���
select lpad('Oracle', 20, '#') from dual;
select rpad('Oracle', 20, '*') from dual;

-- 11 trim() : �÷��̳� ��� ���ڿ����� Ư�� ���ڰ� ù ��° �����̰ų� ������ �����̸� �߶󳻰� ���� ���ڿ� ��ȯ
select trim('a' from 'aaaOracleaaaaaaaa') as result from dual;
select trim('' from '    Oracle      ') as result from dual;

-- ��ġ ó�� ���� �Լ�
-- 12 round() : �ݿø�
select round(12.3456, 3) from dual;

-- 0 �Ҽ��� �ڸ��� ����
-- -1 1�� �ڸ� �ݿø� 
-- 2 10�� �ڸ� �ݿø�
select round(1728.9382, 3) from dual;
select round(1728.9382, 2) from dual;
select round(1728.9382, 1) from dual;
select round(1728.9382, 0) from dual;
select round(1728.9382, -1) from dual;
select round(1728.9382, -2) from dual;
select round(1728.9382, -3) from dual;

-- 13 abs() : ���밪
select abs(-10) from dual;
-- 14 floor() : �Ҽ��� �Ʒ� ����(�ݿø� ����)
select floor(12.94567)
-- 15 trunc() : Ư�� �ڸ� �ڸ���(�ݿø� ����), n�ڸ����� ����
select trunc(12.34567, 3)
-- 16 mod() : ������
select mod(8, 5) from dual;

-- 17 sysdate : ��¥
select sysdate from dual;

-- 18 months_between() : ���� �� ���ϱ�
select floor(months_between('2021-12-31', '2020-07-10')) from dual;

-- 19 add_months() : ���� �� ���ϱ�
select add_months(sysdate, 200) from dual;

-- 20 next_day() : �ٰ��� ���Ͽ� �ش��ϴ� ��¥ - ���� ��¥(sysdate)���� ���� ����� �Ͽ���
select next_day(sysdate, '�Ͽ���') from dual;

-- 21 last_day() : �ش� ���� ������ �ϼ�
select last_day(sysdate) from dual;
select last_day('2020-02-15') from dual;

-- 22 to_char() : ��¥������ ���ڿ��� ��ȯ
select to_char(sysdate, 'yyyy-mm-dd') from dual;
-- 23 to_date() : ���������� ��¥��(date)���� ��ȯ
select to_date('2019/12/31', yyyy/mm/dd) from dual;

-- 24 nvl() : null�� �����͸� �ٸ� �����ͷ� ����
select comm/100 as comm_pct from emp;
-- comm �ʵ尪�� ���� �Ϻ� ���ڵ�� ��� ����� null�� �� ����
select nvl(comm, 1)/100 as comm_pct from emp;
-- �ش� �ʵ� ���� null�̸� 1�� �ٲ� ��꿡 ����

-- power() : ù ��° �� ��° ��ŭ �ŵ�����
select power(3, 2), power(3, 3), power(3, 3.0001) from dual;


-- sqrt()
select sqrt(2), sqrt(5) from dual;

-- 25 decode() : JAVA Switch
select empno, ename, deptno, decode(deptno,
	10, 'ACCOUNT',
	20, 'RESEARCH',
	30, 'SALES',
	40, 'OPERATIONS',
	50, 'SH_CLECK',
	60, 'IT_PROG',
	70, 'PR_REP',
	80, 'SA_REP',
	90, 'AD_PRES',
	100, 'FI_ACCOUNT',
	110, 'AC_ACCOUNT'
) as "�μ���" from emp;

select * from tab;

-- 26 case : if else if �� ����� ����

select * from employees;

select employee_id, emp_name, department_id,
	case when department_id = 10 then 'ACCOUNT'
		when department_id = 20 then 'RESEARCH'
		when department_id = 30 then 'SALES'
		when department_id = 40 then 'OPERATIONS'
		when department_id = 50 then 'SH_CLECK'
		when department_id = 60 then 'IT_PROG'
		when department_id = 70 then 'PR_REP'
		when department_id = 80 then 'SA_REP'
		when department_id = 90 then 'AD_PRES'
		when department_id = 100 then 'FI_ACCOUNT'
		when department_id = 110 then 'AC_ACCOUNT'
	end as "�μ���"
from employees;

-- 10.5�� 4.2�� ���� ������ : 10.5 - (4.2 * 2) = 2.1

-- �����Լ� replace
select replace('���� �ʸ� �𸣴µ� �ʴ� ���� �˰ڴ°�?', '��', '��') from dual;
select replace('ABC DEF', ' ', '') from dual;

-- ��ȯ �Լ�
select to_char(123456789, '999,999,999') from dual;
select to_char(sysdate, 'YYYY-MM-DD') from dual;
select to_number('123456') from dual;
select to_date('20140101', 'YYYY-MM-DD') from dual;
select to_date('20140101 13:44:50', 'YYYY-MM-DD HH24:MI:SS') from dual;
select to_char(sysdate, 'am') from dual;
select to_char(sysdate, 'YY"��:') from dual;
select to_char(sysdate, 'Y"��"') from dual;
select to_char(sysdate, 'MONTH') from dual;
select to_char(sysdate, 'MON') from dual;

-- D ���� 1~7�� ǥ��
select to_char(sysdate, 'D') from dual;
select to_char(sysdate, 'day') from dual;
-- DD ���ڸ� 01~31�� ǥ�� 
select to_char(sysdate, 'DD') from dual;
-- DDD ���ڸ� 001~365 ���·� ǥ��
select to_char(sysdate, 'DDD') from dual;
-- DL ���� ��¥�� ���ϱ��� ǥ��
select to_char(sysdate, 'DL') from dual;
-- WW
-- HH, HH12
-- HH24
-- MI
select to_char(sysdate, 'MI"��"') from dual;
-- SS : �ʸ� 01~59 ���·� ǥ��
select to_char(sysdate, 'HH24"�� "MI"�� SS"��"') from dual;


