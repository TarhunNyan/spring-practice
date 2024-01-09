-- EDU-Postgres: заполняем созданные таблицы при инициализации проекта
DELETE
FROM coffee_order
WHERE id > 0;
DELETE
FROM coffee_type
WHERE id > 0;
DELETE
FROM customer
WHERE id > 0;
DELETE
FROM coffee_discount
WHERE id > 0;
DELETE
FROM customer_type
WHERE id > 0;

INSERT INTO coffee_type(id, type, price)
VALUES (1, 'latte', 100),
       (2, 'cappuccino', 120),
       (3, 'frappuccino', 250),
       (4, 'mocha', 70),
       (5, 'americano', 30),
       (6, 'afforgato', 120),
       (7, 'espresso', 70);

INSERT INTO customer_type(id, type)
VALUES (1, 'default'),
       (2, 'child'),
       (3, 'student'),
       (4, 'pensioner');

INSERT INTO coffee_discount(id, discount, customer_id)
VALUES (1, 1.0, 1),
       (2, 1.2, 2),
       (3, 0.8, 3),
       (4, 0.5, 4);

INSERT INTO customer(id, type_id, name)
VALUES (1, 1, 'Vasia'),
       (2, 1, 'Tanya'),
       (3, 1, 'Petia'),
       (4, 2, 'Antoshenka'),
       (5, 3, 'First Course'),
       (6, 4, 'Genadii Petrovich');

INSERT INTO coffee_order(id, count, customer_id, type_id)
VALUES (2, 5, 5, 2),
       (1, 2, 1, 1),
       (3, 1, 2, 3),
       (4, 100, 5, 4),
       (5, 1, 3, 5);
