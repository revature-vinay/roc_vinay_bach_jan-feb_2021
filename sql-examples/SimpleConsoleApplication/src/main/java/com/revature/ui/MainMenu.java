package com.revature.ui;

import java.util.Scanner;

public class MainMenu implements Menu {
	
	public MainMenu() {
		super();
	}

	@Override
	public void display() {
		int choice = 0;
		do {
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.) Exit Application");
			System.out.println("2.) Player Menu");
			System.out.println("3.) Team Menu");
			System.out.println("Enter a choice between 1 and 3");
			
			try {
				choice = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
			}
			
			switch (choice) {
				case 1:
					break;
				case 2:
					Menu playerMenu = new PlayerMenu();
					playerMenu.display();
					break;
				case 3:
					System.out.println("Team Menu selected");
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while (choice != 1);
		
	}
	
}
