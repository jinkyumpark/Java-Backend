drop table booklist purge;

CREATE table booklist(
	booknum number(5) not null,
	subject varchar2(30) not null,
	makeyear number(4) default 2021,   
	inprice number(6) default 0,
	rentprice number(6) default 0 ,     
	
	constraint booknum_pk primary key( booknum )
);

select * from booklist;  

drop table memberlist purge;

create table memberlist(
	memberNum number(5) not null,
	memberName varchar2(12) not null,
	phone varchar2(13) not null,
	birth date,
	Bpoint number(6) default 0,
	joinDate date default sysdate,  
	
	constraint member_pk primary key(memberNum)
);

select * from booklist;
select * from memberlist;


create table rentlist(
	rent_date date default sysdate,
	idx number(5) not null,     
	bookNum number(5) not null,
	memberNum number(5) not null,
	discount number(4),
	constraint rent_pk primary key(rent_date, idx ) ,
	constraint fk1 foreign key( bookNum ) references booklist(bookNum),
	constraint fk2 foreign key( memberNum ) references memberlist(memberNum)
);

select * from rentlist;