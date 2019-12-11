package Preceedence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
	public static void main(String[] args) throws IOException {
		bufferadd B = new bufferadd();
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection C = DriverManager.getConnection("jdbc:postgresql://localhost:5432/msdb", "postgres","nic123");
			System.out.println("Driver Registered");
			B.Add(C);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}		
		catch(ClassNotFoundException f)
		{
			f.printStackTrace();
		}

}
}	

			
	
