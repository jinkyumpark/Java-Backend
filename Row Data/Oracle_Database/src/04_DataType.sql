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

-- 입고가격이 20000원 이상인 book 목록
select * from booklist;
select subject from booklist where inprice > 15000;
-- 이름이 홍으로 시작하는 회원의 모든 회원정도
select subject from booklist where 
-- 1983년도 이후로 태어난 회원의 모든 회원정보

-- 사은포인트가 250점 이상이고 1982년 이후로 태어난 회원의 모든 회원정보(and, or)

