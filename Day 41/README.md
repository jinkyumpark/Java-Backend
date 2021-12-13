# Day 41 Week 9 MON 대면

## 9:30-10:20
Test
## 10:30-11:20
Test
## 11:30-12:20
Test, Plugin
## 점심시간 : 12:20-1:00 (40분)

## 13:00-13:50
Database
## 14:00-14:50

## 15:00-15:50


# Plugin
- 상업적인 목적으로 쓰면 돈을 내야 하는 경우가 있음
- .js 확장자는 바이러스가 있는 경우가 많아 첨부파일로 보내기 어려움

# Database
- DB를 사용할 수 있는 프로그램 종류는 여러가지 있음
- Oracle, MSSQL, MySQL, MariaDB, MongoDB
- Oracle(주로), MySQL 공부할 것임
- https://www.oracle.com/database/technologies/xe-prior-release-downloads.html
- Mac에서는 Docker 설치하고 설치

- Relational DB

- (--) 주석문
- 열 : field, 속성, attribute
- 행 : record, tuple

- DB Ex : Oracle, MySQL, MSSQL, MariaDB, MongoDB, Access
- DBMS - 데이터베이스 조작 운영을 가능하게 하는 프로그램
- Oracle DBMS : SQL Developer, SQL Plus, Eclipse

- DB 활용분야
    - 일반 웹사이트 게시판 게시물 저장
    - 포털 검색 사이트 검색 대산 정보 저장
    - 게임의 게임정보, 케릭터 정보
    - 회원들의 회원정보

- SQL(DB에서 쓰는 언어)
    - SQL(Structured Query Language) : RDBMS의 데이터를 관리하기 위해 설계된 특수 목적 프로그램

- SQL 3가지 종류
    - DDL(Database Definition Language)
    - DML(Database Management Language)
    - DCL(Database Control Language)

- DDL(Data Definition Language) - 데이터 정의어
    - Create, Alter, Drop
    - Create : 테이블, 뷰 등을 생성할때 사용하는 명령
    - Alter : 이미 생성되어 있는 테이블 또는 뷰 등의 구조 수정
    - Drop : 이미 생성되어 있는 테이블 또는 뷰 등을 삭제하기 위한 명령

- DML(Data Management Language) - 데이터 조작
    - Insert : 테이블에 레코드 추가
    - Update : 테이블에 있는 레코드 일부/전부 수정
    - Delete : 테이블에 있는 레코드 일부/전부 삭제
    - Select : 테이블에 있는 레코드 일부/전부 조회(검색)/열람

- DCL(Data Control Language) = 데이터 제어어
    - Grant : 특정 사용자에게 권한을 설정
    - Revoke : 특정 사용자에게 권한을 해제

- 기본키(Primary Key) : 테이블을 구성하는 필드들 중에서 갖는 값들이 빈칸이 없고 서로 다른 값(유일한 값)들을 갖고 있어 레코드들을 유일하게 구분해 낼 수 있는 필드, 테이블을 구성하는 필드들 중 자격이 되는 필드 중 하나에 부여하는 테이블의 대표 값
    - 기본키를 지정함으로써 기본키가 지정하지 않았을때 발생할 수 있는 오류들을 미연에 방지 가능
    - 기본키로 결함을 없앰, 그래서 결합없이 유지되는 것을 개체 무결성이라 함

- 외래키(Foreign Key) : 테이블 간의 필수 포함 관계에 있어 상대 테이블의 특정 필드값을 참조하면서 없는 값을 사용하지 않는 필드
    - 외래키로 유지되는 무결성을 참조무결성이라 함

## CMD Command
### sqlplus
데이터 베이스 접근, 아이디 비번 쳐야 함
### create user scott identified by tiger;
scott이라는 이름, tiger라는 pw로 유저 생성

### grant dba to scott;
권한 부여

### conn
유저에 연결

## Eclipse Setting
- Window
- show view
- data source explorer
- database connection
- new
- oracle

- add JAR(oraclexe-app-oracle-product-11.2.0-server-jdbc-lib-ojdbc6.jar)

- property(server -> localhost, db -> xe)

- enter user id/pw

