CREATE TABLE person (
	id SERIAL PRIMARY KEY, -- SERIAL is an integer that automatically increments for us
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	"age" INTEGER NOT NULL,
	created_at Timestamp DEFAULT current_timestamp -- the DEFAULT constraint allows values to be automatically inserted as well
);

CREATE TABLE car (
	id SERIAL PRIMARY KEY,
	vin VARCHAR(16) UNIQUE NOT NULL,
	make VARCHAR(50) NOT NULL,
	model VARCHAR(50) NOT NULL,
	person_id INTEGER, -- the column we want to be the foreign key
	
	CONSTRAINT fk_person FOREIGN KEY(person_id) references person(id) -- here we're specifying a constraint that we then apply to that column
);

DROP TABLE car;
DROP TABLE person; -- Delete the entire table

TRUNCATE TABLE person; -- Delete all data from person table but not the table itself

-- DML, (CRUD) -> INSERT, SELECT, UPDATE, DELETE
INSERT INTO person (first_name, last_name, "age")
VALUES 
('Bob', 'Doe', 20),
('John', 'Doe', 23),
('Jane', 'Doe', 30);

INSERT INTO car (vin, make, model, person_id)
VALUES ('A1B2C3D4A1B2C3D4', 'Tesla', 'Model 3', 5),
('A1B2C3D4A1B2C3D5', 'Tesla', 'Model S', 5);


SELECT *
FROM person;

-- JOINS
-- Joins are used to combine data from two or more tables based on some condition

-- Here I want to join together the person and car table based on the foreign key and primary key of person
INSERT INTO car (vin, make, model, person_id)
VALUES ('A1B2C3D4A1B2C3E9', 'Chevrolet', 'Tahoe', 6),
('A1B2C3D4A1B2C3E8', 'Toyota', 'Supra', 7);


-- get the cars that either Bob or Jane owe (ids of 5 and 7 respectively)
SELECT c.*
FROM person per
INNER JOIN car c
ON per.id = c.person_id
WHERE per.id BETWEEN 5 AND 7;

