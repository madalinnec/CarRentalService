CREATE TABLE car
(
    id INT(30) PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(60) NOT NULL,
    model VARCHAR(60) NOT NULL,
    body_type VARCHAR(60) NOT NULL,
    year VARCHAR(4) NOT NULL,
    colour VARCHAR(60) NOT NULL,
    mileage INT(30) NOT NULL,
    status VARCHAR(30) NOT NULL,
    amount DOUBLE(60, 2) NOT NULL,
    id_branch INT(30) NOT NULL,
    FOREIGN KEY (id_branch) REFERENCES branch(id)
)