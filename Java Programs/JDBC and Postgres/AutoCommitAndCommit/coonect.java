package satwikgrp.satwikartid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coonect {
	
	public Connection Connecting() 
	{
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/msdb", "postgres", "nic123");
		}
		catch(ClassNotFoundException e) 
		{
		e.printStackTrace();
		System.out.println("Device is not registered");
		}
		catch(SQLException f)
		{
		f.printStackTrace();
		System.out.println("Connection cannot be established");
		}
		System.out.println("Driver registered successfully \n\nConnection Established\n");
		return conn;
	}

}
