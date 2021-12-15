alter table booklist rename column subject to title;
alter table booklist rename column title to subject;
alter table memberlist rename column membername to name;
alter table rentlist rename column rent_date to rentdate;
alter table rentlist rename column idx to numseq;
alter table rentlist rename column numseq to num;
alter table booklist rename column booknum to num;
alter table memberlist rename column membernum to num;

select * from booklist;
select * from rentlist;

alter table memberlist modify name varchar2(50);

alter table booklist modify num varchar2(5);

alter table booklist add grade varchar2(15);

alter table memberlist add gender varchar2(3);

alter table memberlist add age number(2);



alter table memberlist drop column gender;

alter table booklist drop column grade;

alter table memberlist drop column age;

alter table booklist add grade varchar2(15);
alter table memberlist add gender varchar2(3);
alter table memberlist add age number(2);


alter table rentlist drop constraint fk1;
alter table rentlist drop constraint fk2;
alter table rentlist drop constraint rent_pk;


alter table booklist modify num varchar2(5);
alter table memberlist modify num varchar2(5);
alter table rentlist modify booknum varchar2(5);
alter table rentlist modify membernum varchar2(5);

alter table booklist modify num number(5);
alter table memberlist modify num number(5);
alter table rentlist modify booknum number(5);
alter table rentlist modify membernum number(5);


alter table memberlist add constraint check_gender  check( gender in('F', 'M') );
alter table memberlist add constraint check_age check( age<100 );


alter table rentlist add constraint fk1 
foreign key(booknum) references booklist(num);

alter table rentlist add constraint fk2 
foreign key(membernum) references memberlist(num);

alter table rentlist add constraint rent_pk
primary key( num );


create table orders1(
	order_id  number(12,0),  
	order_date date,
	order_mode varchar2(8),  
	customer_id number(6,0),
	order_status number(2,0),
	order_total number(8,2) default 0, 
	sale_rep_id number(6,0),
	promotion_id number(6,0),
	constraint pk_order primary key(order_id),
	constraint ck_order_mode check (order_mode in('direct', 'online'))
);



alter table orders1 rename column customer_id to customer_number;

alter table orders1 add constraint pro_check 
check( promotion_id between 10000 and 99999);

CREATE TABLE orders2 AS SELECT * FROM orders1;

DROP TABLE orders2 purge; 










