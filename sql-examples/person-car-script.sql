-- DDL (Data Definition Language)
-- CREATE, ALTER, DROP, TRUNCATE

-- ONE TO MANY from person to car (one person can have many cars)
DROP TABLE IF EXISTS person CASCADE;
CREATE TABLE person (
	id SERIAL PRIMARY KEY, -- SERIAL is an integer that automatically increments for us
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	"age" INTEGER NOT NULL,
	created_at Timestamp DEFAULT current_timestamp -- the DEFAULT constraint allows values to be automatically inserted as well
);

DROP TABLE IF EXISTS car CASCADE;
CREATE TABLE car (
	id SERIAL PRIMARY KEY,
	vin VARCHAR(16) UNIQUE NOT NULL,
	make VARCHAR(50) NOT NULL,
	model VARCHAR(50) NOT NULL,
	person_id INTEGER, -- the column we want to be the foreign key
	
	CONSTRAINT fk_person FOREIGN KEY(person_id) references person(id) -- here we're specifying a constraint that we then apply to that column
);

-- Delete the entire table
--DROP TABLE car;
-- DROP TABLE person; 

-- TRUNCATE TABLE car;
-- TRUNCATE TABLE person; -- Delete all data from person table but not the table itself


-- DML, (CRUD) -> INSERT, SELECT, UPDATE, DELETE
SELECT *
FROM person;

SELECT *
FROM car;

INSERT INTO person (first_name, last_name, "age")
VALUES 
('Bob', 'Doe', 20),
('John', 'Doe', 23),
('Jane', 'Doe', 30),
('Jose', 'Rodriguez', 40);

INSERT INTO car (vin, make, model, person_id)
VALUES ('A1B2C3D4A1B2C3D4', 'Tesla', 'Model 3', 1),
('A1B2C3D4A1B2C3D5', 'Tesla', 'Model S', 1),
('A1B2C3D4A1B2C3E9', 'Chevrolet', 'Tahoe', 2),
('A1B2C3D4A1B2C3E8', 'Toyota', 'Supra', 3);

INSERT INTO car (vin, make, model)
VALUES ('C1B2C3D4A1B2C3E8', 'Ford', 'Focus RS');

-- get the cars that either Bob or Jane owe (ids of 5 and 7 respectively)
SELECT *
FROM person per
FULL OUTER JOIN car c
ON per.id = c.person_id;


-- TCL (Transaction Control Language)
BEGIN TRANSACTION;

INSERT INTO car (vin, make, model, person_id)
VALUES ('B1B2C3D4A1B2C3D4', 'Honda', 'Civic Type-R', 3),
('B1B2C3D4A1B2C3D5', 'BMW', '3 series', 3),
('B1B2C3D4A1B2C3E9', 'Kia', 'Stinger', 2),
('B1B2C3D4A1B2C3E8', 'Ford', 'Focus RS', 1);

SELECT *
FROM car;

COMMIT TRANSACTION;


-- User defined function
-- We'll make function that takes in an id from the person table
-- a car ID, and modify the foreign key in the car table to that person
DROP FUNCTION IF EXISTS transfer_ownership;
CREATE OR REPLACE FUNCTION transfer_ownership(new_person_id INTEGER, car_id INTEGER)
RETURNS boolean AS $$
	DECLARE 
		old_person_id INTEGER;
	BEGIN
		SELECT car.person_id INTO old_person_id 
		FROM car 
		WHERE car.id = transfer_ownership.car_id;
	
		IF old_person_id = transfer_ownership.new_person_id
		THEN
			RETURN FALSE;
		END IF;
		
		UPDATE car 
		SET person_id = transfer_ownership.new_person_id
		WHERE car.id = transfer_ownership.car_id;
		
		-- If a car is actually being updated
		-- then return true
		-- If no car was found return false
		IF FOUND
		THEN
			RETURN TRUE;
		ELSE
			RETURN FALSE;
		END IF;
	EXCEPTION
		WHEN others THEN
			RETURN FALSE;
	END
$$ LANGUAGE plpgsql;

SELECT transfer_ownership(4, 100);




SELECT *
FROM person;

SELECT *
FROM car;

-- Before deleting a person, we need to delete all the cars belonging to that person
-- SO that referential integrity is not violated (aka preventing orphan records from occuring)
DELETE FROM car 
WHERE car.person_id = 1;

DELETE FROM person 
WHERE person.id = 1;




-- MANY TO MANY REFACTORING OF DATABASE SCHEMA
-- ===========================================
DROP TABLE IF EXISTS person CASCADE;
CREATE TABLE person (
	id SERIAL PRIMARY KEY, -- SERIAL is an integer that automatically increments for us
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	"age" INTEGER NOT NULL,
	created_at Timestamp DEFAULT current_timestamp -- the DEFAULT constraint allows values to be automatically inserted as well
);

DROP TABLE IF EXISTS car CASCADE;
CREATE TABLE car (
	id SERIAL PRIMARY KEY,
	vin VARCHAR(16) UNIQUE NOT NULL,
	make VARCHAR(50) NOT NULL,
	model VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS person_car CASCADE;
CREATE TABLE person_car (
	id SERIAL PRIMARY KEY,
	person_id INTEGER,
	car_id INTEGER,
	CONSTRAINT fk_person FOREIGN KEY(person_id) REFERENCES person(id),
	CONSTRAINT fk_car FOREIGN KEY(car_id) REFERENCES car(id)
);

INSERT INTO person(first_name, last_name, "age") 
VALUES 
('Bob', 'Doe', 20),
('Jane', 'Doe', 30);

INSERT INTO car (vin, make, model) 
VALUES
('B1B2C3D4A1B2C3D4', 'Honda', 'Civic Type-R'),
('B1B2C3D4A1B2C3D5', 'BMW', '3 series'),
('B1B2C3D4A1B2C3E9', 'Kia', 'Stinger');

SELECT *
FROM car;

SELECT *
FROM person;


SELECT *
FROM person_car;

INSERT INTO person_car (person_id, car_id) 
VALUES (1, 2),
(2, 2),
(1, 1),
(2, 3);

-- Query the data and match owners to their cars
SELECT *
FROM person p
INNER JOIN person_car pc
ON p.id = pc.person_id
INNER JOIN car c 
ON pc.car_id = c.id;

-- Query all of the owners of a particular car
SELECT p.*
FROM car c 
INNER JOIN person_car pc 
ON pc.car_id = c.id
INNER JOIN person p 
ON pc.person_id = p.id
WHERE c.id = 2;



--
CREATE TABLE names (
	name VARCHAR(50)
);

INSERT INTO names
VALUES ('Bach'),
('Bob'),
('Charlie'),
('Christian'),
('Brockton'),
('Fred'),
('Frank');

SELECT *
FROM names 
WHERE name LIKE '%a%';
--

--

-- Example similar to Hackerrank challenge
DROP TABLE IF EXISTS city;
CREATE TABLE city (
	name VARCHAR(17),
	countrycode VARCHAR(3),
	population INTEGER
);

DROP TABLE IF EXISTS country;
CREATE TABLE country ( 
	code VARCHAR(3),
	name VARCHAR(50),
	continent VARCHAR(13)
);

INSERT INTO city
VALUES 
('Tokyo', 'JPN', 38567343),
('Shanghai', 'CHN', 34223123),
('Harbin', 'CHN', 5282093),
('New York City', 'USA', 19868544),
('Toronto', 'CAN', 6398534),
('London', 'GBR', 13896455),
('Paris', 'FRA', 12564555);

INSERT INTO country
VALUES 
('JPN', 'Japan', 'Asia'),
('CHN', 'China', 'Asia'),
('USA', 'United States', 'North America'),
('CAN', 'Canada', 'North America'),
('GBR', 'Great Britain', 'Europe'),
('FRA', 'France', 'Europe');


SELECT city.countrycode, continent, COUNT(*)
FROM city 
INNER JOIN country 
ON city.countrycode = country.code
GROUP BY continent, city.countrycode;




