create table member(
	id varchar(20) not null,
	pwd varchar(20) not null,
	name varchar(20) not null,
	email varchar(20) not null,
	zip_num varchar(10) not null,
	address varchar(100) not null,
	phone varchar(20) not null,
	useyn char(1) default 'y',
	indate datetime default now(),
	constraint pd_id primary key(id)
);

drop table member;

create table product(
	pseq number(5) not null,
	product_seq int auto_increment,
	name varchar(100) not null,
	kind char(1) not null,
	price1 number(7),
	price2 number(7),
	price3 number(7),
	content varchar(1000),
	image varchar(50),
	useyn char(1) default 'y',
	bestyn char(1) default 'n',
	indate date default now,
	constraint pk_pseq primary key(pseq)
	
);


create table worker(
	id varchar(20) not null,
	pwd varchar(20) not null,
	name varchar(20) not null,
	phone varchar(20) not null,
	constraint pd_id primary key(id),
);

select count(*) from address;