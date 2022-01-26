CREATE TABLE reservation
(
    id INT(100) PRIMARY KEY AUTO_INCREMENT,
    id_customer INT(100) NOT NULL,
    id_car INT(100) NOT NULL,
    booking_date DATE NOT NULL,
    date_start DATE NOT NULL,
    date_stop DATE NOT NULL,
    id_branch INT(30) NOT NULL,
    id_return_branch INT(30),
    price DOUBLE(60,2),

    FOREIGN KEY (id_customer) REFERENCES customer(id),
    FOREIGN KEY (id_car) REFERENCES car(id),
    FOREIGN KEY (id_branch) REFERENCES branch(id),
    FOREIGN KEY (id_return_branch) REFERENCES branch(id)
)