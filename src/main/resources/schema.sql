/* Drop Tables */
DROP TABLE IF EXISTS todos;

/* Create Tables */
CREATE TABLE todos
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255),
    deadline DATETIME,
    done BOOLEAN,
    createdAt DATETIME,
    updatedAt DATETIME
);