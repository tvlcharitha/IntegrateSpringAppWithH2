DROP TABLE IF EXISTS Persons;

CREATE TABLE Persons (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

INSERT INTO Persons (name, age, email) VALUES
  ('Lokesh', 34, 'abc@gmail.com'),
  ('Deja', 45, 'xyz@email.com'),
  ('Caption', 56, 'cap@marvel.com');