select * from member;

create table board(
	num int(5) not null auto_increment,
	pass varchar(30),
	userid varchar(30),
	email varchar(30),
	title varchar(50),
	content varchar(1000),
	readcount int(4) default 0,
	writedate datetime default now(),
	
	primary key(num)
);

drop table board;

insert into board(userid, email, pass, title, content)
values('hong', 'abc@naver.com', '1234', 'CoronaVirus', 'CoronaVirus Vacinne');

insert into board(userid, email, pass, title, content)
values('somi', 'adddnaver.com', '1234', 'CoronaVirus', 'CoronaVirus Vacinne');

insert into board(userid, email, pass, title, content)
values('light', 'bnbn@naver.com', '1234', 'CoronaVirus', 'CoronaVirus Vacinne');

insert into board (userid, email, pass, title, content)
values('hana', 'hana@daum.net', '1234', 'CoronaVirus', 'CoronaVirus Vacinne');

insert into board(userid, email, pass, title, content)
values('hana', 'hana@daum.net', '1234','CoronaVirus', 'CoronaVirus Vacinne');

select * from board;
select * from member;
