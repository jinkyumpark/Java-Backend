select * from booklist;
select * from memberlist;

-- 이름이 홍으로 시작하는 회원정보
select * from memberlist where name like 'R%';
-- 1983년도 이후로 태어난 회원의 회원정보
select * from memberlist where birth > '1982/12/31';
-- 사은포인트가 250점 이상이고 1982년 이후로 태어난 회원의 회원정도
select * from memberlist where bpoint >= 250 and birth >= '1982/01/01';

-- 제작년도가 2016년 이전이거나 입고가격이 18000 이하인 book 정보
select * from booklist where makeyear < 2016 or inprice <= 18000;
-- 성명이 이로 시작하는 회원의 정보
select * from memberlist where name like '이%';
-- 이름이 용으로 끝나는 회원의 정보
select * from memberlist where name like '%용';
-- 도서 제목에 이가 포함되는 도서 정보
select * from booklist where subject like '%이%';
-- memberlist에서 성별이 null이 아닌 회원의 이름과 전화번호
select name, phone from memberlist where gender is null;
-- 성별이 널일 것은 모두 M으로 수정
update memberlist set gender = 'M' where gender = null;
-- booklist에서 도서 제목에 두 번째 글자가 것인 도서 정보
select * from booklist where name like '_것%';