package artifactsat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Read {
	tables t2 = new tables();
	Scanner s3 = new Scanner(System.in);
	
	public void Reading(Connection con) {
		System.out.println("\nAll the elemets are as below : \n");
		Connection C = con;
		try {
		 PreparedStatement read=C.prepareStatement("select * from usermaster");
		 ResultSet rs=read.executeQuery();
		 while(rs.next())
		 {	 System.out.println("________________________________________");
			 System.out.println("id     : "+rs.getString("id"));
			 System.out.println("name   : "+rs.getString("name"));
			 System.out.println("address: "+rs.getString("address"));
			 System.out.println("Mobile : "+rs.getString("mobile"));
			 System.out.println("Email  : "+rs.getString("email"));
			 System.out.println("________________________________________");
		}
		}catch(SQLException e)
		{
			e.printStackTrace();
		
		}
		System.out.println("\n1. Move to homepage \n2. Be on the same page \n");
		int op = s3.nextInt();
		if(op == 1) {
			homep();
		}
		if(op == 2){
		Reading(C);
		}
		
		}
	public void homep() {
		System.out.print("\n\n****************HOME-PAGE**********************************\n\n\n");
		t2.table();
	}
}
