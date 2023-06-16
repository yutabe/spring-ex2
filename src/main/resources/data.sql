--/* Drop Tables */
--DROP TABLE IF EXISTS todos;
--
--/* Create Tables */
--CREATE TABLE todos
--(
--    id INTEGER PRIMARY KEY AUTO_INCREMENT,
--    description VARCHAR(255),
--    deadline DATETIME,
--    done BOOLEAN,
--    createdAt DATETIME,
--    updatedAt DATETIME
--);

--INSERT INTO employee VALUES(101, '山田太郎', '2010-04-01', '営業部', 'yamada@example.com', '1986-05-11');
--INSERT INTO employee VALUES(102, '鈴木次郎', '2010-04-01', '開発部', 'suzuki@example.com', '1989-06-19');
--INSERT INTO employee VALUES(103, '高田純平', '2010-04-01', '管理部', 'takada@example.com', '1979-12-01');
--INSERT INTO employee VALUES(104, '大山里美', '2010-04-01', '開発部', 'oyama@example.com', '1990-01-11');
--INSERT INTO employee VALUES(105, '橋本哲也', '2010-04-01', '営業部', 'hashimoto@example.com', '1989-07-17');
--INSERT INTO employee VALUES(106, '本山百合子', '2010-04-01', '開発部', 'motoyama@example.com', '1982-09-13');
--INSERT INTO employee VALUES(107, '中田かすみ', '2010-04-01', '管理部', 'nakata@example.com', '1981-02-22');
--INSERT INTO employee VALUES(108, '田中亮太', '2010-04-01', '営業部', 'tanaka@example.com', '1986-04-11');
--INSERT INTO employee VALUES(109, '長谷川宏', '2010-04-01', '開発部', 'hasegawa@example.com', '1989-11-29');

--上記で作成してテーブル構造に会うようにテストデータを挿入

INSERT INTO todos VALUES(1, '牛乳を買う', '2020-04-01 10:00:00', false, '2020-04-01 10:00:00', '2020-04-01 10:00:00');
INSERT INTO todos VALUES(2, '本を読む', '2020-04-01 10:00:00', false, '2018-04-03 10:24:20', '2018-04-05 10:02:00');
INSERT INTO todos VALUES(3, 'Javaの勉強をする', '2020-04-01 10:00:00', true, '2022-06-01 10:00:00', '2020-04-01 10:00:00');
INSERT INTO todos VALUES(4, '腹筋をする', '2020-04-01 10:00:00', false, '2020-04-01 10:00:00', '2020-04-01 10:00:00');
INSERT INTO todos VALUES(5, '本を読む', '2020-04-01 10:00:00', false, '2020-04-01 10:00:00', '2020-04-01 10:00:00');
INSERT INTO todos VALUES(6, 'Javaの勉強をする', '2020-04-01 10:00:00', true, '2020-04-01 10:00:00', '2020-04-01 10:00:00');
INSERT INTO todos VALUES(7, '腹筋をする', '2020-04-01 10:00:00', false, '2020-04-01 10:00:00', '2020-04-01 10:00:00');
INSERT INTO todos VALUES(8, '本を読む', '2020-04-01 10:00:00', false, '2020-04-01 10:00:00', '2020-04-01 10:00:00');