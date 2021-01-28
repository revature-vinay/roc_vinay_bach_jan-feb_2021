package com.revature.main;

import java.util.List;

import com.revature.dao.PlayerCrudDao;
import com.revature.dao.PlayerCrudDaoImpl;
import com.revature.exceptions.DatabaseConnectivityException;
import com.revature.exceptions.PlayerNotFoundException;
import com.revature.model.Player;

public class Main {

	public static void main(String[] args) {
		
//		Player newPlayer = new Player(0, "Bobby", "SF", "Male", 25, "888-888-8888", 1);
//		
//		PlayerCrudDao dao = new PlayerCrudDaoImpl();
//		int count = dao.createPlayer(newPlayer);
//		System.out.println(count);
		
		
		PlayerCrudDao dao = new PlayerCrudDaoImpl();
		try {
			Player player = dao.getPlayerById(1);
			System.out.println(player);
			
			List<Player> players = dao.getAllPlayers();
			System.out.println(players);
		} catch (PlayerNotFoundException | DatabaseConnectivityException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
