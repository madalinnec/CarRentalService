INSERT IGNORE INTO rental_agency
    (id, name, internet_domain, contact_address, owner)
    VALUES
    (
        1,
        'Best Cars',
        'bestcars.ro',
        'contact@bestcars.ro',
        'Madalin Neculaes'
    );

INSERT IGNORE INTO branch
    (id, address, id_rental_agency)
    VALUES
    (
        1,
        'Iasi, Str. Tudor Neculai, Nr. 3A',
        1
    );

INSERT IGNORE INTO employee
    (id, first_name, last_name, position, id_branch)
    VALUES
    (
        1,
        'Andreea',
        'Neculaes',
        'Manager',
        1
    );

INSERT IGNORE INTO car
    (id, brand, model, body_type, year, colour, mileage, status, amount, id_branch)
    VALUES
    (
        1,
        'Dacia',
        'Sandero',
        'hatchback',
        '2014',
        'green',
        150000,
        'AVAILABLE',
        120.00,
        1
    );

INSERT IGNORE INTO customer
    (id, first_name, last_name, email, address)
    VALUES
    (
        1,
        'Adelina',
        'Apetrei',
        'adelina_apetrei@gmail.com',
        'Iasi, Str. Sub Cosere, bl. C2'
    );

INSERT IGNORE INTO reservation
    (id, id_customer, id_car, booking_date, date_start, date_stop, id_branch, price)
    VALUES
    (
        1,
        1,
        1,
        '2020-02-15',
        '2022-02-20',
        '2022-02-28',
        1,
        2000.00
    );

INSERT IGNORE INTO rental
    (id, id_employee, id_reservation, comments)
    VALUES
    (
        1,
        1,
        1,
        'The customer swore only twice during the process, so I gave him a discount.'
    );

INSERT IGNORE INTO return_car
    (id, id_employee, return_date, id_reservation, surcharge, comments)
    VALUES
    (
        1,
        1,
        '2022-03-05',
        1,
        1200.00,
        'The customer was late 4 hours so he was charged for a few more days.'
    );

INSERT IGNORE INTO revenue
    (id, date, amount)
    VALUES
    (
        1,
        '2022-01-21',
        960000
    );