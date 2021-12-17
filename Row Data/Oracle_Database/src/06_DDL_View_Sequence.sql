create sequence member_seq start with 1 increment by 1;

insert into memberlist( num, name, phone ) 
values( member_seq.nextVal  , 'Jin', '010-3333-4444');

insert into memberlist( num, name, phone ) 
values( member_seq.nextVal  , 'Yerim', '010-5555-6666');

insert into memberlist( num, name, phone ) 
values( member_seq.nextVal  , 'Rona', '010-7777-8888');

select * from memberlist;

select sequence member_seq maxvalue 14;

select member_seq.currval, member_seq.nextVal from dual;

drop sequence member_seq;

create sequence book_seq start with 15 increment by 1;
create sequence rent_seq start with 1 increment by 1;

alter sequence member_seq;
create sequence member_seq start with 4 increment by 1;

select * from booklist;
select * from rentlist;