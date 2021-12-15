select * from booklist;
select * from memberlist;

-- �̸��� ȫ���� �����ϴ� ȸ������
select * from memberlist where name like 'R%';
-- 1983�⵵ ���ķ� �¾ ȸ���� ȸ������
select * from memberlist where birth > '1982/12/31';
-- ��������Ʈ�� 250�� �̻��̰� 1982�� ���ķ� �¾ ȸ���� ȸ������
select * from memberlist where bpoint >= 250 and birth >= '1982/01/01';

-- ���۳⵵�� 2016�� �����̰ų� �԰����� 18000 ������ book ����
select * from booklist where makeyear < 2016 or inprice <= 18000;
-- ������ �̷� �����ϴ� ȸ���� ����
select * from memberlist where name like '��%';
-- �̸��� ������ ������ ȸ���� ����
select * from memberlist where name like '%��';
-- ���� ���� �̰� ���ԵǴ� ���� ����
select * from booklist where subject like '%��%';
-- memberlist���� ������ null�� �ƴ� ȸ���� �̸��� ��ȭ��ȣ
select name, phone from memberlist where gender is null;
-- ������ ���� ���� ��� M���� ����
update memberlist set gender = 'M' where gender = null;
-- booklist���� ���� ���� �� ��° ���ڰ� ���� ���� ����
select * from booklist where name like '_��%';