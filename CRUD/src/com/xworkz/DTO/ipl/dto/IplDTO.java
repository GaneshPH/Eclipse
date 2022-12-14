package com.xworkz.DTO.ipl.dto;

public class IplDTO extends AbstractAuditDTO {

	private String teamName;
	private String captainName;
	private String headCoach;
	private boolean ownerAlive;
	private int wins;
	private int defeats;
	private int trophies;
	
	public IplDTO() {
		System.out.println("Calling no-arg const of IplDTO");
	}
	
	
	
	
	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainName=" + captainName + ", headCoach=" + headCoach
				+ ", ownerAlive=" + ownerAlive + ", wins=" + wins + ", defeats=" + defeats + ", trophies=" + trophies
				+ ", toString()=" + super.toString() + "]";
	}




	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
	public boolean isOwnerAlive() {
		return ownerAlive;
	}
	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDefeats() {
		return defeats;
	}
	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	
	
}
