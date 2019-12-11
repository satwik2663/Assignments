package Preceedence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class bufferadd {
	Scanner scan = new Scanner(System.in);
	
	BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
	public void Add(Connection Con) throws IOException{
		try {
		PreparedStatement P = Con.prepareStatement("insert into usermaster Values(?,?,?,?,?)");
		int option = 0;
		while(option == 0){
		System.out.println("Enter ID");
		String id = B.readLine();
		System.out.println("Enter Name");
		String name = B.readLine();
		System.out.println("Enter Address");
		String address = B.readLine();
		System.out.println("Enter Mobile");
		String mobile = B.readLine();
		System.out.println("Enter Email");
		String email = B.readLine();
		P.setString(1,id);  
		P.setString(2,name);  
		P.setString(3,address); 
		P.setString(4,mobile);  
		P.setString(5,email);
		  
		P.addBatch();  
		
		System.out.println("Do you want to enter more \n1.Press 1 - if Yes \n1.Press 2 - if No");
		option = scan.nextInt();
	}
		P.executeBatch();
		System.out.println("Batch Posting done successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
