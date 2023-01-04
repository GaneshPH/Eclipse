package com.xworks.collection.Lambda.Palace;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PalaceRunner {
	
	public static void main(String[] args) {
		
		
		Collection<PalaceDTO> collection = new LinkedList<PalaceDTO>();
		collection.add(new PalaceDTO("Mysuru", "Mysuru", 1897, false, 100));
		collection.add(new PalaceDTO("Bengaluru", "Bengaluru", 1874, true, 225));
		collection.add(new PalaceDTO("Lalitha Mahal Palace", "Mysuru", 1921, false, 0));

		collection.stream().filter(dto -> !dto.isDestroyed()).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));

	}

}
