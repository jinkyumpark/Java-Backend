create table member(
	id number(10) primary key,
	pwd varchar2(15) not null,
	indate date default sysdate,
	name varchar2(15) not null,
	deptno number(3) default 10
)

select * from rentlist;

select sum(discount) from rentlist group by rentdate having sum(discount) >= 100;