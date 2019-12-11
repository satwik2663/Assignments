package artifactsat;
import java.sql.Connection;
import java.util.Scanner;

public class tables {
		
	public void table() {
		Scanner scan = new Scanner(System.in);
		Add a = new Add();
		Delete d = new Delete();
		Read r = new Read();
		Update u = new Update();
		
		Connect c= new Connect();
		Connection CC = c.Connecting();
			
		System.out.println("Enter the choice: \n1. Add\n2. Read\n3. Update\n4. Delete");
		System.out.print("Your choice is : ");
		byte choice = scan.nextByte();
		
		switch(choice)
		{
			case 1: System.out.println("\nYou have selected 'Choice 1' \n");	
					a.Adding(CC);break;
			case 2: System.out.println("\nYou have selected 'Choice 2'\n");	
					r.Reading(CC);break;
			case 3: System.out.println("\nYou have selected 'Choice 3'\n");	
					u.updating(CC);break;
			case 4: System.out.println("\nYou have selected 'Choice 4'\n");	
					d.deleting(CC);break;
			default: System.out.println("Please select a valid option");
		}
		
		}
	public static void main(String[] args) {
		tables t1 = new tables();
		t1.table();
	}
		
				
	}		


