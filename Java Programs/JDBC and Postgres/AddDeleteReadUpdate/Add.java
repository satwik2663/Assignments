package artifactsat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Add {
	Scanner scan = new Scanner(System.in);
	String Uid;
	String Uname;
	String Uadd;
	String Umob;
	String Uemail;
	tables t = new tables();
	
	public void Adding(Connection con) {
		Connection C = con;
		System.out.print("Enter the Id: ");
		Uid = scan.next();
		System.out.print("Enter the Name: ");
		Uname = scan.next();
		System.out.print("Enter the Address: ");
		Uadd = scan.next();
		System.out.print("Enter the Mobile: ");
		Umob = scan.next();  
		System.out.print("Enter the Email: ");
		Uemail = scan.next();
		
		System.out.print("Do you want to : \n1. Save the inputs \n2.Write the inputs again\n");
		System.out.print("Enter you input : ");
		int i = scan.nextInt();
		if(i == 1) 
		{
			inputCorrect(Uid,Uname,Uadd,Umob,Uemail,C);
			System.out.println("\n1. Add More Records \n2. Move to homepage ");
			int X = scan.nextInt();
			if(X==1){
				Adding(C);
			}
			else if(X==2){
			 Home();
			}
		}
		if(i == 2)
		{
			Adding(C);
		}
	}
	public void inputCorrect(String id, String name,String addr,String mob,String email,Connection C) {
		try {
				PreparedStatement add = C.prepareStatement("insert into usermaster Values(?,?,?,?,?)");
				add.setString(1,id);
				add.setString(2,name);
				add.setString(3,addr);
				add.setString(4,mob);
				add.setString(5,email);
				add.executeUpdate();
				System.out.println("Record Added");
				}
			catch(SQLException e) {
				e.printStackTrace();
				}
		}
		
	
	
	
	
	public void Home()
	{	System.out.print("\n\n****************HOME-PAGE**********************************\n\n\n");
		t.table();
	}
}
