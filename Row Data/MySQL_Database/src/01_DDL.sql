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

-- ��������
-- �Ʒ��� �ʵ���� ���� memberlist ���̺� ����
-- �ʵ�� : num(int, �ڵ�����, �⺻Ű), name(varchar(30), not null), birth(date, not null), bpoint(int), joindate(date, default now()),
-- age(int), gender(varchar(3))
-- ���̺� �ڸ�Ʈ : ȸ�� ���

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
COMMENT = 'ȸ�� ���';

ALTER TABLE `scott`.`memberlist`
ADD COLUMN `phone` VARCHAR(45) NOT NULL;

-- �������� 2
-- ���̺��̸� : rentlist
-- �ʵ� : rentdate(datetime, default, now()), numseq(int, AI)
-- booknum(int), membernum(int), discount(int)

-- ���̺� comment : ���� ���
-- �⺻ ���� set : utf-8mb4
-- ��ũ ��ġ���� ���̺� �����ϴ� ����� �����ؼ� ��Ŭ������ �ٿ��ְ� �����ϼ���

CREATE TABLE `scott`.`rentlist` (
  `rentdate` DATETIME NOT NULL DEFAULT now(),
  `numseq` INT NULL AUTO_INCREMENT,
  `booknum` INT NULL,
  `membernum` INT NULL,
  `discount` INT NULL,
  PRIMARY KEY (`rentdate`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '���� ���';

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


