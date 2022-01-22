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