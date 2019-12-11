package artifactsat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	tables t1 = new tables();
	Scanner s = new Scanner(System.in);
	public void updating(Connection con) {
		Connection C = con;
		System.out.println("Enter the field which you want to update:\n1. name \n2. address \n3. mobile \n4. email ");
		byte opt = s.nextByte();
	if (opt == 1) {
		try {
			System.out.print("Enter the Id for which you want to update the name: ");
			String Id = s.next();
			System.out.print("Enter the updated Name: ");
			String N = s.next();
			PreparedStatement update = C.prepareStatement("Update usermaster Set name = ? where id = ?");
			update.setString(1, N);
			update.setString(2, Id);
			update.executeUpdate();
			System.out.println("Record updated");
			System.out.println("\n1. Be on the same page \n2. Move to homepage");
			int X = s.nextInt();
			if(X==1){
				updating(C);
			}
			else if(X==2){
			 Home();
			}
		}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	
	if (opt == 2) {
		try {
			System.out.print("Enter the Id for which you want to update the Address: ");
			String Id = s.next();
			System.out.print("Enter the updated Adress: ");
			String Add = s.next();
			PreparedStatement update = C.prepareStatement("Update usermaster Set address = ? where id = ?");
			update.setString(1, Id);
			update.setString(2, Add);
			update.executeUpdate();
			System.out.println("Record updated");
			System.out.println("\n1. Be on the same page \n2. Move to homepage ");
			int X = s.nextInt();
			if(X==1){
				updating(C);
			}
			else if(X==2){
			 Home();
			}
		
		}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	
	if (opt == 3) {
		try {
			System.out.print("Enter the Id for which you want to update the Mobile: ");
			String Id = s.next();
			System.out.print("Enter the updated mobile: ");
			String M = s.next();
			PreparedStatement update = C.prepareStatement("Update usermaster Set mobile = ? where id = ?");
			update.setString(1, M);
			update.setString(2, Id);
			update.executeUpdate();
			System.out.println("Record updated");
			System.out.println("\n1. Be on the same page \n2. Move to homepage");
			int X = s.nextInt();
			if(X==1){
				updating(C);
			}
			else if(X==2){
			 Home();
			}
		}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	
	if (opt == 4) {
		try {
			System.out.print("Enter the Id for which you want to update the Email: ");
			String E = s.next();
			System.out.print("Enter the updated Email: ");
			String Id = s.next();
			PreparedStatement update = C.prepareStatement("Update usermaster Set email = ? where id = ?");
			update.setString(1, E);
			update.setString(2, Id);
			update.executeUpdate();
			System.out.println("Record updated");
		}catch(SQLException e) {
			System.out.println("\n1. Be on the same page \n2. Move to homepage");
			int X = s.nextInt();
			if(X==1){
				updating(C);
			}
			else if(X==2){
			 Home();
			}
		e.printStackTrace();
		}
	}
	}
	public void Home()
	{	
		System.out.print("\n\n****************HOME-PAGE**********************************\n\n\n");
		t1.table();
	}
	

}
