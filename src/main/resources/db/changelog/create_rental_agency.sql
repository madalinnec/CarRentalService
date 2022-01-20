CREATE TABLE rental_agency
(
    id              INT(30) PRIMARY KEY AUTO_INCREMENT,
    name            VARCHAR(30) UNIQUE  NOT NULL,
    internet_domain VARCHAR(100) UNIQUE NOT NULL,
    contact_address VARCHAR(100) UNIQUE NOT NULL,
    owner           VARCHAR(60) UNIQUE  NOT NULL,
    id_branches     INT(30),

    FOREIGN KEY (id_branches) REFERENCES branch(id)
)