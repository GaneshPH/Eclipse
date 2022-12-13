package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {
	public static void main(String[] args) {
		IplRepository repository = new IplRepositoryImpl();


		//Team 1
		IplDTO dto = new IplDTO();
		System.out.println("----------------------------");
		dto.setTeamName("RCB");
		dto.setCaptainName("Virat");
		dto.setHeadCoach("ABD");
		dto.setOwnerAlive(true);
		dto.setTrophies(5);
		dto.setWins(155);
		dto.setDefeats(55);
		dto.setCreatedBy("Unitided Spirits");
		dto.setCreatedDate(LocalDateTime.now());
		repository.create(dto);


		//Team 2
		IplDTO dto2 = new IplDTO();
		System.out.println("----------------------------");
		dto2.setTeamName("KKR");
		dto2.setCaptainName("IYER");
		dto2.setHeadCoach("McCallum");
		dto2.setOwnerAlive(true);
		dto2.setTrophies(4);
		dto2.setWins(95);
		dto2.setDefeats(165);
		dto2.setCreatedBy("Sharukh");
		dto2.setCreatedDate(LocalDateTime.now());
		repository.create(dto2);

		//Team 3
		IplDTO dto3 = new IplDTO();
		System.out.println("----------------------------");
		dto3.setTeamName("Mumbai Indians");
		dto3.setCaptainName("Rohit");
		dto3.setHeadCoach("Jayavardhane");
		dto3.setOwnerAlive(true);
		dto3.setTrophies(4);
		dto3.setWins(105);
		dto3.setDefeats(155);
		dto3.setCreatedBy("Ambani");
		dto3.setCreatedDate(LocalDateTime.now());
		repository.create(dto3);

		//Team 4
		IplDTO dto4 = new IplDTO();
		System.out.println("----------------------------");
		dto4.setTeamName("CSK");
		dto4.setCaptainName("MSD");
		dto4.setHeadCoach("Dhoni");
		dto4.setOwnerAlive(true);
		dto4.setTrophies(0);
		dto4.setWins(1);
		dto4.setDefeats(255);
		dto4.setCreatedBy("Umpires");
		dto4.setCreatedDate(LocalDateTime.now());
		repository.create(dto4);


		//Team 5
		IplDTO dto5 = new IplDTO();
		System.out.println("----------------------------");
		dto5.setTeamName("Sun Risers Hyderbad");
		dto5.setCaptainName("Kane");
		dto5.setHeadCoach("Simon");
		dto5.setOwnerAlive(true);
		dto5.setTrophies(0);
		dto5.setWins(100);
		dto5.setDefeats(195);
		dto5.setCreatedBy("Kaviya");
		dto5.setCreatedDate(LocalDateTime.now());
		repository.create(dto5);

		
		//Team 6
		IplDTO dto6 = new IplDTO();
		System.out.println("----------------------------");
		dto6.setTeamName("Gujarat Titans");
		dto6.setCaptainName("Hardik Pandya");
		dto6.setHeadCoach("Nehra");
		dto6.setOwnerAlive(true);
		dto6.setTrophies(1);
		dto6.setWins(18);
		dto6.setDefeats(9);
		dto6.setCreatedBy("JSW");
		dto6.setCreatedDate(LocalDateTime.now());
		repository.create(dto6);

		//Team 7
		IplDTO dto7 = new IplDTO();
		System.out.println("----------------------------");
		dto7.setTeamName("Lucknow Super Gaints");
		dto7.setCaptainName("KL Rahul");
		dto7.setHeadCoach("Gambir");
		dto7.setOwnerAlive(true);
		dto7.setTrophies(0);
		dto7.setWins(7);
		dto7.setDefeats(9);
		dto7.setCreatedBy("XYZ");
		dto7.setCreatedDate(LocalDateTime.now());
		repository.create(dto7);

		//Team 8
		IplDTO dto8 = new IplDTO();
		System.out.println("----------------------------");
		dto8.setTeamName("Kochi Tuskers Kerala");
		dto8.setCaptainName("Jayavardhane");
		dto8.setHeadCoach("Lawson");
		dto8.setOwnerAlive(true);
		dto8.setTrophies(0);
		dto8.setWins(100);
		dto8.setDefeats(195);
		dto8.setCreatedBy("Kochi Pvt.Ltd");
		dto8.setCreatedDate(LocalDateTime.now());
		repository.create(dto8);

		//Team 9
		IplDTO dto9 = new IplDTO();
		System.out.println("----------------------------");
		dto9.setTeamName("Deccan Chargers");
		dto9.setCaptainName("Sangakkara");
		dto9.setHeadCoach("ABC");
		dto9.setOwnerAlive(true);
		dto9.setTrophies(1);
		dto9.setWins(120);
		dto9.setDefeats(175);
		dto9.setCreatedBy("Deccan");
		dto9.setCreatedDate(LocalDateTime.now());
		repository.create(dto9);

		//Team 10
		IplDTO dto10 = new IplDTO();
		System.out.println("----------------------------");
		dto10.setTeamName("Pune Warriors India");
		dto10.setCaptainName("Ganguly");
		dto10.setHeadCoach("Yuvraj");
		dto10.setOwnerAlive(true);
		dto10.setTrophies(0);
		dto10.setWins(101);
		dto10.setDefeats(205);
		dto10.setCreatedBy("Sahara");
		dto10.setCreatedDate(LocalDateTime.now());
		repository.create(dto10);

	}

}
