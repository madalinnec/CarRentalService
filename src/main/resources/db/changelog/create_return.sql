CREATE TABLE return_car
(
    id INT(100) PRIMARY KEY AUTO_INCREMENT,
    id_employee INT(30) NOT NULL,
    return_date DATE NOT NULL,
    id_reservation INT (100) NOT NULL,
    surcharge DOUBLE(60,2),
    comments VARCHAR(300), #if the customer never returned the car, mention here

    FOREIGN KEY (id_employee) REFERENCES employee(id),
    FOREIGN KEY (id_reservation) REFERENCES reservation(id)
)