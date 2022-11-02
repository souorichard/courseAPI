CREATE TABLE Students (
    id              INT             NOT NULL    auto_increment,
    nameStudents    VARCHAR(20)     NOT NULL,
    ageStudents     INT             NOT NULL,
    idCourse        INT             NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE Students ADD CONSTRAINT FK_Students_Course FOREIGN KEY(idCourse) REFERENCES Course(id);

INSERT INTO Students(nameStudents, ageStudents, idCourse) VALUES ('Richard', 16, 1);
INSERT INTO Students(nameStudents, ageStudents, idCourse) VALUES ('Carol', 17, 2);
INSERT INTO Students(nameStudents, ageStudents, idCourse) VALUES ('Yuri', 17, 3);
INSERT INTO Students(nameStudents, ageStudents, idCourse) VALUES ('João', 17, 4);
INSERT INTO Students(nameStudents, ageStudents, idCourse) VALUES ('Michel', 24, 4);