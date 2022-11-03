CREATE TABLE Course (
    id              INT             NOT NULL    auto_increment,
    nameCourse      VARCHAR(200)    NOT NULL,
    period          VARCHAR(200)     NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO Course(nameCourse, period) VALUES ('Development of Systems', 'Full');
INSERT INTO Course(nameCourse, period) VALUES ('Chemistry', 'Full');
INSERT INTO Course(nameCourse, period) VALUES ('Marketing', 'Morning');
INSERT INTO Course(nameCourse, period) VALUES ('Buildings', 'Night');