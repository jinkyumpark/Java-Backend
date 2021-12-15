CREATE TABLE booklist(
	booknum number(5) not null,
	subject varchar2(30) not null,
	makeyear number(4) default 2021,
	inprice number(6) default 0,
	rentprice number(6) default 0,
	
	constraint booknum_pk primary key(booknum)
)

create table rentlist(
	rent_date date default sysdate,
	idx number(5) not null,
	bookNum varchar2(5) not null,
	memberNum varchar2(5) not null,
	discount number(4),
	constraint rent_pk primary key(rent_date, idx),
	constraint fk1 foreign key(memberNum) references booklist(bookNum),
	constraint fk2 foreign key(memberNum) references memberlist(memberNum)
);

select * from booklist;
select * from memberlist;