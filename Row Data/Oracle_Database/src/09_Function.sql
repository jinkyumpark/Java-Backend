-- Oracle DB Function

-- dual : 테이블이 대산이 아닌 연산을 하려고 할 떄 from 다음에 형식적으로 붙이는 실제로는 없는 테이블 이름
select * from tab;
select * from dual;

-- 2 임시 데이터 출력
select 1234*1234 from dual;

-- 3 lower() 모든 문자를 소문자로
select lower('Hong Kil Dong') as "lower" from dual
-- 4 upper() 모든 문자를 대문자로
select upper('Hong Kil Dong') as "upper" from dual;
-- 5 initcap() 첫 문자만 대문자
select initcap('hong kil dong') as "initcap" from dual;


select upper(name) from emp;
select lower(job) from emp;
select ename, lower('Hong Kil Dong') as "lower" from emp;

-- 6 concat() : 문자열 연결
select concat('이젠 IT', '아카데미') from dual;
select '이젠 IT' || '아카데미' as stringconcat from dual;

-- 7 length() : 문자열의 길이
select length('이젠 아이티 아카데미'), length('The ezen IT') from dual;
select ename, length(ename) from emp;

-- 8 substr() : 문자열 추출(데이터, 인덱스, 카운트)
select substr('홍길동 만세', 2 4) from dual;

-- 9 instr() : 문자열 시작 위치
select instr('홍길동 만세 동그라미', '동') from dual;

-- 10 lpad(), rpad() : 자리 채우기
select lpad('Oracle', 20, '#') from dual;
select rpad('Oracle', 20, '*') from dual;

-- 11 trim() : 컬럼이나 대상 문자열에서 특정 문자가 첫 번째 글자이거나 마지막 글자이면 잘라내고 남은 문자열 반환
select trim('a' from 'aaaOracleaaaaaaaa') as result from dual;
select trim('' from '    Oracle      ') as result from dual;

-- 수치 처리 관련 함수
-- 12 round() : 반올림
select round(12.3456, 3) from dual;

-- 0 소수점 자리수 없앰
-- -1 1의 자리 반올림 
-- 2 10의 자리 반올림
select round(1728.9382, 3) from dual;
select round(1728.9382, 2) from dual;
select round(1728.9382, 1) from dual;
select round(1728.9382, 0) from dual;
select round(1728.9382, -1) from dual;
select round(1728.9382, -2) from dual;
select round(1728.9382, -3) from dual;

-- 13 abs() : 절대값
select abs(-10) from dual;
-- 14 floor() : 소수점 아래 절사(반올림 없음)
select floor(12.94567)
-- 15 trunc() : 특정 자리 자르기(반올림 없음), n자리까지 유지
select trunc(12.34567, 3)
-- 16 mod() : 나머지
select mod(8, 5) from dual;

-- 17 sysdate : 날짜
select sysdate from dual;

-- 18 months_between() : 개월 수 구하기
select floor(months_between('2021-12-31', '2020-07-10')) from dual;

-- 19 add_months() : 개월 수 더하기
select add_months(sysdate, 200) from dual;

-- 20 next_day() : 다가올 요일에 해당하는 날짜 - 오늘 날짜(sysdate)에서 가장 가까운 일요일
select next_day(sysdate, '일요일') from dual;

-- 21 last_day() : 해당 월의 마지막 일수
select last_day(sysdate) from dual;
select last_day('2020-02-15') from dual;

-- 22 to_char() : 날짜형식을 문자열로 반환
select to_char(sysdate, 'yyyy-mm-dd') from dual;
-- 23 to_date() : 문자형식을 날짜형(date)으로 변환
select to_date('2019/12/31', yyyy/mm/dd) from dual;

-- 24 nvl() : null인 데이터를 다른 데이터로 변경
select comm/100 as comm_pct from emp;
-- comm 필드값에 따라서 일부 레코드는 계산 결과가 null일 수 있음
select nvl(comm, 1)/100 as comm_pct from emp;
-- 해당 필드 값이 null이면 1로 바꿔 계산에 참여

-- power() : 첫 번째 두 번째 만큼 거듭제곱
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
) as "부서명" from emp;

select * from tab;

-- 26 case : if else if 와 비슷한 구조

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
	end as "부서명"
from employees;

-- 10.5를 4.2로 나눈 나머지 : 10.5 - (4.2 * 2) = 2.1

-- 문자함수 replace
select replace('나는 너를 모르는데 너는 나를 알겠는가?', '나', '너') from dual;
select replace('ABC DEF', ' ', '') from dual;

-- 변환 함수
select to_char(123456789, '999,999,999') from dual;
select to_char(sysdate, 'YYYY-MM-DD') from dual;
select to_number('123456') from dual;
select to_date('20140101', 'YYYY-MM-DD') from dual;
select to_date('20140101 13:44:50', 'YYYY-MM-DD HH24:MI:SS') from dual;
select to_char(sysdate, 'am') from dual;
select to_char(sysdate, 'YY"년:') from dual;
select to_char(sysdate, 'Y"년"') from dual;
select to_char(sysdate, 'MONTH') from dual;
select to_char(sysdate, 'MON') from dual;

-- D 요일 1~7로 표시
select to_char(sysdate, 'D') from dual;
select to_char(sysdate, 'day') from dual;
-- DD 일자를 01~31로 표시 
select to_char(sysdate, 'DD') from dual;
-- DDD 일자를 001~365 형태로 표시
select to_char(sysdate, 'DDD') from dual;
-- DL 오늘 날짜를 요일까지 표시
select to_char(sysdate, 'DL') from dual;
-- WW
-- HH, HH12
-- HH24
-- MI
select to_char(sysdate, 'MI"분"') from dual;
-- SS : 초를 01~59 형태로 표시
select to_char(sysdate, 'HH24"시 "MI"분 SS"초"') from dual;


