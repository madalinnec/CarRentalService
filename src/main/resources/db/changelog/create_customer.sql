CREATE TABLE customer
(
    id INT(100) PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(60) NOT NULL,
    last_name VARCHAR(60) NOT NULL,
    email VARCHAR(60) NOT NULL,
    address VARCHAR(60) NOT NULL
)