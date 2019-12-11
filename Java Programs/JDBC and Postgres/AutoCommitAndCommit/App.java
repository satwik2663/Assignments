	package satwikgrp.satwikartid;

import java.sql.Connection;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	
        coonect c= new coonect();
		Connection CC = c.Connecting();
		CC.setAutoCommit(false);  // this would not lead making the values update to Database
		
		Insert I1 = new Insert();
		int p = I1.Inserting(CC);
		
		Updating U1 = new Updating();
		int q = U1.Update(CC);
		
		try{
			if(p>0 && q>0)
		{
			CC.commit(); // values will update to Database when commit is called(all the values at once)
			System.out.println("\n\nTRANSACTION UPDATED");
		}
		
		else 
		{ 
			CC.rollback(); //All the changes would be rolled back if number of records is 0
			System.out.println("\n\nROLLED BACK");
		}
		}
		catch(Exception e)
		{
			CC.rollback(); //All the changes would be rolled back if any of the records are not updated
		}
		finally
		{
			CC.close();
			System.out.println("----------Connection closed --------");
		}
    }
}
		

