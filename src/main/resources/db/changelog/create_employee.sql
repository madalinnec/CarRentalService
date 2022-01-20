CREATE TABLE employee
(
    id INT(200) PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    position VARCHAR(100) NOT NULL,
    id_branch INT(30) ,
    FOREIGN KEY (id_branch) REFERENCES branch(id)
)
