CREATE TABLE branch
(
    id               INT(60) PRIMARY KEY AUTO_INCREMENT,
    address          VARCHAR(200) NOT NULL,
    id_rental_agency INT (30),

    FOREIGN KEY (id_rental_agency) REFERENCES rental_agency(id)
)