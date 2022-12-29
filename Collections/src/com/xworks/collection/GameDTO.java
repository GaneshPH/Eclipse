package com.xworks.collection;

public class GameDTO {
	private String name;
	private String type;
	private int totalPlayers;
	
	public GameDTO() {
		
	}

	public GameDTO(String name, String type, int totalPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;
	}

	@Override
	public boolean equals (Object ref) {
		System.out.println("Running");
		if(ref != null) {
			if(ref instanceof GameDTO) {
				GameDTO dto = (GameDTO)ref;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is matched: "+dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", totalPlayers=" + totalPlayers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotalPlayers() {
		return totalPlayers;
	}

	public void setTotalPlayers(int totalPlayers) {
		this.totalPlayers = totalPlayers;
	}
	
}
