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

