CREATE TABLE `scott`.`booklist` (
  `num` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(100) NOT NULL,
  `makeyear` INT NOT NULL,
  `inprice` INT NOT NULL,
  `rentprice` INT NOT NULL,
  `grade` VARCHAR(6) NOT NULL DEFAULT 'ALL',
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = 'Book List';

SELECT * FROM scott.booklist;

-- 연습문제
-- 아래의 필드명을 담은 memberlist 테이블 생성
-- 필드명 : num(int, 자동증가, 기본키), name(varchar(30), not null), birth(date, not null), bpoint(int), joindate(date, default now()),
-- age(int), gender(varchar(3))
-- 테이블 코멘트 : 회원 목록

CREATE TABLE `scott`.`memberlist` (
  `num` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `birth` DATETIME NOT NULL,
  `bpoint` INT NOT NULL,
  `joindate` DATETIME NOT NULL DEFAULT now(),
  `age` INT NULL,
  `gender` VARCHAR(3) NULL,
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '회원 목록';

ALTER TABLE `scott`.`memberlist`
ADD COLUMN `phone` VARCHAR(45) NOT NULL;

-- 연습문제 2
-- 테이블이름 : rentlist
-- 필드 : rentdate(datetime, default, now()), numseq(int, AI)
-- booknum(int), membernum(int), discount(int)

-- 테이블 comment : 매출 목록
-- 기본 문자 set : utf-8mb4
-- 워크 벤치에서 테이블 생성하는 명령을 복사해서 이클립스에 붙여넣고 생성하세요

CREATE TABLE `scott`.`rentlist` (
  `rentdate` DATETIME NOT NULL DEFAULT now(),
  `numseq` INT NULL AUTO_INCREMENT,
  `booknum` INT NULL,
  `membernum` INT NULL,
  `discount` INT NULL,
  PRIMARY KEY (`rentdate`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '매출 목록';

ALTER TABLE `scott`.`rentlist` 
ADD INDEX `fk1_idx` (`membernum` ASC) VISIBLE,
ADD INDEX `fk2_idx` (`booknum` ASC) VISIBLE;
;
ALTER TABLE `scott`.`rentlist` 
ADD CONSTRAINT `fk1`
  FOREIGN KEY (`membernum`)
  REFERENCES `scott`.`memberlist` (`num`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `fk2`
  FOREIGN KEY (`booknum`)
  REFERENCES `scott`.`booklist` (`num`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;


