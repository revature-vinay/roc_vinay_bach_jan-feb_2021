package com.revature.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.TeamDAO;
import com.revature.dao.TeamDAOImpl;
import com.revature.exceptions.DatabaseConnectionException;
import com.revature.models.Team;
import com.revature.util.ConnectionUtil;

public class TeamService {

	public TeamDAO teamDAO;
	
	public TeamService() {
		teamDAO = new TeamDAOImpl();
	}
	
	public int createTeam(String teamName) {
		int count = 0;
		
		Team team = new Team(0, teamName);
		
		try (Connection connection = ConnectionUtil.getConnection()) {
			connection.setAutoCommit(false);
			
			count = teamDAO.createTeam(team, connection); // pass connection object into DAO operation
			
			// Let's say we have some more team manipulation going on here.
			// Then because these operations are wrapped between .setAutoCommit(false) and .commit()
			// We can treat all of these operations as a single transaction
			
			connection.commit(); // commit DAO operation changes here
		} catch (SQLException | DatabaseConnectionException e) {
			System.out.println(e.getMessage());
		}
			
		
		return count;
	}

}
