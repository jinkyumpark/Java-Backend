-- DML(Data Management Language)

-- 테이블에 레코드 조작(추가, 수정, 삭제, 조회)
-- INSERT
-- UPDATE
-- DELETE
-- SELECT

create table exam01(
	deptno number(2),
	dname varchar2(14),
	loc varchar2(14)
);

select * from exam01;

insert into exam01(deptno, dname, loc) values(10, 'Account', 'NY');
insert into exam01 values(30, 'sales', 'Chicago')

insert into exam01(deptno, dname) values(20, 'Marketing');
insert into exam01 values(40, 'operation', null);

select * from booklist;

insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, 'Trend Korea 2022', 2021, 16200, 0, 'all');

insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, 'Trend Korea 2022', 2021, 16200, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '눈아이', 2021, 13500, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '불편한 편의점', 2021, 12600, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '장면들', 2021, 16650, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '2년 안에 무조건 돈 버는 부동산 투자 시크릿', 2021, 15750, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '그냥 하지 말라', 2021, 15300, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '거인의 포트폴리오', 2021, 16200, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '오은영의 화해', 2021, 14400, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, 'NFT 사용설명서', 2021, 16200, 0, 'all');

delete from memberlist;

select * from memberlist;

insert into memberlist(num, name, phone, birth, bpoint, joindate, gender, age)
	values(member_seq.nextVal, 'Jin', '010-4539-8503', '99/10/25', null, '99/10/25', 'M', 22);
insert into memberlist(num, name, phone, birth, bpoint, joindate, gender, age)
	values(member_seq.nextVal, 'Yerim', '010-2407-8503', '99/05/02', null, '99/05/02', 'F', 22);
insert into memberlist(num, name, phone, birth, bpoint, joindate, gender, age)
	values(member_seq.nextVal, 'Rona', '010-6767-8503', '16/10/25', null, '16/10/25', 'F', 5);

select * from rentlist;
	
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 15, 100);

insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 3, 100);

select * from exam01;
update exam01 set deptno = 30;
update exam01 set deptno = 10 where dname = 'Account';

update exam01 set deptno = 20 where dname = 'sales';
update exam01 set deptno = 30 where dname = 'operation';
update exam01 set loc = 'BOSTON' where deptno = 30;
update exam01 set loc = 'LA' where deptno = 40;

-- update num of certain booklist item
update booklist set num =50 where subject = '장면들';

-- emp table every item of sal 10% increse
select * from emp;
update emp set sal = sal * 1.1;
-- emp table sal more than 3000, 10% decrese
update emp set sal = sal * 0.9 where sal > 3000;
-- emp table hiredate before 2002 sal + 2000
update emp set sal = sal + 2000 where hiredate <= '2001-12-31';
-- emp table ename start with j job to manager
update emp set job = 'MANAGER' where substr(ename, 1, 1) = 'J';
update emp set job = 'MANAGER' where ename like 'J%';
-- memberlist bpoint more than 200, bpoint * 100
select * from memberlist;
update memberlist set bpoint = 300 where name = 'Rona';
update memberlist set bpoint = 100 where name = 'Jin';
update memberlist set bpoint = bpoint * 100 where bpoint > 200;
-- rentlist table discount more than 100, everyone to 90
select * from rentlist;
update rentlist set discount = 90 where discount > 100;


update booklist set rentprice = rentprice * 1.1, subject = subject || '20+' where grade = '20';

select * from booklist;

update booklist set grade = '20' where inprice > 14000;

delete from rentlist where discount >= 100;

delete from rentlist where booknum = 5;
delete from booklist where num = 5;

alter table rentlist drop constraint fk1;
alter table rentlist add constraint fk1 foreign key(num)
references booklist(booknum) on delete cascade;

select * from memberlist;
select * from rentlist;

alter table rentlist drop constraint fk2;

alter table rentlist add constraint fk2 foreign key(membernum)
references memberlist(num) on delete cascade;

-- 참조되는 값의 수정은 적용되지 않음(Oracle에서는 안 되고 MySQL에서는 됨)

