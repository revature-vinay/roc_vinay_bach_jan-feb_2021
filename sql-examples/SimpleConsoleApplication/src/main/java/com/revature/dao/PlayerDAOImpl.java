package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.exceptions.DatabaseConnectionException;
import com.revature.models.Player;
import com.revature.util.ConnectionUtil;

public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public Player getPlayerById(int id) {
		Player player = null;
		try (Connection connection = ConnectionUtil.getConnection()) {
			
			String sql = "SELECT * FROM jdbc_demo_1.player WHERE player.id = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int playerId = rs.getInt("id");
				String playerName = rs.getString("player_name");
				String playerPosition = rs.getString("player_position");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");
				String phoneNumber = rs.getString("phone_number");
				int teamId = rs.getInt("team_id");
				
				player = new Player(playerId, playerName, playerPosition, gender, age, phoneNumber, teamId);
			}
			
		} catch (DatabaseConnectionException | SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return player;
	}

	@Override
	public Player getPlayerByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
