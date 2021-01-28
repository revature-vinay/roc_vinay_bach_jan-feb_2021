DROP TABLE IF EXISTS team CASCADE;
CREATE TABLE team (
	id SERIAL PRIMARY KEY,
	team_name VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS player CASCADE;
CREATE TABLE player (
	id SERIAL PRIMARY KEY,
	player_name VARCHAR(50) NOT NULL,
	player_position VARCHAR(50) NOT NULL,
	gender VARCHAR(10) NOT NULL,
	age INTEGER NOT NULL,
	phone_number VARCHAR(20) NOT NULL UNIQUE,
	team_id INTEGER,
	CONSTRAINT fk_team FOREIGN KEY(team_id) REFERENCES team(id)
);

INSERT INTO team (team_name)
VALUES
('Tigers');

INSERT INTO player (player_name, player_position, gender, age, phone_number, team_id)
VALUES
('Joe', 'PG', 'Male', 24, '111-111-1111', 1),
('Bob', 'SG', 'Male', 22, '222-222-2222', 1),
('Mary', 'PF', 'Female', 26, '333-333-3333', 1),
('Jimmy', 'SF', 'Male', 27, '444-444-4444', 1),
('Tommy', 'C', 'Male', 25, '555-555-5555', 1),
('Sarah', 'PG', 'Female', 21, '666-666-6666', 1);

