package com.revature.dao;

import java.util.List;

import com.revature.exceptions.DatabaseConnectivityException;
import com.revature.exceptions.PlayerNotFoundException;
import com.revature.model.Player;

public interface PlayerCrudDao {

	public int createPlayer(Player player) throws DatabaseConnectivityException;
	public Player getPlayerById(int id) throws DatabaseConnectivityException, PlayerNotFoundException;
	public int updatePlayerPhoneNumber(int id, String phoneNumber) throws DatabaseConnectivityException;
	public boolean deletePlayerById(int id) throws DatabaseConnectivityException;
	public List<Player> getAllPlayers() throws DatabaseConnectivityException;
	
}
