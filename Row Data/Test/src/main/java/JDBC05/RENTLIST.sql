SELECT 	a.rentdate, a.num AS "rentnum", 
		c.num AS "membernum", c.name AS "membername", 
		b.rentprice, c.name, b.rentprice - a.discount,
		b.num, b.subject 
from rentlist a, booklist b, memberlist c
WHERE a.booknum = b.num AND a.membernum = c.num;

create or replace view rentdetail as 
select to_char(a.rentdate, 'YYYY-MM-DD') as rentdate,
a.num == 