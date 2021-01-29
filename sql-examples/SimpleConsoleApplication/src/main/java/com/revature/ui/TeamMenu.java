package com.revature.ui;

import com.revature.services.TeamService;

public class TeamMenu implements Menu {

	public TeamService teamService;
	
	public TeamMenu() {
		teamService = new TeamService();
	}
	
	@Override
	public void display() {
		int choice = 0;
		do {
			System.out.println("TEAM MENU");
			System.out.println("=========");
			System.out.println("1.) Back");
			System.out.println("2.) Create team");
			System.out.println("Enter a choice between 1 and 2");
			
			try {
				choice = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
			}
			
			switch (choice) {
				case 1:
					break;
				case 2:
					String teamName = getCreateTeamInput();
					
					teamService.createTeam(teamName);
					
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while (choice != 1);
		
	}
	
	public String getCreateTeamInput() {
		System.out.println("Enter a team name: ");
		String teamName = Menu.sc.nextLine();
		
		return teamName;
	}

}
