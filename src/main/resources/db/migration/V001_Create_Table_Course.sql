CREATE TABLE Course (
    id              INT             NOT NULL    auto_increment,
    nameCourse      VARCHAR(20)     NOT NULL,
    period          VARCHAR(10)     NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO Course(nameCourse, period) VALUES ('Development of Systems', 'Full');
INSERT INTO Course(nameCourse, period) VALUES ('Chemistry', 'Full');
INSERT INTO Course(nameCourse, period) VALUES ('Marketing', 'Morning');
INSERT INTO Course(nameCourse, period) VALUES ('Buildings', 'Night');