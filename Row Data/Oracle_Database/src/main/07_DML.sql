-- DML(Data Management Language)

-- ���̺� ���ڵ� ����(�߰�, ����, ����, ��ȸ)
-- INSERT
-- UPDATE
-- DELETE
-- SELECT

create table exam01(
	deptno number(2),
	dname varchar2(14),
	loc varchar2(14)
);

select * from exam01;

insert into exam01(deptno, dname, loc) values(10, 'Account', 'NY');
insert into exam01 values(30, 'sales', 'Chicago')

insert into exam01(deptno, dname) values(20, 'Marketing');
insert into exam01 values(40, 'operation', null);

select * from booklist;

insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, 'Trend Korea 2022', 2021, 16200, 0, 'all');

insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, 'Trend Korea 2022', 2021, 16200, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '������', 2021, 13500, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '������ ������', 2021, 12600, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '����', 2021, 16650, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '2�� �ȿ� ������ �� ���� �ε��� ���� ��ũ��', 2021, 15750, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '�׳� ���� ����', 2021, 15300, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '������ ��Ʈ������', 2021, 16200, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, '�������� ȭ��', 2021, 14400, 0, 'all');
insert into booklist(num, subject, makeyear, inprice, rentprice, grade) values(book_seq.nextVal, 'NFT ��뼳��', 2021, 16200, 0, 'all');

delete from memberlist;

select * from memberlist;

insert into memberlist(num, name, phone, birth, bpoint, joindate, gender, age)
	values(member_seq.nextVal, 'Jin', '010-4539-8503', '99/10/25', null, '99/10/25', 'M', 22);
insert into memberlist(num, name, phone, birth, bpoint, joindate, gender, age)
	values(member_seq.nextVal, 'Yerim', '010-2407-8503', '99/05/02', null, '99/05/02', 'F', 22);
insert into memberlist(num, name, phone, birth, bpoint, joindate, gender, age)
	values(member_seq.nextVal, 'Rona', '010-6767-8503', '16/10/25', null, '16/10/25', 'F', 5);

select * from rentlist;
	
insert into rentlist values('2021/12/01', rent_seq.nextVal, 15, 15, 100);

insert into rentlist values('2021/12/01', rent_seq.nextVal, 3, 1, 100);