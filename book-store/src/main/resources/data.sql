DROP TABLE IF EXISTS book;

CREATE TABLE book
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(250) NOT NULL,
    title  VARCHAR(250) NOT NULL,
    price  DECIMAL NOT NULL
);

INSERT INTO book (id, author, title, price)
VALUES (1, 'Author 1', 'Book 1', 100),
       (2, 'Author 2', 'Book 2', 500),
       (3, 'Author 3', 'Book 3', 400),
       (4, 'Author 4', 'Book 4', 300),
       (5, 'Author 5', 'Book 5', 200);
