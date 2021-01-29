package com.revature.dao;

import com.revature.models.Player;

public interface PlayerDAO {

	public Player getPlayerById(int id);
	public Player getPlayerByPhoneNumber(String phoneNumber);
}
