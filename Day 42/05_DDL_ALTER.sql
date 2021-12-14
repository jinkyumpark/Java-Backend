ALTER TABLE booklist rename column subject to title;

ALTER TABLE booklist rename column title to subject;

ALTER TABLE memberlist rename column membername to name;

ALTER TABLE rentlist rename column rent_date to rentdate;

ALTER TABLE rentlist rename column numseq to num;

select * from booklist;
select * from rentlist;

alter talbe memberlist drop column gender;

alter table booklist drop column grade;

alter table memberlist drop column age;

alter table booklist add grade varchar2(15);
alter table memberlist add gender varchar2(3);
alter table memberlist add age number(2);

alter table rentlist drop constraint fk1;
alter table rentlist drop constraint fk2;
alter table rentlist drop constraint rent_pk;

alter table booklist modify num number(5);
alter table memberlist modify num number(5);
alter table rentlist modify booknum number(5);
alter table rentlist modify membernum number(5);

alter table memberlist add constraint check_gender check(gender in ('F', 'M'));

alter table memberlist add constraint check_age check(age <= 120);

alter table rentlist add constraint fk1
foregin key(booknum) references booklist(num);

alter table rentlist add constraint fk2
foreign  key(membernum) references memberlist(num);

alter table rentlist add constraint rent_pk
primary key(num);

-- 테이블 생성 연습문제

create table ORDERS1(
    ORDER_ID number(12, 0),
    ORDER_DATE date,
    ORDER_MODE varchar2(8),
    CUSTOMER_ID number(6, 0),
    ORDER_STATUS number(2, 0),
    ORDER_TOTAL number(8, 2) default 0,
    SALES_REP_ID number(6, 0),
    PROMOTION_ID number(6, 0),
    constraint pk_order primary key(order_id),
    constraint ck_order_mode check(order_mode in('direct', 'online'))
);

-- 테이블 수정 EX
-- customer_id 필드명을 customer_number로 수정
alter table order1 rename column customer_id to customer_number

alter table orders1 add constraint pro_check
check(promotion_id between 10000 and 99999);

-- table copy
create table orders2 as select * from orders1;

-- remove table
drop table orders2 purge
-- you can delete it without purse, but it can be reversable
