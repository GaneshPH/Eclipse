package com.xworkz.egg.DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connobject = DriverManager.getConnection("jdbc:mysql://localhost:3306/feb13","root","Ganeshph@0910");
			
			String insertQuery = "insert into egg_table values (0, 'Xworkz', 'EggCurry', 'Boiler', 500, 5, false)";
			Statement statement = connobject.createStatement();
			
			int rowsAffected = statement.executeUpdate(insertQuery);
			System.out.println("RowsAffected"+rowsAffected);
			
			connobject.close();
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found "+e.getMessage());
		}
		catch(SQLException se) {
			System.out.println("SQL Exception"+se.getMessage());
		}
	}

}
