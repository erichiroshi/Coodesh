CREATE TABLE employee_interview_eric_hiroshi (
    emp_no BIGINT AUTO_INCREMENT PRIMARY KEY,
    birth_date DATE,
    first_name VARCHAR(255),
    gender CHAR(1) NOT NULL,
    hire_date DATE,
    last_name VARCHAR(255),
    salary DECIMAL(38,2)
);
