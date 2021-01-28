package com.revature.model;

public class Player {
	
	private int id;
	private String playerName;
	private String playerPosition;
	private String gender;
	private int age;
	private String phoneNumber;
	private int teamId;
	
	// no-args constructor
	public Player() {
		super();
	}
	
	// parameterized constructor
	public Player(int id, String playerName, String playerPosition, String gender, int age, String phoneNumber, int teamId) {
		this.id = id;
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.teamId = teamId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	// These methods come from the Object class which all classes extend from
	// And here we are overriding them

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", playerPosition=" + playerPosition + ", gender="
				+ gender + ", age=" + age + ", phoneNumber=" + phoneNumber + ", teamId=" + teamId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ((playerPosition == null) ? 0 : playerPosition.hashCode());
		result = prime * result + teamId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (playerPosition == null) {
			if (other.playerPosition != null)
				return false;
		} else if (!playerPosition.equals(other.playerPosition))
			return false;
		if (teamId != other.teamId)
			return false;
		return true;
	}
	
}
