DROP SCHEMA IF EXISTS usersDB;
CREATE SCHEMA usersDB;

USE usersDB;

CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  lastName varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  pwd varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

INSERT INTO users (name, lastName, email, pwd) VALUES
("Ricky", "Fort", "maiamee@gmail.com", "cultucuchillo"),
("Carlin", "Hacker", "hacker@hotmail.com", "12345678"),
("Daniel", "Travieso", "travesura666@yahoo.com", "jaja123"),
("Harry", "Potter", "harry11@gmail.com", "voldmalo"),
("Hermione", "Granger", "hermione@hotmail.com", "lovestudy"),
("Ron", "Weasley", "ron123@yahoo.com", "987654321");