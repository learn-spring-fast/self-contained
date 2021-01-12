package com.mcnz.rps.spring.temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	public static void main(String args[]) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//rps.cyvpttibbqrc.us-east-1.rds.amazonaws.com
			String url ="jdbc:mysql://rps.cyvpttibbqrc.us-east-1.rds.amazonaws.com:3306/ROSHAMBO?useSSL=false";
			Connection con = DriverManager.getConnection(url, "cameronmcnz", "Spring2021");
//here sonoo is database name, root is username and password  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from GAMESUMMARY");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}  
}  