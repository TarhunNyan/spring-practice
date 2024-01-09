
CREATE SCHEMA IF NOT EXISTS TransactionalTest;

CREATE TABLE IF NOT EXISTS TransactionalTest.customer
(
    id    BIGSERIAL PRIMARY KEY,
    fio   TEXT    NOT NULL,
    money NUMERIC NOT NULL
);

CREATE TABLE IF NOT EXISTS TransactionalTest.purchase
(
    id          BIGSERIAL PRIMARY KEY,
    customer_id BIGINT  NOT NULL,
    price       numeric NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES TransactionalTest.customer (id) ON DELETE CASCADE
);