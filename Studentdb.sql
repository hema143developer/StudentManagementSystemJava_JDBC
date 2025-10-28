CREATE DATABASE IF NOT EXISTS studentdb;
USE studentdb;

CREATE TABLE IF NOT EXISTS students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    major VARCHAR(50),
    gpa DOUBLE
);
SELECT * FROM students;

INSERT INTO students (student_id, first_name, last_name, major, gpa) VALUES
    (1, 'Hema', 'Kumari', 'Computer Science', 9.2),
    (2, 'Ravi', 'Teja', 'Electrical', 8.5),
    (3, 'Sara', 'Singh', 'Mechanical', 7.8),
    (4, 'Anil', 'Kumar', 'Civil', 8.9);

SELECT * FROM students;