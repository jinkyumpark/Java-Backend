# Day 42 Week 9 TUE 비대면

## Create Table
- 이름 : 객체 의미할 수 있는 적절한 이름, 다른 테이블과 중복되면 안 됨, 테이블 내의 필드 이름도 중복 안 됨
- 각 필드는 , 로 구분
- SQL 명령은 ;로 끝남
- 필드명 뒤에 DATATYPE은 반드시 지정, []안에 내용은 해당 내용이 있을 때 작성하고 생략가능
- 테이블 명과 필드명은 반드시 문자, 예약어 명령어 사용 불가
- 대/소문자 구분 없음 (테이블이나 컬럼명은 대문자)
- DATE 데이터형식은 별도 크기 지정 않함
- varchart2(), number()
- 문자 데이터 유형은 반드시 가질 수 있는 최대 길이 표시
- 컬럼과 컬럼의 구분은 콤마, 작성이 모두 종료되는 마지막 컬럼 또는 제약사항의 내용 뒤에는 콤마 찍지 않음

## 제약조건
- UNIQUE KEY
- NOT NULL
- CHECK
- FOREIGN KEY

## 오라클 자료형
- 정수형 - number(n) - 자리수 표시(-99, 99)
-  실수형 - number(n1, n2) - 총 자리수 n1, 소수점 n2, 용량 초과하는 데이터 입력 시 자료 추가 오류 발생
-  가변형 문자열(최대 4000 Byte) - varchart2()
    - 입력 데이터가 실제 크기 넘어서면 크기만큼 자료형의 크기가 늘어나지는 않음, 줄어들어서 저장
- 고정형 문자열(최대 2000 Byte) - char()
    - 실제 크기와 상관없이 고정형으로 저장됨
- 고정형 유니코드 문자 - nchart()
    - 다국어를 입력하기 위한 고정형 자료형
- 가변형 유니코드 문자 - nvarchar()
    - 다국어를 입력하기 위한 가변형 자료형
- 날짜 데이터
    - DATE : BC 4712-9999년 12월 31일까지
    - TIMESTAMP : 연도 월 일 시 분 초 밀리초
    - DATE : 가장 일반적이고 많이 사용하는 날짜 데이터 타입
    - sysdate, systimestamp는 현재일자와 시간을 반환하는 오라클 내부 키워드
- LOB(Large OBject)
    - 대용량 데이터 저장 가능
    - CLOB : 문자형 대용량 객체
    - NCLOB : 유니코드를 포함한 문자형 대용량 객체
    - BLOB : 이진형 대용량 객체
    - BFILE : 대용량 이진 파일에 대한 로케이터
- 지금은 잘 사용되지 않는 자료형
    - varchar - varchar2가 용량에서 업그레이드 되어 잘 사용하지 않음
    - long - 최대 2GB 가변 길이 문자형
    - float - number 하위 타입
    - binary_float - 32비트 부동 소수점
    - binary_double - 64비트 부동 소수점

    ## 테이블 수정(ALTER
    - 필드명의 변경
        - ALTER TABLE table_name RENAME COLUMN table_name_before TO table_name_before
