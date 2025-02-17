DROP TABLE IF EXISTS TBL_STUDENTS;

CREATE TABLE TBL_STUDENTS
(
    id   INT AUTO_INCREMENT primary key ,
    name VARCHAR(100),
    age  INT
);

DROP TABLE IF EXISTS TBL_COURSES;

CREATE TABLE TBL_COURSES
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    description  VARCHAR(100),
    steps VARCHAR(300)
);