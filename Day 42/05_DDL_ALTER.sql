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

