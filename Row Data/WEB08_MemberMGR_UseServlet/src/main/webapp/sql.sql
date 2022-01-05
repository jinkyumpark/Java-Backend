create database membermgr;

create table member(
	name char(10),
	userid char(10),
	pwd char(10),
	email char(20),
	phone char(15),
	admin int(1) default 0,
	constraint pk_member primary key(userid)
);

insert into member values('이소미','somi', '1234', 'gmd@naver.com', '010-1234-1234', 0);
insert into member values('하상오','sang12', '1234', 'h12@naver.com', '010-5555-6666', 0);
insert into member values('김윤승','light', '1234', 'yoon1@daum.com', '010-9999-1111', 0);

UPDATE MEMBER SET admin = 1 WHERE userid='somi';

select * from member;

