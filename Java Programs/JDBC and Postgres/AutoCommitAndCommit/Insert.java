package satwikgrp.satwikartid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Insert 
{
	
	Scanner scan = new Scanner(System.in);
	String costumer_id,balance;
	
	public int Inserting(Connection con) 
	{
		System.out.println("--------------CREATE---------------------");
			int y = 0;
			Connection C = con;
			try{
			
			System.out.print("Enter the Id: ");
			costumer_id = scan.next();
			System.out.print("Enter the Balance: ");
			balance = scan.next();
			PreparedStatement add = C.prepareStatement("insert into cost_balance_master Values(?,?)");
			
			add.setString(1,costumer_id);
			add.setString(2,balance);
			
			y = add.executeUpdate( ); //return the total number of instances to be updates
			
		} 
		catch(SQLException e)
			{
			e.printStackTrace();
			}
		
		return y;	

}}
