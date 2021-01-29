package com.revature.services;

import com.revature.dao.PlayerDAO;
import com.revature.dao.PlayerDAOImpl;
import com.revature.exceptions.PlayerNotFoundException;
import com.revature.models.Player;

public class PlayerService {

	public PlayerDAO playerDAO;
	
	public PlayerService() {
		playerDAO = new PlayerDAOImpl();
	}
	
	public Player getPlayerById(int id) throws PlayerNotFoundException {
		Player player = playerDAO.getPlayerById(id); // getPlayerById will return null if no player is found with that id in the database
		
		if (player != null) {
			return player;
		} else {
			throw new PlayerNotFoundException("A player with id of " + id + " was not found");
		}
		
	}
	
	public Player getPlayerByPhoneNumber(String phoneNumber) {
		// TODO
		return null;
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		String regexPattern = "\\d{3}-\\d{3}-\\d{4}";
		return phoneNumber.matches(regexPattern);		
	}

}
