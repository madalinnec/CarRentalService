CREATE TABLE rental
(
    id INT(100) PRIMARY KEY AUTO_INCREMENT,
    id_employee INT(100),
    id_reservation INT(100),
    comments VARCHAR(300), #if the customer was rude, mention here.

    FOREIGN KEY (id_employee) REFERENCES employee(id),
    FOREIGN KEY (id_reservation) REFERENCES reservation(id)
)