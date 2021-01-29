package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.exceptions.DatabaseConnectionException;
import com.revature.models.Team;
import com.revature.util.ConnectionUtil;

public class TeamDAOImpl implements TeamDAO {
	
	public TeamDAOImpl() {
		super();
	}
	
	@Override
	public int createTeam(Team team, Connection connection) throws SQLException {
		int count = 0;
			
		String sql = "INSERT INTO jdbc_demo_1.team (team_name) VALUES (?)";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, team.getTeamName());
		
		count = pstmt.executeUpdate();
		
		return count;
	}

}
