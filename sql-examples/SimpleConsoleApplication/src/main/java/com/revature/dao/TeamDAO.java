package com.revature.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.models.Team;

public interface TeamDAO {

	public int createTeam(Team team, Connection connection) throws SQLException;
	
}
