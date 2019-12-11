package artifactsat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	Scanner SS = new Scanner(System.in);
	tables t1 = new tables();
	public void deleting(Connection con) {
		
		
		System.out.print("Enter the id you want to delete: ");
		String Did = SS.next();
		System.out.print("1.Want to delete\n2.Dont want to delete ");
		System.out.print("\n");
		int conf = SS.nextInt();
		
			if(conf == 1) {
			try {
			PreparedStatement delete = con.prepareStatement("Delete from usermaster where id = ?");
			delete.setString(1, Did);	
			delete.executeUpdate();
			System.out.println("The Id has been deleted successfully");
		}
			catch(SQLException e) 
			{
			e.printStackTrace();
			}
		}
		else if(conf == 2) {
			System.out.println("The Id has not been deleted");
		}
		
		System.out.print("1. Do go back to the home page(Press 1/Backspace)");
		int optt = SS.nextInt(0);
		if(optt==1  ) {
			Home();
		    }
		}
		
	
		public void Home()
		{	
			System.out.print("\n\n****************HOME-PAGE**********************************\n\n\n");
			t1.table();
		}
}