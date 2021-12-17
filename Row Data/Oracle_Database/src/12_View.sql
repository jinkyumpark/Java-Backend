-- 오라클 뷰
	-- 물리적인 테이블에 근거한 논리 가상 테이블
	-- 가상 = 실질적으로 데이터 저장하지 않음
	-- 테이블 = 사용 계정자는 마치 테이블을 사용하는 것과 동일하게 뷰를 사용할 수 있음

	-- 뷰는 기본테이블에서 파생된 객체, 기본테이블에 대한 쿼리문
	-- 실제 테이블에 저장된 데이터를 뷰를 통해서 볼 수 있음

	-- 사용자에게 주어진 뷰를 통해 기본 테이블 제한적으로 사용
	-- 이미 존재하고 있는 테이블에 제한적으로 접근
	-- 뷰 생성 위해서는 실질적으로 데이터를 저장하고 있는 물리적인 테이블이 존재해야 함 = 기본테이블

-- 뷰 생성 방법
-- create or replace view 뷰이름 as select 조회명령
-- 결과는 select의 결과를 테이블로 내어 놓는 가상테이블 제작 명령이 새이기는 셈
-- 뷰이름으로 조회명령을 저장하고 있다가 뷰이름으로 조회 할 때 마다 조회 명령이 실행되어 결과를 내 놓음

create or replace view result_inner_join as
select a.empno, a.ename, a.job, a.hiredate, a.deptno, b.dname, b.loc
from emp a, dept b where a.deptno = b.deptno;

select * from result_inner_join;
