package com.xworks.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworks.collection.GameDTO;

public class GameRunner {
	public static void main(String[] args) {
		GameDTO gameDTO1 = new GameDTO("Kabaddi", "Indoor", 7);
		
		GameDTO gameDTO2 = new GameDTO("VolleyBall", "Indoor", 7);
		
		GameDTO gameDTO3 = new GameDTO("Kabaddi", null, 0);
		
		boolean equals = gameDTO1.equals(gameDTO3);
		System.out.println(gameDTO1.getName().equals(gameDTO3.getName()));
		Collection<GameDTO>games = new ArrayList<GameDTO>();
		
		games.add(gameDTO1);
		games.add(gameDTO2);
		boolean contains = games.contains(gameDTO3);
		System.out.println("Contains: "+contains);
	}

}
