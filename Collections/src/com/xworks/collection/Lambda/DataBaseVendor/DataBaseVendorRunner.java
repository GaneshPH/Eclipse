package com.xworks.collection.Lambda.DataBaseVendor;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class DataBaseVendorRunner {
	public static void main(String[] args) {
		Collection<DataBaseVendorDTO> collection = new LinkedList<DataBaseVendorDTO>();
		collection.add(new DataBaseVendorDTO("Microsoft", "Bill Gates", Size.Ten, 40, Type.SQL));
		collection.add(new DataBaseVendorDTO("Oracle", "Larry Ellison", Size.Twenty, 60000, Type.rationalDataBase));
		collection.add(new DataBaseVendorDTO("IBM", "Thomas Watson", Size.Thirty, 90000, Type.rationalDataBase));
		System.out.println("1st condition");
		 collection.stream().map(dto->dto.getDevelopedBy().toUpperCase()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));

		System.out.println("2nd condition");

		collection.stream().filter((dto) -> {
			return dto.getLicenseCost() < 100 && dto.getType().equals(Type.SQL);
		}).collect(Collectors.toList()).forEach(dto -> System.out.println(dto));
		
		System.out.println("3rd condition");
		
		collection.stream().map(dto->dto.getType()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
	}

}
