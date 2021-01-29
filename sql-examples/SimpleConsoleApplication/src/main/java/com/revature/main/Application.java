package com.revature.main;

import com.revature.ui.MainMenu;
import com.revature.ui.Menu;

public class Application {

	public static void main(String[] args) {
		System.out.println("Welcome to the Player application!");
		System.out.println("==================================");
		
		// Invoke our MainMenu's display method
		Menu mainMenu = new MainMenu();
		mainMenu.display();
		
		Menu.sc.close();
		System.out.println("Goodbye!");
	}

}
