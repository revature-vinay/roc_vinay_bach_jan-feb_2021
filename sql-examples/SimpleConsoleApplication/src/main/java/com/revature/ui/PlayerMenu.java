package com.revature.ui;

import java.util.Scanner;

import com.revature.exceptions.PlayerNotFoundException;
import com.revature.models.Player;
import com.revature.services.PlayerService;

public class PlayerMenu implements Menu {
	
	public PlayerService playerService;
	
	public PlayerMenu() {
		playerService = new PlayerService();
	}
	
	@Override
	public void display() {
		int choice = 0;
		do {
			System.out.println("PLAYER MENU");
			System.out.println("===========");
			System.out.println("1.) Back");
			System.out.println("2.) Find player by Id");
			System.out.println("3.) Find player by phone number");
			System.out.println("Enter a choice between 1 and 3");
			
			try {
				choice = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
			}
			
			switch (choice) {
				case 1:
					break;
				case 2:
					int id = getPlayerByIdInput();
					try {
						Player player = playerService.getPlayerById(id);
						System.out.println(player);
					} catch (PlayerNotFoundException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					String phoneNumber = getPlayerByPhoneNumberInput();
					System.out.println(phoneNumber);
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while (choice != 1);

	}
	
	public int getPlayerByIdInput() {
		int id;
		
		while (true) {
			try {
				System.out.println("Enter a player id you would like to lookup: ");
				id = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, please try again");
				continue;
			}
			
			break;
		}
		
		return id;
	}
	
	public String getPlayerByPhoneNumberInput() {
		String phoneNumber;
		
		while (true) {
			System.out.println("Enter a phone number (xxx-xxx-xxxx): ");
			phoneNumber = Menu.sc.nextLine();
			
			if (playerService.validatePhoneNumber(phoneNumber)) {
				break;
			} else {
				System.out.println("You entered an invalid phone number");
			}
		}
		
		return phoneNumber;
	}

}
