drop table member cascade constraints;

create table member(
	name varchar2(10),
	userid varchar2(10),
	pwd varchar2(10),
	email varchar2(20),
	phone varchar2(15),
	admin number(1) default 0,  -- 0:�Ϲݻ���� , 1:������
	primary key(userid)
);

insert into member values('�̼ҹ�', 'somi', '1234', 'gmd@anver.com', '010-1234-1234', 0);
insert into member values('�ϻ��', 'sang12', '1234', 'h12@naver.com', '010-5555-6666', 0);
insert into member values('������', 'light', '1234', 'yoon1@daum.net', '010-9999-1111', 0);

select * from member;


update member set admin=1 where userid='somi';




