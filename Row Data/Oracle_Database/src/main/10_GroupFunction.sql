-- Group Function : 지정된 필드의 값 전체를 대상으로 한 번 계산하는 함수

-- sum() : 특정 필드의 합계
select sum(rentprice) as "대여가격 합계" from booklist;
select sum(rentprice) as "대여가격 합계" from booklist where inrpice >= 18000;

-- count(*) : 필드내의 데이터 갯수(레코드 갯수)
select count(*) as "회원인원수" from memberlist;
select count(*) as "회원인원수" from memberlist where bpoint >= 150;

-- avg : 평균
select round(avg(inprice), 0) from booklist;

-- max : 최대값
select max(inprice) from booklist;

-- min : 최소값
select min(inprice) from booklist;

-- variance, stddev
select variance(salary), stddev(salary) from employees;

-- group by : 하나의 필드를 지목해서 같은 값끼리 그룹을 형성한 결과를 도출
-- 전체 대여건수
select count(*) from rentlist;

-- 각 도서별 대여건수 : 한 번도 대여 안 된 도서 제외
select booknum, count(*) from rentlist group by booknum;

-- rentlist 날짜별 할인금액 평균
select rentdate, round(avg(discount), 0) from rentlist
group by rentdate order by rentdate desc;

-- rentlist 날짜별 대여 건수
select rentdate, count(*) from rentlist
group by rentdate order by rentdate desc;

-- employees 테이블의 부서id별 급여의 평균
select * from employees;
select DEPARTMENT_ID, avg(SALARY) from employees
group by DEPARTMENT_ID order by DEPARTMENT_ID;
-- kor_loan_status 테이블의 period(년도와 월)을 그룹으로 대출 잔액(loan_jan_amt)의 합계
select * from kor_loan_status;
select period, sum(loan_jan_amt) from kor_loan_status
group by period order by period;

-- HAVIHG 절 : 그룹핑된 내용들에 조건을 붙일때
-- 날짜별 할인금액의 평균을 출력, 다만 그 평균 금액이 100 미만인 그룹만 출력
select rentdate as 날짜, avg(discount) as 할인평균 from rentlist
group by rentdate
having avg(discounbt) < 180;

-- group by 절에는 select와 from 사이에 쓰여진 함수를 제외한 모든 필드를 반드시 써 줘야 함

