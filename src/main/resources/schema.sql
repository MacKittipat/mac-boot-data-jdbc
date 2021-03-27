CREATE TABLE customer (
    id INT IDENTITY PRIMARY KEY, -- IDENTITY enable auto increment
    name VARCHAR(20),
    age INT
);

CREATE TABLE subject (
    id INT IDENTITY PRIMARY KEY,
    name VARCHAR(20)
);

CREATE TABLE student (
    id INT IDENTITY PRIMARY KEY,
    full_name VARCHAR(20),
    subject INT REFERENCES subject(id)
);

-------------------------------------------------------

CREATE TABLE book (
    id INT IDENTITY PRIMARY KEY,
    title VARCHAR(20),
    price DOUBLE
);

CREATE TABLE author (
    id INT IDENTITY PRIMARY KEY,
    name VARCHAR(20),
    book INT REFERENCES book(id)
);
