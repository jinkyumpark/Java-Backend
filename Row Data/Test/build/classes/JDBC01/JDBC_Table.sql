create table customer(
	num number(3),
	name varchar2(10),
	email varchar2(20),
	tel varchar2(15)
);


insert into customer values(1, '������', 'jinpark1025@gmail.co', '010-4539-8503');
insert into customer values(2, '�տ���', 'jinpark1026@gmail.co', '010-4531-8503');
insert into customer values(3, '�շγ�', 'jinpark1027@gmail.co', '010-4532-8503');
insert into customer values(4, '����Ű', 'jinpark1028@gmail.co', '010-4533-8503');
insert into customer values(5, '��°��', 'jinpark1029@gmail.co', '010-4534-8503');

select * from customer;

create sequence num_seq start with 7 increment by 1;

select * from booklist;

select data_type from INFORMATION_SCHEMA.COLUMNS where table_name = 'booklist';
